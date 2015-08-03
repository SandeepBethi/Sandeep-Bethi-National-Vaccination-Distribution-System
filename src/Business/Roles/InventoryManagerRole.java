/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.InventoryManagerWorkArea;

/**
 *
 * @author Bethi
 */
public class InventoryManagerRole extends Role{

    public InventoryManagerRole() {
  super("Inventory Manager");
        wa=new InventoryManagerWorkArea();
    
    }
    
}
