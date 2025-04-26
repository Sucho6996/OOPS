//Create an abstract class called Shape having abstract method area( ) and two variables dimension1
//and dimension2. Create two subclasses of Shape, Rectangle and Triangle class which implement
//the method area( )

abstract class Shape{
    protected int dimension1;
    protected int dimension2;
    abstract public double area(int d1,int d2);
}
class Rectangle extends Shape{
    @Override
    public double area(int d1, int d2) {
        this.dimension1=d1;
        this.dimension2=d2;
        return this.dimension1*this.dimension2;
    }
}
class Triangle extends Shape{
    @Override
    public double area(int d1, int d2) {
        this.dimension1=d1;
        this.dimension2=d2;
        return this.dimension1*this.dimension2*0.5;
    }
}
public class Eighteen {
    public static void main(String[] args) {
       Triangle t=new Triangle();
       System.out.println("Area of triangle with Base 10cm and height 15cm : "+t.area(10,15)+" cm^2");
       Rectangle r=new Rectangle();
       System.out.println("Area of rectangle with Length 15cm and breath 10cm : "+r.area(15,10)+" cm^2");
    }
}
