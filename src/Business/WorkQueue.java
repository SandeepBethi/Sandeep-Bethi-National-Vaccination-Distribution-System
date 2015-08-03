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
public class WorkQueue {

    private ArrayList<WorkRequest> wrList;

    public WorkQueue() {
        wrList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWrList() {
        return wrList;
    }

    
    public void addWR(WorkRequest wr) {
        wrList.add(wr);
    }
}
