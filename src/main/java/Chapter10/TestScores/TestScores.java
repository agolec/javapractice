package Chapter10.TestScores;

public class TestScores implements Relatable {
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

    @Override
    public int getAverage() {

        return FindArrayStats.findArrayStats(this.scores,Operation.AVERAGE);
    }

    @Override
    public int getMax() {

        return FindArrayStats.findArrayStats(this.scores,Operation.MAX);
    }

    @Override
    public int getMin() {
        return FindArrayStats.findArrayStats(this.scores,Operation.MIN);
    }

    @Override
    public int getRange() {
        return FindArrayStats.findArrayStats(this.scores,Operation.RANGE);
    }

    @Override
    public int getTotal() {
        return FindArrayStats.findArrayStats(this.scores,Operation.TOTAL);
    }
    public String toString(){
        String scoresString = "Total: " + this.getTotal() + "\n" +
                    "Average: " + this.getAverage() + "\n" +
                "Minimum Score: " + this.getMin() + "\n" +
                "Maximum Score: " + this.getMax() + "\n" +
                "Range of scores: " + this.getRange();
        return scoresString;
    }
}
