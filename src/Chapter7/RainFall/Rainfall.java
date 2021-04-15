package Chapter7.RainFall;

//Write a rainfall class which saves 12 months of an array of doubles.

//Program must have the following methods that return the following:
//
// total rainfall for the year.
//
//average monthly rainfall.
//
//month with the most rainfall.
//
//Month with the least rainfall.
public class Rainfall {
    private final int MONTHS = 12;

    private double averageRainfall;

    private double[] rainfall = {12, 33, 44, 33, 12, 68, 9.43, 2.2, 3, 78, 32, 49.3};

    Rainfall() {
        averageRainfall = 0;
    }

    public double getTotalAnnualRainfall() {
        double sumOfRainfall = 0;

        for (int i = 0; i < MONTHS; i++) {
            sumOfRainfall += rainfall[i];
        }
        return sumOfRainfall;
    }

    public double getAverageRainFall() {
        double sumOfRainfall = 0;

        for (int i = 0; i < MONTHS; i++) {
            sumOfRainfall += rainfall[i];
        }
        averageRainfall = sumOfRainfall / MONTHS;

        return averageRainfall;
    }

    public double getMonthWithMostRainfall() {
        int highestRainfallIndex = 0;

        for (int i = 0; i < MONTHS; i++) {
            if (rainfall[i] > rainfall[highestRainfallIndex]) {
                highestRainfallIndex = i;
            }
        }
        return rainfall[highestRainfallIndex];
    }
    public double getMonthWithLeastRainfall(){
        int lowestRainfallIndex = 0;

        for(int i = 0; i < MONTHS; i++){
            if(rainfall[i] < rainfall[lowestRainfallIndex]){
                lowestRainfallIndex = i;
            }
        }
        return rainfall[lowestRainfallIndex];
    }
}


