package com.visualpatterns.timex.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.visualpatterns.timex.util.ApplicationSecurityManager;

/**
 * Controller for "signing out" of the application.
 * @author anil
 */
public class SignOutController implements Controller
{
    private ApplicationSecurityManager applicationSecurityManager;
    private String successView;

    /**
     * Removes Employee object from session using ApplicationSecurityManager.
     * @see ApplicationSecurityManager 
     */
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception
    {
        applicationSecurityManager.removeEmployee(request);
        return new ModelAndView(getSuccessView());
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

    public String getSuccessView()
    {
        return successView;
    }

    public void setSuccessView(String successView)
    {
        this.successView = successView;
    }
}
