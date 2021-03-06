/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Community;
import model.House;

/**
 *
 * @author sethu
 */
public class CreateCommunity extends javax.swing.JPanel {

    public JPanel rightPanel;
    public City city;
    /**
     * Creates new form CreateCommunity
     */
    public CreateCommunity(JPanel rightPanel, City city) {
        initComponents();
        this.rightPanel = rightPanel;
        this.city = city;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create New Community");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 600, 63));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name : ");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 184, 94, 33));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 175, 265, 54));

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText(" Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        btnCancel.setBackground(new java.awt.Color(0, 102, 102));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cacel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
      rightPanel.remove(this);
      CardLayout layout = (CardLayout) rightPanel.getLayout();
      layout.previous(rightPanel);  
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        String communityName = txtName.getText(); // get name from field

        // check if the community name is given
        if (communityName.equals("")) {
            JOptionPane.showMessageDialog(this,"Community name cannot be blank");
            return;
        }
        
        // check if the community with same name exists in the city
        for(Community c: city.getCommunities()){
            if(c.getName().toLowerCase().equals(communityName.toLowerCase())) {
                JOptionPane.showMessageDialog(this, "Community with the same name already exists");
                return;
            }
        }
        
       Community newCommunity = new Community(); // create new community 
       ArrayList<House> myHousesList = new ArrayList<House>();// create arraylist of 0 houses
       newCommunity.setName(communityName); // set name for community
       newCommunity.setHousesList(myHousesList); // set Houses list for community

       city.add(newCommunity); // add the new community to city
       
      // Navigate back
      rightPanel.remove(this);
      CardLayout layout = (CardLayout) rightPanel.getLayout();
      layout.previous(rightPanel);
      
      // Navigate into community for entering houses details
      ViewHouses myViewHouses = new ViewHouses(rightPanel, city, newCommunity);
      rightPanel.add("ViewHouses", myViewHouses);
      layout.next(rightPanel);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
