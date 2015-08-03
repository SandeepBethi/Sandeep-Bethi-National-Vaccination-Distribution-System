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
public class VaccineCatalog {
    
    private ArrayList<Vaccine> vaccineList;

    public VaccineCatalog() {
        vaccineList=new ArrayList<Vaccine>();
    }

    
    
    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
    public Vaccine newVaccine(){
        Vaccine d=new Vaccine();
        vaccineList.add(d);
        return d;
    }
}
