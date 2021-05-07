package Chapter9.ProgrammingChallenges.numberNine;

public abstract class BankAccount {

    private double balance;
    private int numberOfDeposits;
    private int numberOfWithdrawls;
    private double annualInterestRate;
    protected double monthlyServiceCharges;

    BankAccount(double balance,double interestRate){
        this.balance = balance;
        this.annualInterestRate = interestRate;
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        this.numberOfDeposits++;
    }
    public void withdrawl(double withdrawlAmount){
        this.balance -= withdrawlAmount;
        this.numberOfWithdrawls++;
    }
    private void calcInterest(){
        double monthlyInterestRate = (annualInterestRate / 12);

        monthlyInterestRate = balance * monthlyInterestRate;
        balance += monthlyInterestRate;
        System.out.println("Monthly Interest Rate was: $" + monthlyInterestRate);
        System.out.println("Annual was: " + annualInterestRate);
        System.out.println("Balance after adding the monthly interest rate was: $" + balance);
    }
    public void monthlyProcess(){
        balance -= monthlyServiceCharges;
        calcInterest();
        numberOfWithdrawls = 0;
        numberOfDeposits = 0;
        monthlyServiceCharges = 0;
    }



    public double getBalance(){
        return this.balance;
    }
    public int getNumberOfDeposits(){
        return this.numberOfDeposits;
    }
    public int getNumberOfWithdrawls(){
        return this.numberOfWithdrawls;
    }

}
