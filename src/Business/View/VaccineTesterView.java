/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.VaccineTester.VaccineTesterWorkAreaJPanel;
import UserInterface.SalesEmployee.SalesEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class VaccineTesterView extends View {
     public VaccineTesterView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new VaccineTesterWorkAreaJPanel(userProcessContainer, business,ua);
    }
}
