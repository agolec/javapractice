package Chapter10.TestScores;

public class FindArrayStats {
    public static int findArrayStats(int[] array, Operation operator){
        int seekedStat = 0;
        switch(operator){
            case MAX:
                seekedStat= findMax(array);
                break;
            case AVERAGE:
                seekedStat = findAverage(array);
                break;
            case MIN:
                seekedStat = findMinimumValue(array);
                break;
            case RANGE:
                seekedStat = findRangeOfArray(array);
                break;
            case TOTAL:
                seekedStat = findTotalOfArray(array);
        }
        return seekedStat;
    }

    private static int findTotalOfArray(int[] array) {
        int totalValuesOfArray = 0;

        for(int i = 0; i < array.length; i++){
            totalValuesOfArray += array[i];
        }
        return totalValuesOfArray;
    }

    private static int findRangeOfArray(int[] array) {
        int maximumValue = findMax(array);
        int minimumValue = findMinimumValue(array);

        return maximumValue - minimumValue;
    }

    private static int findMinimumValue(int[] array) {
        int minimumValueInArray = array[0];

        for(int i = 1; i < array.length; i++){
            if (minimumValueInArray > array[i]){
                minimumValueInArray = array[i];
            }
        }
        return minimumValueInArray;
    }


    public static int findMax(int[] array){
        int maximumValueInArray = array[0];

        for(int i = 1; i < array.length; i++){
            if (maximumValueInArray < array[i]){
                   maximumValueInArray = array[i];
            }
        }
        return maximumValueInArray;
    }
    private static int findAverage(int[] array) {

        int runningTotal = 0;
        for(int i = 0; i < array.length; i++){
            runningTotal += array[i];
        }
        return runningTotal / array.length;

    }
}
