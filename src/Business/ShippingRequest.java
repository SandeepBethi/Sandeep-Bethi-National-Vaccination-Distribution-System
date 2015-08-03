/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class ShippingRequest extends WorkRequest{

    Order order;
    private Organization destination;
    private Patient patient;
    public Order getOrder() {
        return order;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setOrder(Order order) {
        this.order = order;
        
    }

    public Organization getDestination() {
        return destination;
    }

    public void setDestination(Organization destination) {
        this.destination = destination;
    }
    
    
    
}
