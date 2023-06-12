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
        String buildingString = "";
        for(int i = inputString.length()-1; i >= 0; i--){
           buildingString += inputString.charAt(i);
       }
        return buildingString;
    }
}
