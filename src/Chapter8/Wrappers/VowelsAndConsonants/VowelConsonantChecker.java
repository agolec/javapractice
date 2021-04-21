package Chapter8.Wrappers.VowelsAndConsonants;

public class VowelConsonantChecker {
    String stringToProcess;
    int vowelCount;
    int consonantCount;

    public VowelConsonantChecker(String input){
        stringToProcess = input.toLowerCase();

        vowelCount = 0;
        consonantCount = 0;
        countCharacterTypes(stringToProcess);
    }
    private void countCharacterTypes(String input) {
        int vowelMatch = 0;
        int consonantMatch = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                        || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    vowelMatch++;
                } else {
                    consonantMatch++;
                }
            }
        }
        vowelCount = vowelMatch;
        consonantCount = consonantMatch;
    }

    public void setNewString(String input){
        stringToProcess = input.toLowerCase();
        countCharacterTypes(stringToProcess);
    }
    public int getVowelCount(){
        return vowelCount;
    }
    public int getConsonantCount(){
        return consonantCount;
    }
    public String getInputString(){
        return stringToProcess;
    }
}
