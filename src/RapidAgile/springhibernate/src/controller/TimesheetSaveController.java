package controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model.Timesheet;
import model.TimesheetManager;

public class TimesheetSaveController implements Controller
{
    private TimesheetManager timesheetManager;
    

    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception
    {
        int minutes=480;
        String param=request.getParameter("m");
        if (param != null)
            minutes = Integer.parseInt(param);
        
        Timesheet timesheet = new Timesheet();
        timesheet.setTimesheetId(9999);
        timesheet.setStatusCode("P");
        timesheet.setDepartmentCode("IT");
        timesheet.setPeriodEndingDate(new Date());
        timesheet.setMinutesMon(minutes);
        timesheetManager.saveTimesheet(timesheet);
        
        return new ModelAndView("timesheetsave");
    }

    public TimesheetManager getTimesheetManager()
    {
        return timesheetManager;
    }

    public void setTimesheetManager(TimesheetManager timesheetManager)
    {
        this.timesheetManager = timesheetManager;
    }
}
