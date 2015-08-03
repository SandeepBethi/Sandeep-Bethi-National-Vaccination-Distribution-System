/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.VaccineManufacturerWorkArea;

/**
 *
 * @author Bethi
 */
public class VaccineManufacturerRole extends Role{

    public VaccineManufacturerRole() {
    super("Vaccine Manufacturer");
        wa=new VaccineManufacturerWorkArea();
    
    }
    
}
