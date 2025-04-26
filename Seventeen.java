//Create a Circle class having data member radius.
// Create a subclass of circle called Cylinder having data members: radius and height.
// Both classes should have a method called area( ) that calculates their area.

class Circle{
    protected int radius;
    public double area(int radius){
        this.radius=radius;
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    private int height;
    public double area(int radius,int height){
        this.radius=radius;
        this.height=height;
        return (2*Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius);
    }
}
public class Seventeen {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println("Area of circle with radius 10cm: "+circle.area(10)+" cm^2");
        Cylinder cylinder=new Cylinder();
        System.out.println("Area of circle with radius 10cm and height 15cm : "+cylinder.area(10,15)+" cm^2");
    }
}
