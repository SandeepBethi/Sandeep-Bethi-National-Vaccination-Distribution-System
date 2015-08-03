/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class HospitalEnterprise extends Enterprise{
    InventoryManagementOrg inventoryManagementOrg;
ProviderOrganization smo;
ShippingOrganization sho;

    public HospitalEnterprise(String enterpriseName) {
        super(enterpriseName);
       
        inventoryManagementOrg=(InventoryManagementOrg)getOrgDirectory().newOrg(Organization.INVENTORYMANAGEMENT);
        smo=(ProviderOrganization)getOrgDirectory().newOrg(Organization.PROVIDER);
        sho=(ShippingOrganization)getOrgDirectory().newOrg(Organization.SHIPPING);
    }

    public InventoryManagementOrg getInventoryManagementOrg() {
        return inventoryManagementOrg;
    }

   public ProviderOrganization getSmo() {
        return smo;
    }

    public ShippingOrganization getSho() {
        return sho;
    }


}
