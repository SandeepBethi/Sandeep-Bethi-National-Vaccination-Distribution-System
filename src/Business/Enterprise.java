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
public abstract class  Enterprise extends Organization{
    
    private ArrayList<Alert> alertList;
     public static enum Type{
    DISTRIBUTOR{@Override
        public String toString(){return "Distributor Enterprise";}},
    MANUFACTURER{@Override
    public String toString(){return "Manufacturer Enterprise";}},
    HospitalEnterprise{@Override
    public String toString(){return "Hospital Enterprise";}},
    CDC{@Override
    public String toString(){return "CDC Enterprise";}},
    DistributionCentreEnterprise{@Override
    public String toString(){return "DistributionCentreEnterprise";}},
    FederalRegulatoryOffice{@Override
    public String toString(){return "Federal Regulatory Office";}},
    StateRegulatoryOffice{@Override
    public String toString(){return "State Regulatory Office";}},
     
     ThirdPartyLab{@Override
    public String toString(){return "Third Party Lab Enterprise";}}
     
     }
     
    private String enterpriseName;
    private String enterpriseType;
    private OrganizationDirectory orgDirectory;

    public Enterprise(String enterpriseName) {
        super(enterpriseName);
        this.enterpriseName = enterpriseName;
        orgDirectory=new OrganizationDirectory();
        alertList=new ArrayList<Alert>();
    }

    public ArrayList<Alert> getAlertList() {
        return alertList;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public OrganizationDirectory getOrgDirectory() {
        return orgDirectory;
    }
     
    @Override
    public String toString()
    {
    return enterpriseName;
    }
    public Organization getOrganizationByUserAccount(UserAccount ua){
        
        for(Organization o:orgDirectory.getOrgList()){
            for(UserAccount ua1:o.getUad().getUaList()){
                if(ua1==ua){
                    return o;
                }
            }
        }
        
        return null;
    }
}
