/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class FederalRegulatoryOffice extends Enterprise{
    
    

LicenseApprovalDepartment licenseApprovalDepartment;

    public FederalRegulatoryOffice(String enterpriseName) {
        super(enterpriseName);
       
        licenseApprovalDepartment=(LicenseApprovalDepartment)getOrgDirectory().newOrg(Organization.LICENSEAPPROVALDEPT);
        
        
    }

    public LicenseApprovalDepartment getLicenseApprovalDepartment() {
        return licenseApprovalDepartment;
    }

    public void setLicenseApprovalDepartment(LicenseApprovalDepartment licenseApprovalDepartment) {
        this.licenseApprovalDepartment = licenseApprovalDepartment;
    }

   


   

    
}
