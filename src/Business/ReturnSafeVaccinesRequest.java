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
public class ReturnSafeVaccinesRequest extends WorkRequest{

    private ArrayList<Carton> cartonList;
    private ArrayList<VaccinePackage> packageList;
    private Enterprise destination;
   
    private Patient patient;
   

   
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    public ReturnSafeVaccinesRequest() {
    cartonList=new ArrayList<Carton>();
        packageList=new ArrayList<VaccinePackage>();
    }

    public ArrayList<Carton> getCartonList() {
        return cartonList;
    }

    public ArrayList<VaccinePackage> getPackageList() {
        return packageList;
    }
    
    public Carton newCarton(){
        Carton carton=new Carton();
        cartonList.add(carton);
        return carton;
        
    }
     public void addCarton(Carton carton){
        
        cartonList.add(carton);
        
        
    }
     public void addPackage(VaccinePackage p){
        
        packageList.add(p);
        
        
    }
    
   

       

    public Enterprise getDestination() {
        return destination;
    }

    public void setDestination(Enterprise destination) {
        this.destination = destination;
    }
    
    
    
}
