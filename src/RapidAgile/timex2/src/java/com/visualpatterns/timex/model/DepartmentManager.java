package com.visualpatterns.timex.model;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Manages database operations for Department table.
 * @author anil
 */
public class DepartmentManager extends HibernateDaoSupport
{
    /**
     * Returns list of all records in Department table, sorted by name.
     */
    public List getDepartments()
    {
        List departmentList = null;
        departmentList = getSessionFactory().getCurrentSession().createQuery(
                "from Department ORDER BY name").list();
        return departmentList;
    }
}
