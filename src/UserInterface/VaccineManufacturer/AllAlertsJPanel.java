/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VaccineManufacturer;

import UserInterface.InventoryManager.*;
import Business.Alert;
import Business.Business;
import Business.Carton;
import Business.VaccinePackage;
import Business.Enterprise;
import Business.CDCEnterprise;
import Business.InventoryManagementOrg;
import Business.Network;
import Business.UserAccount;
import Business.WorkRequest;
import java.awt.CardLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bethi
 */
public class AllAlertsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    UserAccount ua;

    /**
     * Creates new form InventoryManagerJPanel
     */
    public AllAlertsJPanel(JPanel userProcessContainer, Business business, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.ua = ua;

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
        
        
        for(Network net:business.getNetDir().getNetworkList()){
        for(Enterprise ent:net.getEntDirectory().getEnterpriseList()){
          if(ent.getClass().equals(CDCEnterprise.class)){
              CDCEnterprise fda=(CDCEnterprise)ent;
              
              for (Alert a : fda.getAlertList()) {
            
            
            Object row[] = new Object[3];
            row[0] = a;
            if(a.getIncidentOrigin()!=null){
            row[1] = a.getIncidentOrigin();
            }
            
            
            row[2]="Passive Alert";
            


            ((DefaultTableModel) workReqTable.getModel()).addRow(row);
            

        }
              
          }  
        }}
        
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workReqTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        workReqTable.setAutoCreateRowSorter(true);
        workReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine", "Incident Origin", "Status"
            }
        ));
        jScrollPane1.setViewportView(workReqTable);

        jButton2.setText("View Alert Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonBack.setText("back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(696, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(buttonBack))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int selectetedRow = workReqTable.getSelectedRow();
if(selectetedRow<0){
    JOptionPane.showMessageDialog(userProcessContainer,"Select an alert", "Select alert", 0);
    return;
}

Alert a=(Alert)workReqTable.getValueAt(selectetedRow, 0);
JPanel panel = new AlertJPanel(userProcessContainer, business, ua,a);
        userProcessContainer.add("AlertJPanel", panel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workReqTable;
    // End of variables declaration//GEN-END:variables
}
