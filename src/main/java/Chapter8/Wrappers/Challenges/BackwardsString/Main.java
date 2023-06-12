package Chapter8.Wrappers.Challenges.BackwardsString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);
        final int LENGTH_OF_ONE = 1;

        System.out.println("Enter a string of text to print backward: ");

        String o = keyboardInput.next();
        int string_length = o.length();
        while(string_length == LENGTH_OF_ONE){
            System.out.println("Enter a string more than one character long: ");
            o = keyboardInput.next();
        }
        while(o.toString() == ""|| o == " "){
            System.out.println("Error! String wasn't entered after last prompt. \n" +
                    "Enter another string: ");
            o = keyboardInput.next();
        }

        StringProcessor reverseStringProcessor = new StringProcessor(o);

        System.out.println("The entered string was: " + o.toString());
        System.out.println("The reverse is: " + reverseStringProcessor.printReverseString());
    }
}
