/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package UserInterface.VaccineTester;

import Business.Business;
import Business.Carton;
import Business.VaccinePackage;
import Business.Enterprise;
import Business.HospitalEnterprise;
import Business.LabTestingRequest;
import Business.Network;
import Business.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
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
    LabTestingRequest ltr;
    int drugAvailability = 0;

    /**
     * Creates new form BusinessAdminWorkAreaJPanel
     */
    public ViewRequestDetails(JPanel upc, Business b, UserAccount ua, LabTestingRequest ltr) {
        initComponents();

        this.b = b;
        userProcessContainer = upc;
        userAccount = ua;
        this.ltr = ltr;
        for (VaccinePackage.StatusType str : VaccinePackage.StatusType.values()) {
            cmbStatus.addItem(str);
        }
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
        int rowCount = vaccinecatalogTable.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) vaccinecatalogTable.getModel()).removeRow(i);

        }
        if (ltr.getRfr().getPackageList().size() == 0) {
            for (Carton c : ltr.getRfr().getCartonList()) {



                Object row[] = new Object[4];
                row[0] = c;
                row[1] = c.getCartonId();
                row[2] = c.getPackageList().size();

                Enterprise enterprise1 = b.getNetDir().getNetworkByUserAccount(userAccount).getEnterpriseByUserAccount(userAccount);
                if (enterprise1.getClass().equals(HospitalEnterprise.class)) {
                    row[3] = ltr.getRfr().getPatient();

                } else {
                    Enterprise tempEnt = null;
                    for (Network net1 : b.getNetDir().getNetworkList()) {
                        for (Enterprise ent1 : net1.getEntDirectory().getEnterpriseList()) {
                            for (Organization org1 : ent1.getOrgDirectory().getOrgList()) {
                                if (org1 == ltr.getRfr().getDestination()) {
                                    tempEnt = ent1;
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        suspectedTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request Details");

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nav_left_red.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        requestDrugsJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/navigate_right.png"))); // NOI18N
        requestDrugsJButton1.setText("Proceed");
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
        vaccinecatalogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vaccinecatalogTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vaccinecatalogTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Suspected Products");

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
        jScrollPane2.setViewportView(suspectedTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Change Status");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Change Status" }));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(298, 298, 298)
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jLabel2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3)
                .add(18, 18, 18)
                .add(cmbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .add(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(cmbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 9, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(backJButton)
                    .add(requestDrugsJButton1))
                .add(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestDrugsJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDrugsJButton1ActionPerformed
        JPanel panel = new TestReportJPanel(userProcessContainer, b, userAccount, ltr);
        userProcessContainer.add("TestReportJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);


    }//GEN-LAST:event_requestDrugsJButton1ActionPerformed

    private void suspectedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suspectedTableMouseClicked
        int selectetedRow = suspectedTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        VaccinePackage p = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);

        cmbStatus.setEnabled(true);


    }//GEN-LAST:event_suspectedTableMouseClicked

    private void vaccinecatalogTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vaccinecatalogTableMouseClicked
        int selectetedRow = vaccinecatalogTable.getSelectedRow();
        if (selectetedRow < 0) {
            return;
        }
        Carton c = (Carton) vaccinecatalogTable.getValueAt(selectetedRow, 0);
        refreshsuspectTable(c);
    }//GEN-LAST:event_vaccinecatalogTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cmbStatus.isEnabled()) {
            if (cmbStatus.getSelectedIndex() > 0) {
                int selectetedRow = suspectedTable.getSelectedRow();
                if (selectetedRow < 0) {
                    return;
                }
                VaccinePackage dp = (VaccinePackage) suspectedTable.getValueAt(selectetedRow, 0);
                dp.setStatus(((VaccinePackage.StatusType) cmbStatus.getSelectedItem()).toString());
            }
        }
        cmbStatus.setEnabled(false);
        refreshWorkReqTable();
        refreshsuspectTable(null);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton requestDrugsJButton1;
    private javax.swing.JTable suspectedTable;
    private javax.swing.JTable vaccinecatalogTable;
    // End of variables declaration//GEN-END:variables
}
