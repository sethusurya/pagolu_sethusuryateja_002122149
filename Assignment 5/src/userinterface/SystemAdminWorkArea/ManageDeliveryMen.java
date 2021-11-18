/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import static Business.Organization.Type.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class ManageDeliveryMen extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    /**
     * Creates new form ManageDeliveryMen
     */
    public ManageDeliveryMen(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        
        populateTable(ecosystem.getDeliveryManDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setForeground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("🗑️ Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, -1, -1));

        btnAdd.setForeground(new java.awt.Color(0, 102, 0));
        btnAdd.setText("➕ Add New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 109, -1, -1));

        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("🔙 Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("LIST OF DELIVERYMEN");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 800, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 800, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        int selectedRow = table.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a DeliveryMan to delete");
            return;
        } else {

            // @to-do: cancel all the orders to this restaurant before deleting
            DeliveryMan selectedDeliveryMan = (DeliveryMan) table.getValueAt(selectedRow, 0);
            UserAccount AccountToRemove = null;
            for (UserAccount ua: ecosystem.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername() != null  && ua.getUsername().equals(selectedDeliveryMan.getName())) {
                    AccountToRemove = ua;
                }
            }
            if (AccountToRemove != null) {
                ecosystem.getUserAccountDirectory().removeUserAccount(AccountToRemove); //as customer name is same as username in useraccount
                ecosystem.getDeliveryManDirectory().removeDeliveryMan(selectedDeliveryMan);
                populateTable(ecosystem.getDeliveryManDirectory());
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CreateDeliveryMan newDeliveryMan = new CreateDeliveryMan(userProcessContainer,ecosystem);
        userProcessContainer.add("newDeliveryMan", newDeliveryMan);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable(ecosystem.getDeliveryManDirectory());
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void populateTable(DeliveryManDirectory deliveryManDirectory) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        for(DeliveryMan p:deliveryManDirectory.getDeliveryManDirectory()) {
           Object[] row = new Object[1];
           row[0] = p;
           
           model.addRow(row);
        }
    }
    
    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}
