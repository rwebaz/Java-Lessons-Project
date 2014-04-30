package com.visualpatterns.timex.job;

import java.util.List;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import com.visualpatterns.timex.model.Employee;
import com.visualpatterns.timex.model.EmployeeManager;

/**
 * Sending reminder emails to employees.
 */
public class ReminderEmail
{
    private EmployeeManager employeeManager;
    private MailSender mailSender;
    private SimpleMailMessage message;

    /**
     * Retrieves list of employees using employeeManager.getHourlyEmployees()
     * and sends emails to these employees using Spring's mail support.
     * @see EmployeeManager 
     */
    public void sendMail()
    {
        List list = employeeManager.getHourlyEmployees();
        if (list == null || list.size() < 1) return;
        String emailAddresses[] = new String[list.size()];
        Employee employee;
        for (int i = 0; i < list.size(); i++)
        {
            employee = (Employee) list.get(i);
            emailAddresses[i] = employee.getEmail();
        }
        message.setTo(emailAddresses);
        SimpleMailMessage threadSafeMailMessage = new SimpleMailMessage(
                message);
        mailSender.send(threadSafeMailMessage);
    }

    public MailSender getMailSender()
    {
        return mailSender;
    }

    public void setMailSender(MailSender mailSender)
    {
        this.mailSender = mailSender;
    }

    public SimpleMailMessage getMessage()
    {
        return message;
    }

    public void setMessage(SimpleMailMessage message)
    {
        this.message = message;
    }

    public EmployeeManager getEmployeeManager()
    {
        return employeeManager;
    }

    public void setEmployeeManager(EmployeeManager employeeManager)
    {
        this.employeeManager = employeeManager;
    }
}
