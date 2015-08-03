/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package UserInterface.InventoryManager;

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
public class ViewRequestDetails extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    Business b;
    RequestForVaccines rfd;
    int drugAvailability = 0;
    InventoryWorkQueueJPanel iwq;

    /**
     * Creates new form BusinessAdminWorkAreaJPanel
     */
    public ViewRequestDetails(JPanel upc, Business b, UserAccount ua, RequestForVaccines rfd,InventoryWorkQueueJPanel iwq) {
        initComponents();

        this.b = b;
        userProcessContainer = upc;
        userAccount = ua;
        this.rfd = rfd;
        this.iwq=iwq;
        
        cmbNetwork.removeAllItems();
        for (Network n : b.getNetDir().getNetworkList()) {
            cmbNetwork.addItem(n);
        }
        cmbNetwork.setSelectedIndex(0);
        
        Enterprise ent = b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
        if (ent.getClass().equals(HospitalEnterprise.class)) {
            rbManufacturer.setEnabled(false);
            rbDistributor.setSelected(true);
            
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
//        Enterprise ent = (Enterprise) cmbEnterprise.getSelectedItem();
////                if(ent.getClass().equals(DistributorEnterprise.class)){
////                    DistributorEnterprise dent=(DistributorEnterprise)ent;
////                    ArrayList <Drug> tempList=new ArrayList<Drug>();
////                    for (Carton c : dent.getInventoryManagementOrg().getInvCatalog().getCartonList()) {
////                    if(!tempList.contains(c.getPackageList().get(1).getDrug())){
////                        tempList.add(c.getPackageList().get(1).getDrug());
////                        
////                    }
////                    }
////                    for(Vaccine d:tempList){
////                Object row[] = new Object[4];
////            row[0] = d;
////            row[1]=d.getType();
////            row[2]=d.getWeight();
////            row[3] = d.getDrugLife();
////            
////               
////                
////                ((DefaultTableModel) drugcatalogTable.getModel()).addRow(row);
////                    }
////        
////                    
////                }else
        ManufacturerEnterprise ment = null;
        Vaccine d = rfd.getVaccine();
        for (Network n : b.getNetDir().getNetworkList()) {
            for (Enterprise e : n.getEntDirectory().getEnterpriseList()) {

                if (e.getClass().equals(ManufacturerEnterprise.class)) {
                    ManufacturerEnterprise ment1 = (ManufacturerEnterprise) e;
                    for (Vaccine drug : ment1.getDmo().getVaccinecatalog().getVaccineList()) {
                        if (drug == d) {
                            ment = ment1;
                        }
                    }
                }
            }
        }


        Object row[] = new Object[6];
        row[0] = d;
        row[1] = d.getType();
        row[2] = d.getWeight();
        row[3] = rfd.getReqQuantity();
        InventoryManagementOrg im = (InventoryManagementOrg) b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
        int drugQ = 0;
        for (Carton carton : im.getInvCatalog().getCartonList()) {

            if (carton.getPackageList().get(0).getVaccine() == d) {
                drugQ = drugQ + 10;
            }

        }
        drugAvailability = drugQ;

        row[4] = drugQ;

        row[5] = ment;



        ((DefaultTableModel) vaccinecatalogTable.getModel()).addRow(row);




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
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccinecatalogTable = new javax.swing.JTable();
        cmbNetwork = new javax.swing.JComboBox();
        cmbEnterprise = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbManufacturer = new javax.swing.JRadioButton();
        rbDistributor = new javax.swing.JRadioButton();

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

        lblQuantity.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quantity (In Cartons)");

        vaccinecatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Vaccine Type", "Vaccine Weight", "Order Quantity", "Availablity", "Manufacturer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccinecatalogTable);

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        cmbEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEnterpriseActionPerformed(evt);
            }
        });
        cmbEnterprise.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbEnterpriseFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Network");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enterprise");

        rbManufacturer.setForeground(new java.awt.Color(255, 255, 255));
        rbManufacturer.setText("Order from the Manufacturer");
        rbManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManufacturerActionPerformed(evt);
            }
        });

        rbDistributor.setForeground(new java.awt.Color(255, 255, 255));
        rbDistributor.setText("Order from a distributor");
        rbDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDistributorActionPerformed(evt);
            }
        });

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
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(rbManufacturer)
                                .add(18, 18, 18)
                                .add(rbDistributor)
                                .add(18, 18, 18)
                                .add(jLabel2)
                                .add(18, 18, 18)
                                .add(cmbNetwork, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(jLabel4)
                                .add(18, 18, 18)
                                .add(cmbEnterprise, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(298, 298, 298)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 114, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(txtQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 174, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {cmbEnterprise, cmbNetwork}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(35, 35, 35)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(rbManufacturer)
                    .add(rbDistributor)
                    .add(cmbNetwork, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cmbEnterprise, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jLabel4))
                .add(51, 51, 51)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblQuantity)
                    .add(txtQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 71, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backJButton)
                    .add(requestDrugsJButton1))
                .add(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        iwq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestDrugsJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDrugsJButton1ActionPerformed

        
        int temp;
        try {
            temp = Integer.parseInt(txtQuantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(userProcessContainer, "Please enter a valid number", "Invalid value", 0);
            return;
        }
        int selectedRow = vaccinecatalogTable.getSelectedRow();
        Vaccine vaccine = (Vaccine) rfd.getVaccine();
        if (rfd.getReqQuantity() > drugAvailability) {

            if (!rbDistributor.isSelected() && !rbManufacturer.isSelected()) {
                JOptionPane.showMessageDialog(userProcessContainer, "Please select the manufacturer or a distributor", "Radio Button Not Selected", 0);
                return;
            }

            ManufacturerEnterprise ment = null;
            DistributorEnterprise dent = null;


RequestForVaccines sr = null;

            if (rbManufacturer.isSelected()) {
                A:
                for (Network net : b.getNetDir().getNetworkList()) {
                    for (Enterprise ent : net.getEntDirectory().getEnterpriseList()) {
                        if (ent.getClass().equals(ManufacturerEnterprise.class)) {
                            ment = (ManufacturerEnterprise) ent;
                            for (Vaccine d : ment.getDmo().getVaccinecatalog().getVaccineList()) {
                                if (vaccine == d) {
                                    sr = new RequestForVaccines();
                                    ment.getSmo().getWorkQueue().addWR(sr);
                                    break A;
                                }
                            }
                        }
                    }
                }
            } else if (rbDistributor.isSelected()) {
                dent = (DistributorEnterprise) cmbEnterprise.getSelectedItem();
                sr = new RequestForVaccines();
                dent.getSmo().getWorkQueue().addWR(sr);
            }

//                    sr = new RequestForVaccines();
//                    ment.getSmo().getWorkQueue().addWR(sr);
//                if (ent.getClass().equals(DistributorEnterprise.class)) {
//                    dent = (DistributorEnterprise) ent;
//                    Vaccine tempDrug = null;
//                    for (Carton c : dent.getInventoryManagementOrg().getInvCatalog().getCartonList()) {
//                        if (tempDrug == c.getPackageList().get(1).getDrug()) {
//                            break A;
//                        }
//                    }
//
//                    sr = new RequestForVaccines();
//                    dent.getSmo().getWorkQueue().addWR(sr);
//            
//
//
//            
//        }
            if (sr != null) {
                sr.setSender(userAccount);
                sr.setVaccine(vaccine);
                sr.setReqQuantity(temp * 10);
                sr.setStatus(WorkRequest.StatusType.AtSalesOrganization.toString());
                Network net = b.getNetDir().getNetworkByUserAccount(userAccount);

                Enterprise e1 = net.getEntDirectory().getEnterpriseByUserAccount(userAccount);
                Organization myorg = e1.getOrganizationByUserAccount(userAccount);
                myorg.getSentWorkQueue().addWR(sr);
            }
            rfd.setStatus(WorkRequest.StatusType.PendingOutOfStock.toString());
        } else {
            Order o = new Order();
            Enterprise ent1 = b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
            if (ent1.getClass().equals(DistributorEnterprise.class)) {
                InventoryManagementOrg im = (InventoryManagementOrg) b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);

                int i = rfd.getReqQuantity();

                while (i > 0) {
                    Carton tempCarton = null;
                    for (Carton carton : im.getInvCatalog().getCartonList()) {
                        if (carton.getPackageList().get(1).getVaccine() == vaccine) {
                            
                            for(VaccinePackage dPackage:carton.getPackageList()){
                                VaccineHistory dh=null;
                                for(VaccineHistory dh1:b.getTransactionHistory().getVaccineHistoryList()){
                                    if(dh1.getdPackage()==dPackage){
                                        dh=dh1;
                                    }
                                }
//                            dh.setdPackage(dPackage);
                            Transaction t=dh.newTransaction();
                            
                            Enterprise ent2=b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
                            Enterprise destEnt=null;
                            
                            for(Network n1:b.getNetDir().getNetworkList()){
                                for(Enterprise e1: n1.getEntDirectory().getEnterpriseList()){
                                     for(Organization o1: e1.getOrgDirectory().getOrgList()){
                                         if(o1==rfd.getDestination()){
                                          destEnt=e1;   
                                         }
                                     }
                                }
                            }
                            
                            t.setSender(ent2);
                            t.setReceiver(destEnt);
                            t.setOrderId(o.getOrderId());
                            }
                            o.addCarton(carton);
                            i = i - 10;
                            tempCarton = carton;
                            break;
                        }
                    }
                    im.getInvCatalog().getCartonList().remove(tempCarton);
                }
                ShippingRequest sr = new ShippingRequest();
                sr.setOrder(o);
                sr.setSender(userAccount);
                sr.setDestination(rfd.getDestination());
                sr.setStatus(WorkRequest.StatusType.PendingatBilling.toString());
                
                
            if (ent1.getClass().equals(DistributorEnterprise.class)) {
                DistributorEnterprise ment=(DistributorEnterprise)ent1;
                ment.getSmo().getWorkQueue().addWR(sr);
            }else if (ent1.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise ment=(HospitalEnterprise)ent1;
                ment.getSmo().getWorkQueue().addWR(sr);
            }
               
                




                Organization so = b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
                so.getSentWorkQueue().addWR(sr);

            } else if (ent1.getClass().equals(HospitalEnterprise.class)) {
                InventoryManagementOrg im = (InventoryManagementOrg) b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);

                int i = rfd.getReqQuantity();

               
                    A: for (Carton carton : im.getInvCatalog().getCartonList()) {
                        if (carton.getPackageList().get(1).getVaccine() == vaccine) {
                            int j=0;
                            for (VaccinePackage p : carton.getPackageList()) {

                                if (i > 0) {
                                      VaccineHistory dh=null;
                                for(VaccineHistory dh1:b.getTransactionHistory().getVaccineHistoryList()){
                                    if(dh1.getdPackage()==p){
                                        dh=dh1;
                                    }
                                }
//                            dh.setdPackage(p);
                            Transaction t=dh.newTransaction();
                            
                            Enterprise ent2=b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
                            Enterprise destEnt=null;
                            
                            for(Network n1:b.getNetDir().getNetworkList()){
                                for(Enterprise e1: n1.getEntDirectory().getEnterpriseList()){
                                     for(Organization o1: e1.getOrgDirectory().getOrgList()){
                                         if(o1==rfd.getDestination()){
                                          destEnt=e1;   
                                         }
                                     }
                                }
                            }
                            
                            t.setSender(ent2);
                            t.setPatient(rfd.getPatient());
                            t.setOrderId(o.getOrderId());
                                    o.addPackage(p);
                                    i--;
                                    j++;
                                }else{
                                break;
                                }
                            }
                            for(int q=0;q<j;q++){
                                VaccinePackage dp1=(VaccinePackage)carton.getPackageList().get(0);
                                carton.getPackageList().remove(dp1);
                            }
                            if(i==0){
                                break;
                            }
                        }
                    }
              
               
                   ArrayList<Carton> tempCarton=new ArrayList<Carton>();
                for(Carton carton : im.getInvCatalog().getCartonList()) {
                    
                    if(carton.getPackageList().size()==0){
                        tempCarton.add(carton);
                        
                    }}
                for(Carton carton : tempCarton) {
                im.getInvCatalog().getCartonList().remove(carton);
                }
               
               ShippingRequest sr = new ShippingRequest();
                sr.setOrder(o);
                sr.setSender(userAccount);
                sr.setPatient(rfd.getPatient());
                sr.setStatus(WorkRequest.StatusType.PendingatBilling.toString());
               if (ent1.getClass().equals(DistributorEnterprise.class)) {
                DistributorEnterprise ment=(DistributorEnterprise)ent1;
                ment.getSmo().getWorkQueue().addWR(sr);
            }else if (ent1.getClass().equals(HospitalEnterprise.class)) {
                HospitalEnterprise ment=(HospitalEnterprise)ent1;
                ment.getSmo().getWorkQueue().addWR(sr);
            }



                Organization so = b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount).getOrganizationByUserAccount(userAccount);
                so.getSentWorkQueue().addWR(sr);
            }
rfd.setStatus(WorkRequest.StatusType.Resolved.toString());

        }

iwq.refreshWorkReqTable();
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_requestDrugsJButton1ActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        cmbEnterprise.removeAllItems();

        if (cmbNetwork.getSelectedIndex() < 0) {
            return;
        }
        Network n = (Network) cmbNetwork.getSelectedItem();
        for (Enterprise e : n.getEntDirectory().getEnterpriseList()) {
            if (e.getClass().equals(DistributorEnterprise.class)) {
                cmbEnterprise.addItem(e);
            }
        }

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void cmbEnterpriseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbEnterpriseFocusGained
    }//GEN-LAST:event_cmbEnterpriseFocusGained

    private void cmbEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEnterpriseActionPerformed
        if (cmbEnterprise.getSelectedIndex() < 0) {
            return;
        }

    }//GEN-LAST:event_cmbEnterpriseActionPerformed

    private void rbManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManufacturerActionPerformed
        rbDistributor.setSelected(false);
    }//GEN-LAST:event_rbManufacturerActionPerformed

    private void rbDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDistributorActionPerformed
        rbManufacturer.setSelected(false);
    }//GEN-LAST:event_rbDistributorActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbEnterprise;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JRadioButton rbDistributor;
    private javax.swing.JRadioButton rbManufacturer;
    private javax.swing.JButton requestDrugsJButton1;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTable vaccinecatalogTable;
    // End of variables declaration//GEN-END:variables
}
