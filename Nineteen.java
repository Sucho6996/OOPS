//Design a class Complex having a real part (x) and an imaginary part (y).
// Provide methods to perform the following on complex numbers:
//a) Add two complex numbers.
//b) Multiply two complex numbers.
//c) toString( ) method to display complex numbers in the form: x + i y
class Complex {
    private double x;
    private double y;
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex add(Complex other) {
        double real = this.x + other.x;
        double imag = this.y + other.y;
        return new Complex(real, imag);
    }
    public Complex multiply(Complex other) {
        double real = (this.x * other.x) - (this.y * other.y);
        double imag = (this.x * other.y) + (this.y * other.x);
        return new Complex(real, imag);
    }

    // toString method to display in x + iy format
    @Override
    public String toString() {
        return x + " + i" + y;
    }
}
public class Nineteen {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3); // 2 + i3
        Complex c2 = new Complex(4, 5); // 4 + i5

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
