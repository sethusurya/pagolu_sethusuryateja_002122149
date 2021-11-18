/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Role.Role;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sethu
 */
public class CreateDeliveryMan extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    /**
     * Creates new form CreateDeliveryMan
     */
    public CreateDeliveryMan(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name : ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 67, 91, 35));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 67, 142, 35));

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password : ");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 113, 91, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE DELIVERY MAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 49));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 113, 142, 35));

        btnSave.setForeground(new java.awt.Color(0, 51, 153));
        btnSave.setText("💾 Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 184, -1, -1));

        btnCancel.setForeground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("❌ Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 184, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // check for unique names as usernames

        String name = txtName.getText();
        char[] passwordArray = txtPassword.getPassword();
        String password = String.valueOf(passwordArray); // reconstruct password
        Role role = new DeliverManRole();
        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(name)) {
            DeliveryMan newDeliveryMan = new DeliveryMan();
            newDeliveryMan.setName(name);

            ecosystem.getDeliveryManDirectory().addDeliveryMan(newDeliveryMan); // add user to customer directory
            UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(name, password, null, role); // no employee creation for customers

            goBack();
        } else {
            JOptionPane.showMessageDialog(this, "User with same username already exists");
            return;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
}
