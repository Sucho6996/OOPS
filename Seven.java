import java.util.Scanner;

//Write a Java program to display the first n terms of a Fibonacci series.
public class Seven {
    public static int[] fibo(int n){
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++) dp[i]=dp[i-1]+dp[i-2];
        return dp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n= sc.nextInt();
        int[] dp=fibo(n);
        for(int num:dp) System.out.println(num);
    }
}
