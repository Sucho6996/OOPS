//Write a Java program to demonstrate the use of:
//i. Bitwise operators
//ii. Shift operators.
public class Three {
    public static void main(String[] args) {
        int a = 5;  // 5 = 0101 in binary
        int b = 3;  // 3 = 0011 in binary

        System.out.println("Bitwise Operators:");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("~a = " + (~a));       // Bitwise Complement

        System.out.println("\nShift Operators:");
        int x = 8; // 8 = 1000 in binary

        System.out.println("x = " + x);

        System.out.println("x << 2 = " + (x << 2));  // Left shift by 2 positions
        System.out.println("x >> 2 = " + (x >> 2));  // Right shift by 2 positions
        System.out.println("x >>> 2 = " + (x >>> 2)); // Unsigned right shift
    }
}
