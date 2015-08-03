/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bethi
 */
public class EmployeeDirectory {
 
    ArrayList<Employee> empList;

    public EmployeeDirectory() {
    empList=new ArrayList<>();
    
    }
    
    
    public Employee newEmployee()
    {
    Employee emp=new Employee();
    empList.add(emp);
    
    return emp;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }
    
}
