/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.VaccineManufacturer.VaccineManufacturerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class VaccineManufacturerView extends View {

    public VaccineManufacturerView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new VaccineManufacturerWorkAreaJPanel(userProcessContainer, business,ua);
    }
    
}
