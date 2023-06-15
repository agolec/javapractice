package Chapter8.Wrappers.Challenges.BackwardsString;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
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

        assertEquals(expectedResult, processor.printReverseString());
    }

    @Parameterized.Parameters
    public static Collection stringValues(){
        return Arrays.asList(new Object[][] { {"HELLO","OLLEH"},
                {"TESTING", "GNITSET"} });
    }
}
