/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.House;
import model.PatientsList;
import model.Person;
import model.PersonsList;

/**
 *
 * @author sethu
 */
public class ViewPersons extends javax.swing.JPanel {

    public City city;
    public JPanel rightPanel;
    public PersonsList personsList;
    public PatientsList patientsList;
    /**
     * Creates new form ViewPersons
     */
    public ViewPersons(JPanel rightPanel, City city, PersonsList personsList, PatientsList patientsList) {
        initComponents();
        this.city = city;
        this.rightPanel = rightPanel;
        this.personsList = personsList;
        this.patientsList = patientsList;
        
        populateTable(personsList);
        populateFilter();
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
        personsTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        selCommunity = new javax.swing.JComboBox<>();
        lblCommunity = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        btnApplyFilter = new javax.swing.JButton();
        btnClearFilter = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Sex", "House Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(personsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 219, 572, 220));

        btnAdd.setText("+ Add New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 177, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        title.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Filter");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 23, 339, 27));

        selCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(selCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 68, 186, 26));

        lblCommunity.setText("Community : ");
        add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 68, 98, 26));

        title1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("List of Persons");
        add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 174, 339, 27));

        btnApplyFilter.setText("Apply");
        btnApplyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFilterActionPerformed(evt);
            }
        });
        add(btnApplyFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 112, -1, -1));

        btnClearFilter.setText("Clear");
        btnClearFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFilterActionPerformed(evt);
            }
        });
        add(btnClearFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 112, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CreatePerson myCreatePerson = new CreatePerson(rightPanel, city, personsList);
        rightPanel.add("CreatePerson", myCreatePerson);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable(personsList);
        populateFilter();
    }//GEN-LAST:event_formComponentShown

    private void btnClearFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFilterActionPerformed
        // TODO add your handling code here:
        populateTable(personsList);
    }//GEN-LAST:event_btnClearFilterActionPerformed

    private void btnApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFilterActionPerformed
        // TODO add your handling code here:
        PersonsList filteredPersonsList = new PersonsList();
        if (selCommunity.getSelectedItem().toString().equals("")){
            filteredPersonsList = personsList;
            // do nothing
        } else {
            String selectedCommunityName = selCommunity.getSelectedItem().toString();
            Community newSelectedCommunity = new Community();
            for (Community c:city.getCommunities()){
                if (c.getName().equals(selectedCommunityName)){
                    newSelectedCommunity = c;
                    break;
                }
            }
            
            for (Person p:personsList.getPersonsList()){
             House h = p.getHouse();
             if (newSelectedCommunity.getHousesList().size() > 0 && checkHouseCommunityConnection(newSelectedCommunity, h)) {
                 filteredPersonsList.add(p);
             }
            }
        }
        populateTable(filteredPersonsList);
    }//GEN-LAST:event_btnApplyFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnApplyFilter;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearFilter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JTable personsTable;
    private javax.swing.JComboBox<String> selCommunity;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables

    private void populateTable(PersonsList personsList) {
        DefaultTableModel model = (DefaultTableModel) personsTable.getModel();
        model.setRowCount(0);
        
        for(Person p:personsList.getPersonsList()) {
           Object[] row = new Object[4];
           row[0] = p;
           row[1] = p.getAge();
           row[2] = p.getSex();
           row[3] = p.getHouseAddr();
           
           model.addRow(row);
        }
    }

    private void populateFilter() {
        ArrayList<String> myCommunityList = new ArrayList<String>();
        myCommunityList.add("");
        
        for(Community c : city.getCommunities()) {
            // check if it is already present in the list before trying to add it to list
            if (!myCommunityList.contains(c.getName()))myCommunityList.add(c.getName());
        }
        
        // convert arraylist to array
        String[] myCommunities = myCommunityList.toArray(new String[0]);
        
        // populating the menus
        selCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(myCommunities));
    }
    private boolean checkHouseCommunityConnection(Community community, House house){
        boolean isIn = false;
        for (House h:community.getHousesList()){
            if (h.getHouseNumber() == house.getHouseNumber() && h.getStreetName().equals(house.getStreetName()) && h.getZipCode() == house.getZipCode()) {
                isIn = true;
            }
        }
        return isIn;
    }
}
