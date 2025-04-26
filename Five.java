// 5. Write a menu driven Java program (using switch-case) which accepts a number as user input: 
//i. Checks whether the number is even or odd. 
//ii. Checks whether the number is prime.
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        System.out.println("=== Menu ===");
        System.out.println("1. Check whether the number is even or odd.");
        System.out.println("2. Check whether the number is prime.");

        System.out.print("Enter your choice (1 OR 2): ");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch (ch) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Even.");
                } else {
                    System.out.println("Number " + num + " is Odd.");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int num1 = sc.nextInt();
                boolean isPrime = true;

                if (num1 <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num1); i++) {
                        if (num1 % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println("Number " + num1 + " is Prime.");
                } else {
                    System.out.println("Number " + num1 + " is NOT Prime.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close(); 
    }
}
