package com.visualpatterns.timex.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

    
public class SimpleTest extends TestCase
{
    int value1 = 2, value2 = 3, expectedResult = 5;

    public static void main(String args[])
    {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite()
    {
        return new TestSuite(SimpleTest.class);
    }

    public void testAddSuccess()
    {
        assertTrue(value1 + value2 == expectedResult);
    }

    public void testAddFail()
    {
        assertTrue(value1 - value2 == expectedResult);
    }
}
