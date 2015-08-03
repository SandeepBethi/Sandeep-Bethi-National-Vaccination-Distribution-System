/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package UserInterface.LicenseOfficial;


import Business.Business;
import Business.DistributorEnterprise;
import Business.Vaccine;
import Business.VaccineLicenseRequest;
import Business.Enterprise;
import Business.EnterpriseLicenseApprovalRequest;
import Business.FederalRegulatoryOffice;
import Business.HospitalEnterprise;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.StateRegulatoryOffice;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import sun.security.acl.WorldGroupImpl;

/**
 *
 * @author Bethi
 */
public class EnterpriseLicenseRequestJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
Business b;
EnterpriseLicenseApprovalRequest sr;
LicenseOfficialWorkQueueJPanel swq;

    /** Creates new form BusinessAdminWorkAreaJPanel */
    public EnterpriseLicenseRequestJPanel(JPanel upc, Business b, UserAccount ua,EnterpriseLicenseApprovalRequest sr,LicenseOfficialWorkQueueJPanel swq) {
        initComponents();

        this.b=b;
        userProcessContainer = upc;
        userAccount = ua;
        this.sr=sr;
        this.swq=swq;
        
        lblDrugName.setText(sr.getReqEnterprise().getEnterpriseName());
        
        if(sr.getReqEnterprise().getClass().equals(ManufacturerEnterprise.class)){
        lblDrugCompound.setText(Enterprise.Type.MANUFACTURER.toString());     
             
         }else if(sr.getReqEnterprise().getClass().equals(DistributorEnterprise.class)){
        lblDrugCompound.setText(Enterprise.Type.DISTRIBUTOR.toString());
         }else if(sr.getReqEnterprise().getClass().equals(HospitalEnterprise.class)){
        lblDrugCompound.setText(Enterprise.Type.HospitalEnterprise.toString());
         }
        
        
               
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        buttonApproveDrugRequest = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonRejectDrugRequest1 = new javax.swing.JButton();
        lblDrugCompound = new javax.swing.JLabel();
        lblDrugName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nav_left_red.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        buttonApproveDrugRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ok.png"))); // NOI18N
        buttonApproveDrugRequest.setText("Approve");
        buttonApproveDrugRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveDrugRequestActionPerformed(evt);
            }
        });

        jLabel4.setText("Enterprise Type");

        jLabel6.setText("Enterprise Name");

        buttonRejectDrugRequest1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/error.png"))); // NOI18N
        buttonRejectDrugRequest1.setText("Reject");
        buttonRejectDrugRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRejectDrugRequest1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enterprise Approval Request");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(64, 64, 64)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(backJButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 313, Short.MAX_VALUE)
                        .add(buttonRejectDrugRequest1)
                        .add(18, 18, 18)
                        .add(buttonApproveDrugRequest))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(jLabel6))
                        .add(45, 45, 45)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblDrugName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 136, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblDrugCompound, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 136, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .add(105, 105, 105))
            .add(layout.createSequentialGroup()
                .add(298, 298, 298)
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(lblDrugName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel4)
                        .add(18, 308, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(backJButton)
                            .add(buttonApproveDrugRequest)
                            .add(buttonRejectDrugRequest1))
                        .add(29, 29, 29))
                    .add(layout.createSequentialGroup()
                        .add(lblDrugCompound, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        swq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void buttonApproveDrugRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveDrugRequestActionPerformed

        Network n=b.getNetDir().getNetworkByUserAccount(userAccount);
        n.getEntDirectory().getEnterpriseList().add(sr.getReqEnterprise());
        sr.setStatus(WorkRequest.StatusType.Resolved.toString());
        
        swq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonApproveDrugRequestActionPerformed

    private void buttonRejectDrugRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRejectDrugRequest1ActionPerformed
        
        sr.setStatus("Rejected");
        
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonRejectDrugRequest1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton buttonApproveDrugRequest;
    private javax.swing.JButton buttonRejectDrugRequest1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDrugCompound;
    private javax.swing.JLabel lblDrugName;
    // End of variables declaration//GEN-END:variables
}