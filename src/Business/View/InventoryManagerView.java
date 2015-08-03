/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.InventoryManager.InventoryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class InventoryManagerView extends View {
     public InventoryManagerView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new InventoryManagerJPanel(userProcessContainer, business,ua);
    }
}
