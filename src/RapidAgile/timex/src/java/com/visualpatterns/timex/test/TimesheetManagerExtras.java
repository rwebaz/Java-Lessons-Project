package com.visualpatterns.timex.test;

import java.util.Date;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.visualpatterns.timex.model.Timesheet;
import com.visualpatterns.timex.util.DateUtil;
import com.visualpatterns.timex.util.HibernateUtil;

/**
 * Manages database operations for Timesheet table.
 * @author anil
 */
public class TimesheetManagerExtras
{
    public List getTimesheets(String statusCode)
    {
        List timesheetList = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        timesheetList = session.createQuery(
                "from Timesheet" + " where statusCode = ?").setString(0,
                statusCode).list();
        session.getTransaction().commit();

        return timesheetList;
    }
    
    /**
     * Demonstrates use of Hibernate's Session.getNamedQuery method.
     */
    public List getTimesheetsUsingNamedQuery(
            int employeeId,
            Date periodEndingDate)
    {
        List timesheetList = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        System.err.println("periodEndingDate = " + periodEndingDate);
        timesheetList = session.getNamedQuery(
                "getTimesheetsByEmployeeIdAndPeriodEndingDate").setInteger(
                "employeeId", employeeId).setDate("periodEndingDate",
                periodEndingDate).list();
        session.getTransaction().commit();

        return timesheetList;
    }

    /** 
     * Demonstrates use of Hibernate's Session.createCriteria method.
     */
    public List getTimesheetsUsingCriteria(int employeeId)
    {
        List timesheetList = null;
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        timesheetList = session.createCriteria(Timesheet.class).add(
                Restrictions.eq("employeeId", new Integer(employeeId)))
                .list();
        session.getTransaction().commit();

        return timesheetList;
    }

    /** 
     * Saves a list of Timesheets 
     */
    public int saveTimesheetsWithTransaction(List timesheets)
    {
        if (timesheets == null || timesheets.size() < 1) return 0;

        Timesheet timesheet;
        int saved = 0;
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        try
        {
            session.beginTransaction();
            for (int i = 0; i < timesheets.size(); i++)
            {
                timesheet = (Timesheet) timesheets.get(i);
                session.saveOrUpdate(timesheet);
                saved++;
            }

            session.getTransaction().commit();
        } catch (Exception e)
        {
            session.getTransaction().rollback();
        }

        return saved;
    }

    /**
     * Demonstrates use of Hibernate's Session.createSQLQuery method.
     */
    public int getDaysLeftTillPeriodEnd()
    {
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        int daysLeft = -1;
        String sql = "select datediff('dd', NOW, ?) AS daysleft"
                + " from timesheet";
        Integer valueObject = (Integer) session.createSQLQuery(sql)
                .addScalar("daysleft", Hibernate.INTEGER).setDate(0,
                        DateUtil.getCurrentPeriodEndingDate()).uniqueResult();
        if (valueObject != null) daysLeft = valueObject.intValue();
        return daysLeft;
    }
}
