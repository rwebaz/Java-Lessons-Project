package com.visualpatterns.timex.test;

import com.visualpatterns.timex.controller.TimesheetListController;
import com.visualpatterns.timex.model.Employee;
import com.visualpatterns.timex.model.Timesheet;
import com.visualpatterns.timex.model.TimesheetManager;
import com.visualpatterns.timex.util.ApplicationSecurityManager;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Test class for TimeListController
 */
public class TimesheetListControllerTest extends TestCase
{
    private MockHttpServletRequest mockHttpServletRequest = null;
    private TimesheetListController timesheetListController = null;
    private TimesheetManager timesheetManager = new TimesheetManager();
    private ApplicationSecurityManager applicationSecurityManager = new ApplicationSecurityManager();
    private final int EMPLOYEE_ID = 2;
    private static int timesheetId1 = 0;
    private static int timesheetId2 = 0;

    public static void main(String args[])
    {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite()
    {
        return new TestSuite(TimesheetListControllerTest.class);
    }

    /**
     * Test GET of TimesheetList screen for an employee
     */
    public void testShowForm() throws Exception
    {
        mockHttpServletRequest = new MockHttpServletRequest("GET",
                "/timesheetlist.htm");

        Employee employee = new Employee();
        employee.setEmployeeId(EMPLOYEE_ID);
        applicationSecurityManager.setEmployee(mockHttpServletRequest,
                employee);

        // inject objects Spring normally would
        timesheetListController = new TimesheetListController();
        timesheetListController.setTimesheetManager(timesheetManager);
        timesheetListController
                .setApplicationSecurityManager(applicationSecurityManager);

        ModelAndView modelAndView = timesheetListController.handleRequest(
                mockHttpServletRequest, null);

        assertNotNull(modelAndView);
        assertNotNull(modelAndView.getModel());

        List timesheets = (List) modelAndView.getModel().get(
                TimesheetListController.MAP_KEY);
        assertNotNull(timesheets);

        Timesheet timesheet;
        for (int i = 0; i < timesheets.size(); i++)
        {
            timesheet = (Timesheet) timesheets.get(i);
            assertEquals(EMPLOYEE_ID, timesheet.getEmployeeId());
            System.out.println(timesheet.getTimesheetId() + " passed!");
        }
    }

    /**
     * Create test Timesheet objects in DB
     */
    protected void setUp() throws Exception
    {
        Timesheet timesheet = null;

        timesheet = new Timesheet();
        timesheet.setEmployeeId(EMPLOYEE_ID);
        timesheet.setPeriodEndingDate(new GregorianCalendar(2006,
                Calendar.MARCH, 04).getTime());
        timesheet.setStatusCode("P");
        timesheet.setDepartmentCode("IT");
        timesheet.setMinutesMon(480);
        timesheet.setMinutesTue(480);
        timesheet.setMinutesWed(480);
        timesheet.setMinutesThu(480);
        timesheet.setMinutesFri(480);
        timesheet.setMinutesSat(0);
        timesheet.setMinutesSun(0);
        timesheetManager.saveTimesheet(timesheet);
        timesheetId1 = timesheet.getTimesheetId();

        timesheet = new Timesheet();
        timesheet.setEmployeeId(EMPLOYEE_ID);
        timesheet.setPeriodEndingDate(new GregorianCalendar(2006,
                Calendar.MARCH, 11).getTime());
        timesheet.setStatusCode("A");
        timesheet.setDepartmentCode("IT");
        timesheet.setMinutesMon(480);
        timesheet.setMinutesTue(480);
        timesheet.setMinutesWed(480);
        timesheet.setMinutesThu(480);
        timesheet.setMinutesFri(480);
        timesheet.setMinutesSat(0);
        timesheet.setMinutesSun(0);
        timesheetManager.saveTimesheet(timesheet);
        timesheetId2 = timesheet.getTimesheetId();
    }

    /**
     * Delete test Timesheet objects from DB.
     */
    protected void tearDown() throws Exception
    {
        timesheetManager.deleteTimesheet(timesheetId1);
        timesheetManager.deleteTimesheet(timesheetId2);
    }
}
