/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class RequestForVaccines extends WorkRequest{
    
    private Vaccine vaccine;
    
    private Organization destination;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Organization getDestination() {
        return destination;
    }

    public void setDestination(Organization destination) {
        this.destination = destination;
    }
    
    
    
}
