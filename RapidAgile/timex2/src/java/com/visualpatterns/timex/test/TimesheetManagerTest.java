package com.visualpatterns.timex.test;

import com.visualpatterns.timex.model.Timesheet;
import com.visualpatterns.timex.model.TimesheetManager;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//TODO: Add Javadoc comments
public class TimesheetManagerTest extends TimexTestCase
{
    public static void main(String args[])
    {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite()
    {
        return new TestSuite(TimesheetManagerTest.class);
    }

    public void testGetByEmployeeId()
    {
        List timesheetList = timesheetManager.getTimesheets();
        assertNotNull(timesheetList);
        assertTrue(timesheetList.size() > 0);

        int employeeId = ((Timesheet) timesheetList.get(0)).getEmployeeId();
        timesheetList = timesheetManager.getTimesheets(employeeId);
        assertNotNull(timesheetList);

        Timesheet timesheet;
        for (int i = 0; i < timesheetList.size(); i++)
        {
            timesheet = (Timesheet) timesheetList.get(i);
            assertEquals(employeeId, timesheet.getEmployeeId());
            System.out.println(">>>> Department name = "
                    + timesheet.getDepartment().getName());
        }
    }

    public void testGetByEmployeeAndPeriod()
    {
        List timesheetList = timesheetManager.getTimesheets();
        if (timesheetList == null || timesheetList.size() < 1) return;

        Timesheet timesheet = (Timesheet) timesheetList.get(0);
        final int employeeId = timesheet.getEmployeeId();
        Date periodEndingDate = timesheet.getPeriodEndingDate();
        timesheet = timesheetManager.getTimesheet(employeeId,
                periodEndingDate);
        assertNotNull(timesheet);

        assertEquals(employeeId, timesheet.getEmployeeId());
        assertTrue(!periodEndingDate.before(timesheet.getPeriodEndingDate()));
        assertTrue(!periodEndingDate.after(timesheet.getPeriodEndingDate()));
        System.out.println(">>>> Department name = "
                + timesheet.getDepartment().getName());
    }

    public void testSaveSingle()
    {
        final int EMPLOYEE_ID = 1111;
        GregorianCalendar gc = new GregorianCalendar(2006,
                Calendar.SEPTEMBER, 15);
        Date periodEndingDate = gc.getTime();
        Timesheet timesheet = timesheetManager.getTimesheet(EMPLOYEE_ID,
                                periodEndingDate);
        if (timesheet == null)
        {
            timesheet = new Timesheet();
            timesheet.setEmployeeId(EMPLOYEE_ID);
            timesheet.setPeriodEndingDate(periodEndingDate);
        }
        else
            System.out.println("Timesheet record found: "
                    + timesheet.getTimesheetId());

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

        Timesheet timesheetInDb = timesheetManager.getTimesheet(EMPLOYEE_ID,
                periodEndingDate);
        assertEquals(timesheetInDb.getEmployeeId(), timesheet.getEmployeeId());
        assertEquals(timesheetInDb.getStatusCode(), "P");
        assertEquals(timesheetInDb.getDepartmentCode(), "IT");
        assertEquals(timesheetInDb.getMinutesMon(), timesheet.getMinutesMon());
        assertEquals(timesheetInDb.getMinutesTue(), timesheet.getMinutesTue());
        assertEquals(timesheetInDb.getMinutesWed(), timesheet.getMinutesWed());
        assertEquals(timesheetInDb.getMinutesThu(), timesheet.getMinutesThu());
        assertEquals(timesheetInDb.getMinutesFri(), timesheet.getMinutesFri());
        assertEquals(timesheetInDb.getMinutesSat(), timesheet.getMinutesSat());
        assertEquals(timesheetInDb.getMinutesSun(), timesheet.getMinutesSun());
        
        timesheetManager.deleteTimesheet(timesheet.getTimesheetId());
    }

    public void testDeleteByEmployeeId()
    {
        final int EMPLOYEE_ID = 9999;
        Date periodEndingDate = new Date();
        Timesheet timesheet = timesheetManager.getTimesheet(EMPLOYEE_ID,
                periodEndingDate);

        // delete just in case it exists
        if (timesheet == null)
        {
            timesheet = new Timesheet();
            timesheet.setEmployeeId(EMPLOYEE_ID);
            timesheet.setPeriodEndingDate(periodEndingDate);
        }
        else
            timesheetManager.deleteTimesheet(timesheet.getTimesheetId());
        //timesheetManager.deleteTimesheetUsingCreateQuery(timesheet.getTimesheetId());

        timesheet.setEmployeeId(EMPLOYEE_ID);
        timesheet.setPeriodEndingDate(periodEndingDate);
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

        assertTrue(timesheet.getTimesheetId() > 0);
        timesheetManager.deleteTimesheet(timesheet.getTimesheetId());

        timesheet = timesheetManager.getTimesheet(EMPLOYEE_ID,
                periodEndingDate);
        assertNull(timesheet);
    }

    public void testGetByTimesheetId()
    {
        List timesheetList = timesheetManager.getTimesheets();
        assertNotNull(timesheetList);
        assertTrue(timesheetList.size() > 0);

        Timesheet timesheetInList = (Timesheet)timesheetList.get(0); 
        int timesheetId = timesheetInList.getTimesheetId();
        Timesheet timesheetInDb = timesheetManager.getTimesheet(timesheetId, false);
        assertNotNull(timesheetInDb);
        assertEquals(timesheetInDb.getEmployeeId(), timesheetInList.getEmployeeId());
        assertEquals(timesheetInDb.getStatusCode(), "P");
        assertEquals(timesheetInDb.getDepartmentCode(), "IT");
        assertEquals(timesheetInDb.getMinutesMon(), timesheetInList.getMinutesMon());
        assertEquals(timesheetInDb.getMinutesTue(), timesheetInList.getMinutesTue());
        assertEquals(timesheetInDb.getMinutesWed(), timesheetInList.getMinutesWed());
        assertEquals(timesheetInDb.getMinutesThu(), timesheetInList.getMinutesThu());
        assertEquals(timesheetInDb.getMinutesFri(), timesheetInList.getMinutesFri());
        assertEquals(timesheetInDb.getMinutesSat(), timesheetInList.getMinutesSat());
        assertEquals(timesheetInDb.getMinutesSun(), timesheetInList.getMinutesSun());
    }
}
