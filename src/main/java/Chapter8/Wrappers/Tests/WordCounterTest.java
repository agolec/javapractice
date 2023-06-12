package Chapter8.Wrappers.Tests;

import Chapter8.Wrappers.WordCounter.WordCounter;
import org.junit.Assert;
import org.junit.Test;

public class WordCounterTest {
    @Test
    public void noArgConstuctor(){

        final int EXPECTED_WORD_COUNT = 4;

        String inputString = "Hello How Are you?";
        TokenizeString wordCounter = new TokenizeString(inputString);
        final int ACTUAL_WORD_COUNT = wordCounter.getTokenCount();

        Assert.assertEquals(EXPECTED_WORD_COUNT,ACTUAL_WORD_COUNT);

    }
}
