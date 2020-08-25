/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sheng
 */
public class SearchPatient extends javax.swing.JFrame {

    /**
     * Creates new form SearchPatient
     */
    private User user;
    DefaultTableModel model;
    
    public SearchPatient() {
        initComponents();
    }

    public SearchPatient(User user) throws SQLException {
        this.user = user;
        initComponents();
        show_patients();
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
        tblPatient = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboArrange = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "IC", "姓名", "性别", "年龄", "电话号码", "地址", "创建时间", "更新时间"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(35, 82, 927, 420);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(100, 530, 376, 42);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 530, 107, 42);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(591, 554, 0, 0);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("排列：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 740, 60, 42);

        comboArrange.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboArrange.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "顺序", "逆序" }));
        getContentPane().add(comboArrange);
        comboArrange.setBounds(100, 740, 150, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("IC:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 530, 40, 30);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtICKeyPressed(evt);
            }
        });
        getContentPane().add(txtIC);
        txtIC.setBounds(580, 530, 380, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(100, 600, 380, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("姓名：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 600, 57, 30);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("性别：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 600, 60, 30);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
        });
        getContentPane().add(txtGender);
        txtGender.setBounds(580, 600, 380, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("年龄：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 670, 57, 30);

        txtAge.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(100, 670, 380, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("电话号码：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 670, 100, 30);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(580, 670, 380, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        getContentPane().add(btnBack);
        btnBack.setBounds(100, 810, 130, 50);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        getContentPane().add(btnFind);
        btnFind.setBounds(830, 800, 130, 50);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("寻找病人资料");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 20, 120, 50);

        setBounds(0, 0, 1032, 933);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_tblPatientMouseClicked

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        try {
            // TODO add your handling code here:
            String ID = txtID.getText();
            show_selected_patients("ID",ID);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtICKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String IC = txtIC.getText();
            show_selected_patients("IC",IC);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtICKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String Name = txtName.getText();
            show_selected_patients("name",Name);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String gender = txtGender.getText();
            show_selected_patients("gender",gender);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String age = txtAge.getText();
            show_selected_patients("age",age);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String phone = txtPhone.getText();
            show_selected_patients("age",phone);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtPhoneKeyPressed

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
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPatient().setVisible(true);
            }
        });
    }
    
    public void show_patients() throws SQLException{
         Patient patient = new Patient();
         List<Patient> patientList = new ArrayList<Patient>();
         patientList = patient.getPatients();
         model = (DefaultTableModel)tblPatient.getModel();
         Object row[] = new Object[9];
         for(int i =0; i<patientList.size(); i++)
         {
             row[0] = patientList.get(i).getID();
             row[1] = patientList.get(i).getIC();
             row[2] = patientList.get(i).getName();
             row[3] = patientList.get(i).getGender();
             row[4] = patientList.get(i).getAge();
             row[5] = patientList.get(i).getPhone();
             row[6] = patientList.get(i).getAddress();
             row[7] = patientList.get(i).getLastUpdateDateTime();
             row[8] = patientList.get(i).getCreateDateTime();
             model.addRow(row);
         }
    }
    
    public void show_selected_patients(String contribute,String detail) throws SQLException{
        model.setRowCount(0);
        Patient patient = new Patient();
        List<Patient> patientList = new ArrayList<Patient>();
        String arrangement;
        arrangement = comboArrange.getSelectedItem() == "顺序" ? "asc" : comboArrange.getSelectedItem() == "逆序" ? "desc" : "系统有问题！";
        patientList = patient.getDetail(contribute,detail,arrangement);
        model = (DefaultTableModel)tblPatient.getModel();
        Object row[] = new Object[9];
        for(int i =0; i<patientList.size(); i++)
        {
            row[0] = patientList.get(i).getID();
            row[1] = patientList.get(i).getIC();
            row[2] = patientList.get(i).getName();
            row[3] = patientList.get(i).getGender();
            row[4] = patientList.get(i).getAge();
            row[5] = patientList.get(i).getPhone();
            row[6] = patientList.get(i).getAddress();
            row[7] = patientList.get(i).getLastUpdateDateTime();
            row[8] = patientList.get(i).getCreateDateTime();
            model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> comboArrange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
