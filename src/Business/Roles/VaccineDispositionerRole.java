/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;


import Business.WorkAreas.VaccineDispositionerWorkArea;
import Business.WorkAreas.VaccineTesterWorkArea;

/**
 *
 * @author Bethi
 */
public class VaccineDispositionerRole extends Role{

    public VaccineDispositionerRole() {
        super("Vaccine Disposioner");
        wa=new VaccineDispositionerWorkArea();
    }
    
}
