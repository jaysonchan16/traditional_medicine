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

/**
 *
 * @author Sheng
 */
public class NewPatientDisease extends javax.swing.JFrame {

    /**
     * Creates new form NewPatientDisease
     */
    private User user;
    private int id;
    private String ic;
    private String name;
    private String phone;
    public NewPatientDisease(User user) {
        initComponents();
        this.user = user;
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        setResizable(false);
    }
    public NewPatientDisease(User user,int id, String ic, String name, String phone) {
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
        setResizable(false);
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
        jLabel11 = new javax.swing.JLabel();
        txtPee = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 27, 32);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIC);
        txtIC.setBounds(120, 82, 770, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(910, 70, 140, 50);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("主症：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 280, 57, 26);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(120, 200, 930, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("姓名：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 57, 30);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(120, 140, 930, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("电话号码：");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 100, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 260, 1040, 20);

        txtSymptom.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtSymptom);
        txtSymptom.setBounds(120, 280, 930, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("体温：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 340, 60, 30);

        txtTemperature.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTemperature);
        txtTemperature.setBounds(120, 340, 410, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("血压：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 340, 60, 30);

        txtBlood.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtBlood);
        txtBlood.setBounds(640, 340, 410, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("脉象：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 400, 60, 30);

        txtPulse.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });
        getContentPane().add(txtPulse);
        txtPulse.setBounds(120, 400, 930, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("舌质：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 460, 70, 30);

        txtTongueQuality.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueQuality);
        txtTongueQuality.setBounds(120, 460, 930, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("舌苔：");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 520, 60, 26);

        txtTongueCoating.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtTongueCoating);
        txtTongueCoating.setBounds(120, 520, 930, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("大便：");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 580, 70, 26);

        txtShit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtShit);
        txtShit.setBounds(120, 580, 930, 40);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("小便：");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 640, 70, 30);

        txtPee.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPee);
        txtPee.setBounds(120, 640, 930, 40);

        jButton2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jButton2.setText("新增");
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 710, 90, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(960, 710, 90, 40);

        setBounds(0, 0, 1101, 816);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        
        Patient patient = new Patient();
        try {
            if(patient.getPatient(IC).getIC().equalsIgnoreCase(IC))
            {    
                txtName.setText(patient.getPatient(IC).getName());
                txtPhone.setText(patient.getPatient(IC).getPhone());
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
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        PatientDetailMenu main = new PatientDetailMenu(user);
        main.setVisible(true);
        this.dispose();
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPee;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtShit;
    private javax.swing.JTextField txtSymptom;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTongueCoating;
    private javax.swing.JTextField txtTongueQuality;
    // End of variables declaration//GEN-END:variables
}
