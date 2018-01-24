package com.visualpatterns.timex.model;

import java.util.Date;

//TODO: Add Javadoc comments
public class Timesheet
{
    private int timesheetId;
    private int employeeId;
    private int minutesMon = 0;
    private int minutesTue = 0;
    private int minutesWed = 0;
    private int minutesThu = 0;
    private int minutesFri = 0;
    private int minutesSat = 0;
    private int minutesSun = 0;
    private String statusCode;
    private String departmentCode;
    private Date periodEndingDate;
    private Department department;

    public int getTimesheetId()
    {
        return timesheetId;
    }

    /**
     * @param timesheetId  The timesheetId to set.
     * @uml.property  name="timesheetId"
     */
    public void setTimesheetId(int timesheetId)
    {
        this.timesheetId = timesheetId;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public int getMinutesMon()
    {
        return minutesMon;
    }

    public void setMinutesMon(int minutesMon)
    {
        this.minutesMon = minutesMon;
    }

    public int getMinutesTue()
    {
        return minutesTue;
    }

    public void setMinutesTue(int minutesTue)
    {
        this.minutesTue = minutesTue;
    }

    public int getMinutesWed()
    {
        return minutesWed;
    }

    public void setMinutesWed(int minutesWed)
    {
        this.minutesWed = minutesWed;
    }

    public int getMinutesThu()
    {
        return minutesThu;
    }

    public void setMinutesThu(int minutesThu)
    {
        this.minutesThu = minutesThu;
    }

    public int getMinutesFri()
    {
        return minutesFri;
    }

    public void setMinutesFri(int minutesFri)
    {
        this.minutesFri = minutesFri;
    }

    public int getMinutesSat()
    {
        return minutesSat;
    }

    public void setMinutesSat(int minutesSat)
    {
        this.minutesSat = minutesSat;
    }

    public int getMinutesSun()
    {
        return minutesSun;
    }

    public void setMinutesSun(int minutesSun)
    {
        this.minutesSun = minutesSun;
    }

    public String getStatusCode()
    {
        return statusCode;
    }

    public void setStatusCode(String statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getDepartmentCode()
    {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode)
    {
        this.departmentCode = departmentCode;
    }

    public Date getPeriodEndingDate()
    {
        return periodEndingDate;
    }

    public void setPeriodEndingDate(Date periodEndingDate)
    {
        this.periodEndingDate = periodEndingDate;
    }

    public Department getDepartment()
    {
        return department;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public int getTotalMinutes()
    {
        return (minutesMon + minutesTue + minutesWed + minutesThu
                + minutesFri + minutesSat + minutesSun);
    }
}
