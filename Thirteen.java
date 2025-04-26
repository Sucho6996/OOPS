//Write a Java program to create a class Student having:
//a. Private Data members: rollNo, name, marks1, marks2, marks3
//b. Constructor – to assign values to data members
//c. Methods:
//i. calculatePercentage( ) – to calculate percentage of marks
//ii. calculateDivision( ) – to calculates division based on formula:
//a) I Div if percentage is > 60
//b) II Div if percentage is between 50 and 60
//c) III Div if percentage is < 50
//iii. displayMarksheet( ) – to display values of data members as well as percentage and division of
//student.

class Student13{
    private String name;
    private int rollNo, marks1, marks2, marks3;
    public Student13(String name, int rollNo, int marks1, int marks2, int marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculatePercentage(){return ((this.marks1+this.marks2+this.marks3)/3);}
    public void calculateDivision( ){
        double avg=this.calculatePercentage();
        if(avg>60) System.out.println("Grade is I");
        else if(avg>50) System.out.println("Grade is II");
        else System.out.println("Grade is III");
    }
    public void displayMarksheet( ){
        System.out.println("Name: "+this.name);
        System.out.println("Marks1: "+this.marks1);
        System.out.println("Marks2: "+this.marks2);
        System.out.println("Marks3: "+this.marks3);
        System.out.println("Obtained Percentage: "+this.calculatePercentage());
        this.calculateDivision();
    }
}
public class Thirteen {
    public static void main(String[] args) {
        Student13 s1=new Student13("Suchorit Saha",015,75,60,45);
        s1.displayMarksheet();
    }
}
