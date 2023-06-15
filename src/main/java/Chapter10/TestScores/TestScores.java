package Chapter10.TestScores;

public class TestScores {
    private int[] scores;
    private int average;
    private int total;

    TestScores(int[] scores, int size) throws InvalidTestScoreException {
        if(size > 0){
            this.scores = new int[size];
            if(scores == null){
                System.out.println("Null array.");
                return;
            }
            for(int i = 0; i < size;i++){
                if(scores[i] >= 0 && scores[i] <= 100) {

                    this.scores[i] = scores[i];
                    this.total += scores[i];
                } else {
                    throw new InvalidTestScoreException(scores[i]);
                }

            }
        }
    }
    public int averageScore(){
        int runningTotal = 0;

        return average = this.total / this.scores.length;

    }
    public String printArray(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < this.scores.length; i++){
            if(i < this.scores.length){
                sb.append(this.scores[i] + " ");
            }else{
                sb.append(this.scores);
            }
        }

        return sb.toString();
    }
}
