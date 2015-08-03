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
public class MasterOrderCatalog {
    
    private ArrayList<Order> orderList;

    public MasterOrderCatalog() {
        orderList=new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public void addOrder(Order o){
        orderList.add(o);
    }
    
    
}
