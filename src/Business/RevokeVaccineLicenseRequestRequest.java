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
public class RevokeVaccineLicenseRequestRequest extends WorkRequest{

Vaccine vaccine;
ManufacturerEnterprise manufacturerEnterprise;
    

    public RevokeVaccineLicenseRequestRequest() {
    
    
    }

    public ManufacturerEnterprise getManufacturerEnterprise() {
        return manufacturerEnterprise;
    }

    public void setManufacturerEnterprise(ManufacturerEnterprise manufacturerEnterprise) {
        this.manufacturerEnterprise = manufacturerEnterprise;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
   

  

        
        
    }
    
   

       

    
