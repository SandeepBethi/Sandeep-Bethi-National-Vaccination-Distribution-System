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
public class VaccineDispositionRequest extends WorkRequest{

   
    private ArrayList<VaccinePackage> packageList;

    public VaccineDispositionRequest() {
    packageList=new ArrayList<VaccinePackage>();
    
    }
   

  

    public ArrayList<VaccinePackage> getPackageList() {
        return packageList;
    }
    
    
     public void addPackage(VaccinePackage p){
        
        packageList.add(p);
        
        
    }
    
   

       

    
}
