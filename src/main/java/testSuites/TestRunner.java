package testSuites;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    /**
     * Declare a main method of the class to run the JUnit test in.
     *
     * Executing test cases using JunitCore.runclasses takes the test class name
     * as a parameter. In this case, TestSuite.class
     *
     * Processing the result using the for loop and printing out the failed result.
     *
     * Printing out the successful result.
     *
     */
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestSuite.class);
        for(Failure failure: result.getFailures()){
            System.out.println("Failure Message: " + failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
