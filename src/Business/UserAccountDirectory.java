/*
 * To change this tualate, choose Tools | Tualates
 * and open the tualate in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Bethi
 */
public class UserAccountDirectory {
    
    
     ArrayList<UserAccount> uaList;

    public UserAccountDirectory() {
    uaList=new ArrayList<>();
    }

    public ArrayList<UserAccount> getUaList() {
        return uaList;
    }
    
    
    public UserAccount newUserAccount()
    {
    UserAccount ua=new UserAccount();
    uaList.add(ua);
    return ua;
    }
}
