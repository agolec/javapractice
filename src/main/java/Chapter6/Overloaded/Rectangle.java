package Chapter6.Overloaded;

public class Rectangle
{
    private double length;
    private double width;

    /*
        constructors
     */
    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }
    public double getWidth()
    {
        return this.width;
    }

    public static void main(String[] args)
    {
        //Declare two rectangles, but don'Chapter6.t create instances of the class.
        Rectangle box1, box2;

        //create a rectangle object and use the first constructor.
        box1 = new Rectangle();

        System.out.println("The box1 object's length "
                            + "and width are "
                            + box1.getLength() + " and "
                            + box1.getWidth());

        //Create another Rectangle object and use the second constructor.

        box2 = new Rectangle(5.0,10.0);

        System.out.println("The box2 object's length "
                            + "and width are "
                            + box2.getLength() + " and "
                            + box2.getWidth());
    }
}
