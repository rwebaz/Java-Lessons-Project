package com.visualpatterns.timex.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase
{
    public static Test suite() 
    {
       TestSuite modelTestSuite = new TestSuite("Model Tests");
       modelTestSuite.addTestSuite(TimesheetManagerTest.class);
       
       TestSuite controllerTestSuite = new TestSuite("Controller Tests");
       controllerTestSuite.addTestSuite(TimesheetListControllerTest.class);
       
       // Full test suite
       TestSuite fullSuite = new TestSuite("All Tests");
       fullSuite.addTest(modelTestSuite);
       fullSuite.addTest(controllerTestSuite);
       return fullSuite;
    }
}
