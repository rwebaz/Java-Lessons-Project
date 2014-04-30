package model;

import org.hibernate.SessionFactory;

public interface TimesheetManager
{
    public abstract SessionFactory getSessionFactory();
    public abstract void setSessionFactory(SessionFactory sessionFactory);
    public abstract void saveTimesheet(Timesheet timesheet);
    public abstract void deleteTimesheet(int timesheetId);
}