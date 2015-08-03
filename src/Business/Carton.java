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
public class Carton {
    
    
    private static int count=0;
    private long cartonId;
    private ArrayList<VaccinePackage> packageList;

    public Carton() {
        count++;
        packageList=new ArrayList<VaccinePackage>();
        cartonId=System.currentTimeMillis()+count;
    }

    public ArrayList<VaccinePackage> getPackageList() {
        return packageList;
    }
    
    public VaccinePackage newPackage(){
        VaccinePackage dPackage=new VaccinePackage();
        packageList.add(dPackage);
        return dPackage;
    }

    public long getCartonId() {
        return cartonId;
    }
    
    @Override
    public String toString(){
        if(this.getPackageList().size()<1){
            return null;
    }else{
            return this.getPackageList().get(0).getVaccine().getName();
        }
    }
}
