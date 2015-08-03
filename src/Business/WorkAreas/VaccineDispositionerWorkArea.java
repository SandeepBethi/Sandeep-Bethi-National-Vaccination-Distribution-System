/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Business;
import Business.UserAccount;
import Business.View.VaccineDispositionerView;
import Business.View.VaccineTesterView;
import Business.View.View;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class VaccineDispositionerWorkArea extends WorkArea{
    
    @Override
    public View createView(JPanel userProcessContainer, Business business,UserAccount ua) {
        return new VaccineDispositionerView(userProcessContainer, business,ua);
    }
    
}
