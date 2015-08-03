/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdmin;

import Business.Business;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class EnterpriseAdminJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
Business business;
UserAccount ua;
    /**
     * Creates new form EnterpriseAdminJPanel
     */
    public EnterpriseAdminJPanel(JPanel userProcessContainer, Business business,UserAccount ua) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;
        this.ua=ua;
     JPanel panel = this;
        panel.setOpaque(false);
        panel.setPreferredSize(this.getPreferredSize());

    }
    ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/rsz_drug_good.jpg"));

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(icon.getImage(), 0, 0, null);
        super.paintComponent(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonManageEmployees = new javax.swing.JButton();
        buttonManageUserAccounts = new javax.swing.JButton();
        buttonViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        buttonManageEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/businesspeople2.png"))); // NOI18N
        buttonManageEmployees.setText("Manage Employees");
        buttonManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageEmployeesActionPerformed(evt);
            }
        });

        buttonManageUserAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/businesspeople2.png"))); // NOI18N
        buttonManageUserAccounts.setText("Manage User Accounts");
        buttonManageUserAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManageUserAccountsActionPerformed(evt);
            }
        });

        buttonViewDetails.setText("View Personal Details");
        buttonViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonManageEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonManageUserAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonViewDetails)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonViewDetails)
                .addGap(71, 71, 71)
                .addComponent(buttonManageEmployees)
                .addGap(26, 26, 26)
                .addComponent(buttonManageUserAccounts)
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageEmployeesActionPerformed

        ManageEmployeesJPanel crpm=new ManageEmployeesJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("ManageEmployeesJPanel", crpm);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonManageEmployeesActionPerformed

    private void buttonManageUserAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManageUserAccountsActionPerformed
        ManageUserAccounts cse=new ManageUserAccounts(userProcessContainer, business, ua);
        userProcessContainer.add("ManageUserAccounts", cse);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonManageUserAccountsActionPerformed

    private void buttonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewDetailsActionPerformed
        JPanel panel = new ViewDetailsJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("View Details", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonViewDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonManageEmployees;
    private javax.swing.JButton buttonManageUserAccounts;
    private javax.swing.JButton buttonViewDetails;
    // End of variables declaration//GEN-END:variables
}