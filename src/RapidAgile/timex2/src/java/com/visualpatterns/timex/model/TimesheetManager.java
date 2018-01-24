package com.visualpatterns.timex.model;

import java.util.Date;
import java.util.List;

import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


/**
 * Manages database operations for Timesheet table.
 * @author anil
 */
public class TimesheetManager extends HibernateDaoSupport
{
    /**
     * Returns list of all timesheet database records with matching 
     * employeeId.
     */
    public List getTimesheets(int employeeId)
    {
        List timesheetList = null;
            timesheetList = getSessionFactory().getCurrentSession().createQuery(
                    "from Timesheet" + " where employeeId = ?").setInteger(0,
                    employeeId).list();
        return timesheetList;
    }

    /**
     * Returns Timesheet database record with matching employeeId and
     * periodEndingDate.
     */
    public Timesheet getTimesheet(int employeeId, Date periodEndingDate)
    {
        Timesheet timesheet = null;
            timesheet = (Timesheet) getSessionFactory().getCurrentSession().createQuery(
                    "from Timesheet" + " where employeeId = ?"
                            + " and periodEndingDate = ?").setInteger(0,
                    employeeId).setDate(1, periodEndingDate).uniqueResult();
        return timesheet;
    }

    /**
     * Saves a Timesheet object.
     */
    public void saveTimesheet(Timesheet timesheet)
    {
        getHibernateTemplate().saveOrUpdate(timesheet);
    }

    /**
     * Returns list of all timesheet database records sorted by timesheetId
     */
    public List getTimesheets()
    {
        List timesheetList = null;
        timesheetList = getSessionFactory().getCurrentSession().createQuery(
                "from Timesheet ORDER BY timesheetId").list();
        return timesheetList;
    }

    /**
     * Deletes Timesheet record with matching timeSheetId 
     */
    public void deleteTimesheet(int timesheetId)
    {
        getHibernateTemplate().delete(
        		getHibernateTemplate().load(Timesheet.class, 
        				new Integer(timesheetId)));
    }

    /**
     * Returns a database Timesheet record with matching timesheetId
     * and demonstrates how a record can be locked using Hibernate.
     */
    public Timesheet getTimesheet(int timesheetId, boolean doLock)
    {
        Timesheet timesheet = null;
        if (doLock)
            timesheet = (Timesheet)getHibernateTemplate().get(Timesheet.class,
                    new Integer(timesheetId), LockMode.UPGRADE);
        else
            timesheet = (Timesheet)getHibernateTemplate().get(Timesheet.class,
                    new Integer(timesheetId));
        return timesheet;
    }
}
