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
public class PatientDirectory {
 
    ArrayList<Patient> patientList;

    public PatientDirectory() {
    patientList=new ArrayList<Patient>();
    
    }
    
    
    public Patient newPatient()
    {
    Patient pat=new Patient();
    patientList.add(pat);
    
    return pat;
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
}
