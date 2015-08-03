/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class VaccineLicenseRequest extends WorkRequest{
    
    private String vaccineName;
    private String vaccineCompound;
    private int vaccineWeight;
    private String type;
    private int shelfLife;
    private Organization destination;

    public Organization getDestination() {
        return destination;
    }

    public void setDestination(Organization destination) {
        this.destination = destination;
    }
    public String getVaccineName() {
        return vaccineName;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompound() {
        return vaccineCompound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVaccineCompound(String vaccineCompound) {
        this.vaccineCompound = vaccineCompound;
    }

    public int getVaccineWeight() {
        return vaccineWeight;
    }

    public void setVaccineWeight(int vaccineWeight) {
        this.vaccineWeight = vaccineWeight;
    }
    
    
}
