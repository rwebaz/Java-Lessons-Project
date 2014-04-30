package com.visualpatterns.timex.model;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Manages database operations for Employee table.
 * @author anil
 */
public class EmployeeManager extends HibernateDaoSupport
{
    /**
     * Returns list of all Employee records matching employeeCode 'H'
     */
    public List getHourlyEmployees()
    {
        List employeeList = null;
        employeeList = getSessionFactory().getCurrentSession().createQuery(
                    "from Employee" + " WHERE employeeCode='H'"
                            + "ORDER BY name").list();
        return employeeList;
    }

    /**
     * Gets employee record with matching employeeId
     */
    public Employee getEmployee(int employeeId)
    {
        Employee employee = null;
        employee = (Employee)getSessionFactory().getCurrentSession()
         .createQuery(
                  "from Employee" + " where employeeId = ?").setInteger(0,
                    employeeId).uniqueResult();
        return employee;
    }
}
