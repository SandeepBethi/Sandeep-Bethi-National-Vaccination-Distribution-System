/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.ShipmentManager.ShipmentManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class ShipmentManagerView extends View {
     public ShipmentManagerView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new ShipmentManagerJPanel(userProcessContainer, business,ua);
    }
}
