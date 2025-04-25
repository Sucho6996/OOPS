//Write a Java program that calculates the area of circle, rectangle and triangle using method
//overloading.

class Calculate{
    public double area(int len,int breath){ return len*breath;}
    public double area(int base,int height,boolean isTriangle){
        if(isTriangle) return 0.5*base*height;
        else return area(base,height);
    }
    public double area(int radius){ return Math.PI*radius*radius;}
}
public class Fourteen {
}
