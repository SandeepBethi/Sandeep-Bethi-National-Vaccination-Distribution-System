/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import UserInterface.MainJFrame;

/**
 *
 * @author Bethi
 */
public class Business extends Enterprise {

    NetworkDirectory netdir;
    TransactionHistory transactionHistory;
    public static Business business;

    private Business() {
        super("Vaccine Ecosystem");
        netdir = new NetworkDirectory();
        transactionHistory=new TransactionHistory();


    }

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public NetworkDirectory getNetDir() {
        return netdir;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public boolean isUserNamePresent(String uName,Business business) {
        boolean flag = false;
        for (UserAccount ua : business.getUad().getUaList()) {
            if (uName.equals(ua.getUserName())) {
                flag = true;
            }
        }
        for (Network network : business.getNetDir().getNetworkList()) {
            for (UserAccount ua : network.getUad().getUaList()) {
                if (uName.equals(ua.getUserName())) {
                    flag = true;
                }
            }
            for (Enterprise e : network.getEntDirectory().getEnterpriseList()) {
                for (UserAccount ua : e.getUad().getUaList()) {
                    if (uName.equals(ua.getUserName())) {
                        flag = true;
                    }
                }
                for (Organization o : e.getOrgDirectory().getOrgList()) {
                    for (UserAccount ua : o.getUad().getUaList()) {
                        if (uName.equals(ua.getUserName())) {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public UserAccount authenticateUser(String uName, String pWord,Business business) {
        
        UserAccount userAccount = null;
        for (UserAccount ua : business.getUad().getUaList()) {
            if (uName.equals(ua.getUserName()) && pWord.equals(ua.getPassword())) {
                userAccount = ua;
            }
        }
        for (Network n : business.getNetDir().getNetworkList()) {
            for (UserAccount ua : n.getUad().getUaList()) {
                if (uName.equals(ua.getUserName()) && pWord.equals(ua.getPassword())) {
                    userAccount = ua;
                }
            }
        for (Enterprise e : n.getEntDirectory().getEnterpriseList()) {
            for (UserAccount ua : e.getUad().getUaList()) {
                if (uName.equals(ua.getUserName()) && pWord.equals(ua.getPassword())) {
                    userAccount = ua;
                }
            }
            for (Organization o : e.getOrgDirectory().getOrgList()) {
                for (UserAccount ua : o.getUad().getUaList()) {
                    if (uName.equals(ua.getUserName()) && pWord.equals(ua.getPassword())) {
                        userAccount = ua;
                    }
                }
            }
        }
    }
        return userAccount;
    }
    /*  public EnterpriseOrganization getEo() {
     return eo;
     }*/
}
