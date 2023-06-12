package Chapter9.ProgrammingChallenges.numberOne;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyRate;

    public ProductionWorker(int shift, int hourlyPay){
        super();
        this.shift = shift;
        this.hourlyRate = hourlyPay;
    }
    //Mutators.
    public void setShift(int shift){
        this.shift = shift;
    }
    public void setHourlyPay(double hourlyPay){
        this.hourlyRate = hourlyPay;
    }
    //Accessors
    public String getShift(){
        if(this.shift == 1){
            return "DAY SHIFT";
        } else if (this.shift == 2) {
            return "NIGHT SHIFT";
        } else {
            return "shift wasn't set correctly, or at all.";
        }
    }
    public double getHourlyRate(){
        return this.hourlyRate;
    }
    public int getShiftField(){
        return this.shift;
    }
    public String printShiftInputError(){
        return "input for shift was incorrect. Please re-enter 1 or 2.";
    }

}
