package Chapter9.ProgrammingChallenges.numberOne;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class EmployeeIDValidator {
    //String inputForEmployeeNumber;

    EmployeeIDValidator(String input, Scanner keyboard){

    }
    public static boolean isValidInput(String employeeNumber, Scanner keyboard){
        boolean isValid = false;
        String inputConvertedToCaps = employeeNumber.toUpperCase();

        if(validStringLength(inputConvertedToCaps)){
            if(validNumbers(inputConvertedToCaps)){
                if(hyphenPresent(inputConvertedToCaps)){
                    if(validLetter(inputConvertedToCaps)){
                        isValid = true;
                    }
                }
            }
        }
        return isValid;
    }
    private static boolean validStringLength(String employeeNumber){
        boolean isValid = true;
        final int REQUIRED_LENGTH = 5;

        //Don't need a while statement since I'm not looping. Will perform a single check in an if statement.
        //If the employeeNumber length is not 5, we do not continue.
        if(employeeNumber.length() != REQUIRED_LENGTH){
            isValid = false;
        }
        return isValid;
    }
    private static boolean validNumbers(String employeeNumber){
        boolean isValid = true;
        final int NUMBER_LENGTH = 3;

        //Defaulting isValid to true. Will continue loop as long as string is valid during check.
        //Whenever isValid is determined to be false, loop terminates and we will return the isValid boolean.

        //Will initialize i outside for statement and use it as control for the while loop.
        int i = 0;
        while(isValid && i < NUMBER_LENGTH){
            for(; i < NUMBER_LENGTH; i++){
                if(Character.isDigit(employeeNumber.charAt(i))){
                    isValid = true;
                } else {
                    isValid = false;
                }
            }
        }
        return isValid;
    }
    private static boolean hyphenPresent(String employeeNumber){
        boolean isValid = true;
        final char HYPHEN = '-';
        final int HYPHEN_INDEX = 3;

        if(employeeNumber.charAt(HYPHEN_INDEX) != HYPHEN){
            isValid = false;
        }
        return isValid;
    }
    private static boolean validLetter(@NotNull String employeeNumber){
        boolean isValid = true;

        final int LETTER_INDEX = 4;

        char minValue = 'A';
        char maxValue = 'L';

        if(Character.isAlphabetic(employeeNumber.charAt(LETTER_INDEX)) == false){
            isValid = false;

        } else {
            if((int) minValue <= employeeNumber.charAt(LETTER_INDEX) == false){
                isValid = false;

            } else {
                if((int) maxValue >= employeeNumber.charAt(LETTER_INDEX) == false){
                    isValid = false;
                }
                else {
                    isValid = true;
                }
            }
        }
        return isValid;
    }
    public static String printError(){
        String message = "Invalid String. Please enter another in the format XXX-L. \n" +
                "Where X is a number 0-9, followed by the - symbol, and L is a Letter A-M.";
        return message;
    }
    public static boolean areCharactersDigits(String input){
        boolean isDigit = false;

        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                isDigit = true;
            }
            else{
                isDigit = false;
                break;
            }
        }
        return isDigit;
    }
}
