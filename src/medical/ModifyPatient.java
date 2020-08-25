/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheng
 */
public class ModifyPatient extends javax.swing.JFrame {

    /**
     * Creates new form ModifyPatient
     */
    private User user;
    DefaultTableModel model;
    private String IC;
    private String ID;
    
    public ModifyPatient() {
        initComponents();
    }

    public ModifyPatient(User user) {
        initComponents();
        this.user = user;
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
        txtIC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 130, 27, 26);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtICKeyPressed(evt);
            }
        });
        getContentPane().add(txtIC);
        txtIC.setBounds(120, 130, 710, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("姓名：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 270, 60, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(120, 270, 710, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("性别：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 340, 57, 30);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtGender);
        txtGender.setBounds(120, 340, 710, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("年龄：");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 410, 70, 30);
        getContentPane().add(txtAge);
        txtAge.setBounds(120, 410, 710, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("电话号码：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 480, 110, 30);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(120, 480, 710, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("地址：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 550, 60, 30);

        txtAddress.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtAddress);
        txtAddress.setBounds(120, 550, 710, 40);

        btnUpdate.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnUpdate.setText("更改");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(560, 610, 110, 50);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(720, 610, 110, 50);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 610, 110, 50);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel7.setText("更改病人资料");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(420, 20, 150, 30);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 70, 25, 26);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(120, 70, 710, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(720, 190, 110, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 250, 860, 2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        IC = txtIC.getText();
        ID = txtID.getText();
        
         if (IC.equalsIgnoreCase("") || ID.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "IC或ID没填！");
        } else {
            try {
                Patient patient = new Patient();
                if(patient.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
                {
                    txtName.setText(patient.getPatient(IC,ID).getName());
                    txtGender.setText(patient.getPatient(IC,ID).getGender());
                    txtAge.setText(String.valueOf(patient.getPatient(IC, ID).getAge()));
                    txtPhone.setText(patient.getPatient(IC,ID).getPhone());
                    txtAddress.setText(patient.getPatient(IC,ID).getAddress());
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                    /*NewPatient detail = new NewPatient(user,IC);
                    detail.setVisible(true);
                    this.dispose();*/
                }
                    } catch (SQLException ex) {
                ex.printStackTrace();
            }
         }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:
        ID = txtID.getText();
        try {
            Patient patient = new Patient();
            if(patient.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
            {
                txtName.setText(patient.getPatient(IC,ID).getName());
                txtGender.setText(patient.getPatient(IC,ID).getGender());
                txtAge.setText(String.valueOf(patient.getPatient(IC, ID).getAge()));
                txtPhone.setText(patient.getPatient(IC,ID).getPhone());
                txtAddress.setText(patient.getPatient(IC,ID).getAddress());

            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                /*NewPatient detail = new NewPatient(user,IC);
                detail.setVisible(true);
                this.dispose();*/
            }
                } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtICKeyPressed
        // TODO add your handling code here:
        IC = txtIC.getText();
        try {
            Patient patient = new Patient();
            if(patient.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
            {
                txtName.setText(patient.getPatient(IC,ID).getName());
                txtGender.setText(patient.getPatient(IC,ID).getGender());
                txtAge.setText(String.valueOf(patient.getPatient(IC, ID).getAge()));
                txtPhone.setText(patient.getPatient(IC,ID).getPhone());
                txtAddress.setText(patient.getPatient(IC,ID).getAddress());

            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                /*NewPatient detail = new NewPatient(user,IC);
                detail.setVisible(true);
                this.dispose();*/
            }
                } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtICKeyPressed

    
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
            java.util.logging.Logger.getLogger(ModifyPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
