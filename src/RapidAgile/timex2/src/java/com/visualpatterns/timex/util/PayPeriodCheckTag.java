package com.visualpatterns.timex.util;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * JSP tag library for checking if a date falls in current
 * pay period.
 */
public class PayPeriodCheckTag 
       extends TagSupport
{
    private Date checkDate;
    
    /**
     * @return EVAL_BODY_INCLUDE if checkDate falls in current period 
     */
    public int doStartTag() throws JspException
    {
        boolean includeText = (DateUtil.isInCurrentPayPeriod(checkDate));
        if (includeText)
            return TagSupport.EVAL_BODY_INCLUDE;
        
        return TagSupport.SKIP_BODY;
    }
    
    public Date getCheckDate()
    {
        return checkDate;
    }

    public void setCheckDate(Date checkDate)
    {
        this.checkDate = checkDate;
    }
}