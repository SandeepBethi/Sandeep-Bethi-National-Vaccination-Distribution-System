/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.View;

import Business.Business;
import Business.UserAccount;
import UserInterface.SalesEmployee.SalesEmployeeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class SalesEmployeeView extends View {
     public SalesEmployeeView(JPanel userProcessContainer, Business business,UserAccount ua) {
    viewPanel=new SalesEmployeeJPanel(userProcessContainer, business,ua);
    }
}
