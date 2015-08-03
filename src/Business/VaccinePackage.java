/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Bethi
 */
public class VaccinePackage {
    Vaccine vaccine;
    private static int count=0;
    private long packageId;
    private long cartonId;
    private Calendar dateOfManufacturing;
    private Calendar dateOfExpiry;
    private String status;

    public static enum StatusType{
    Safe{@Override
        public String toString(){return "Safe";}},
    SuspectCounterfeit{@Override
    public String toString(){return "Suspect-Counterfeit";}},
    SuspectCarton{@Override
    public String toString(){return "Suspect-Carton";}},
    SuspectShipping{@Override
    public String toString(){return "Suspect-Shipping";}},
    Illegitimate{@Override
    public String toString(){return "Illegitimate";}}
    }
/*
 * just for testing purposes
 */
    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }
    /*
     * 
     */
    public VaccinePackage() {
        count++;
        packageId=System.currentTimeMillis()+count;
        dateOfManufacturing=Calendar.getInstance();
        dateOfExpiry=Calendar.getInstance();
        
        status=StatusType.Safe.toString();
        
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDateOfExpiry(int i) {
        dateOfExpiry.add(Calendar.DAY_OF_YEAR, i);
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public long getCartonId() {
        return cartonId;
    }

    public void setCartonId(long cartonId) {
        this.cartonId = cartonId;
    }

    public long getPackageId() {
        return packageId;
    }

    public Calendar getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public Calendar getDateOfExpiry() {
        return dateOfExpiry;
    }
    
    @Override
    public String toString(){
        return vaccine.getName();
    }
    
}
