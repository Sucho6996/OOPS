//3.Write a Java program to demonstrate the use of: 
//i. Bitwise operators   
//ii. Shift operators.              

public class Three {
    public static void main(String[] args) {
        int a = 5;  
        int b = 3;  

        // i. Bitwise Operators
        System.out.println(" Bitwise Operators ");
        System.out.println("a & b = " + (a & b));  
        System.out.println("a | b = " + (a | b));  
        System.out.println("a ^ b = " + (a ^ b));  
        System.out.println("~a = " + (~a));        

        // ii. Shift Operators
        int num = 8; 
        System.out.println(" Shift Operators ");
        System.out.println("num << 1 = " + (num << 1));  
        System.out.println("num >> 1 = " + (num >> 1));  
        System.out.println("num >>> 1 = " + (num >>> 1)); 
    }
}
