package Chapter9.CubeClass;

public class Cube extends Rectangle {
    private double height;

    public Cube(double length, double width, double height){
        super(length, width);

        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    //Note to self Surface area calculation for a given object is the sum of the area of all shapes that cover the surface of an object.
    //Hence, we get the area of a rectangle (length x width), and multiply by the number of sides.
    public double getSurfaceArea(){
        return getArea() * 6;
    }
    //Volume equation for a cube is the length * width * height.
    public double getVolume(){
        return getArea() * height;
    }
}
