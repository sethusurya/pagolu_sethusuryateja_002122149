/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Encounter;
import model.EncounterHistory;
import model.Person;
import model.PersonsList;
import model.Vitals;

/**
 *
 * @author sethu
 */
public class CreateEncounter extends javax.swing.JPanel {

    public JPanel rightPanel;
    public City city;
    public PersonsList personsList;
    public Person person;
    /**
     * Creates new form CreateEncounter
     */
    public CreateEncounter(JPanel rightPanel, City city, PersonsList personsList, Person person) {
        initComponents();
        this.rightPanel = rightPanel;
        this.city = city;
        this.personsList = personsList;
        this.person = person;
        
        // initiate the date value by default
        dtDate.setDate(Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        
        txtPatientId.setText(person.getPatientId());
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
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        dtDate = new com.toedter.calendar.JDateChooser();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create New Encounter");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 583, 50));

        lblPatientId.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientId.setText("Patient ID : ");
        add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 104, 82, 29));

        txtPatientId.setEditable(false);
        add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 104, 213, 29));

        lblBloodPressure.setForeground(new java.awt.Color(255, 255, 255));
        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBloodPressure.setText("Blood Pressure : ");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 144, -1, 29));
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 144, 213, 29));

        lblTemperature.setForeground(new java.awt.Color(255, 255, 255));
        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTemperature.setText("Temperature : ");
        add(lblTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 184, 82, 29));
        add(txtTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 184, 213, 29));

        lblPulse.setForeground(new java.awt.Color(255, 255, 255));
        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPulse.setText("Pulse : ");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 224, 82, 29));
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 224, 213, 29));

        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDate.setText("Date : ");
        add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 264, 82, 29));
        add(dtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 264, 213, 30));

        btnSave.setBackground(new java.awt.Color(0, 102, 102));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 338, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 51, 51));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 338, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        goBack();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // check if all the inputs are provided or not
        if (txtPulse.getText().equals("") || txtBloodPressure.getText().equals("") || txtTemperature.getText().equals("") || dtDate.getDate() == null) {
            JOptionPane.showMessageDialog(this,"One or more inputs is left blank, Please provide them to proceed");
            return;
        }
        
        // check for valid number data
        if (!isValidNumber(txtPulse.getText())) {
            JOptionPane.showMessageDialog(this,"Pulse is not in number, Please correct the data");
            return;
        }
        if (!isValidDoubleNumber(txtBloodPressure.getText())) {
            JOptionPane.showMessageDialog(this, "Blood pressure cannot have alphabets and stuff");
            return;
        }
        if (!isValidDoubleNumber(txtTemperature.getText())){
            JOptionPane.showMessageDialog(this, "Temperature cannot be string(FYI)");
            return;
        }
        
        // save things first and go back & person is selected person here
        double newBloodPressure = Double.parseDouble(txtBloodPressure.getText());
        double newTemperature = Double.parseDouble(txtTemperature.getText());
        int newPulse = Integer.parseInt(txtPulse.getText());
        
        System.out.println("get date : "+ dtDate.getDate());
        
        LocalDate newDate;
        newDate = dtDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        for (Encounter e: person.getEncounterHistory().getEncounterHistory()){
            if (e.getDate().compareTo(newDate) == 0) { // compared makes it 0
                JOptionPane.showMessageDialog(this, "Vitals for this day have been already entered");
                return;
            }
        }
                
        
        Vitals newVitals = new Vitals();
        newVitals.setBloodPressure(newBloodPressure);
        newVitals.setTemperature(newTemperature);
        newVitals.setPulse(newPulse);
        
        Encounter newEncounter = new Encounter();
        newEncounter.setDate(newDate);
        newEncounter.setVitals(newVitals);
        
        EncounterHistory newEncounterHistory = person.getEncounterHistory();
        
        // find the index where this date falls in
        int index = person.getEncounterHistory().getEncounterHistory().size();
        for (int i = 0; i < person.getEncounterHistory().getEncounterHistory().size(); i++) {
            LocalDate currentDate = person.getEncounterHistory().getEncounterHistory().get(i).getDate();
            if(newDate.compareTo(currentDate) > 0) {
                index = i;
                break;
            }
        }
        newEncounterHistory.addEncounter(index,newEncounter); // add new encounter to the person
        
        person.setEncounterHistory(newEncounterHistory);
        goBack();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser dtDate;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables

    private void goBack() {
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }
    
    private boolean isValidNumber(String numberString) {
        boolean isValid = true;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (!(c>='0' && c<='9')) {
                isValid = false;
            }
        }
        return isValid;
    }
    
    private boolean isValidDoubleNumber(String numberString) {
        boolean isValid = true;
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (c == '.' || (c>='0' && c<='9')) {
               isValid = true; 
            } else {
                isValid = false;
            }
        }
        return isValid;
    }
}
