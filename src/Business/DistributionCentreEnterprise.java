/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class DistributionCentreEnterprise extends Enterprise{

    ShippingOrganization sho;
    
    public DistributionCentreEnterprise(String enterpriseName) {
        super(enterpriseName);
        sho=(ShippingOrganization)getOrgDirectory().newOrg(Organization.SHIPPING);
    }

    public ShippingOrganization getSho() {
        return sho;
    }
    
    
}
