/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bethi
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList=new ArrayList<>();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }
    
   public Organization newOrg(String orgName){
        Organization org=null;
        if(orgName.equals(Organization.INVENTORYMANAGEMENT))
        {org=new InventoryManagementOrg(orgName);
        
        }else if(orgName.equals(Organization.PROVIDER))
        {org=new ProviderOrganization(orgName);
        
        }else if(orgName.equals(Organization.SHIPPING))
        {org=new ShippingOrganization(orgName);
        
        }else if(orgName.equals(Organization.VACCINEMANUFACTURE))
        {org=new VaccineManfacturingOrg(orgName);
        
        }else if(orgName.equals(Organization.INVESTIGATIONORG))
        {org=new InvestigationDepartment(orgName);
        
        }else if(orgName.equals(Organization.LICENSEAPPROVALDEPT))
        {org=new LicenseApprovalDepartment(orgName);
        
        }else if(orgName.equals(Organization.VaccineTesting))
        {org=new VaccineTestingOrganization(orgName);
        }else if(orgName.equals(Organization.VaccineDisposition))
        {org=new VaccineDispositionOrganization(orgName);
        }
                if(org!=null)
        {orgList.add(org);}
        
        return org;
    }
 
    
}
