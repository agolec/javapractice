package Chapter8.Wrappers.VowelsAndConsonants;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char menuChoice = 'F';

        VowelConsonantChecker check;

        System.out.println("Enter a string and I will prompt you with options on what to process it with.");

        Scanner keyboardInput = new Scanner(System.in);

        String keyboardText = keyboardInput.nextLine();

        check = new VowelConsonantChecker(keyboardText);

        System.out.println("MENU");
        System.out.println("-----------------------------------");
        System.out.println("Type 'A' for vowels");
        System.out.println("Type 'B' for consonant counter");
        System.out.println("Type 'C' for vowels and consonants");
        System.out.println("Type 'D' to enter another string");
        System.out.println("Type 'E' to quit");

        Scanner menuInput = new Scanner(System.in);

        menuChoice = menuInput.next().charAt(0);


        while(menuChoice != 'E'){
            switch(menuChoice){
            case 'A':
                System.out.println("Vowel Count for string: \"" + check.getInputString() + "\" is:" + check.getVowelCount());

                System.out.println("MENU");
                System.out.println("-----------------------------------");
                System.out.println("Type 'A' for vowels");
                System.out.println("Type 'B' for consonant counter");
                System.out.println("Type 'C' for vowels and consonants");
                System.out.println("Type 'D' to enter another string");
                System.out.println("Type 'E' to quit");

                menuChoice = menuInput.next().charAt(0);
                break;
            case 'B':
                System.out.println("Consonant Count for string: \"" + check.getInputString() + "\" is: " + check.getConsonantCount());

                System.out.println("MENU");
                System.out.println("-----------------------------------");
                System.out.println("Type 'A' for vowels");
                System.out.println("Type 'B' for consonant counter");
                System.out.println("Type 'C' for vowels and consonants");
                System.out.println("Type 'D' to enter another string");
                System.out.println("Type 'E' to quit");

                menuChoice = menuInput.next().charAt(0);
                break;
            case 'C':
                System.out.println("Vowel Count for string \"" + check.getInputString() + "\" is:" + check.getVowelCount());
                System.out.println("Consonant Count for string \"" + check.getInputString() + "\" is:" + check.getConsonantCount());

                System.out.println("MENU");
                System.out.println("-----------------------------------");
                System.out.println("Type 'A' for vowels");
                System.out.println("Type 'B' for consonant counter");
                System.out.println("Type 'C' for vowels and consonants");
                System.out.println("Type 'D' to enter another string");
                System.out.println("Type 'E' to quit");

                menuChoice = menuInput.next().charAt(0);
                break;
            case 'D':
                System.out.println("Enter another String here: \"");
                keyboardText = keyboardInput.nextLine();

                check.setNewString(keyboardText);

                System.out.println("MENU");
                System.out.println("-----------------------------------");
                System.out.println("Type 'A' for vowels");
                System.out.println("Type 'B' for consonant counter");
                System.out.println("Type 'C' for vowels and consonants");
                System.out.println("Type 'D' to enter another string");
                System.out.println("Type 'E' to quit");

                menuChoice = keyboardInput.next().charAt(0);
                break;
            default:
                System.out.println("input didn't match case. Re-enter: ");
                System.out.println("-----------------------------------");
                System.out.println("MENU");
                System.out.println("Type 'A' for vowels");
                System.out.println("Type 'B' for consonant counter");
                System.out.println("Type 'C' for vowels and consonants");
                System.out.println("Type 'D' to enter another string");
                System.out.println("Type 'E' to quit");

                menuChoice = keyboardInput.next().charAt(0);
                break;

        }


        }

    }



}
