package Chapter8.Wrappers.Challenges.BackwardsString;

import java.util.Scanner;

public class StringProcessor {
    private StringBuilder inputString;

    public StringProcessor(){
        inputString.append("");
    }

    public StringProcessor(Object o){
        inputString = new StringBuilder(o.toString());
    }

    public String printReverseString(){
       return inputString.reverse().toString();
    }
}
