package Chapter8.Wrappers.Tests;

import Chapter8.Wrappers.Challenges.BackwardsString.StringProcessor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;
import java.util.Collection;

@RunWith(JUnitParamsRunner.class)
public class StringProcessorTest {

    private StringProcessor processor;
    private final String expectedResult;
    private final String inputString;

    public StringProcessorTest(String inputString, String expectedResult){
        super();
        this.inputString = inputString;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize(){
        processor = new StringProcessor();
    }



    @Parameters
    public static Collection stringValues(){
        return Arrays.asList(new Object[][] { {"HELLO","OLLEH"},
                {"TESTING", "GNITSET"} });
    }

    @Test
    public void objectConstructor_InitializeStringBuilderInside_EqualsPassedString(String inputString, String expectedResult){

        Object input;

        input = inputString;

        processor = new StringProcessor(input);

        Assert.assertEquals(expectedResult, processor.printReverseString());

    }
}
