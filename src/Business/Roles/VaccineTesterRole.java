/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;


import Business.WorkAreas.VaccineTesterWorkArea;

/**
 *
 * @author Bethi
 */
public class VaccineTesterRole extends Role{

    public VaccineTesterRole() {
        super("Vaccine Tester");
        wa=new VaccineTesterWorkArea();
    }
    
}
