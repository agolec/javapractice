package Chapter8.Wrappers.Tests;

import Chapter8.Wrappers.Challenges.BackwardsString.StringProcessor;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
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
        processor = new StringProcessor(inputString);
    }

    @Test
    public void objectConstructor_InitializeStringBuilderInside_EqualsPassedString(){
        String input;

        input = inputString;

        processor = new StringProcessor(inputString);

        Assert.assertEquals(expectedResult, processor.printReverseString());

    }

    @Parameterized.Parameters
    public static Collection stringValues(){
        return Arrays.asList(new Object[][] { {"HELLO","OLLEH"},
                {"TESTING", "GNITSET"} });
    }
}
