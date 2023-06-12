package Chapter6.Challenges.CarpetCalculator;

//This assumes that the room is a square or rectangular shape.

public class RoomDimension
{
    private double roomLength;
    private double roomWidth;

    public RoomDimension(double length, double width)
    {
            roomLength = length;
            roomWidth = width;
    }
    public RoomDimension copy()
    {
        RoomDimension copy = new RoomDimension(roomLength,roomWidth);
        return copy;
    }

    public double getArea(){
        return roomLength * roomWidth;
    }

    public String toString()
    {
        String str = "Room Dimensions are "
                + roomLength + " and "
                + roomWidth + ".";
        return str;
    }

}
