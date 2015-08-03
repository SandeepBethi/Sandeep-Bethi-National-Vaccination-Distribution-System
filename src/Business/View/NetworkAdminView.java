/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.NetworkAdmin.NetworkAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class NetworkAdminView extends View {

    public NetworkAdminView(JPanel userProcessContainer, Business business, UserAccount ua) {
       
            viewPanel = new NetworkAdminJPanel(userProcessContainer, business,ua);
        
    }
}
