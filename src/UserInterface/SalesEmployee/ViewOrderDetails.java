/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package UserInterface.SalesEmployee;

import UserInterface.InventoryManager.*;
import Business.Business;
import Business.Carton;
import Business.DistributorEnterprise;
import Business.Vaccine;
import Business.VaccineHistory;
import Business.VaccinePackage;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.InventoryManagementOrg;
import Business.ManufacturerEnterprise;
import Business.Network;
import Business.Order;
import Business.Organization;
import Business.RequestForVaccines;
import Business.ProviderOrganization;
import Business.ShippingRequest;
import Business.DistributionCentreEnterprise;
import Business.Transaction;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bethi
 */
public class ViewOrderDetails extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    Business b;
    ShippingRequest rfd;
    int drugAvailability = 0;
    SalesWorkQueueJPanel swq;

    /**
     * Creates new form BusinessAdminWorkAreaJPanel
     */
    public ViewOrderDetails(JPanel upc, Business b, UserAccount ua, ShippingRequest rfd,SalesWorkQueueJPanel swq) {
        initComponents();

        this.b = b;
        userProcessContainer = upc;
        userAccount = ua;
        this.rfd = rfd;
        this.swq=swq;
       
for (Network net : b.getNetDir().getNetworkList()) {
            for (Enterprise ent : net.getEntDirectory().getEnterpriseList()) {
                if (ent.getClass().equals(DistributionCentreEnterprise.class)) {
                    shippingComboBox.addItem(ent);
                }

            }

        }
        refreshWorkReqTable();

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

    private void refreshWorkReqTable() {
        int rowCount = vaccinecatalogTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) vaccinecatalogTable.getModel()).removeRow(i);

        }
        if(rfd.getOrder().getPackageList().size()==0){
        for(Carton c:rfd.getOrder().getCartonList()){



Object row[] = new Object[4];
            row[0] = c;
            row[1] = c.getCartonId();
            row[2] = c.getPackageList().size();
            
            Enterprise enterprise1=b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
            if(enterprise1.getClass().equals(HospitalEnterprise.class)){
                row[3]=rfd.getPatient();
            
            }else {
                Enterprise tempEnt=null;
            for(Network net1:b.getNetDir().getNetworkList()){
                for(Enterprise ent1:net1.getEntDirectory().getEnterpriseList()){
                   for(Organization org1:ent1.getOrgDirectory().getOrgList()){
                       if(org1==rfd.getDestination()){
                           tempEnt=ent1;
                       }
                   }
                }
            }
            row[3] = tempEnt;
            }
            



            ((DefaultTableModel) vaccinecatalogTable.getModel()).addRow(row);
        }
        }else{
            for(VaccinePackage c:rfd.getOrder().getPackageList()){



Object row[] = new Object[4];
            row[0] = c;
            row[1] = c.getCartonId();
            row[2] = null;
            
            Enterprise enterprise1=b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
            if(enterprise1.getClass().equals(HospitalEnterprise.class)){
                row[3]=rfd.getPatient();
            
            }else {
                Enterprise tempEnt=null;
            for(Network net1:b.getNetDir().getNetworkList()){
                for(Enterprise ent1:net1.getEntDirectory().getEnterpriseList()){
                   for(Organization org1:ent1.getOrgDirectory().getOrgList()){
                       if(org1==rfd.getDestination()){
                           tempEnt=ent1;
                       }
                   }
                }
            }
            row[3] = tempEnt;
            }
            



            ((DefaultTableModel) vaccinecatalogTable.getModel()).addRow(row);
        }
        }
        if (vaccinecatalogTable.getRowCount() > 0) {
            vaccinecatalogTable.changeSelection(0, 0, true, true);
        }
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
        backJButton = new javax.swing.JButton();
        requestDrugsJButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinecatalogTable = new javax.swing.JTable();
        shippingComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request for Vaccines");

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nav_left_red.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestDrugsJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ok.png"))); // NOI18N
        requestDrugsJButton1.setText("Submit");
        requestDrugsJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDrugsJButton1ActionPerformed(evt);
            }
        });

        vaccinecatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine", "Carton Id", "Size", "Destination"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccinecatalogTable);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Third Party Shipping");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(backJButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(requestDrugsJButton1))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(298, 298, 298)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .add(18, 18, 18)
                .add(shippingComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(shippingComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 162, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backJButton)
                    .add(requestDrugsJButton1))
                .add(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        swq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestDrugsJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDrugsJButton1ActionPerformed

        ProviderOrganization smo=(ProviderOrganization)b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
        smo.getMasterOrderCatalog().addOrder(rfd.getOrder());

       DistributionCentreEnterprise tso = (DistributionCentreEnterprise) shippingComboBox.getSelectedItem();
        tso.getSho().getWorkQueue().addWR(rfd);
        rfd.setStatus(WorkRequest.StatusType.PendingatShippingDept.toString());
        rfd.setReceiver(null);
        rfd.setSender(userAccount);
        rfd.setStatus(WorkRequest.StatusType.AtShippingDepartment.toString());
        Enterprise temp=null;
        if(rfd.getDestination()!=null){
        for(Network n:b.getNetDir().getNetworkList()){
            for(Enterprise e:n.getEntDirectory().getEnterpriseList()){
                for(Organization o:e.getOrgDirectory().getOrgList()){
                    if(o==rfd.getDestination()){
                        temp=e;
                    }
                }
            }
        }
        rfd.getOrder().setDestination(temp);
        }else{
            rfd.getOrder().setPatient(rfd.getPatient());
        }
        swq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_requestDrugsJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestDrugsJButton1;
    private javax.swing.JComboBox shippingComboBox;
    private javax.swing.JTable vaccinecatalogTable;
    // End of variables declaration//GEN-END:variables
}
