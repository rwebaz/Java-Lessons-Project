package com.visualpatterns.timex.controller;

import org.springframework.validation.Errors;
import com.visualpatterns.timex.model.Employee;

/**
 * Validator for SignInController
 * @author anil
 * @see com.visualpatterns.timex.controller.SignInController
 */
public class SignInValidator implements
        org.springframework.validation.Validator
{
    public boolean supports(Class clazz)
    {
        return clazz.equals(Employee.class);
    }

    /**
     * Validates an Employee command object. Ensures that employeeId
     * is greater than zero and that a password is specified.
     * @see Employee 
     */
    public void validate(Object command, Errors errors)
    {
        Employee employee = (Employee) command;
        if (employee == null) return;

        int employeeId = employee.getEmployeeId();
        String password = employee.getPassword();

        if (employeeId < 1)
            errors.reject("error.login.invalid");
        else
            if (password == null || password.trim().length() < 8
                    || password.trim().length() > 10)
                errors.reject("error.login.invalid");
    }
}
