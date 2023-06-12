package Chapter8.Wrappers.Tests;

import Chapter6.Challenges.Tests.MonthTest;
import Chapter8.Wrappers.Challenges.BackwardsString.StringProcessor;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args){

        Result result = JUnitCore.runClasses(StringProcessorTest.class);

        for(Failure failures: result.getFailures()) {
            System.out.println(failures.toString());
        }
        System.out.println(result.wasSuccessful());


    }
}
