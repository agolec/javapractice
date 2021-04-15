package Chapter7.RainFall;

import Chapter7.RainFall.Rainfall;

public class RainfallArrayDemo {

    public static void main(String[] args) {


    Rainfall rainfall = new Rainfall();

    System.out.println("Average Rainfall is: " + rainfall.getAverageRainFall());
    System.out.println("Sum of total rainfall is: " + rainfall.getTotalAnnualRainfall());
    System.out.println("Most rainfall is " + rainfall.getMonthWithMostRainfall());
        System.out.println("Most rainfall is " + rainfall.getMonthWithLeastRainfall());


    }
}
