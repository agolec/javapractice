package Chapter8.Wrappers.Challenges.BackwardsString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);
        Object stringInput;

        System.out.println("Enter a string of text to print backward: ");

        Object o = keyboardInput.next();
        while(o.toString() == ""){
            System.out.println("Error! String wasn't entered after last prompt. \n" +
                    "Enter another string: ");
        }

        StringProcessor reverseStringProcessor = new StringProcessor(o);

        System.out.println("The entered string was: " + o.toString());
        System.out.println("The reverse is: " + reverseStringProcessor.printReverseString());
    }
}
