/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;


import Business.WorkAreas.LicenseOfficialWorkArea;

/**
 *
 * @author Bethi
 */
public class LicenseOfficialRole extends Role{

    public LicenseOfficialRole() {
    super("License Official");
        wa=new LicenseOfficialWorkArea();
    
    }
    
}
