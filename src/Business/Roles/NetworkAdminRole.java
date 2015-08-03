/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.AdminWorkArea;
import Business.WorkAreas.NetworkAdminWorkArea;

/**
 *
 * @author Bethi
 */
public class NetworkAdminRole extends Role{

    public NetworkAdminRole() {
        super("Network Admin");
        wa=new NetworkAdminWorkArea();
    }
    
}
