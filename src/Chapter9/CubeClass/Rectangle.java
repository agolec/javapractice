package Chapter9.CubeClass;

public class Rectangle {
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    private void setLength(double length){
        this.length = length;
    }
    private void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double getArea(){
       return this.length * this.width;
    }
}
