/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;


import Business.WorkAreas.InvestigationOfficialWorkArea;

/**
 *
 * @author Bethi
 */
public class InvestigationOfficialRole extends Role{

    public InvestigationOfficialRole() {
    super("Investigation Official");
        wa=new InvestigationOfficialWorkArea();
    
    }
    
}
