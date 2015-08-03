/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public  class  Network extends Enterprise{
   
    
    private String networkName;
    private EnterpriseDirectory entDirectory;
    private PatientDirectory patientDir;

    public Network(String networkName) {
        super(networkName);
        this.networkName = networkName;
        entDirectory=new EnterpriseDirectory();
        patientDir=new PatientDirectory();
    }

    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    

    public String getNetworkName() {
        return networkName;
    }

    public EnterpriseDirectory getEntDirectory() {
        return entDirectory;
    }
     
    @Override
    public String toString()
    {
    return networkName;
    }
    public Enterprise getEnterpriseByUserAccount(UserAccount ua){
       
        for(Enterprise e:entDirectory.getEnterpriseList()){
            for(UserAccount ua1:e.getUad().getUaList()){
                if(ua==ua1){
                    return e;
                }
            }
            if(e.getOrganizationByUserAccount(ua)!=null){
                return e;
            }
            
        }
        
        return null;
    }
}
