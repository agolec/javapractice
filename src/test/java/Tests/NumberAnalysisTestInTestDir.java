package Tests;


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Chapter7.NumberAnalysis.NumberAnalysis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberAnalysisTestInTestDir {
    public NumberAnalysisTestInTestDir() {
    }

    @Test
    void noArgConstructor_KeepsAllValuesAtZero_returnGetFieldMethods() {
        NumberAnalysis analysis = new NumberAnalysis();
        int[] array = analysis.getEntryArrayField();
        Assertions.assertEquals(0, analysis.getAverageField());
        Assertions.assertEquals(0, analysis.getMinimumField());
        Assertions.assertEquals(0, analysis.getMaximumField());
        Assertions.assertEquals(0, analysis.getTotalField());

        for(int i = 0; i < array.length; ++i) {
            Assertions.assertEquals(0, array[i]);
        }

    }

    @Test
    void intArgConstructor_setsAllReturnFields_ThreeElementArray() {
        int[] entries = new int[]{20, 10, 25};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        Assertions.assertEquals(18, analysis.getAverageValue());
        Assertions.assertEquals(25, analysis.getMaximumValue());
        Assertions.assertEquals(10, analysis.getMinimumValue());
        Assertions.assertEquals(55, analysis.getTotalValue());
    }

    @Test
    void calcAverage_ArrayEntriesTenAndTwenty_EqualsFifteen() {
        int[] entries = new int[]{10, 20};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        Assertions.assertEquals(15, analysis.getAverageValue());
    }

    @Test
    void calcMaximumValue_ArrayEntryMaximumValueTwenty_EqualsTwenty() {
        int[] entries = new int[]{10, 11, 20, 18, 18};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        Assertions.assertEquals(20, analysis.getMaximumValue());
    }

    @Test
    void calcMinimumValue_ArrayEntryMinimumValueTen_EqualsTen() {
        int[] entries = new int[]{10, 11, 20, 18, 18};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        Assertions.assertEquals(10, analysis.getMinimumValue());
    }

    @Test
    void calcTotalValues_ArrayEntryMinimumValueTen_EqualsOneHundredFifty() {
        int[] entries = new int[]{10, 20, 30, 40, 50};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        Assertions.assertEquals(150, analysis.getTotalValue());
    }

    @Test
    void toString_threeEntryArray_equalsText_threeEntryArray() {
        int[] entries = new int[]{10, 20, 30};
        NumberAnalysis analysis = new NumberAnalysis(entries);
        analysis.getMinimumValue();
        analysis.getMaximumValue();
        analysis.getAverageValue();
        analysis.getTotalValue();
        Assertions.assertEquals("The array contains the following values: {  [10], [20], [30] }\n\nThe average is: 20.\nThe highest value is: 30\nThe lowest value is: 10\nThe total is: 60", analysis.toString());
    }
}


