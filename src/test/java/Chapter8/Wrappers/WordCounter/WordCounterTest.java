package Chapter8.Wrappers.WordCounter;

import static org.junit.Assert.assertEquals;

import Chapter8.Wrappers.Tests.TokenizeString;

import org.junit.Test;

public class WordCounterTest {

    private static final int EXPECTED_WORD_COUNT = 4;
    @Test
    public void noArgConstuctor(){
        final String inputString = "Hello How Are you?";
        final TokenizeString wordCounter = new TokenizeString(inputString);
        final int ACTUAL_WORD_COUNT = wordCounter.getTokenCount();

        assertEquals(EXPECTED_WORD_COUNT,ACTUAL_WORD_COUNT);
    }
}
