/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class Vaccine {
    
    private String name;
    private String compound;
    private String type;
    private int weight;
    private int vaccineLife;

    public int getVaccineLife() {
        return vaccineLife;
    }

    public void setVaccineLife(int vaccineLife) {
        this.vaccineLife = vaccineLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
