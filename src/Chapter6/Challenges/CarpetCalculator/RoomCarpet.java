package Chapter6.Challenges.CarpetCalculator;

public class RoomCarpet
{
    private double carpetCost;
    private RoomDimension dimension;

    public RoomCarpet(RoomDimension dimension, double cost)
    {
        this.dimension = dimension.copy();
        carpetCost = cost;
    }

    public double getTotalCost()
    {
        return carpetCost * dimension.getArea();
    }

    public String toString()
    {
        String str = dimension.toString() + "\n"
                + "The cost of the room is: $ "
                + getTotalCost();

        return str;
    }





}
