package Chapter6;

import java.util.Scanner;

public class OverLoading {

    public static void main(String[] args)
    {
        int iNumber;
        double dNumber;

        //Create a scanner object to use for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Get an integer and display it's square.
        System.out.println("Enter an integer: ");
        iNumber = keyboard.nextInt();
        System.out.println("The square is "
                + MyMath.square(iNumber) + " for int.");

        System.out.println("Enter an double: ");
        dNumber = keyboard.nextDouble();
        System.out.println("The double is " + MyMath.square(dNumber) + " when squared.");

    }
}
