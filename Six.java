import java.util.Scanner;
//6. Write a menu-driven Java program (using switch-case) which accepts a number as user input:
//i. Prints sum of digits of the given number.
//ii. Prints reverse of the given number.
public class Six {
    public static int rev;
    public static int sum(int n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            rev= rev*10+(n%10);
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println("Press 1 to add digits\nPress 2 to reverse the number");
        int choice=sc.nextInt();
        switch (choice){
            case (1):
                System.out.println("Sum of the digits is "+sum(n));
                break;
            case (2):
                sum(n);
                System.out.println("Reversed number is "+rev);
                break;
            default:
                System.out.println("Your choice in program same as choice in partner, wrong!!!");
        }
    }
}
