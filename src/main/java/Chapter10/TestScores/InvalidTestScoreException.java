package Chapter10.TestScores;

public class InvalidTestScoreException extends Exception {
    public InvalidTestScoreException(int score){
        super("Error: Invalid Test Score Value Given: "+ score +
                "\nEnter a number between 1 and 100.");
    }
}
