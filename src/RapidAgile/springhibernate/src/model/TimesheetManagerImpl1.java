package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class TimesheetManagerImpl1 implements TimesheetManager
{
    SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public void saveTimesheet(Timesheet timesheet)
    {
        this.sessionFactory.getCurrentSession().merge(timesheet);
    }
    
    public void deleteTimesheet(int timesheetId)
    {
        Session session = this.sessionFactory.getCurrentSession();
        session.delete(session.load(Timesheet.class, new Integer(timesheetId)));
    }
}
