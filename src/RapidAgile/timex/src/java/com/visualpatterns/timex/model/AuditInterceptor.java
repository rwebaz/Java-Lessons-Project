package com.visualpatterns.timex.model;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

/**
 * Hibernate interceptor class.
 * @author anil
 */
public class AuditInterceptor extends EmptyInterceptor
{
    private static Log log = LogFactory.getLog(AuditInterceptor.class);

    public void afterTransactionCompletion(Transaction tx)
    {
        log.debug("afterTransactionCompletion called!");
    }

    public boolean onSave(
            Object entity,
            Serializable id,
            Object[] state,
            String[] propertyNames,
            Type[] types)
    {
        return false;
    }
}
