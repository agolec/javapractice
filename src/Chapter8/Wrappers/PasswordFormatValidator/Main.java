package Chapter8.Wrappers.PasswordFormatValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String entryForPassword = new String();
        PasswordValidator validator = new PasswordValidator();

        validator.printInstruction();

        entryForPassword = keyboard.nextLine();

        validator.setString(entryForPassword);

        while(validator.isValid() == false){
            validator.printError();

            entryForPassword = keyboard.nextLine();
            validator.setString(entryForPassword);
        }
        System.out.println("Success. Password entered was valid.\n" +
                            "The entered text: " + validator.getEnteredString() + " met all requirements eventually. Bitch.");




    }
}
