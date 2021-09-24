/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Profile;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Sethu
 */
public class CreateJpanel1 extends javax.swing.JPanel {
    
    Profile profile;

    /**
     * Creates new form createJPanel
     */
    public CreateJpanel1(Profile profile) {
        initComponents();
        this.profile = profile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        title = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblProfile = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        profilePic = new org.jdesktop.swingx.JXImageView();
        txtAddress1 = new javax.swing.JTextField();
        lblAddress1 = new javax.swing.JLabel();
        txtAddress2 = new javax.swing.JTextField();
        lblAddress2 = new javax.swing.JLabel();
        txtAddress3 = new javax.swing.JTextField();
        lblAddress3 = new javax.swing.JLabel();
        txtAddress4 = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtAddress5 = new javax.swing.JTextField();
        lblAddress5 = new javax.swing.JLabel();
        txtAddress6 = new javax.swing.JTextField();
        lblAddress6 = new javax.swing.JLabel();
        txtAddress7 = new javax.swing.JTextField();
        lblAddress7 = new javax.swing.JLabel();
        txtAddress8 = new javax.swing.JTextField();
        lblAddress8 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Create Profile");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");
        lblName.setAlignmentY(2.0F);

        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDob.setText("Date of Birth:");
        lblDob.setAlignmentY(2.0F);

        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress.setText("Street Address:");
        lblAddress.setAlignmentY(2.0F);

        txtName.setAlignmentY(2.0F);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.setAlignmentY(2.0F);
        txtAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        dob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dob.setAlignmentY(2.0F);

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone No:");
        lblPhone.setAlignmentY(2.0F);

        txtPhone.setAlignmentY(2.0F);
        txtPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProfile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProfile.setText("Profile Photo:");

        uploadBtn.setText("upload");
        uploadBtn.setToolTipText("");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePicLayout = new javax.swing.GroupLayout(profilePic);
        profilePic.setLayout(profilePicLayout);
        profilePicLayout.setHorizontalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        profilePicLayout.setVerticalGroup(
            profilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtAddress1.setAlignmentY(2.0F);
        txtAddress1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress1ActionPerformed(evt);
            }
        });

        lblAddress1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress1.setText("Zip Code:");
        lblAddress1.setAlignmentY(2.0F);

        txtAddress2.setAlignmentY(2.0F);
        txtAddress2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress2ActionPerformed(evt);
            }
        });

        lblAddress2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress2.setText("State:");
        lblAddress2.setAlignmentY(2.0F);

        txtAddress3.setAlignmentY(2.0F);
        txtAddress3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress3ActionPerformed(evt);
            }
        });

        lblAddress3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress3.setText("Email ID:");
        lblAddress3.setAlignmentY(2.0F);

        txtAddress4.setAlignmentY(2.0F);
        txtAddress4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress4ActionPerformed(evt);
            }
        });

        lblAddress4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress4.setText("SSN:");
        lblAddress4.setAlignmentY(2.0F);

        txtAddress5.setAlignmentY(2.0F);
        txtAddress5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress5ActionPerformed(evt);
            }
        });

        lblAddress5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress5.setText("Health Plan ID:");
        lblAddress5.setAlignmentY(2.0F);

        txtAddress6.setAlignmentY(2.0F);
        txtAddress6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress6ActionPerformed(evt);
            }
        });

        lblAddress6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress6.setText("Medical ID:");
        lblAddress6.setAlignmentY(2.0F);

        txtAddress7.setAlignmentY(2.0F);
        txtAddress7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress7ActionPerformed(evt);
            }
        });

        lblAddress7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress7.setText("Linkedin profile:");
        lblAddress7.setAlignmentY(2.0F);

        txtAddress8.setAlignmentY(2.0F);
        txtAddress8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAddress8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddress8ActionPerformed(evt);
            }
        });

        lblAddress8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAddress8.setText("IPAddress:");
        lblAddress8.setAlignmentY(2.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uploadBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtPhone)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAddress6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress6, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress7, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblAddress8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress8, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilePic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uploadBtn)
                        .addGap(41, 41, 41)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(CancelBtn))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAddress, lblDob, lblName, lblPhone, lblProfile});

    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        profile.setName(txtName.getText());
        profile.setDateOfBirth(dob.getDate());
        profile.setAddress(txtAddress.getText());
        
        JOptionPane.showMessageDialog(this, "Profile information is saved");
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:d
        clearProfile();
        displayProfile();
        JOptionPane.showMessageDialog(this, "Profile information is cleared");
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser  = new JFileChooser(); // creating new file picker
        chooser.addChoosableFileFilter(new ImageFilter()); // adding filter to display only supported image types
        chooser.setAcceptAllFileFilterUsed(false); // for disabling other type of files other than image
        chooser.showOpenDialog(null);
        try {
            File profilePhoto = chooser.getSelectedFile();
            profilePic.setImage(profilePhoto);
        } catch (IOException ex) {
//            Logger.getLogger(CreateJpanel1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1ActionPerformed

    private void txtAddress2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress2ActionPerformed

    private void txtAddress3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress3ActionPerformed

    private void txtAddress4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress4ActionPerformed

    private void txtAddress5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress5ActionPerformed

    private void txtAddress6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress6ActionPerformed

    private void txtAddress7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress7ActionPerformed

    private void txtAddress8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddress8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress8ActionPerformed

    private void validateName(JTextField field, JLabel label) {
        if (field.getText().length() <= 2) {
            label.setText("Invalid Name, it should be atleast 3 letters");
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblAddress2;
    private javax.swing.JLabel lblAddress3;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblAddress5;
    private javax.swing.JLabel lblAddress6;
    private javax.swing.JLabel lblAddress7;
    private javax.swing.JLabel lblAddress8;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblProfile;
    private org.jdesktop.swingx.JXImageView profilePic;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAddress2;
    private javax.swing.JTextField txtAddress3;
    private javax.swing.JTextField txtAddress4;
    private javax.swing.JTextField txtAddress5;
    private javax.swing.JTextField txtAddress6;
    private javax.swing.JTextField txtAddress7;
    private javax.swing.JTextField txtAddress8;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables

    Date currentDate = new Date();

    private void clearProfile() {
        profile.setName("");
        profile.setDateOfBirth(currentDate);
        profile.setAddress("");
    }
    
    private void displayProfile() {
        txtName.setText("");
        txtAddress.setText("");
        System.out.println(currentDate);
        dob.setDate(currentDate);
    }
}

// Define a filter for the image types
class ImageFilter extends FileFilter {
   public final static String JPEG = "jpeg";
   public final static String JPG = "jpg";
   public final static String GIF = "gif";
   public final static String TIFF = "tiff";
   public final static String TIF = "tif";
   public final static String PNG = "png";
   
   @Override
   public boolean accept(File f) {
      if (f.isDirectory()) {
         return true;
      }

      String extension = getExtension(f);
      if (extension != null) {
         if (extension.equals(TIFF) ||
            extension.equals(TIF) ||
            extension.equals(GIF) ||
            extension.equals(JPEG) ||
            extension.equals(JPG) ||
            extension.equals(PNG)) {
            return true;
         } else {
            return false;
         }
      }
      return false;
   }

   @Override
   public String getDescription() {
      return "Image Only";
   }

   String getExtension(File f) {
      String ext = null;
      String s = f.getName();
      int i = s.lastIndexOf('.');
   
      if (i > 0 &&  i < s.length() - 1) {
         ext = s.substring(i+1).toLowerCase();
      }
      return ext;
   } 
}
