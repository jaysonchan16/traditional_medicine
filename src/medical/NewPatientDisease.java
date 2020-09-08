/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Sheng
 */
public class NewPatientDisease extends javax.swing.JFrame {

    /**
     * Creates new form NewPatientDisease
     */
    private User user;
    private String id;
    private String ic;
    private String name;
    private String phone;
    DefaultTableModel model;
    
    public NewPatientDisease(User user) throws SQLException {
        initComponents();
        this.user = user;
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        medicineCategory();
        setResizable(false);
        txtchufang.setText("1");
        txtchufang.setEnabled(false);
    }
    public NewPatientDisease(User user,String id, String ic, String name, String phone) throws SQLException {
        initComponents();
        this.user = user;
        this.id = id;
        this.ic = ic;
        this.name = name;
        this.phone = phone;
        System.out.println(id);
        btnFind.setEnabled(false);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtIC.setEnabled(false);
        txtIC.setText(ic);
        txtName.setText(name);
        txtPhone.setText(phone);
        lblID.setText(String.valueOf(id));
        medicineCategory();
        setResizable(false);
        model = (DefaultTableModel)tblDisease.getModel();
        txtchufang.setText("1");
        txtchufang.setEnabled(false);
    }
    public NewPatientDisease() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSymptom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBlood = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTongueQuality = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongueCoating = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtShit = new javax.swing.JTextField();
        BtnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblCreateDateTime = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisease = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtchufang = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        comboBoxMedicine = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        comboBoxName = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtJiLiang = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btnFind2 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        buttonAdd.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 70, 27, 32);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIC);
        txtIC.setBounds(120, 70, 290, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(430, 70, 110, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("主症：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 270, 57, 26);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(120, 190, 370, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("姓名：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 130, 57, 30);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(120, 130, 1240, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("电话号码：");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 190, 100, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 250, 1350, 20);

        txtSymptom.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtSymptom);
        txtSymptom.setBounds(120, 270, 420, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("体温：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 450, 60, 30);

        txtTemperature.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTemperature);
        txtTemperature.setBounds(120, 450, 410, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("血压：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 450, 60, 30);

        txtBlood.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtBlood);
        txtBlood.setBounds(640, 450, 720, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("脉象：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 330, 57, 26);

        txtPulse.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });
        getContentPane().add(txtPulse);
        txtPulse.setBounds(120, 330, 240, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("舌质：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 330, 60, 26);

        txtTongueQuality.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueQuality);
        txtTongueQuality.setBounds(470, 330, 240, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("舌苔：");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 330, 60, 26);

        txtTongueCoating.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueCoating);
        txtTongueCoating.setBounds(810, 330, 550, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("大小便：");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 390, 90, 26);

        txtShit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtShit);
        txtShit.setBounds(120, 390, 410, 40);

        BtnAdd.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        BtnAdd.setText("新增");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAdd);
        BtnAdd.setBounds(1160, 950, 90, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(1270, 950, 90, 40);
        getContentPane().add(lblID);
        lblID.setBounds(40, 50, 0, 0);

        btnEdit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnEdit.setText("更改");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(1060, 950, 90, 40);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(950, 950, 90, 40);

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel12.setText("病症资料");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 10, 120, 30);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel13.setText("日期：");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 190, 60, 26);

        lblCreateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(lblCreateDateTime);
        lblCreateDateTime.setBounds(600, 190, 760, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtID);
        txtID.setBounds(600, 70, 630, 40);

        jLabel14.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel14.setText("ID:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 70, 40, 30);

        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "处方", "药物种类", "药物名称", "剂量", "价格/G", "总价值"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisease);
        if (tblDisease.getColumnModel().getColumnCount() > 0) {
            tblDisease.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(new JComboBox()));
            tblDisease.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JComboBox()));
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 530, 810, 400);

        btnAdd.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnAdd.setText("添加");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(450, 890, 80, 40);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("病史：");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(580, 400, 60, 20);

        jLabel16.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel16.setText("处方：");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 530, 60, 30);

        txtchufang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtchufang);
        txtchufang.setBounds(120, 530, 410, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 510, 1350, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 940, 1350, 10);

        jLabel17.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel17.setText("药物种类：");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(20, 590, 100, 30);

        comboBoxMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxMedicine);
        comboBoxMedicine.setBounds(120, 590, 410, 40);

        jLabel18.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel18.setText("药物名称：");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 650, 95, 26);

        comboBoxName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxName);
        comboBoxName.setBounds(120, 650, 410, 40);

        jLabel19.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel19.setText("剂量：");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(50, 710, 60, 26);

        txtJiLiang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtJiLiang);
        txtJiLiang.setBounds(120, 710, 380, 50);

        jLabel20.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel20.setText("价格/G:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 770, 100, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPrice);
        txtPrice.setBounds(120, 770, 410, 40);

        txtTotalPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTotalPrice);
        txtTotalPrice.setBounds(120, 830, 410, 40);

        jLabel21.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel21.setText("总价值：");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(20, 830, 90, 30);

        txtHistory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtHistory);
        txtHistory.setBounds(640, 390, 720, 40);

        jLabel22.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel22.setText("病症分类：");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(570, 270, 95, 30);

        txtCategory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtCategory);
        txtCategory.setBounds(660, 270, 700, 40);

        btnFind2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind2.setText("寻找");
        btnFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFind2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind2);
        btnFind2.setBounds(1250, 70, 110, 40);
        getContentPane().add(jScrollBar1);
        jScrollBar1.setBounds(500, 710, 21, 48);

        setBounds(0, 0, 1418, 1058);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PatientDetailMenu main = new PatientDetailMenu(user);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // TODO add your handling code here:
        try {
            int patientID = Integer.parseInt(lblID.getText());
            String symptom = txtSymptom.getText();
            int temperature = Integer.parseInt(txtTemperature.getText());
            String blood = txtBlood.getText();
            String pulse = txtPulse.getText();
            String tonguequality = txtTongueQuality.getText();
            String tonguecoating = txtTongueCoating.getText();
            String shit = txtShit.getText();
            String category = txtCategory.getText();
            String history = txtHistory.getText();
            
            if (symptom.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "主症没填！");
            } else if (temperature <= 0 && temperature >= 100) {
                JOptionPane.showMessageDialog(rootPane, "体温错误！");
            } else if (blood.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "血压没填！");
            } else if (pulse.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "脉象没填！");
            } else if (tonguequality.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "舌质没填！");
            } else if (tonguecoating.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "舌苔没填！");
            } else if (shit.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "大小便没填！");
            } else if (category.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "病症归类没填！");
            } else if (history.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "病史没填！");
            }
            else {
                Disease disease = new Disease(symptom, temperature, blood, pulse, tonguequality, 
                                                tonguecoating, shit, category, history, patientID);
                if (disease.AddDisease() == 1) {
                    JOptionPane.showMessageDialog(rootPane, "新增成功");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "新增失败");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "体温后面不可以有空格/体温不可以放字母！");
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String symptom = txtSymptom.getText();
        int temperature = Integer.parseInt(txtTemperature.getText());
        String blood = txtBlood.getText();
        String pulse = txtPulse.getText();
        String tonguequality = txtTongueQuality.getText();
        String tonguecoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String category = txtCategory.getText();
        String history = txtHistory.getText();
        int patientID = Integer.parseInt(lblID.getText());
        
        Disease disease = new Disease(symptom,temperature, blood, pulse, tonguequality,tonguecoating, shit, category, history, patientID );
        if (disease.EditDisease() == 1) {
            JOptionPane.showMessageDialog(rootPane, "更改成功");
        } else {
            JOptionPane.showMessageDialog(rootPane, "更改失败");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String symptom = txtSymptom.getText();
        int temperature = Integer.parseInt(txtTemperature.getText());
        String blood = txtBlood.getText();
        String pulse = txtPulse.getText();
        String tonguequality = txtTongueQuality.getText();
        String tonguecoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String category = txtCategory.getText();
        String history = txtHistory.getText();
        int patientID = Integer.parseInt(lblID.getText());
        Disease disease = new Disease(symptom,temperature, blood, pulse, tonguequality,tonguecoating, shit, category, history, patientID);
        try {
            if (disease.DeleteDisease() == 1) {
                JOptionPane.showMessageDialog(rootPane, "删除成功");
            } else {
                JOptionPane.showMessageDialog(rootPane, "删除失败");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void comboBoxMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMedicineActionPerformed
        try {
            // TODO add your handling code here:
            String name = comboBoxMedicine.getSelectedItem().toString();
            
            System.out.println(name);
            
            medicineName(name);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_comboBoxMedicineActionPerformed

    private void comboBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxNameActionPerformed

    private void btnFind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFind2ActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFind2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        chufang();
        
        String jiliang = txtJiLiang.getText();
        String price = txtPrice.getText();
        String totalprice = txtTotalPrice.getText();
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    public void chufang()
    {
        int chufang = Integer.valueOf(txtchufang.getText()) + 1;
        txtchufang.setText(String.valueOf(chufang));
    }
    
    public void Find()
    {
        String IC = txtIC.getText();
        String ID = txtID.getText();
        
        Patient patient = new Patient();
        try {
            if(patient.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
            {    
                txtName.setText(patient.getPatient(IC,ID).getName());
                txtPhone.setText(patient.getPatient(IC,ID).getPhone());
                lblID.setText(patient.getPatient(IC,ID).getID());
                txtIC.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                NewPatient detail = new NewPatient(user,IC);
                detail.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
    
    public void medicineCategory() throws SQLException
    {
        try {
            Code code = new Code();
            
            for(int i = 0; i < code.getComboMedicine().size(); i++)
            {
                comboBoxMedicine.addItem(code.getComboMedicine().get(i).getCode());
            }
            medicineName(code.getComboMedicine().get(0).getCode());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        
    }
    
    public void medicineName(String name) throws SQLException
    {
        comboBoxName.removeAllItems();
        if(name.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();
            
            for(int i = 0; i < pill.comboName().size(); i++)
            {
                comboBoxName.addItem(pill.comboName().get(i).getName());
            }
        }
        else if(name.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion potion = new GrassMedicinePotion();
            
            for(int i = 0; i < potion.comboName().size(); i++)
            {
                comboBoxName.addItem(potion.comboName().get(i).getName());
            }
        }
        else if(name.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill pill = new GrassMedicinePill();
            
            for(int i = 0; i < pill.comboName().size(); i++)
            {
                comboBoxName.addItem(pill.comboName().get(i).getName());
            }
        }
        else if(name.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
            
            for(int i = 0; i < potion.comboName().size(); i++)
            {
                comboBoxName.addItem(potion.comboName().get(i).getName());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatientDisease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFind2;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JComboBox<String> comboBoxMedicine;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCreateDateTime;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblDisease;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJiLiang;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtShit;
    private javax.swing.JTextField txtSymptom;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTongueCoating;
    private javax.swing.JTextField txtTongueQuality;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtchufang;
    // End of variables declaration//GEN-END:variables
}
