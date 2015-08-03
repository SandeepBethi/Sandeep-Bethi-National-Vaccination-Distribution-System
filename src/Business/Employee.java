/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class Employee extends Person{
    
//    
//    private String empFName;
//    private String empLName;
private static int count=0;
private int empID;

    public Employee() {
        count++;
        empID=count;
    }

    
//    public String getEmpLName() {
//        return empLName;
//    }
//
//    public void setEmpLName(String empLName) {
//        this.empLName = empLName;
//    }
//    
//
//    public String getEmpFName() {
//        return empFName;
//    }
//
//    public void setEmpFName(String empFName) {
//        this.empFName = empFName;
//    }

    public int getEmpID() {
        return empID;
    }
    @Override
    public String toString(){
        return getFirstName()+" "+getLastName();
    }

}
