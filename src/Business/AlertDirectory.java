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
public class AlertDirectory {
private ArrayList<Alert> alertList;
    public AlertDirectory() {
        alertList=new ArrayList<Alert>();
    }

    public ArrayList<Alert> getAlertList() {
        return alertList;
    }
    
}
