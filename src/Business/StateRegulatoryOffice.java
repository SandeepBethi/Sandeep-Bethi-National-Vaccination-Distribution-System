/*
 * To change this template, choose Tools | Templates
 * awond open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class StateRegulatoryOffice extends Enterprise{
    
    

LicenseApprovalDepartment licenseApprovalDepartment;

    public StateRegulatoryOffice(String enterpriseName) {
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
