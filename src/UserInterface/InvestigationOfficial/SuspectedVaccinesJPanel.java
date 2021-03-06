/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InvestigationOfficial;

import Business.Business;
import Business.Carton;
import Business.VaccineDispositionRequest;
import Business.VaccineHistory;
import Business.VaccinePackage;
import Business.Enterprise;
import Business.CDCEnterprise;
import Business.InventoryManagementOrg;
import Business.LabTestingRequest;
import Business.Network;
import Business.Organization;
import Business.ReportCDCRequest;
import Business.ThirdPartyLabEnterprise;
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
public class SuspectedVaccinesJPanel extends javax.swing.JPanel {

    Business b;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    ReportCDCRequest rfr;
InvestigationOfficialWorkQueueJPanel iwq;
    /**
     * Creates new form InventorySentRequestJPanel
     */
    public SuspectedVaccinesJPanel(JPanel upc, Business b, UserAccount ua, ReportCDCRequest rfr,InvestigationOfficialWorkQueueJPanel iwq) {
        initComponents();

        this.b = b;
        userProcessContainer = upc;
        userAccount = ua;
        this.rfr = rfr;
        this.iwq=iwq;

        shippingComboBox.removeAll();
        for (Network net : b.getNetDir().getNetworkList()) {
            for (Enterprise ent : net.getEntDirectory().getEnterpriseList()) {
                if (ent.getClass().equals(ThirdPartyLabEnterprise.class)) {
                    shippingComboBox.addItem(ent);
                }

            }

        }

        refreshWorkReqTable();
        refreshsuspectTable(null);
     JPanel panel = this;
        panel.setOpaque(false);
        panel.setPreferredSize(this.getPreferredSize());

    }
    ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/Resources/vaccine.jpg"));

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(icon.getImage(), 0, 0, null);
        super.paintComponent(g);
    }

    private void refreshWorkReqTable() {
        int rowCount = workReqTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) workReqTable.getModel()).removeRow(i);

        }
//        InventoryManagementOrg im=(InventoryManagementOrg)b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
        for (Carton c : rfr.getCartonList()) {

            Object row[] = new Object[4];
            row[0] = c;
            row[1] = c.getCartonId();
            row[2] = c.getPackageList().size();
            row[3] = c.getPackageList().get(0).getStatus();



            ((DefaultTableModel) workReqTable.getModel()).addRow(row);
        }

        if (workReqTable.getRowCount() > 0) {
            workReqTable.changeSelection(0, 0, false, false);
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
        buttonBack = new javax.swing.JButton();
        buttonAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workReqTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        suspectedTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionTable1 = new javax.swing.JTable();
        shippingComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventory Catalog");

        buttonBack.setText("back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonAssign.setText("Send for Lab Testing");
        buttonAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAssignActionPerformed(evt);
            }
        });

        workReqTable.setAutoCreateRowSorter(true);
        workReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine", "Carton ID", "Size", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workReqTableMouseClicked(evt);
            }
        });
        workReqTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workReqTableFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(workReqTable);

        suspectedTable.setAutoCreateRowSorter(true);
        suspectedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vaccine", "Package ID", "Carton ID", "Expiry Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suspectedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suspectedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(suspectedTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Suspected Products");

        transactionTable1.setAutoCreateRowSorter(true);
        transactionTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vaccine", "Package Id", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(transactionTable1);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Third Party Lab");

        jButton1.setText("Dispose Vaccines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(shippingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAssign))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shippingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(buttonAssign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(375, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAssignActionPerformed

        int selectedRow = workReqTable.getSelectedRow();
        if (selectedRow < 0) {
            int selectedRow1 = suspectedTable.getSelectedRow();
            if (selectedRow1 < 0) {
                JOptionPane.showMessageDialog(userProcessContainer, "Select a Vaccine", "Select object", 0);
                return;
            }
        }
        
        ThirdPartyLabEnterprise lab = (ThirdPartyLabEnterprise) shippingComboBox.getSelectedItem();
        LabTestingRequest ltr = new LabTestingRequest();
        lab.getDto().getWorkQueue().addWR(ltr);
        CDCEnterprise myEnt = (CDCEnterprise) b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);

        myEnt.getInvestigationOrg().getSentWorkQueue().addWR(ltr);

        
        ltr.setRfr(rfr);

        ltr.setSender(userAccount);


        rfr.setStatus(WorkRequest.StatusType.Resolved.toString());
        ltr.setStatus(WorkRequest.StatusType.SentForTesting.toString());


        iwq.refreshWorkReqTable();
         userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);

    }//GEN-LAST:event_buttonAssignActionPerformed

    private void workReqTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workReqTableFocusGained
    }//GEN-LAST:event_workReqTableFocusGained

    private void workReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workReqTableMouseClicked
        int selectetedRow = workReqTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        Carton c = (Carton) workReqTable.getValueAt(selectetedRow, 0);
        refreshsuspectTable(c);
        VaccinePackage p = c.getPackageList().get(0);
        refreshtransactionTable(p);

    }//GEN-LAST:event_workReqTableMouseClicked

    private void suspectedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suspectedTableMouseClicked
        int selectetedRow = suspectedTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
        refreshtransactionTable(p);
    }//GEN-LAST:event_suspectedTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int selectedRow = workReqTable.getSelectedRow();
 ArrayList <VaccinePackage> dispositionList=new ArrayList<>();
        if (selectedRow < 0) {
            int selectedRow1 = suspectedTable.getSelectedRow();
            if (selectedRow1 < 0) {
                JOptionPane.showMessageDialog(userProcessContainer, "Select a Vaccine", "Select object", 0);
                return;
            }else{
                 VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectedRow1, 0);
                 
            dispositionList.add(p);
            for(VaccinePackage dp:dispositionList){
                if(rfr.getPackageList().contains(dp)){
                rfr.getPackageList().remove(dp);
                }
                }
            }
        }else{
            Carton c=(Carton)workReqTable.getValueAt(selectedRow, 0);
            for(VaccinePackage dp:c.getPackageList()){
            dispositionList.add(dp);    
            
            }rfr.getCartonList().remove(c);
            for(VaccinePackage dp:dispositionList){
                if(c.getPackageList().contains(dp)){
                    c.getPackageList().remove(dp);
                }
            }
            
        }  
         VaccineDispositionRequest ddr=new VaccineDispositionRequest();
        for(VaccinePackage dp:dispositionList){
            ddr.addPackage(dp);
        }
        CDCEnterprise fda=(CDCEnterprise)b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
        
        
        fda.getDrugDispositionOrg().getWorkQueue().addWR(ddr);
        ddr.setSender(userAccount);
                ddr.setStatus("Sent for Disposal");
                
                refreshWorkReqTable();
                refreshsuspectTable(null);
                refreshtransactionTable(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshtransactionTable(VaccinePackage p) {
        int rowCount = transactionTable1.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) transactionTable1.getModel()).removeRow(i);

        }
if(p==null){
    return;
}
        VaccineHistory dh = null;

        for (VaccineHistory dh1 : b.getTransactionHistory().getVaccineHistoryList()) {
            if (dh1.getdPackage() == p) {
                dh = dh1;
            }
        }

        for (Transaction t : dh.getTransactionList()) {

            Object row[] = new Object[4];
            row[0] = p;
            row[1] = p.getPackageId();
            row[2] = t.getSender();
            if (t.getReceiver() == null) {
                row[3] = t.getPatient();
            } else {
                row[3] = t.getReceiver();
            }


            ((DefaultTableModel) transactionTable1.getModel()).addRow(row);
        }


    }

    private void refreshsuspectTable(Carton c) {
        int rowCount = suspectedTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) suspectedTable.getModel()).removeRow(i);

        }

        if (c == null) {
            for (VaccinePackage dPack : rfr.getPackageList()) {

                Object row[] = new Object[5];
                row[0] = dPack;
                row[1] = dPack.getPackageId();
                row[2] = dPack.getCartonId();
                row[3] = dPack.getDateOfExpiry().getTime().toString();
                row[4] = dPack.getStatus();


                ((DefaultTableModel) suspectedTable.getModel()).addRow(row);
            }

            int selectetedRow = suspectedTable.getSelectedRow();
            if (selectetedRow < 0) {
                return;
            }
            VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
            refreshtransactionTable(p);

        } else {



            for (VaccinePackage dPack : c.getPackageList()) {

                Object row[] = new Object[5];
                row[0] = dPack;
                row[1] = dPack.getPackageId();
                row[2] = dPack.getCartonId();
                row[3] = dPack.getDateOfExpiry().getTime().toString();
                row[4] = dPack.getStatus();


                ((DefaultTableModel) suspectedTable.getModel()).addRow(row);
            }

            int selectetedRow = suspectedTable.getSelectedRow();
            if (selectetedRow < 0) {
                return;
            }
            VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
            refreshtransactionTable(p);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAssign;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox shippingComboBox;
    private javax.swing.JTable suspectedTable;
    private javax.swing.JTable transactionTable1;
    private javax.swing.JTable workReqTable;
    // End of variables declaration//GEN-END:variables
}
