package com.visualpatterns.timex.model;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Session;
import com.visualpatterns.timex.util.HibernateUtil;

/**
 * Manages database operations for Timesheet table.
 * @author anil
 */
public class TimesheetManager
{
    /**
     * Returns list of all timesheet database records with matching 
     * employeeId.
     */
    public List getTimesheets(int employeeId)
    {
        List timesheetList = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            timesheetList = session.createQuery(
                    "from Timesheet" + " where employeeId = ?").setInteger(0,
                    employeeId).list();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return timesheetList;
    }

    /**
     * Returns Timesheet database record with matching employeeId and
     * periodEndingDate.
     */
    public Timesheet getTimesheet(int employeeId, Date periodEndingDate)
    {
        Timesheet timesheet = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            timesheet = (Timesheet) session.createQuery(
                    "from Timesheet" + " where employeeId = ?"
                            + " and periodEndingDate = ?").setInteger(0,
                    employeeId).setDate(1, periodEndingDate).uniqueResult();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return timesheet;
    }

    /**
     * Saves a Timesheet object.
     */
    public void saveTimesheet(Timesheet timesheet)
    {
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            session.saveOrUpdate(timesheet);
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }
    }

    /**
     * Returns list of all timesheet database records sorted by timesheetId
     */
    public List getTimesheets()
    {
        List timesheetList = null;
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            timesheetList = session.createQuery(
                    "from Timesheet ORDER BY timesheetId").list();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return timesheetList;
    }

    /**
     * Deletes Timesheet record with matching timeSheetId 
     */
    public void deleteTimesheet(int timesheetId)
    {
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            session.delete(session.load(Timesheet.class, new Integer(
                    timesheetId)));
            session.flush();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }
    }

    /**
     * Returns a database Timesheet record with matching timesheetId
     * and demonstrates how a record can be locked using Hibernate.
     */
    public Timesheet getTimesheet(int timesheetId, boolean doLock)
    {
        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        Timesheet timesheet = null;
        try
        {
            if (doLock)
                timesheet = (Timesheet) session.get(Timesheet.class,
                        new Integer(timesheetId), LockMode.UPGRADE);
            else
                timesheet = (Timesheet) session.get(Timesheet.class,
                        new Integer(timesheetId));
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return timesheet;
    }
}
