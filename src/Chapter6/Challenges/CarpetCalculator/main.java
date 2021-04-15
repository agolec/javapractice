package Chapter6.Challenges.CarpetCalculator;

public class main
{
    public static void main(String[] args)
    {
        RoomDimension dimension;
        RoomCarpet carpet;

        //passing in some stuff for room dimension?
        dimension = new RoomDimension(12,10);

        carpet = new RoomCarpet(dimension, 8);

        System.out.println(carpet.toString());
    }
}
