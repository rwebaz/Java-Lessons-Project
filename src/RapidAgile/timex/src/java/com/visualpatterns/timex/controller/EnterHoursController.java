package com.visualpatterns.timex.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.visualpatterns.timex.model.DepartmentManager;
import com.visualpatterns.timex.model.Employee;
import com.visualpatterns.timex.model.Timesheet;
import com.visualpatterns.timex.model.TimesheetManager;
import com.visualpatterns.timex.util.ApplicationSecurityManager;
import com.visualpatterns.timex.util.DateUtil;

/**
 * Controller class for the "Enter Hours" screen
 * @author anil
 */
public class EnterHoursController extends SimpleFormController
{
    private TimesheetManager timesheetManager = null;
    private DepartmentManager departmentManager = null;
    private ApplicationSecurityManager applicationSecurityManager;
    public static final String TID = "tid";

    /**
     * Returns a new instance of Timesheet object if "tid" HTTP parameter is
     * specified; other returns instance of object in database matching the
     * value of the "tid" parameter.
     * @see Timesheet
     */
    protected Object formBackingObject(HttpServletRequest request)
    {
        if (request.getParameter(TID) != null
                && request.getParameter(TID).trim().length() > 0)
            return timesheetManager.getTimesheet(Integer.parseInt(request
                    .getParameter(TID)), false);

        Timesheet timesheet = new Timesheet();
        Employee employee = (Employee) applicationSecurityManager
                .getEmployee(request);
        timesheet.setEmployeeId(employee.getEmployeeId());
        timesheet.setStatusCode("P");
        timesheet.setPeriodEndingDate(DateUtil.getCurrentPeriodEndingDate());
        return timesheet;
    }

    /**
     * Registers the MinutesPropertyEditor
     */
    protected void initBinder(
            HttpServletRequest request,
            ServletRequestDataBinder binder) throws Exception
    {
        binder.registerCustomEditor(int.class, new MinutesPropertyEditor());
    }

    /**
     * Returns Hashmap containing a list of all Department databse records
     * @see com.visualpatterns.timex.model.Department
     */
    protected Map referenceData(HttpServletRequest request) throws Exception
    {
        HashMap model = new HashMap();
        model.put("departments", departmentManager.getDepartments());

        return model;
    }

    /**
     * Saves Timesheet command object using 
     * timesheetManager.saveTimesheet(timesheet);
     * @see TimesheetManager
     */
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors)
    {
        Timesheet timesheet = (Timesheet) command;
        timesheetManager.saveTimesheet(timesheet);
        request.getSession().setAttribute(
                "message",
                getMessageSourceAccessor().getMessage(
                        "message.enterhours.savesuccess"));
        return new ModelAndView(getSuccessView());
    }

    public TimesheetManager getTimesheetManager()
    {
        return timesheetManager;
    }

    public void setTimesheetManager(TimesheetManager timesheetManager)
    {
        this.timesheetManager = timesheetManager;
    }

    public DepartmentManager getDepartmentManager()
    {
        return departmentManager;
    }

    public void setDepartmentManager(DepartmentManager departmentManager)
    {
        this.departmentManager = departmentManager;
    }

    public ApplicationSecurityManager getApplicationSecurityManager()
    {
        return applicationSecurityManager;
    }

    public void setApplicationSecurityManager(
            ApplicationSecurityManager applicationSecurityManager)
    {
        this.applicationSecurityManager = applicationSecurityManager;
    }
}
