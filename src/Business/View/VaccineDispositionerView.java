/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.VaccineDispotioner.VaccineDispositionerWorkAreaJPanel;
import UserInterface.VaccineTester.VaccineTesterWorkAreaJPanel;
import UserInterface.SalesEmployee.SalesEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class VaccineDispositionerView extends View {
     public VaccineDispositionerView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new VaccineDispositionerWorkAreaJPanel(userProcessContainer, business,ua);
    }
}
