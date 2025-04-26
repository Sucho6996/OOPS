import java.util.Scanner;

//Write a menu-driven Java program (using switch-case) which accepts a number as user input:
//i. Checks whether the number is even or odd.
//ii. Checks whether the number is prime.
public class Five {
    public static boolean isEven(int n){return n%2==0;}
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<n/2;i++){if(n%i==0) return false;}
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println("Press 1 to check for odd or even\nPress 2 to check for prime or not");
        int choice=sc.nextInt();
        switch (choice){
            case (1):
                if(isEven(n)) System.out.println("Number is even");
                else System.out.println("Number is odd");
                break;
            case (2):
                if (isPrime(n)) System.out.println("Number is prime");
                else System.out.println("Number is composite");
                break;
            default:
                System.out.println("Your choice in program same as choice in partner, wrong!!!");
        }
    }
}
