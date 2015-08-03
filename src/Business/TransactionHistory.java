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
public class TransactionHistory {

    private ArrayList<VaccineHistory> vaccineHistoryList;
    
    public TransactionHistory() {
        vaccineHistoryList=new ArrayList<VaccineHistory>();
    }

    public ArrayList<VaccineHistory> getVaccineHistoryList() {
        return vaccineHistoryList;
    }
    
    public VaccineHistory newVaccineHistory(){
        VaccineHistory dh=new VaccineHistory();
        vaccineHistoryList.add(dh);
        return dh;
    }
    
    
}
