/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class ManufacturerEnterprise extends Enterprise{
    
    

ProviderOrganization smo;

VaccineManfacturingOrg dmo;

    public ManufacturerEnterprise(String enterpriseName) {
        super(enterpriseName);
       
        dmo=(VaccineManfacturingOrg)getOrgDirectory().newOrg(Organization.VACCINEMANUFACTURE);
        smo=(ProviderOrganization)getOrgDirectory().newOrg(Organization.PROVIDER);
        
    }

    public VaccineManfacturingOrg getDmo() {
        return dmo;
    }

    

    

   
    public ProviderOrganization getSmo() {
        return smo;
    }
   

    
}
