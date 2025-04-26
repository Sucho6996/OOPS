//Write a Java program to compute maximum of three numbers:  
//i. Using ternary operator 
//ii. Using if-else statement. 

public class Four{

    public static void UseTernary(int a, int b, int c){

        int out = (a > b ? (a>c ? a : c) : (b>c ? b : c));

        System.out.println("maximun(Ternary) = " + out);
    }

    public static void UseIf_Else(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("maximum(If_Else) = " + a);
        }if(b>a && b>c){
            System.out.println("maximum(If_Else) = " + b);
        }else{
            System.out.println("maximum(If_Else) = " + c);
        }
    }
    public static void main(String[] args) {
        int a=10, b=5, c=25;

        UseTernary(a,b,c);
        UseIf_Else(a,b,c);
    }
}