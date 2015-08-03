/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public abstract class Organization {
    public static final String PROVIDER="PROVIDER";
    public static final String SHIPPING="Shipping";
    public static final String INVENTORYMANAGEMENT="Inventory Management";
    public static final String LICENSEAPPROVALDEPT="License Approval Department";
    public static final String INVESTIGATIONORG="Investigation Department";
    public static final String VACCINEMANUFACTURE="Vaccine Manufacturing";
    public static final String VaccineTesting="Vaccine Testing";
    public static final String ADMIN="Admin";
    public static final String VaccineDisposition="Vaccine Disposition Department";
    
    public WorkQueue workQueue;
    public WorkQueue sentWorkQueue;
    Location location;
    
    String orgName;
    UserAccountDirectory uad;
    EmployeeDirectory empd;

    public Organization(String orgName) {
        
        this.orgName=orgName;
        this.uad=new UserAccountDirectory();
        this.empd=new EmployeeDirectory();
        workQueue=new WorkQueue();
        sentWorkQueue=new WorkQueue();
        location=new Location();
        
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    public EmployeeDirectory getEmpd() {
        return empd;
    }

    public void setEmpd(EmployeeDirectory empd) {
        this.empd = empd;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public WorkQueue getSentWorkQueue() {
        return sentWorkQueue;
    }
    
    @Override
    public String toString(){
        return orgName;
    }
}
