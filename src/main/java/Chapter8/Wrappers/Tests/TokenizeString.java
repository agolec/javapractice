package Chapter8.Wrappers.Tests;

import java.util.StringTokenizer;

public class TokenizeString {
    String input;
    public TokenizeString(String stringInput){
        this.input = stringInput;
    }
    public int getTokenCount() {

        int tokenCount = 0;

        tokenCount = returnTokenCountOfString(this.input);

        return tokenCount;
    }
    public void setInputString(String input){
        this.input = input;
    }

    public static int returnTokenCountOfString(String inputString){
        int tokenCount = 0;
        if(inputString != null){
            StringTokenizer tokenizer = new StringTokenizer(inputString);
            System.out.println("Counting Tokens. . .");
            while(tokenizer.hasMoreTokens()){
                tokenCount++;
                tokenizer.nextToken(); //Consume the token.
            }
            System.out.println("Total Tokens: " + tokenCount);
        } else {
            System.out.println("Null String");
            return 0;
        }
        return tokenCount;
    }
}
