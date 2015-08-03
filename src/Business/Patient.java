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
public class Patient extends Person{
    
    private int patientID;
private static int count=0;
private ArrayList<VaccinePackage> packageList;
private ArrayList<Alert>  alertList;
private WorkQueue sentRequests;
    public Patient() {
    count++;
        patientID=count;
        sentRequests=new WorkQueue();
        packageList=new ArrayList<VaccinePackage>();
        alertList=new ArrayList<Alert>();
    
    }

    public ArrayList<Alert> getAlertList() {
        return alertList;
    }

    public int getPatientID() {
        return patientID;
    }

    public ArrayList<VaccinePackage> getPackageList() {
        return packageList;
    }
    
   public void addPackage(VaccinePackage p) {
       
       packageList.add(p);
       
   }

    public WorkQueue getSentRequests() {
        return sentRequests;
    }
   
}
