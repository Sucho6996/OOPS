//Write a Java program that accepts a list of elements from the user in an array and displays the
//elements in the ascending order.

import java.util.Arrays;
import java.util.Scanner;

public class Ten {
    public static void qSort(int[] nums,int low,int high){
        if(low<high){
            int p= partition(nums,low,high);
            qSort(nums,low,p-1);
            qSort(nums,p+1,high);
        }
    }
    private static int partition(int[] nums,int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<=pivot){
                i++;
                nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
            }
        }
        nums[i+1]=nums[i+1]+nums[high]-(nums[high]=nums[i+1]);
        return i+1;
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
        System.out.println("Before sorting: "+ Arrays.toString(nums));
        qSort(nums,0,nums.length-1);
        System.out.println("After sorting: "+ Arrays.toString(nums));
    }
}
