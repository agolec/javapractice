package Chapter10.TestScores;

import java.util.Random;
import java.util.stream.IntStream;

public class TestScoresDemo {
    public static void main(String[] args) throws InvalidTestScoreException {
        final int UPPER_BOUND = 101;

        final int SIZE = 5;
        int[] numbers;

        Random rand = new Random();

        numbers = IntStream.range(0, SIZE)
                .map(i -> rand.nextInt(UPPER_BOUND))
                .toArray();

        numbers[0] = -1;
        TestScores testScore = new TestScores(numbers,SIZE);

        System.out.println("Average is: " + testScore.getAverage());
        System.out.println("Array values: " + testScore.printArray());


    }
}
