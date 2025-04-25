//Write a Java program to create a class Room having:
//a. Data members: length, breadth, height as dimensions of the room
//b. Three constructors:
//i. Having no parameter -that accepts values of data members from the user.
//ii. Having one parameter –which specifies the same value of all dimensions.
//iii. Having three parameters-which passes different values of all dimensions.

class classRoom{
    private int len;
    private int breath;
    private int height;

    public classRoom() {
        this.len = 0;
        this.breath=0;
        this.height=0;
    }

    public classRoom(int len) {
        this.len = len;
        this.breath=len;
        this.height=len;
    }

    public classRoom(int len, int breath, int height) {
        this.len = len;
        this.breath = breath;
        this.height = height;
    }

    public int getLen() {
        return len;
    }
    public void setLen(int len) {
        this.len = len;
    }
    public int getBreath() {
        return breath;
    }
    public void setBreath(int breath) {
        this.breath = breath;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}
public class Twelve {
}
