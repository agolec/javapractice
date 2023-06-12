package Chapter9.ProgrammingChallenges.numberNine;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class MainProgramme {

    public static void main(String[] args) {
        String input = "";
        double accountBalance = 0;

        SavingsAccount savingAccount;


        Scanner keyboard = new Scanner(System.in);

        printBalanceInputPrompt();

        input = keyboard.nextLine();

        while (isInputNumeric(input) == false) {
            printInputConversionError(AccountInputType.DEPOSIT);
            input = keyboard.nextLine();
        }
        accountBalance = Double.parseDouble(input);
        savingAccount = new SavingsAccount(accountBalance, 0.01);



        //force program to loop over 4 withdrawls to get withdrawl counter to force a service charge.
        for(int i = 0; i < 5; i++){
            printWithdrawlInputPrompt();
            input = keyboard.nextLine();

            while(isInputNumeric(input) == false){
                printInputConversionError(AccountInputType.WITHDRAWL);
                input = keyboard.nextLine();
            }
            savingAccount.withdrawl(Double.parseDouble(input));
            System.out.println("Savings account amount is at: " + savingAccount.getBalance() +
                    "\nNumber of withdrawls: " + savingAccount.getNumberOfWithdrawls() +
                    "\n");

        }
        savingAccount.monthlyProcess();
        System.out.println("Balance after monthly process, adding interest rate changes and service charges is: $" + savingAccount.getBalance());



    }



    private static boolean isInputNumeric(@NotNull String input){
        boolean isNumeric = false;

        //code should hit this loop and check the entire input string to make sure the entire thing is a digit.
        //If it ever comes across a non-numeric digit, isNumeric gets set to false and the loop terminates.
        for(int i = 0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i)) || input.charAt(i) == '.'){
                isNumeric = true;
            } else {
                //Need to account for the decimal that will be in user's input by ignoring it.
                // Wanted to place it in another if statement seperate from the first.
                isNumeric = false;
                break;
            }
        }
        return isNumeric;
    }
    private static void printBalanceInputPrompt(){
        System.out.println("Enter input for balance.");;
    }
    private static void printInputConversionError(AccountInputType inputType){
        switch(inputType){
            case DEPOSIT:
                System.out.println("Invalid input. Input must be numeric. Enter a numeric value for your deposit.");
                break;
            case WITHDRAWL:
                System.out.println("Invalid input. Input must be numeric. Enter a numeric value for your withdrawl.");
                break;
            case INITIALIZATION:
                System.out.println("Invalid input. Input must be numeric. Enter an amount for your saving account balance to be initialized with.");
                break;
        }
    }
    private static void printWithdrawlInputPrompt() {
        System.out.println("Enter a value for withdrawl to your account.");
    }
    private static void printTopMenu(){
        System.out.println("Enter Q to quit, W for withdrawls, D for deposits.");
    }
    private static void printConfirmMessage(){
        System.out.println("Logging out. Your monthly Charges are as followe: ");
    }
}