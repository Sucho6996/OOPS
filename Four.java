import java.util.Scanner;
//Write a Java program to compute maximum of three numbers:
//i. Using ternary operator
//ii. Using if-else statement.
public class Four{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int maxTernary = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("\nMaximum using ternary operator: " + maxTernary);
        int maxIfElse;
        if (a >= b && a >= c) {
            maxIfElse = a;
        } else if (b >= a && b >= c) {
            maxIfElse = b;
        } else {
            maxIfElse = c;
        }
        System.out.println("Maximum using if-else statement: " + maxIfElse);
    }
}
