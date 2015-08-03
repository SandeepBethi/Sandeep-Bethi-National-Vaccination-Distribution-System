/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Bethi
 */
public class VaccineManfacturingOrg extends Organization{

    VaccineCatalog vaccinecatalog;
    public VaccineManfacturingOrg(String orgName) {
        super(orgName);
        vaccinecatalog=new VaccineCatalog();
    }

    public VaccineCatalog getVaccinecatalog() {
        return vaccinecatalog;
    }
    
}
