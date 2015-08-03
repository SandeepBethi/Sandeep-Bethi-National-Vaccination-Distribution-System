/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class InventoryManagementOrg extends Organization{

    InventoryCatalog invCatalog;
    
    public InventoryManagementOrg(String orgName) {
        super(orgName);
        invCatalog=new InventoryCatalog();
    }

    public InventoryCatalog getInvCatalog() {
        return invCatalog;
    }
    
    
}
