package com.visualpatterns.timex.test;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mock.web.MockHttpServletRequest;

import com.visualpatterns.timex.controller.TimesheetListController;
import com.visualpatterns.timex.model.DepartmentManager;
import com.visualpatterns.timex.model.EmployeeManager;
import com.visualpatterns.timex.model.TimesheetManager;
import com.visualpatterns.timex.util.ApplicationSecurityManager;

import junit.framework.TestCase;

public class TimexTestCase extends TestCase
{
    protected DepartmentManager departmentManager;
    protected EmployeeManager employeeManager;
    protected TimesheetManager timesheetManager;
    protected ApplicationSecurityManager applicationSecurityManager;
    protected MockHttpServletRequest mockHttpServletRequest = null;
    protected TimesheetListController timesheetListController = null;
    protected XmlBeanFactory springFactory;
    
    protected TimexTestCase()
    {
        FileSystemResource res = new FileSystemResource("src/conf/timex2-servlet.xml");
        springFactory = new XmlBeanFactory(res);
        departmentManager = (DepartmentManager)springFactory.getBean("departmentManagerProxy");
        employeeManager = (EmployeeManager)springFactory.getBean("employeeManagerProxy");
        timesheetManager = (TimesheetManager)springFactory.getBean("timesheetManagerProxy");
        applicationSecurityManager = (ApplicationSecurityManager)springFactory.getBean("applicationSecurityManager");
    }    
}
