package Chapter10.TestScores;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TestScoreDemoScanner {
    public static void main(String[] args) throws InvalidTestScoreException {
        int[] numbersArray;
        final int SIZE = enterArraySize();
        numbersArray = new int[SIZE];

        Random rand = new Random();
        numbersArray = generateArray(SIZE, rand);

        TestScores scores = new TestScores(numbersArray,SIZE);

        printStats(scores);

    }

    private static void printStats(TestScores scores) {
        System.out.println("Average score is: " + scores.getAverage());
        System.out.println("Range of scores is: " + scores.getRange());
        System.out.println("Highest score is: " + scores.getMax());
        System.out.println("Lowest score is: " + scores.getMin());
        System.out.println("Total of all scores is: " + scores.getTotal());
        System.out.println("Array: " + scores.printArray());
    }

    private static int[] generateArray(int SIZE, Random rand) {
        final int UPPER_BOUND = 101;
        int[] numbersArray;
        numbersArray = IntStream.range(0, SIZE)
                .map(i -> rand.nextInt(UPPER_BOUND))
                .toArray();
        return numbersArray;
    }

    private static int enterArraySize() {
        int arraySize = 0;
        String input;
        boolean hasNextInt = false;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the size of an array:");
        try {
            input = keyboard.next();


            arraySize = Integer.parseInt(input);
        } catch(IllegalArgumentException e){
            System.out.println("ERROR: Illegal argument Exception.\n");
            System.out.println(e.getMessage());
        }

        return arraySize;
    }
}
