/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ShipmentManagerWorkArea;

/**
 *
 * @author Bethi
 */
public class ShipmentManagerRole extends Role{

    public ShipmentManagerRole() {
  super("Shipment Manager");
        wa=new ShipmentManagerWorkArea();
    
    }
    
}
