/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.InventoryManagerWorkArea;
import Business.WorkAreas.SalesEmployeeWorkArea;

/**
 *
 * @author Bethi
 */
public class SalesEmployeeRole extends Role{

    public SalesEmployeeRole() {
  super("Sales Employee");
        wa=new SalesEmployeeWorkArea();
    
    }
    
}
