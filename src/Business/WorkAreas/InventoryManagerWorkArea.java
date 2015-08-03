/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Business;
import Business.UserAccount;
import Business.View.InventoryManagerView;
import Business.View.VaccineManufacturerView;
import Business.View.View;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class InventoryManagerWorkArea extends WorkArea {
 @Override
    public View createView(JPanel userProcessContainer, Business business,UserAccount ua) {
        return new InventoryManagerView(userProcessContainer, business,ua);
    }   
}
