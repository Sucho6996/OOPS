//Create a class Employee containing information about employees of same organisation. It should
//have following data members:
//a. empID (Private),
//b. companyName (static and final),
//c. noOfEmployees (static)
//It should have a static method to calculate number of employees in the organisation based on the
//number of objects of employees created and a display( ) method to display number of employees in
//that organization.

import java.util.ArrayList;
import java.util.List;

class Emp{
    private int empId;
    private static int noOfEmp=0;
    private String companyName="My Company";

    public Emp(int empId) {
        this.empId=empId;
        noOfEmp++;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public static int getNoOfEmp() {
        return noOfEmp;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public static int totalEmp(){return getNoOfEmp();}
}

public class Fifteen{
    public static void main(String[] args) {
        List<Emp> emp=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Emp e=new Emp(i);
            emp.add(e);
        }
        System.out.println("Number of Employee is "+Emp.getNoOfEmp());
    }
}
