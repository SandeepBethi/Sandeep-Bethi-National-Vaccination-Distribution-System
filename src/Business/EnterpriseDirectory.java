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
public class EnterpriseDirectory {
private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList=new ArrayList<>();
    }
public Enterprise newEnterprise(String entName, String type){
    Enterprise ent=null;
    if(type.equals(Enterprise.Type.DISTRIBUTOR.toString())){
    ent=new DistributorEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.MANUFACTURER.toString())){
    ent=new ManufacturerEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.CDC.toString())){
    ent=new CDCEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.DistributionCentreEnterprise.toString())){
    ent=new DistributionCentreEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.HospitalEnterprise.toString())){
    ent=new HospitalEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.ThirdPartyLab.toString())){
    ent=new ThirdPartyLabEnterprise(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.FederalRegulatoryOffice.toString())){
    ent=new FederalRegulatoryOffice(entName);
    ent.setEnterpriseType(type);
    }else if(type.equals(Enterprise.Type.StateRegulatoryOffice.toString())){
    ent=new StateRegulatoryOffice(entName);
    ent.setEnterpriseType(type);
    }
    
    if(ent!=null)
    {enterpriseList.add(ent);}
    return ent;
    
}


    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
public Enterprise getEnterpriseByUserAccount(UserAccount ua){
        for(Enterprise e: enterpriseList){
            for(UserAccount ua1:e.getUad().getUaList()){
                if(ua1==ua){
                    return e;
                }}
        for(Organization o:e.getOrgDirectory().getOrgList()){
            for(UserAccount ua2:o.getUad().getUaList()){
                if(ua2==ua){
                    return e;
                }
            }
        }}
        
        return null;
    }

}
