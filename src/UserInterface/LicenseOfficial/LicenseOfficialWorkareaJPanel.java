/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LicenseOfficial;

import UserInterface.InventoryManager.*;
import Business.Business;
import Business.Enterprise;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class LicenseOfficialWorkareaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount ua;

    /**
     * Creates new form InventoryManagerJPanel
     */
    public LicenseOfficialWorkareaJPanel(JPanel userProcessContainer, Business business, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.ua = ua;

       

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

        buttonSentRequests = new javax.swing.JButton();
        buttonWorkQueue = new javax.swing.JButton();
        buttonViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        buttonSentRequests.setText("Sent Requests");
        buttonSentRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSentRequestsActionPerformed(evt);
            }
        });

        buttonWorkQueue.setText("Work Queue");
        buttonWorkQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWorkQueueActionPerformed(evt);
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
                .addGap(41, 41, 41)
                .addComponent(buttonWorkQueue)
                .addGap(296, 296, 296)
                .addComponent(buttonSentRequests)
                .addContainerGap(224, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSentRequests)
                    .addComponent(buttonWorkQueue))
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSentRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSentRequestsActionPerformed
        JPanel panel = new InventorySentRequestJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("InventorySentRequestJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonSentRequestsActionPerformed

    private void buttonWorkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWorkQueueActionPerformed
        JPanel panel = new LicenseOfficialWorkQueueJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("InventoryWorkQueueJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonWorkQueueActionPerformed

    private void buttonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewDetailsActionPerformed
        JPanel panel = new ViewDetailsJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("View Details", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonViewDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSentRequests;
    private javax.swing.JButton buttonViewDetails;
    private javax.swing.JButton buttonWorkQueue;
    // End of variables declaration//GEN-END:variables
}