/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.BusinessAdmin.AdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class AdminView extends View {

    public AdminView(JPanel userProcessContainer, Business business, UserAccount ua) {
       
            viewPanel = new AdminJPanel(userProcessContainer, business,ua);
        
    }
}
