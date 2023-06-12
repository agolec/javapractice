package Chapter9.CubeClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double length, width, height;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the following dimensions " +
                "of a cube: ");
        System.out.println("Length: ");
        length = keyboard.nextDouble();
        System.out.println("Width: ");
        width = keyboard.nextDouble();
        System.out.println("Height: ");
        height = keyboard.nextDouble();

        Cube aCube = new Cube(length,width,height);

        //display properties.
        System.out.println("Here are the properties of the cube: ");
        System.out.println("Length: " + aCube.getLength());
        System.out.println("Width: " + aCube.getHeight());
        System.out.println("Height: " + aCube.getHeight());
        System.out.println("Base Area: " + aCube.getArea());
        System.out.println("Surface Area: " + aCube.getSurfaceArea());
        System.out.println("Volume: " + aCube.getVolume());
    }
}
