//Create a Person class. Create some objects of this class (by taking information from the user).
// Inherit the class Person to create two subclasses Teacher and Student. Maintain the respective
//information in the classes and create and display objects of these two classes using runtime
//polymorphism.
import java.util.Scanner;

// Base class
class Person {
    protected String name;
    protected int age;

    public void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume leftover newline
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student
class Student16 extends Person {
    private String course;
    private int rollNumber;

    @Override
    public void inputDetails(Scanner sc) {
        super.inputDetails(sc);
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }
}

// Subclass Teacher
class Teacher extends Person {
    private String subject;
    private double salary;

    @Override
    public void inputDetails(Scanner sc) {
        super.inputDetails(sc);
        System.out.print("Enter subject: ");
        subject = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); // consume newline
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person;

        // Create Student
        System.out.println("\nEnter student details:");
        person = new Student16(); // Runtime polymorphism
        person.inputDetails(sc);
        System.out.println("\n--- Student Details ---");
        person.displayDetails();

        // Create Teacher
        System.out.println("\nEnter teacher details:");
        person = new Teacher(); // Runtime polymorphism
        person.inputDetails(sc);
        System.out.println("\n--- Teacher Details ---");
        person.displayDetails();

        sc.close();
    }
}


