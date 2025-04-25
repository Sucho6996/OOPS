import java.util.Scanner;

//Write a Java program that accepts a list of elements from the user in an array.
// Calculate the sum and average of the numbers entered.
// Accept the size of the array as command line argument.
public class Nine {
    public static void sumAvg(int[] arr){
        int sum=0;
        int avg=0;
        for(int num:arr) sum+=num;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+sum/arr.length);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many number you wanna enter?: ");
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter digit: ");
            int x=sc.nextInt();
            nums[i]=x;
        }
        sumAvg(nums);
    }
}
