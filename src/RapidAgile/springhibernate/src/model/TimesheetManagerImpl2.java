package model;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class TimesheetManagerImpl2 extends HibernateDaoSupport
       implements TimesheetManager
{
    public void saveTimesheet(Timesheet timesheet)
    {
        getHibernateTemplate().merge(timesheet);
    }

    public void deleteTimesheet(int timesheetId)
    {
        getHibernateTemplate()
        .delete(getHibernateTemplate()
                .load(Timesheet.class, new Integer(timesheetId)));
    }
}
