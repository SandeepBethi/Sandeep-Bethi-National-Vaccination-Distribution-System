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
public class NetworkDirectory {
private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList=new ArrayList<>();
    }
public Network newNetwork(String entName){
    Network net=new Network(entName);
    networkList.add(net);
    return net;
    
}

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }


public Network getNetworkByUserAccount(UserAccount ua){
        for(Network n: networkList){
            for(UserAccount ua1:n.getUad().getUaList()){
                if(ua1==ua){
                    return n;
                }}
                for(Enterprise e:n.getEntDirectory().getEnterpriseList() ){
                    for(UserAccount ua2:e.getUad().getUaList()){
                if(ua2==ua){
                    return n;
                }
            }
        for(Organization o:e.getOrgDirectory().getOrgList()){
            for(UserAccount ua3:o.getUad().getUaList()){
                if(ua3==ua){
                    return n;
                }
            }
        }}}
        
        return null;
    }

}
