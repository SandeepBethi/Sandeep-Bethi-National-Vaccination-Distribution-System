/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.EnterpriseAdminWorkArea;

/**
 *
 * @author Bethi
 */
public class EnterpriseAdminRole extends Role {

    public EnterpriseAdminRole() {
        super("Enterprise Admin");
     wa=new EnterpriseAdminWorkArea();   
    }
    
}
