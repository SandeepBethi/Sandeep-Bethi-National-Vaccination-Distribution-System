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
public class InventoryCatalog {
    private ArrayList<Carton> cartonList;
    private ArrayList<Carton> suspectedCartonList;

    public InventoryCatalog() {
        cartonList=new ArrayList<Carton>();
        suspectedCartonList=new ArrayList<Carton>();
    }

    public ArrayList<Carton> getCartonList() {
        return cartonList;
    }
    
    public void addCarton(Carton c){
        cartonList.add(c);
    }

    public void addSuspectedCarton(Carton c){
        suspectedCartonList.add(c);
    }
    
    public ArrayList<Carton> getSuspectedCartonList() {
        return suspectedCartonList;
    }
    
    
}
