/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Business;
import Business.UserAccount;
import Business.View.View;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public abstract class WorkArea {
    View view;

   public abstract View createView(JPanel userProcessContainer, Business business, UserAccount ua );
    
    
}
