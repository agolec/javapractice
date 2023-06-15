package Chapter7.NumberAnalysis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberAnalysisTest {

    @Test
    public void noArgConstructor_KeepsAllValuesAtZero_returnGetFieldMethods(){
        final String TYPE_OF_TEST = "NO-ARG";

        NumberAnalysis analysis = new NumberAnalysis();
        int[] array = analysis.getEntryArrayField();
        
        final int expected_value = 0;
        final int ACTUAL_AVERAGE = analysis.getAverageField();
        final int ACTUAL_MINIMUM = analysis.getMinimumField();
        final int ACTUAL_MAXIMUM = analysis.getMaximumField();
        final int ACTUAL_TOTAL = analysis.getTotalField();
        
        assertEquals(expected_value, ACTUAL_AVERAGE,TYPE_OF_TEST + ": ERROR: Average was not 0.\n Actual Average:: "+ analysis.getAverageField());
        assertEquals(expected_value, ACTUAL_MINIMUM,TYPE_OF_TEST + ": Error: Minimum field expected 0. \nActual Value: " + analysis.getMinimumField());
        assertEquals(expected_value, ACTUAL_MAXIMUM,TYPE_OF_TEST + ": Error: No-Arg constructor test. Maximum field expected 0. \nActual Value:" + analysis.getMaximumField());
        assertEquals(expected_value, ACTUAL_TOTAL);

        for(int i = 0; i < array.length; i++){
            assertEquals(0,array[i]);
        }
    }
    @Test
    public void intArgConstructor_setsAllReturnFields_ThreeElementArray(){
        final int SIZE = 3;
        int[] entries = new int[SIZE];
        generateRandomNumbersInArray(SIZE, entries);
        Arrays.sort(entries);
        //int entries[] = new int[] {20,10,25};

        int expectedTotalValue = 0;
            for(int i = 0; i < entries.length;i++){
                expectedTotalValue += entries[i];
            }
        int expectedAverageValue = expectedTotalValue / entries.length;
            int expectedMaximumValue = entries[entries.length - 1];
            int expectedMinimumValue = entries[0];



        NumberAnalysis analysis = new NumberAnalysis(entries);
        int actualAverageValue = analysis.getAverageValue();
        int actualMaximumValue = analysis.getMaximumValue();
        int actualMinimumValue = analysis.getMinimumValue();
        int actualTotalValue = analysis.getTotalValue();

        assertEquals(expectedAverageValue, actualAverageValue);
        assertEquals(expectedMaximumValue, actualMaximumValue);
        assertEquals(expectedMinimumValue,actualMinimumValue);
        assertEquals(expectedTotalValue,actualTotalValue);
    }

    private static void generateRandomNumbersInArray(int SIZE, int[] entries) {
        generateRandomNumbersInArray(SIZE,entries,true);
    }
    private static void generateRandomNumbersInArray(int SIZE, int[] entries, boolean SORT){
        for(int i = 0; i < SIZE; i++){
            entries[i] = (int)(Math.random() * 100) + 1;
        }
        if(SORT){
            Arrays.sort(entries);
        }
    }

    @Test
    public void calcAverage_ArrayEntriesTenAndTwenty_EqualsFifteen(){
        int[] entries = {10,20};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(15,analysis.getAverageValue());
    }

    @Test
    public void calcMaximumValue_ArrayEntryMaximumValueTwenty_EqualsTwenty(){
        int[] entries = {10,11,20,18,18};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(20,analysis.getMaximumValue());
    }
    @Test
    public void calcMinimumValue_ArrayEntryMinimumValueTen_EqualsTen(){
        int[] entries = {10,11,20,18,18};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(10,analysis.getMinimumValue());
    }
    @Test
    public void calcTotalValues_ArrayEntryMinimumValueTen_EqualsOneHundredFifty(){
        int[] entries = {10,20,30,40,50};

        NumberAnalysis analysis = new NumberAnalysis(entries);

        assertEquals(150,analysis.getTotalValue());
    }
    @Test
    public void toString_threeEntryArray_equalsText_threeEntryArray(){
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
