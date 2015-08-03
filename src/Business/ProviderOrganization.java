/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class ProviderOrganization extends Organization{

    private MasterOrderCatalog masterOrderCatalog;
    
    public ProviderOrganization(String orgName) {
        super(orgName);
        masterOrderCatalog=new MasterOrderCatalog();
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }
 
    
}
