package Chapter6.Challenges.Area;

public class Area
{
    private double area;
    //circle's area
    public static double  calculateArea(double radius)
    {
        return Math.PI * Math.pow(radius,2);
    }
    public static double calculateArea(double length, double width)
    {
        return length * width;
    }

    public static double calculateArea(float radius, float height)
    {
        return Math.PI * Math.pow(radius,2) * height;
    }
}
