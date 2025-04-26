//16. Write a menu driven Java program (using switch-case) which accepts a number as user input: 
//i. Prints sum of digits of the given number. 
//ii. Prints reverse of the given number. 

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu ===");
        System.out.println("1. Sum of digits of a number.");
        System.out.println("2. Reverse of a number.");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num1 = sc.nextInt();
                int sum = 0;
                int temp = num1;
                while (temp != 0) {
                    sum += temp % 10;    
                    temp /= 10;          
                }
                System.out.println("Sum of digits of " + num1 + " = " + sum);
                break;

            case 2:
                System.out.print("Enter a number: ");
                int num2 = sc.nextInt();
                int reverse = 0;
                int temp2 = num2;
                while (temp2 != 0) {
                    int digit = temp2 % 10;
                    reverse = reverse * 10 + digit;
                    temp2 /= 10;
                }
                System.out.println("Reverse of " + num2 + " = " + reverse);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close(); 
    }
}
