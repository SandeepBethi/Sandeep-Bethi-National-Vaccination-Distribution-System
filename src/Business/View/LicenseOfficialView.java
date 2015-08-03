/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.LicenseOfficial.LicenseOfficialWorkareaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class LicenseOfficialView extends View {

    public LicenseOfficialView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new LicenseOfficialWorkareaJPanel(userProcessContainer, business,ua);
    }
    
}
