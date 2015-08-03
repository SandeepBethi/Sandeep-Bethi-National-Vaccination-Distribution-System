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
public class Alert {
    
    VaccinePackage dp;
    ArrayList<VaccinePackage> packageList;
    Enterprise incidentOrigin;
    String incidentDetail;

    public Alert() {
        
        packageList=new ArrayList<>();
        
    }
    
    

    public VaccinePackage getDp() {
        return dp;
    }

    public void setDp(VaccinePackage dp) {
        this.dp = dp;
    }

    public Enterprise getIncidentOrigin() {
        return incidentOrigin;
    }

    public void setIncidentOrigin(Enterprise incidentOrigin) {
        this.incidentOrigin = incidentOrigin;
    }

    public String getIncidentDetail() {
        return incidentDetail;
    }

    public void setIncidentDetail(String incidentDetail) {
        this.incidentDetail = incidentDetail;
    }

    public ArrayList<VaccinePackage> getPackageList() {
        return packageList;
    }
    
    @Override
    public String toString(){
        return packageList.get(0).toString();
    }
    
    
}
