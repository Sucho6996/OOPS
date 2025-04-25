//Write a Java program to add, subtract, multiply and divide any two numbers entered by the user
import java.util.Scanner;

class Calc{
    public int add(int a,int b){return a+b;}
    public int sub(int a,int b){if(a<b) return a-b; else return b-a;}
    public int div(int a,int b){if(b>0) return a/b; else return -1;}
    public int mul(int a,int b){return a*b;}
}
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calc calc=new Calc();
        System.out.println("Wanna add(press add) or\nsubtract(write sub) or\nmultiply(mul) or\ndivide(div)?: ");
        String s=sc.nextLine();
        System.out.println("Enter two number:");
        int x= sc.nextInt();
        int y= sc.nextInt();
        switch (s){
            case ("add"):
                System.out.println(calc.add(x,y));
                break;
            case ("sub"):
                System.out.println(calc.sub(x,y));
                break;
            case ("mul"):
                System.out.println(calc.mul(x,y));
                break;
            case ("div"):
                System.out.println(calc.div(x,y));
                break;
            default:
                System.out.println("Are you blind???");
        }
    }
}
