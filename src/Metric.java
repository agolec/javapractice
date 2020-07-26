public class Metric {
    /**
     * The milesToKilometers method converts miles
     * to kilometers. A distance in miles should
     * be passes into the miles parameter. The method
     * returns the equivalent distance in kilometers.
     */

    public static double milesToKilometers(double miles){
        return miles * 1.609;
    }

    /**
     * The kilometers to miles method converts kilometers
     * to miles. A distance in kilometers should be passed
     * into the kilometers parameter. The method
     * returns the equivalent distance in miles.
     */

    public static double kilometersTiMiles(double kilometers){
        return kilometers / 1.609;
    }

    public static void main(String[] args){
        System.out.println("10 miles to kilometers is: " + Metric.milesToKilometers(10));
        System.out.println("10 kilometers to miles is: " + Metric.kilometersTiMiles(10));

    }
}

