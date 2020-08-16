/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class NewPatient extends javax.swing.JFrame {

    /**
     * Creates new form NewPatient
     */
    //private static Statement st;
    private User user;
    private String DiseaseIC = "";
    NewPatientDisease diseasepage;

    public NewPatient(User user) {
        initComponents();
        txtName.setEnabled(false);
        txtGender.setEnabled(false);
        txtAge.setEnabled(false);
        txtPhone.setEnabled(false);
        txtAddress.setEnabled(false);
        this.user = user;
    }

    public NewPatient(User user, String DiseaseIC) {
        initComponents();
        this.user = user;
        this.DiseaseIC = DiseaseIC;
        txtIC.setText(DiseaseIC);
        txtIC.setEnabled(false);
        btnFind.setVisible(false);
        btnDelete.setVisible(false);
        btnEdit.setVisible(false);
        txtAddress.setEnabled(true);
    }

    public NewPatient() {
        initComponents();
        //st = connect.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("名字：");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 128, 70, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("性别：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 145, 30);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("年龄：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 180, 60, 40);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIC);
        txtIC.setBounds(100, 80, 750, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("IC:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 82, 130, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("电话：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 230, 154, 30);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("地址：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 280, 154, 40);

        btnAdd.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(770, 510, 126, 51);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(910, 510, 126, 50);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel7.setText("病人资料");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 20, 260, 41);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(470, 510, 126, 49);

        btnEdit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnEdit.setText("更改");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(620, 510, 126, 49);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(880, 70, 151, 50);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(100, 130, 930, 40);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtGender);
        txtGender.setBounds(100, 180, 390, 40);

        txtAge.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtAge);
        txtAge.setBounds(620, 180, 410, 40);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(100, 230, 930, 40);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(100, 280, 930, 150);

        setBounds(0, 0, 1089, 645);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtName.getText();
            String gender = txtGender.getText();
            int age = Integer.parseInt(txtAge.getText());
            String IC = txtIC.getText();
            String phone = txtPhone.getText();
            String address = txtAddress.getText();
            if (name.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "名字没填！");
            } else if (gender.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "性别没填！");
            } else if (age <= 0 && age >= 100) {
                JOptionPane.showMessageDialog(rootPane, "年龄错误！");
            } else if (phone.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "电话号码没填！");
            } else if (address.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "地址没填！");
            } else {
                Patient patient = new Patient(IC, name, gender, age, phone, address);
                if (patient.AddNewPatient() == 1) {
                    JOptionPane.showMessageDialog(rootPane, "新增成功");
                    try {
                        if (!DiseaseIC.equalsIgnoreCase("") && patient.getPatient(DiseaseIC).getIC().equalsIgnoreCase(IC)) {
                            diseasepage = new NewPatientDisease(user, patient.getPatient(DiseaseIC).getID(),
                                    DiseaseIC,
                                    patient.getPatient(DiseaseIC).getName(),
                                    patient.getPatient(DiseaseIC).getPhone());
                            diseasepage.setVisible(true);
                            this.dispose();
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "新增失败");
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "新增失败");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "年龄后面不可以有空格/年龄不可以放字母！");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        Patient patient = new Patient(IC);
        try {
            if (patient.DeletePatient() == 1) {
                JOptionPane.showMessageDialog(rootPane, "删除成功");
            } else {
                JOptionPane.showMessageDialog(rootPane, "删除失败");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        if (IC.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "IC没填！");
        } else {
            Patient patient = new Patient();
            try {
                if (patient.getPatient(IC).getIC().equalsIgnoreCase(IC)) {
                    txtName.setText(patient.getPatient(IC).getName());
                    txtGender.setText(patient.getPatient(IC).getGender());
                    txtAge.setText(String.valueOf(patient.getPatient(IC).getAge()));
                    txtPhone.setText(patient.getPatient(IC).getPhone());
                    txtAddress.setText(patient.getPatient(IC).getAddress());
                    txtIC.setEnabled(false);
                    txtName.setEnabled(true);
                    txtGender.setEnabled(true);
                    txtAge.setEnabled(true);
                    txtPhone.setEnabled(true);
                    txtAddress.setEnabled(true);
                } else {
                    txtIC.setEnabled(false);
                    txtName.setEnabled(true);
                    txtGender.setEnabled(true);
                    txtAge.setEnabled(true);
                    txtPhone.setEnabled(true);
                    txtAddress.setEnabled(true);
                }

            } catch (SQLException ex) {
                Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String name = txtName.getText();
        String gender = txtGender.getText();
        int age = Integer.parseInt(txtAge.getText());
        String phone = txtPhone.getText();
        String address = txtAddress.getText();

        Patient patient = new Patient(IC);
        if (patient.EditPatient(name, gender, age, IC, phone, address) == 1) {
            JOptionPane.showMessageDialog(rootPane, "更改成功");
        } else {
            JOptionPane.showMessageDialog(rootPane, "更改失败");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (DiseaseIC.equalsIgnoreCase("")) {
            PatientDetailMenu main = new PatientDetailMenu(user);
            main.setVisible(true);
            this.dispose();
        } else {
            diseasepage = new NewPatientDisease(user);
            diseasepage.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
