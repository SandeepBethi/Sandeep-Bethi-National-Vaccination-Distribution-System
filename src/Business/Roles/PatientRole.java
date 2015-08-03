/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.InventoryManagerWorkArea;
import Business.WorkAreas.PatientWorkArea;
import Business.WorkAreas.SalesEmployeeWorkArea;

/**
 *
 * @author Bethi
 */
public class PatientRole extends Role{

    public PatientRole() {
  super("Patient");
        wa=new PatientWorkArea();
    
    }
    
}
