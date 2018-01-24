package com.visualpatterns.timex.model;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.visualpatterns.timex.util.HibernateUtil;

/**
 * Manages database operations for Employee table.
 * @author anil
 */
public class EmployeeManager
{
    /**
     * Returns list of all Employee records matching employeeCode 'H'
     */
    public List getHourlyEmployees()
    {
        List employeeList = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            employeeList = session.createQuery(
                    "from Employee" + " WHERE employeeCode='H'"
                            + "ORDER BY name").list();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return employeeList;
    }

    /**
     * Gets employee record with matching employeeId
     */
    public Employee getEmployee(int employeeId)
    {
        Employee employee = null;

        Session session = HibernateUtil.getSessionFactory()
                .getCurrentSession();
        session.beginTransaction();
        try
        {
            employee = (Employee) session.createQuery(
                    "from Employee" + " where employeeId = ?").setInteger(0,
                    employeeId).uniqueResult();
            session.getTransaction().commit();
        }
        catch (HibernateException e)
        {
            session.getTransaction().rollback();
            throw e;
        }

        return employee;
    }
}
