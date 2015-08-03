/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class CDCEnterprise extends Enterprise{
    
    
InvestigationDepartment investigationOrg;
LicenseApprovalDepartment licenseDept;
VaccineDispositionOrganization vaccineDispositionOrg;
AlertDirectory alertDir;



    
   


    public CDCEnterprise(String enterpriseName) {
        super(enterpriseName);
       alertDir=new AlertDirectory();
       
        investigationOrg=(InvestigationDepartment)getOrgDirectory().newOrg(Organization.INVESTIGATIONORG);
        licenseDept=(LicenseApprovalDepartment)getOrgDirectory().newOrg(Organization.LICENSEAPPROVALDEPT);
        vaccineDispositionOrg=(VaccineDispositionOrganization)getOrgDirectory().newOrg(Organization.VaccineDisposition);
    }

   

    public VaccineDispositionOrganization getDrugDispositionOrg() {
        return vaccineDispositionOrg;
    }

    public AlertDirectory getAlertDir() {
        return alertDir;
    }

    public InvestigationDepartment getInvestigationOrg() {
        return investigationOrg;
    }

    public LicenseApprovalDepartment getLicenseDept() {
        return licenseDept;
    }

    

   

    
}
