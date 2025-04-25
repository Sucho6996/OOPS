import java.util.Scanner;

//Write a Java program to compute the square, cube of a number entered by a user using methods.
public class Two {
    public static int square(int a){
        return a*a;
    }
    public static int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num=sc.nextInt();
        System.out.println("Press 1 to square\nOr press 2 to cube of the number\nyour choice?: ");
        int choice= sc.nextInt();
        if(choice==1) System.out.println("Answer: "+square(num));
        else if (choice == 2) System.out.println("Answer: "+cube(num));
        else System.out.println("wrong choice");
    }
}
