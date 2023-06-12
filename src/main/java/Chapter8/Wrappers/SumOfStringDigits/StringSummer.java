package Chapter8.Wrappers.SumOfStringDigits;

import java.util.Scanner;

public class StringSummer {
    String validString;
    String input;


    int processedSum;

    StringSummer(String input, Scanner scanner){
        //Bring in user input string and their scanner from main program here.

        //Keep flow inside this loop of error statements until user enters a valid string.
        //pass in the parameter input on line 9 as the input to setString on line 45. Do not set field variable
        //until valid input is achieved.
        this.input = input;
        while(!isValid()){
            printError();
            setString(scanner);
        }
        validString = this.input;

        calculateSum();
    }
    private boolean isValid(){
        boolean isValid = false;

        for(int i = 0; i < this.input.length(); i++){
            if(Character.isDigit(this.input.charAt(i))){
                isValid = true;
            } else{
                isValid = false;
                break;
            }
        }
        return isValid;
    }



    public String toString() {
        return "ValidString: " + validString + "\n" +
                "Sum: " + getSum();
    }
    public void setString(Scanner scanner){
        this.input = scanner.nextLine();
    }

    private void printError(){
        System.out.println("There was an error with the input. Enter an un-interrupted string of digits:");
    }

    private void calculateSum(){
        for(int i = 0; i < validString.length(); i++){
            processedSum = processedSum + Character.getNumericValue(validString.charAt(i));
        }
    }

    private int getSum(){
        return processedSum;
    }
}
