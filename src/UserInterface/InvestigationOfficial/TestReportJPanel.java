/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.InvestigationOfficial;

import Business.Alert;
import Business.Business;
import Business.Carton;
import Business.DistributorEnterprise;
import Business.VaccineHistory;
import Business.VaccinePackage;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.LabTestingRequest;
import Business.ManufacturerEnterprise;
import Business.Order;
import Business.ReturnSafeVaccinesRequest;
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
public class TestReportJPanel extends javax.swing.JPanel {

    Business b;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    LabTestingRequest ltr;
    InvestigationOfficialWorkQueueJPanel iwq;
    /**
     * Creates new form InventorySentRequestJPanel
     */
    public TestReportJPanel(JPanel upc, Business b, UserAccount ua, LabTestingRequest ltr,InvestigationOfficialWorkQueueJPanel iwq) {
        initComponents();

        this.b = b;
        this.iwq=iwq;
        userProcessContainer = upc;
        userAccount = ua;
        this.ltr = ltr;

       

        lblTestReport.setText(ltr.getTestReport());

        refreshWorkReqTable();
        refreshsuspectTable(null);
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
        int rowCount = workReqTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) workReqTable.getModel()).removeRow(i);

        }
//        InventoryManagementOrg im=(InventoryManagementOrg)b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
        for (Carton c : ltr.getRfr().getCartonList()) {

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
        jScrollPane2 = new javax.swing.JScrollPane();
        workReqTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        suspectedTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblTestReport = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sendAlert = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbTransaction = new javax.swing.JRadioButton();
        rbProvider = new javax.swing.JRadioButton();
        cmbProvider = new javax.swing.JComboBox();

        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Test Report");

        buttonBack.setText("back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
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

        lblTestReport.setForeground(new java.awt.Color(255, 0, 0));

        transactionTable1.setAutoCreateRowSorter(true);
        transactionTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Vaccine", "Package Id", "Sender", "Receiver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        transactionTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(transactionTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Transactions");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Test Report");

        sendAlert.setText("Send Alert and Dispose Vaccines");
        sendAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendAlertActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Make Packages Illegitimate by");

        rbTransaction.setText("Order");
        rbTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTransactionActionPerformed(evt);
            }
        });

        rbProvider.setText("Provider");
        rbProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProviderActionPerformed(evt);
            }
        });

        cmbProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProviderActionPerformed(evt);
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
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                            .addComponent(lblTestReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(rbTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbProvider)
                .addGap(18, 18, 18)
                .addComponent(cmbProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(172, 172, 172)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTestReport, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendAlert)
                    .addComponent(jLabel5)
                    .addComponent(rbTransaction)
                    .addComponent(rbProvider)
                    .addComponent(cmbProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(496, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        iwq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void workReqTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workReqTableFocusGained
    }//GEN-LAST:event_workReqTableFocusGained

    private void workReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workReqTableMouseClicked
        int selectetedRow = workReqTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        Carton c = (Carton) workReqTable.getValueAt(selectetedRow, 0);
        refreshsuspectTable(c);
      

    }//GEN-LAST:event_workReqTableMouseClicked

    private void suspectedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suspectedTableMouseClicked
        cmbProvider.removeAllItems();
        int selectetedRow = suspectedTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
        refreshtransactionTable(p);
        
    }//GEN-LAST:event_suspectedTableMouseClicked

    private void cmbProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProviderActionPerformed
      
    }//GEN-LAST:event_cmbProviderActionPerformed

    private void sendAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendAlertActionPerformed

        Alert a=new Alert();
        ArrayList<VaccinePackage> dispositionList=new ArrayList<VaccinePackage>();
        ArrayList<Carton> safeCartList=new ArrayList<Carton>();
        ArrayList<VaccinePackage> safePackList=new ArrayList<VaccinePackage>();
        
        for(Carton c:ltr.getRfr().getCartonList()){
            for(VaccinePackage dp: c.getPackageList()){
                if(!dp.getStatus().equals(VaccinePackage.StatusType.Safe.toString())){
                    a.getPackageList().add(dp);
                    dispositionList.add(dp);
                    
                }
            }
        }
        
        for(Carton c:ltr.getRfr().getCartonList()){
            boolean flag=true;
          ArrayList <VaccinePackage> tempList=new ArrayList<VaccinePackage>();
            for(VaccinePackage dp: c.getPackageList()){
                if(!dp.getStatus().equals(VaccinePackage.StatusType.Safe.toString())){
                    
                    tempList.add(dp);
                    
                }
               
                    
                }
             for(VaccinePackage dp:tempList){
             c.getPackageList().remove(dp);
             } 
                if(c.getPackageList().size()>0){
                safeCartList.add(c);
                }
            
        }
        
        
            for(VaccinePackage dp: ltr.getRfr().getPackageList()){
                if(dp.getStatus().equals(VaccinePackage.StatusType.Safe.toString())
                    ){
                    
                    safePackList.add(dp);
                    
                }
            }
        
        
        
        if(rbTransaction.isSelected()){
     int selectetedRow = transactionTable1.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        Transaction t = (Transaction) transactionTable1.getValueAt(selectetedRow, 0);
        
        if(t.getSender().getClass().equals(ManufacturerEnterprise.class)){
            ManufacturerEnterprise ent=(ManufacturerEnterprise)t.getSender();
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            if(o.getOrderId()==t.getOrderId()){
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            }
        }
        }else if(t.getSender().getClass().equals(DistributorEnterprise.class)){
            DistributorEnterprise ent=(DistributorEnterprise)t.getSender();
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            if(o.getOrderId()==t.getOrderId()){
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            }
        }
        }else if(t.getSender().getClass().equals(HospitalEnterprise.class)){
            HospitalEnterprise ent=(HospitalEnterprise)t.getSender();
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            if(o.getOrderId()==t.getOrderId()){
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            }
        }
        }
        
}else if(rbProvider.isSelected()){
    Enterprise pro=(Enterprise)cmbProvider.getSelectedItem();
    
     if(pro.getClass().equals(ManufacturerEnterprise.class)){
            ManufacturerEnterprise ent=(ManufacturerEnterprise)pro;
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            
        }
        }else if(pro.getClass().equals(DistributorEnterprise.class)){
            DistributorEnterprise ent=(DistributorEnterprise)pro;
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            
        }
        }else if(pro.getClass().equals(HospitalEnterprise.class)){
            HospitalEnterprise ent=(HospitalEnterprise)pro;
             for(Order o:ent.getSmo().getMasterOrderCatalog().getOrderList()){
            
                if(o.getCartonList().size()>0){
                    for(Carton c:o.getCartonList()){
                        for(VaccinePackage dp: c.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                    }
                }else{
                    for(VaccinePackage dp: o.getPackageList()){
                            dp.setStatus(VaccinePackage.StatusType.Illegitimate.toString());
                            a.getPackageList().add(dp);
                        }
                }
            
        }
        }
    
}
         if(safeCartList.size()>0){
            
            if(ltr.getRfr().getSource()!=null){
                ReturnSafeVaccinesRequest rsdr=new ReturnSafeVaccinesRequest();
            for(Carton dp:safeCartList){
                rsdr.getCartonList().add(dp);
            }
            if(ltr.getRfr().getSource().getClass().equals(DistributorEnterprise.class)){
                DistributorEnterprise dist=(DistributorEnterprise)ltr.getRfr().getSource();
                dist.getInventoryManagementOrg().getWorkQueue().addWR(rsdr);
            }else if(ltr.getRfr().getSource().getClass().equals(HospitalEnterprise.class)){
                HospitalEnterprise dist=(HospitalEnterprise)ltr.getRfr().getSource();
                dist.getInventoryManagementOrg().getWorkQueue().addWR(rsdr);
            }}else{
                for(VaccinePackage dp:safePackList){
                ltr.getRfr().getPatient().getPackageList().add(dp);
                }
            }
        }
         ltr.setStatus(WorkRequest.StatusType.Resolved.toString());
        if(a.getPackageList().size()>0){
        JPanel panel = new AlertJPanel(userProcessContainer, b, userAccount,a,dispositionList);
        userProcessContainer.add("AlertJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(userProcessContainer,"No alerts to send", "No alerts", 0);
        }
       
        
    }//GEN-LAST:event_sendAlertActionPerformed

    private void rbTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTransactionActionPerformed
       rbProvider.setSelected(false);
    }//GEN-LAST:event_rbTransactionActionPerformed

    private void rbProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProviderActionPerformed
        rbTransaction.setSelected(false);
        
         int selectetedRow = suspectedTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
        
         VaccineHistory dh = null;

        for (VaccineHistory dh1 : b.getTransactionHistory().getVaccineHistoryList()) {
            if (dh1.getdPackage() == p) {
                dh = dh1;
            }
        }

        for (Transaction t : dh.getTransactionList()) {
            cmbProvider.addItem(t.getSender());
        }
        
    }//GEN-LAST:event_rbProviderActionPerformed

    private void transactionTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionTable1MouseClicked
        cmbProvider.removeAll();
        
         int selectetedRow = suspectedTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
        
         VaccineHistory dh = null;

        for (VaccineHistory dh1 : b.getTransactionHistory().getVaccineHistoryList()) {
            if (dh1.getdPackage() == p) {
                dh = dh1;
            }
        }

        for (Transaction t : dh.getTransactionList()) {
            cmbProvider.addItem(t.getSender());
        }
        
    }//GEN-LAST:event_transactionTable1MouseClicked

     private void refreshtransactionTable(VaccinePackage p) {
        int rowCount = transactionTable1.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) transactionTable1.getModel()).removeRow(i);

        }

        VaccineHistory dh = null;

        for (VaccineHistory dh1 : b.getTransactionHistory().getVaccineHistoryList()) {
            if (dh1.getdPackage() == p) {
                dh = dh1;
            }
        }

        for (Transaction t : dh.getTransactionList()) {

            Object row[] = new Object[5];
            row[0] = t;
            row[1] = p;
            row[2] = p.getPackageId();
            row[3] = t.getSender();
            if (t.getReceiver() == null) {
                row[4] = t.getPatient();
            } else {
                row[4] = t.getReceiver();
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
            for (VaccinePackage dPack : ltr.getRfr().getPackageList()) {

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
    private javax.swing.JButton buttonBack;
    private javax.swing.JComboBox cmbProvider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTestReport;
    private javax.swing.JRadioButton rbProvider;
    private javax.swing.JRadioButton rbTransaction;
    private javax.swing.JButton sendAlert;
    private javax.swing.JTable suspectedTable;
    private javax.swing.JTable transactionTable1;
    private javax.swing.JTable workReqTable;
    // End of variables declaration//GEN-END:variables
}