package com.visualpatterns.timex.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

//TODO: Add Javadoc comments
public class SpringTest
{
    public static void main(String args[]) throws Exception
    {
        FileSystemXmlApplicationContext factory = 
            new FileSystemXmlApplicationContext(
                "src/conf/springtest-applicationcontext.xml");

        SpringTestMessage stm = (SpringTestMessage) factory
                .getBean("springtestmessage");
    }
}
