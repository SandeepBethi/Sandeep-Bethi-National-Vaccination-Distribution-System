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
public class VaccineHistory {
    
    private VaccinePackage dPackage;
    private ArrayList<Transaction> transactionList;

    public VaccineHistory() {
        transactionList=new ArrayList<Transaction>();
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }
    
    public Transaction newTransaction(){
        Transaction t=new Transaction();
        transactionList.add(t);
        return t;
    }

    public VaccinePackage getdPackage() {
        return dPackage;
    }

    public void setdPackage(VaccinePackage dPackage) {
        this.dPackage = dPackage;
    }
    
    
    
}
