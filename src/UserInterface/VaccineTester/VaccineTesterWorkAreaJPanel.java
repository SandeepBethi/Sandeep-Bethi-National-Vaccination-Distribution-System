/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VaccineTester;

import Business.Business;
import Business.UserAccount;
import com.db4o.config.annotations.MaximumActivationDepth;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Bethi
 */
public class VaccineTesterWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount ua;

    /**
     * Creates new form InventoryManagerJPanel
     */
    public VaccineTesterWorkAreaJPanel(JPanel userProcessContainer, Business business, UserAccount ua) {
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

        setBackground(new java.awt.Color(102, 0, 0));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(buttonWorkQueue)
                        .addGap(159, 159, 159)
                        .addComponent(buttonSentRequests)
                        .addGap(0, 207, Short.MAX_VALUE))
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
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSentRequests)
                    .addComponent(buttonWorkQueue))
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSentRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSentRequestsActionPerformed
        JPanel panel = new VaccineTestingSentRequestJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("SentRequestJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_buttonSentRequestsActionPerformed

    private void buttonWorkQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWorkQueueActionPerformed
        JPanel panel = new VaccineTestingWorkQueueJPanel(userProcessContainer, business, ua);
        userProcessContainer.add("SalesWorkQueueJPanel", panel);
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