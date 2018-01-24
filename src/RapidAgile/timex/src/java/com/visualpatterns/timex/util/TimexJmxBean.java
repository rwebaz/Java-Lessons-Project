package com.visualpatterns.timex.util;

public class TimexJmxBean
{
    private static int signInCount;
    private static int timesheetsFetched;

    public int getSignInCount()
    {
        return signInCount;
    }

    public void setSignInCount(int signInCount)
    {
        TimexJmxBean.signInCount = signInCount;
    }

    public int getTimesheetsFetched()
    {
        return timesheetsFetched;
    }

    public void setTimesheetsFetched(int timesheetsFetched)
    {
        TimexJmxBean.timesheetsFetched = timesheetsFetched;
    }
}
