package Chapter8.Wrappers;

public class Main {
    public static void main(String[] args){

        Boolean b = true;
        String c = "c";
        String otherC = c.toUpperCase();

        if(c.equalsIgnoreCase("C")){
            System.out.println("character is equal to C. Performing .toUpperCase() while having initially assigned lower case.");
        }


    }
}
