/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sethu
 */
public class ManageOrders extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Restaurant restaurant;
    /**
     * Creates new form ManageOrders
     */
    public ManageOrders(JPanel userProcessContainer, EcoSystem ecosystem,Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        
        populateTable(ecosystem.getOrderDirectory(), restaurant);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAcceptOrder = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDeclineOrdr = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("OUR ORDERS");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 800, 46));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Order Time", "Status", "Delivery Time", "Delivery Man"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 164, 800, 480));

        btnAcceptOrder.setForeground(new java.awt.Color(0, 102, 204));
        btnAcceptOrder.setText("✔ View & ️Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });
        add(btnAcceptOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, -1, -1));

        btnRefresh.setForeground(new java.awt.Color(0, 102, 204));
        btnRefresh.setText("🔃Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, -1, -1));

        btnDeclineOrdr.setForeground(new java.awt.Color(255, 51, 51));
        btnDeclineOrdr.setText("❌ Decline Order");
        btnDeclineOrdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineOrdrActionPerformed(evt);
            }
        });
        add(btnDeclineOrdr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 120, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(255, 51, 51));
        btnBack.setText("🔙Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 107, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Select an order to Accept");
            return;
        } else {
            Order selectedOrder =(Order) table.getValueAt(selectedRowIndex, 0);

//            // navigate to the selected order
            AcceptOrder acceptMyOrder = new AcceptOrder(userProcessContainer,ecosystem, restaurant, selectedOrder);
            userProcessContainer.add("acceptMyOrder", acceptMyOrder);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable(ecosystem.getOrderDirectory(), restaurant);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeclineOrdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineOrdrActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Select an order to Accept");
            return;
        } else {
            Order selectedOrder =(Order) table.getValueAt(selectedRowIndex, 0);
            Order myNewOrder = selectedOrder;
            myNewOrder.setStatus("Cancelled");
            int index = -1;
            for (int i = 0; i < ecosystem.getOrderDirectory().getOrderDirectory().size(); i++) {
                Order tempOrder = ecosystem.getOrderDirectory().getOrderDirectory().get(i);
                Order tempOrder2 = selectedOrder;
                if (tempOrder2.getCustomerName().equals(tempOrder.getCustomerName()) && tempOrder2.getOrderTime().equals(tempOrder.getOrderTime())) {
                    index = i;
                }
            }
            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Unable to Cancel Order");
                return;
            } else {
                ecosystem.getOrderDirectory().modifyOrder(index, myNewOrder); // Modify Order
//                goBack();
            }
        }
    }//GEN-LAST:event_btnDeclineOrdrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeclineOrdr;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void populateTable(OrderDirectory orderDirectory, Restaurant restaurant) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(Order p:orderDirectory.getOrderDirectory()) {
            if (restaurant.getName().equals(p.getRestaurantName())) {
             Object[] row = new Object[5];
             row[0] = p;
             row[1] = p.getOrderTime();
             row[2] = p.getStatus();
             row[3] = p.getDeliveryTime();
             row[4] = p.getDeliveryManName();
           
             model.addRow(row);
            }
        }
    }

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}
