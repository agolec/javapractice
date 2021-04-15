package Chapter6.Challenges.Area;

public class AreaChallenge
{
    public static void main(String[] args)
    {
        //program to demonstrate overloaded methods of Area class.
        System.out.println("the area of a circle with the radius 2 is:"
                        + Area.calculateArea(2));

        System.out.println("The area of a rectangle with a length of 3, and "
                    + " a width of 4 is: "
                    + Area.calculateArea((double)3,(double)4));

        System.out.println("The area of a cylinder with a radius of 2, and "
                + "height of 7 is "
                + Area.calculateArea((float)2,(float)7));
    }
}
