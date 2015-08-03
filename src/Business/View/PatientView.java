/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.Patient.PatientWorkareaJPanel;
import UserInterface.SalesEmployee.SalesEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class PatientView extends View {
     public PatientView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new PatientWorkareaJPanel(userProcessContainer, business,ua);
    }
}
