/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class Transaction {
    private Enterprise sender;
    private Enterprise receiver;
    private Patient patient;
    private long orderId;
    public Enterprise getSender() {
        return sender;
    }

    public Patient getPatient() {
        return patient;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setSender(Enterprise sender) {
        this.sender = sender;
    }

    public Enterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(Enterprise receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public String toString(){
        return Long.toString(orderId);
    }
}
