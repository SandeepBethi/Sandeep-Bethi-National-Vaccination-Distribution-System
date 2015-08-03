/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Roles.AdminRole;
import Business.Roles.VaccineManufacturerRole;
import Business.Roles.VaccineTesterRole;
import Business.Roles.EnterpriseAdminRole;
import Business.Roles.InventoryManagerRole;
import Business.Roles.InvestigationOfficialRole;
import Business.Roles.LicenseOfficialRole;
import Business.Roles.NetworkAdminRole;
import Business.Roles.PatientRole;
import Business.Roles.SalesEmployeeRole;
import Business.Roles.ShipmentManagerRole;

/**
 *
 * @author Bethi
 */
public class ConfigureABusiness {

    private static void addBusinessAdmin(Business business) {
        Employee e = business.getEmpd().newEmployee();
        e.setFirstName("Administrator FName");
        e.setLastName("Administrator LName");


        UserAccount ua = business.getUad().newUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(new AdminRole());
    }

    public static Business initialize() {
        Business b = Business.getInstance();
        addBusinessAdmin(b);
        
      
        return b;
    }
}

