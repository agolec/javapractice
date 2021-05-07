package Chapter9.ProgrammingChallenges.numberNine;

public class SavingsAccount extends BankAccount {
    private boolean active;
    private static final int MIN_ACTIVE_BALANCE = 25;

    SavingsAccount(double balance, double interestRate){
        super(balance, interestRate);
        active = true;

    }
    public void withdrawl(double withdrawlAmount){
        if(super.getBalance() < MIN_ACTIVE_BALANCE){
            active = false;
        } else {
            active = true;
        }

        if(active){
            super.withdrawl(withdrawlAmount);
        } else {
            System.out.println("Account is inactive. " +
                    "\nAccount balance too low. " +
                    "\nBalance: $" + super.getBalance() + "." +
                    "\nYou cannot withdraw until you get over $25.");
        }
    }

    public void deposit(double depositAmount){
        super.deposit(depositAmount);

        if(super.getBalance() > MIN_ACTIVE_BALANCE){
            active = true;
        } else {
            active = false;
        }
    }
    public void monthlyProcess(){
        if(super.getNumberOfWithdrawls() > 4){
            super.monthlyServiceCharges = super.getNumberOfWithdrawls() - 4;
            System.out.println("This month's service charge: " + super.monthlyServiceCharges);
        }
        super.monthlyProcess();
        if(super.getBalance() > MIN_ACTIVE_BALANCE){
            active = false;
        }

        System.out.println("Monthly process finished.");
    }
    public double getMonthlyServiceCharge(){
        return super.monthlyServiceCharges;
    }

}
