package com.visualpatterns.timex.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.visualpatterns.timex.model.Department;

//TODO: Add Javadoc comments
public class HibernateTest
{
    public static void main(String args[]) throws Exception
    {
        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession(); // changed to
        // openSession
        Transaction tx = session.beginTransaction();
        Department department;

        // Demo 1: Get single record
        department = (Department) session.get(Department.class, "IT");
        System.out.println("Name for IT = " + department.getName());

        // Demo 2: Get all records
        List departmentList = session.createQuery("from Department").list();
        for (int i = 0; i < departmentList.size(); i++)
        {
            department = (Department) departmentList.get(i);
            System.out.println("Row " + (i + 1) + "> " + department.getName()
                    + " (" + department.getDepartmentCode() + ")");
        }

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
