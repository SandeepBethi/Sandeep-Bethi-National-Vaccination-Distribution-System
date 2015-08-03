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
public class Order {
    private static int count=0;
    private long orderId;
    private ArrayList<Carton> cartonList;
    private ArrayList<VaccinePackage> packageList;
    Enterprise destination;
    Patient patient;
    public Order() {
        count++;
        orderId=System.currentTimeMillis()+count;
        cartonList=new ArrayList<Carton>();
        packageList=new ArrayList<VaccinePackage>();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getDestination() {
        return destination;
    }

    public void setDestination(Enterprise destination) {
        this.destination = destination;
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

    public long getOrderId() {
        return orderId;
    }
     
     @Override
     public String toString(){
         return Long.toString(orderId);
     }
}
