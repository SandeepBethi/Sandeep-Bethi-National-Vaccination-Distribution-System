/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class ThirdPartyLabEnterprise extends Enterprise{
    
    

VaccineTestingOrganization dto;

    public ThirdPartyLabEnterprise(String enterpriseName) {
        super(enterpriseName);
       
        dto=(VaccineTestingOrganization)getOrgDirectory().newOrg(Organization.VaccineTesting);
        
        
    }

    public VaccineTestingOrganization getDto() {
        return dto;
    }

    public void setDto(VaccineTestingOrganization dto) {
        this.dto = dto;
    }


   

    
}
