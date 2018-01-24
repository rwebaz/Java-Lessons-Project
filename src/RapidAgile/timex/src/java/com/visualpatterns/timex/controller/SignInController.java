package com.visualpatterns.timex.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.visualpatterns.timex.model.Employee;
import com.visualpatterns.timex.model.EmployeeManager;
import com.visualpatterns.timex.util.ApplicationSecurityManager;
import com.visualpatterns.timex.util.TimexJmxBean;

/**
 * Controller for the Sign In screen.
 * @author anil
 */
public class SignInController extends SimpleFormController
{
    private EmployeeManager employeeManager;
    private ApplicationSecurityManager applicationSecurityManager;
    private TimexJmxBean timexJmxBean;
    
    /** 
     * Always returns a new Employee object
     * @see Employee 
     */
    protected Object formBackingObject(HttpServletRequest request)
            throws Exception
    {
        return new Employee();
    }

    /** Forwards to success view, if already logged in */
    public ModelAndView showForm(
            HttpServletRequest request,
            HttpServletResponse response,
            BindException errors,
            Map controlModel) throws Exception
    {
        if (applicationSecurityManager.getEmployee(request) != null)
            return new ModelAndView(getSuccessView());

        return super.showForm(request, response, errors, controlModel);
    }

    /** Validates user/password against database */
    public void onBindAndValidate(
            HttpServletRequest request,
            Object command,
            BindException errors) throws Exception
    {
        if (errors.hasErrors()) return;

        Employee formEmployee = (Employee) command;
        Employee dbEmployee = (Employee) command;
        if ((dbEmployee = employeeManager.getEmployee(formEmployee
                .getEmployeeId())) == null)
            errors.reject("error.login.invalid");
        else
        {
            timexJmxBean.setSignInCount(timexJmxBean.getSignInCount() + 1);
            applicationSecurityManager.setEmployee(request, dbEmployee);
        }
    }

    /** returns ModelAndView(getSuccessView()) */
    public ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception
    {
        return new ModelAndView(getSuccessView());
    }

    public EmployeeManager getEmployeeManager()
    {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager)
    {
        this.employeeManager = employeeManager;
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
    
    public TimexJmxBean getTimexJmxBean()
    {
        return timexJmxBean;
    }

    public void setTimexJmxBean(TimexJmxBean timexJmxBean)
    {
        this.timexJmxBean = timexJmxBean;
    }
}
