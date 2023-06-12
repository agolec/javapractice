package Chapter8.Wrappers.WordCounter;

import Chapter8.Wrappers.Tests.TokenizeString;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String inputString;
        System.out.println("Enter a string: ");
        TokenizeString stringTokenizer;

        inputString = keyboard.nextLine();
         stringTokenizer = new TokenizeString(inputString);

        int tokenCount = stringTokenizer.getTokenCount();

        System.out.println("There were a total of " + tokenCount + " words.");

    }

}
