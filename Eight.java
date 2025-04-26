//Write a method in Java to compute the factorial of a number. Use this method to compute the sum of
//the series:
import java.util.Scanner;
public class Eight {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        double sum = 1.0; // Start with 1
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        System.out.println("Sum of the series = " + sum);
    }
}

