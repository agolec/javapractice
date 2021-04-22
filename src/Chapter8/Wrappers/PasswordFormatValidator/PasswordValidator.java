package Chapter8.Wrappers.PasswordFormatValidator;

public class PasswordValidator {
    String enteredString;
    public PasswordValidator(){

    }
    public void setString(String input){
        enteredString = input;
    }
    public boolean isValid(){

        boolean isValidPassword = false;

        if(validateCaseRequirement(enteredString)){
            if(validateCharacterLength(enteredString)){
                if(validateNumericRequirement(enteredString)){
                    isValidPassword = true;
                }
            }
        }
        return isValidPassword;
    }
    private boolean validateCharacterLength(String entryForPassword){
        Boolean meetsWordLength = false;

        if(entryForPassword.length() >= 6){
            meetsWordLength = true;
        }
        return meetsWordLength;
    }

    private boolean validateCaseRequirement(String entryForPassword){
        boolean meetsUppercaseRequirement = false;
        boolean meetsLowerCaseRequirement = false;
        //for the length of entryForPassword, check each character to see if it is uppercase.
        //if it is, assign true to the flag, break the loop, and return.

        //If not, loop continues to completion and returns false.
        for(int i = 0; i < entryForPassword.length(); i++){
            //if meetsUppercaseRequirement is met, and changed to 'true', this if statement will never run again.
            if(!meetsUppercaseRequirement){
                if(Character.isUpperCase(entryForPassword.charAt(i))){
                    meetsUppercaseRequirement = true;
                }
            }
            if(!meetsLowerCaseRequirement){
                if(Character.isLowerCase(entryForPassword.charAt(i))){
                    meetsLowerCaseRequirement = true;
                }
            }
            if(meetsUppercaseRequirement && meetsLowerCaseRequirement){
                break;
            }
        }
        if(meetsLowerCaseRequirement && meetsUppercaseRequirement){
            return true;
        } else{
            return false;
        }
    }

    private boolean validateNumericRequirement(String entryForPassword){
        boolean numericRequirementMet = false;

        for(int i = 0; i < entryForPassword.length(); i++){
            if (Character.isDigit(entryForPassword.charAt(i))){
                numericRequirementMet = true;
                break;
            }
        }
        return numericRequirementMet;
    }
    public void printInstruction(){
        System.out.println("Enter a string with one upper case character, one lowercase, and one digit.");
    }
    public void printError(){
        System.out.println("String invalid. Enter another and try again.");
    }
    public String getEnteredString() {
        return enteredString;
    }
}
