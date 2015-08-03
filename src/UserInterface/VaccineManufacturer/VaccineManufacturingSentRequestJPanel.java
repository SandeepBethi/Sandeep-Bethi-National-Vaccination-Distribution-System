/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VaccineManufacturer;


import UserInterface.SalesEmployee.*;
import Business.Business;
import Business.VaccineLicenseRequest;
import Business.Enterprise;
import Business.Network;
import Business.Organization;
import Business.LabTestingRequest;
import Business.ReportCDCRequest;
import Business.RequestForVaccines;
import Business.ShippingRequest;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bethi
 */
public class VaccineManufacturingSentRequestJPanel extends javax.swing.JPanel {

    Business b;
    private JPanel userProcessContainer;
    private UserAccount userAccount;

    /**
     * Creates new form SalesSentRequestJPanel
     */
    public VaccineManufacturingSentRequestJPanel(JPanel upc, Business b, UserAccount ua) {
        initComponents();

        this.b=b;
        userProcessContainer = upc;
        userAccount = ua;

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
        int rowCount = workReqTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) workReqTable.getModel()).removeRow(i);

        }
        Network net=b.getNetDir().getNetworkByUserAccount(userAccount);
        
        Enterprise enterprise=net.getEntDirectory().getEnterpriseByUserAccount(userAccount);
        Organization o = enterprise.getOrganizationByUserAccount(userAccount);
        for (WorkRequest wr : o.getSentWorkQueue().getWrList()) {
            if(wr.getClass().equals(VaccineLicenseRequest.class)){
                VaccineLicenseRequest mwr = (VaccineLicenseRequest) wr;
                Object row[] = new Object[7];
            row[0] = mwr;
            row[1] = WorkRequest.WRType.RequestForVaccines;
            row[2] = mwr.getVaccineName();
            row[3] = mwr.getSender();
            row[4] = mwr.getReceiver();
            row[5] = mwr.getStatus();
            for (Network net1 : b.getNetDir().getNetworkList()) {
            for (Enterprise ent : net1.getEntDirectory().getEnterpriseList()) {
            for(Organization org1:ent.getOrgDirectory().getOrgList()){
                if(org1==mwr.getDestination()){
                    row[6] =ent ;
                }
            }
            }
            }
            
                
                
                ((DefaultTableModel) workReqTable.getModel()).addRow(row);
            }else if(wr.getClass().equals(ShippingRequest.class)){
                ShippingRequest mwr = (ShippingRequest) wr;
                Object row[] = new Object[7];
            row[0] = mwr;
            row[1] = WorkRequest.WRType.ShippingRequest;
            row[2] = mwr.getOrder();
            row[3] = mwr.getSender();
            row[4] = mwr.getReceiver();
            row[5] = mwr.getStatus();
            if(mwr.getDestination().getClass().equals(Organization.class)){
            for (Network net1 : b.getNetDir().getNetworkList()) {
            for (Enterprise ent : net1.getEntDirectory().getEnterpriseList()) {
            for(Organization org1:ent.getOrgDirectory().getOrgList()){
                if(org1==mwr.getDestination()){
                    row[6] =ent ;
                }
            }
            }
            }}else{
                row[6] =mwr.getDestination() ;
            }
                
                
                ((DefaultTableModel) workReqTable.getModel()).addRow(row);
            }else if(wr.getClass().equals(ReportCDCRequest.class)){
                ReportCDCRequest mwr = (ReportCDCRequest) wr;
                Object row[] = new Object[7];
            row[0] = mwr;
            row[1] = WorkRequest.WRType.ReportFDARequest;
            row[2] = mwr.getCartonList().size();
            row[3] = mwr.getSender();
            row[4] = mwr.getReceiver();
            row[5] = mwr.getStatus();
            row[6] =mwr.getDestination() ;
                
                
                ((DefaultTableModel) workReqTable.getModel()).addRow(row);
            }
        }
        if (workReqTable.getRowCount() > 0) {
            workReqTable.changeSelection(0, 0, true, true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workReqTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sales Management Sent requests");

        buttonBack.setText("back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        workReqTable.setAutoCreateRowSorter(true);
        workReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request Date", "Type", "Vaccine/Order/Size", "Sender", "Receiver", "Status", "Destination"
            }
        ));
        jScrollPane1.setViewportView(workReqTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(335, 335, 335)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(buttonBack)))
                        .addGap(0, 262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(buttonBack)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workReqTable;
    // End of variables declaration//GEN-END:variables
}