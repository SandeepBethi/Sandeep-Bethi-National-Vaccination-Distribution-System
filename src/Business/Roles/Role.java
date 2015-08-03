/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WorkArea;

/**
 *
 * @author Bethi
 */
public abstract class Role {
    WorkArea wa;
    String roleName;

    public Role(String roleName) {
        this.roleName=roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    
    

    public WorkArea getWa() {
        return wa;
    }

    public void setWa(WorkArea wa) {
        this.wa = wa;
    }
    
    
}
