//Write a Java program to create a class Student having:
//a. Data members: rollNo, studName, courseID
//b. Methods:
//getData( ) – to retrieve values of data members,
//displayData( ) – to display values of data members

class Student{
    private String rollNo;
    private String studName;
    private String courseId;

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    private String[] getData(){
        String[] data=new String[3];
        data[0]= this.rollNo;
        data[1]=this.studName;
        data[2]=this.courseId;
        return data;
    }
    public void displayData(){
        String[] data=this.getData();
        System.out.println("Roll: "+data[0]+" Name: "+data[1]+" CourseId: "+data[2]);
    }
}
public class Eleven {
    public static void main(String[] args) {
        Student student=new Student();
        student.setRollNo("015");
        student.setStudName("Suchorit Saha");
        student.setCourseId("MCAC201");
        student.displayData();
    }
}
