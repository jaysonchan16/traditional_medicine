/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author Sheng
 */
public class ModifyDisease extends javax.swing.JFrame {

    /**
     * Creates new form ModifyDisease
     */
    private User user;
    List<Disease> disease;
    DefaultTableModel model;
    public ModifyDisease() {
        initComponents();
    }
    
    public ModifyDisease(User user) throws SQLException {
        initComponents();
        this.user = user;
        JTableHeader tableHeader = tblDisease.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        show_Disease();
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        disabledTextBox();
        txtDiseaseID.setVisible(false);
        /*tblDisease.setAutoResizeMode(tblDisease.AUTO_RESIZE_OFF);
        new JScrollPane(tblDisease, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSymptom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnFindIC = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnFindID = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtPhone = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTongueQuality = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongueCoating = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtShit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBlood = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisease = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        txtDiseaseID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 760, 130, 50);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更新");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnModify);
        btnModify.setBounds(590, 760, 140, 50);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(400, 760, 140, 50);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("主症：");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 330, 60, 40);

        txtSymptom.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtSymptom);
        txtSymptom.setBounds(130, 330, 500, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("名字：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 170, 70, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 110, 25, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("病症分类：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 400, 100, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 252, 720, 0);

        txtCategory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtCategory);
        txtCategory.setBounds(130, 400, 500, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("脉象：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 470, 60, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("IC:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 110, 40, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("电话号码：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 230, 100, 40);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIC);
        txtIC.setBounds(120, 110, 190, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtID);
        txtID.setBounds(460, 110, 170, 40);

        btnFindIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindIC.setText("寻找");
        btnFindIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindICActionPerformed(evt);
            }
        });
        getContentPane().add(btnFindIC);
        btnFindIC.setBounds(320, 110, 90, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(120, 170, 510, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(280, 20, 0, 110);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(280, 20, 0, 120);

        btnFindID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindID.setText("寻找");
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });
        getContentPane().add(btnFindID);
        btnFindID.setBounds(640, 110, 90, 40);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(10, 290, 730, 10);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(120, 230, 510, 40);

        txtPulse.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPulse);
        txtPulse.setBounds(130, 470, 200, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("舌质：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 470, 60, 40);

        txtTongueQuality.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueQuality);
        txtTongueQuality.setBounds(410, 470, 220, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("舌苔：");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 540, 57, 40);

        txtTongueCoating.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueCoating);
        txtTongueCoating.setBounds(130, 540, 200, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("大小便：");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 540, 76, 40);

        txtShit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtShit);
        txtShit.setBounds(410, 540, 220, 40);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("病史：");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 610, 60, 40);

        txtHistory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtHistory);
        txtHistory.setBounds(130, 610, 500, 40);

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel12.setText("体温：");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 680, 60, 40);

        txtTemperature.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTemperature);
        txtTemperature.setBounds(130, 680, 200, 40);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel13.setText("血压：");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(350, 680, 60, 40);

        txtBlood.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtBlood);
        txtBlood.setBounds(410, 680, 220, 40);

        jLabel14.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel14.setText("更改病症");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(680, 20, 140, 60);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblDisease.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病人ID", "IC", "名字", "电话号码", "主症 ", "病症分类", "脉象", "舌质", "舌苔", "大小便", "病史", "体温", "血压", "创建时间", "更新时间", "病症ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDisease.setToolTipText("");
        tblDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiseaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisease);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(760, 80, 1110, 730);

        btnReset.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnReset.setText(" 重启");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(200, 760, 140, 50);

        txtDiseaseID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtDiseaseID);
        txtDiseaseID.setBounds(170, 42, 250, 40);

        setBounds(0, 0, 1910, 940);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindICActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindICActionPerformed

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindIDActionPerformed

    private void tblDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiseaseMouseClicked
        // TODO add your handling code here:
        int index = tblDisease.getSelectedRow();
        TableModel model = tblDisease.getModel();
        String patientID = model.getValueAt(index, 0).toString();
        String IC = model.getValueAt(index,1).toString();
        String Name = model.getValueAt(index,2).toString(); //property
        String Phone = model.getValueAt(index,3).toString();//appliance
        String Symptom = model.getValueAt(index,4).toString();//appliance
        String Category = model.getValueAt(index,5).toString();
        String PulseCondition = model.getValueAt(index,6).toString();
        String TongueQuality = model.getValueAt(index,7).toString();
        String TongueCoating = model.getValueAt(index,8).toString();
        String Shit = model.getValueAt(index,9).toString();
        String History = model.getValueAt(index,10).toString();
        String Temperature = model.getValueAt(index,11).toString();
        String BloodPressure = model.getValueAt(index,12).toString();
        String DiseaseID = model.getValueAt(index, 15).toString();
        
        txtDiseaseID.setText(DiseaseID);
        txtID.setText(patientID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtSymptom.setText(Symptom);
        txtCategory.setText(Category);
        txtPulse.setText(PulseCondition);
        txtTongueQuality.setText(TongueQuality);
        txtTongueCoating.setText(TongueCoating);
        txtHistory.setText(History);
        txtTemperature.setText(Temperature);
        txtBlood.setText(BloodPressure);
        txtShit.setText(Shit);
        txtIC.setEnabled(false);
        txtID.setEnabled(false);
        btnFindIC.setEnabled(false);
        btnFindID.setEnabled(false);
        
        disabledTextBox();
    }//GEN-LAST:event_tblDiseaseMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DiseaseMenu menu = new DiseaseMenu(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if(validateTextBox())
        {
            try {
                Disease disease = new Disease(txtSymptom.getText(),Integer.parseInt(txtTemperature.getText()),txtBlood.getText(),
                        txtPulse.getText(),txtTongueQuality.getText(),txtTongueCoating.getText(),txtShit.getText(),txtCategory.getText(),
                        txtHistory.getText(),txtID.getText(),txtDiseaseID.getText());
                String result = disease.EditDisease();
                if(result.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更改成功！");
                    model.setRowCount(0);
                    show_Disease();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "ModifyDisease.btnModifyActionPerformed get error on line 394, "+ ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtIC.setText("");
        txtID.setText("");
        txtSymptom.setText("");
        txtCategory.setText("");
        txtPulse.setText("");
        txtTongueQuality.setText("");
        txtTongueCoating.setText("");
        txtShit.setText("");
        txtHistory.setText("");
        txtTemperature.setText("");
        txtBlood.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtDiseaseID.setText("");
        txtIC.setEnabled(true);
        txtID.setEnabled(true);
        btnFindIC.setEnabled(true);
        btnFindID.setEnabled(true);
        txtSymptom.setEnabled(false);
        txtCategory.setEnabled(false);
        txtPulse.setEnabled(false);
        txtTongueQuality.setEnabled(false);
        txtTongueCoating.setEnabled(false);
        txtShit.setEnabled(false);
        txtHistory.setEnabled(false);
        txtTemperature.setEnabled(false);
        txtBlood.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            Disease disease = new Disease(txtDiseaseID.getText());
            String result = disease.DeleteDisease();
            if(result.equalsIgnoreCase("1"))
            {
                JOptionPane.showMessageDialog(rootPane, "删除成功！");
                model.setRowCount(0);
                show_Disease();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyDisease.btnDeleteActionPerformed get error on line 433, "+ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void Find()
    {
        String IC = txtIC.getText();
        String ID = txtID.getText();
        
        Disease disease = new Disease();
        try {
            if(disease.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || disease.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
            {   
                String ICdata = disease.getPatient(IC,ID).getIC();
                String IDdata = disease.getPatient(IC,ID).getID();
                txtName.setText(disease.getPatient(IC,ID).getName());
                txtPhone.setText(disease.getPatient(IC,ID).getPhone());
                txtID.setText(IDdata);
                txtIC.setText(ICdata);
                txtDiseaseID.setText(disease.getDisease(ICdata).getDiseaseID());
                txtSymptom.setText(disease.getDisease(ICdata).getSymptom());
                txtCategory.setText(disease.getDisease(ICdata).getCategory());
                txtPulse.setText(disease.getDisease(ICdata).getPulseCondition());
                txtTongueQuality.setText(disease.getDisease(ICdata).getTongueQuality());
                txtTongueCoating.setText(disease.getDisease(ICdata).getTongueCoating());
                txtHistory.setText(disease.getDisease(ICdata).getHistory());
                txtTemperature.setText(String.valueOf(disease.getDisease(ICdata).getTemperature()));
                txtBlood.setText(disease.getDisease(ICdata).getBloodPressure());
                txtShit.setText(disease.getDisease(ICdata).getPeeShit());
                txtIC.setEnabled(false);
                txtID.setEnabled(false);
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
    
    
    public void show_Disease() throws SQLException
    {
        Disease disease = new Disease();
        List<Disease> diseaseList = new ArrayList<Disease>();
        diseaseList = disease.getDiseases();
        model = (DefaultTableModel)tblDisease.getModel();
        Object row[] = new Object[16];
        for(int i =0; i<diseaseList.size(); i++)
        {
            row[0] = diseaseList.get(i).getPatientID();
            //row[1] = diseaseList.get(i).getDiseaseID();
            row[1] = diseaseList.get(i).getIC();
            row[2] = diseaseList.get(i).getName();
            row[3] = diseaseList.get(i).getPhone();
            row[4] = diseaseList.get(i).getSymptom();
            row[5] = diseaseList.get(i).getCategory();
            row[6] = diseaseList.get(i).getPulseCondition();
            row[7] = diseaseList.get(i).getTongueQuality();
            row[8] = diseaseList.get(i).getTongueCoating();
            row[9] = diseaseList.get(i).getPeeShit();
            row[10] = diseaseList.get(i).getHistory();
            row[11] = diseaseList.get(i).getTemperature();
            row[12] = diseaseList.get(i).getBloodPressure();
            row[13] = diseaseList.get(i).getCreateDateTime();
            row[14] = diseaseList.get(i).getLastUpdateDateTime();
            row[15] = diseaseList.get(i).getDiseaseID();
            model.addRow(row);
        }
    }
    
    public void disabledTextBox()
    {
        txtSymptom.setEnabled(true);
        txtCategory.setEnabled(true);
        txtPulse.setEnabled(true);
        txtTongueQuality.setEnabled(true);
        txtTongueCoating.setEnabled(true);
        txtShit.setEnabled(true);
        txtHistory.setEnabled(true);
        txtTemperature.setEnabled(true);
        txtBlood.setEnabled(true);
        
    }
    
    public boolean validateTextBox()
    {
        boolean result = false;
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String symptom = txtSymptom.getText();
        String category = txtCategory.getText();
        String pulse = txtPulse.getText();
        String tonguequality = txtTongueQuality.getText();
        String tonguecoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String history = txtHistory.getText();
        int temperature = Integer.parseInt(txtTemperature.getText());
        String blood = txtBlood.getText();
        
        if(IC.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "IC没填！");
        } else if(ID.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "ID没填！");
        } else if (symptom.equalsIgnoreCase("")) {
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
        } else {
            result = true;
        }
        return result;
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
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyDisease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindIC;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblDisease;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDiseaseID;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtShit;
    private javax.swing.JTextField txtSymptom;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTongueCoating;
    private javax.swing.JTextField txtTongueQuality;
    // End of variables declaration//GEN-END:variables
}
