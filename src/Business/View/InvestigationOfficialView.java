/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.InvestigationOfficial.InvestigationOfficialWorkareaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class InvestigationOfficialView extends View {

    public InvestigationOfficialView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new InvestigationOfficialWorkareaJPanel(userProcessContainer, business,ua);
    }
    
}
