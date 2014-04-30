package com.visualpatterns.timex.controller;

import java.beans.PropertyEditorSupport;
import java.text.DecimalFormat;

/**
 * Property editor for the Enter Hours screen; registered in 
 * the EnterHoursController class.
 * @author anil
 * @see com.visualpatterns.timex.controller.EnterHoursController
 */
public class MinutesPropertyEditor extends PropertyEditorSupport
{
    private final double ALTER_BY = 60.0; // 60 seconds
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    /**
     * Divides value by 60 and returns result
     */
    public String getAsText()
    {
        Integer value = (Integer) getValue();
        if (value == null) return "";

        float newValue = (float) value.intValue() / (float) ALTER_BY;
        return decimalFormat.format(newValue);
    }

    /**
     * Multiplies value by 60 and returns result
     */
    public void setAsText(String text) throws IllegalArgumentException
    {
        try
        {
            Float newValue = new Float(Float.valueOf(text).floatValue()
                    * ALTER_BY);
            setValue(new Integer(newValue.intValue()));
        }
        catch (NumberFormatException ex)
        {
            throw new IllegalArgumentException("Invalid number: " + text);
        }
    }
}
