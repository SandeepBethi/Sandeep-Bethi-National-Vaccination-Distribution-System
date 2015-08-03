/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NetworkAdmin;

import UserInterface.BusinessAdmin.*;
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
public class NetworkAdminJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
UserAccount ua;
    /**
     * Creates new form NetworkAdminJPanel
     */
    public NetworkAdminJPanel(JPanel userProcessContainer, Business business,UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.ua=ua;
        //getRootPane().setDefaultButton(buttonCreateEnterpriseAdmin);
     JPanel panel = this;
        panel.setOpaque(false);
        panel.setPreferredSize(this.getPreferredSize());

    }
    ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/vaccination-needles.jpg"));

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

        jLabel1 = new javax.swing.JLabel();
        buttonManagePatients = new javax.swing.JButton();
        buttonPatients = new javax.swing.JButton();
        buttonViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Network Admin Work Area");

        buttonManagePatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/businesspeople2.png"))); // NOI18N
        buttonManagePatients.setText("Manage Enterprise");
        buttonManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManagePatientsActionPerformed(evt);
            }
        });

        buttonPatients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/businesspeople2.png"))); // NOI18N
        buttonPatients.setText("Manage Patients");
        buttonPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPatientsActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(324, 324, 324)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonPatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonViewDetails)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonViewDetails)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(buttonManagePatients)
                .addGap(18, 18, 18)
                .addComponent(buttonPatients)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManagePatientsActionPerformed
        ManageEnterpriseJPanel cea = new ManageEnterpriseJPanel(userProcessContainer, business,ua);
        userProcessContainer.add("ManageEnterpriseJPanel", cea);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonManagePatientsActionPerformed

    private void buttonPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPatientsActionPerformed
      ManagePatientJPanel cea = new ManagePatientJPanel(userProcessContainer, business,ua);
        userProcessContainer.add("ManagePatientJPanel", cea);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonPatientsActionPerformed

    private void buttonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewDetailsActionPerformed
        JPanel panel = new ViewDetailsJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("View Details", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonViewDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonManagePatients;
    private javax.swing.JButton buttonPatients;
    private javax.swing.JButton buttonViewDetails;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}