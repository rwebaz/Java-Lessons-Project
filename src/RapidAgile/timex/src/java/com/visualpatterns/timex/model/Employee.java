package com.visualpatterns.timex.model;

import java.io.Serializable;

//TODO: Add Javadoc comments
public class Employee implements Serializable
{
    private int employeeId;
    private int managerEmployeeId;
    private String name;
    private String password;
    private String email;
    private String employeeCode;

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public int getManagerEmployeeId()
    {
        return managerEmployeeId;
    }

    public void setManagerEmployeeId(int managerEmployeeId)
    {
        this.managerEmployeeId = managerEmployeeId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmployeeCode()
    {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode)
    {
        this.employeeCode = employeeCode;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
