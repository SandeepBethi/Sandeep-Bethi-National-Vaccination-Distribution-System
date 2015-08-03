/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.EnterpriseAdmin.EnterpriseAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class EnterpriseAdminView extends View {

    public EnterpriseAdminView(JPanel userProcessContainer, Business business, UserAccount ua) {

       
                        viewPanel = new EnterpriseAdminJPanel(userProcessContainer, business, ua);
                    
    }
}
