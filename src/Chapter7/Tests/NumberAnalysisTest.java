package Chapter7.Tests;

import org.junit.jupiter.api.Test;
import Chapter7.NumberAnalysis.NumberAnalysis;

import static org.junit.jupiter.api.Assertions.*;

public class NumberAnalysisTest {

    @Test
    void noArgConstructor_KeepsAllValuesAtZero_returnGetFieldMethods(){
        NumberAnalysis analysis = new NumberAnalysis();
        int[] array = analysis.getEntryArrayField();

        assertEquals(0, analysis.getAverageField());
        assertEquals(0, analysis.getMinimumField());
        assertEquals(0, analysis.getMaximumField());
        assertEquals(0, analysis.getTotalField());

        for(int i = 0; i < array.length; i++){
            assertEquals(0,array[i]);
        }
    }
    @Test
    void intArgConstructor_setsAllReturnFields_ThreeElementArray(){
        int[] entries = {20,10,25};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(18, analysis.getAverageValue());
        assertEquals(25, analysis.getMaximumValue());
        assertEquals(10,analysis.getMinimumValue());
        assertEquals(55,analysis.getTotalValue());
    }

    @Test
    void calcAverage_EqualsFifteen_ArrayEntriesTenAndTwenty(){
        int[] entries = {10,20};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(15,analysis.getAverageValue());
    }

    @Test
    void calcMaximumValue_EqualsTwenty_ArrayEntryMaximumValueTwenty(){
        int[] entries = {10,11,20,18,18};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(20,analysis.getMaximumValue());
    }
    @Test
    void calcMinimumValue_EqualsTen_ArrayEntryMinimumValueTen(){
        int[] entries = {10,11,20,18,18};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(10,analysis.getMinimumValue());
    }
    @Test
    void calcTotalValues_EqualsOneHundredFifty_ArrayEntryMinimumValueTen(){
        int[] entries = {10,20,30,40,50};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(150,analysis.getTotalValue());
    }
    @Test
    void toString_equalsText_threeEntryArray(){
        int[] entries = {10,20,30};

        NumberAnalysis analysis = new NumberAnalysis(entries);
        analysis.getMinimumValue();
        analysis.getMaximumValue();
        analysis.getAverageValue();
        analysis.getTotalValue();

        assertEquals("The array contains the following values: {  [10], [20], [30] }\n" +
                "\n" +
                "The average is: 20.\n" +
                "The highest value is: 30\n" +
                "The lowest value is: 10\n" +
                "The total is: 60",analysis.toString());
    }
}
