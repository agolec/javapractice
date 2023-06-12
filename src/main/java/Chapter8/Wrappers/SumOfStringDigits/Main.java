package Chapter8.Wrappers.SumOfStringDigits;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String input;
        System.out.println("I will count the digits in a string if you enter a digit-only string of text: ");

        input = keyboard.nextLine();

        StringSummer summer = new StringSummer(input, keyboard);

        System.out.println(summer.toString());
    }
}
