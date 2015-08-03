/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.AdminWorkArea;

/**
 *
 * @author Bethi
 */
public class AdminRole extends Role{

    public AdminRole() {
        super("Business Admin");
        wa=new AdminWorkArea();
    }
    
}
