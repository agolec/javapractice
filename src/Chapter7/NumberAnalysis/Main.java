package Chapter7.NumberAnalysis;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] numberArray = { 10,20,30 };

        NumberAnalysis numbers = new NumberAnalysis();
        numbers.setArray(numberArray);

        System.out.println("I have not calculated anything yet. Just initialized the array inside the object.");
        numbers.getTotalValue();
        numbers.getAverageValue();
        numbers.getMaximumValue();
        numbers.getMinimumValue();

       System.out.println(numbers.toString());



    }
}
