/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Sheng
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private User user;
    public MainMenu(User user) {
        initComponents();
        this.user = user;
        
        this.lblLoggedIn.setText(user.getUserid());
        setResizable(false);
    }
    
    public MainMenu() {
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

        btnPatient = new javax.swing.JButton();
        btnMedical = new javax.swing.JButton();
        btnGrass = new javax.swing.JButton();
        btnReference = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblLoggedIn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnPatient.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\new_patient1.png")); // NOI18N
        btnPatient.setText("病人");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnPatient);
        btnPatient.setBounds(30, 120, 220, 80);

        btnMedical.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnMedical.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\grassmedic1.png")); // NOI18N
        btnMedical.setText("药");
        btnMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedical);
        btnMedical.setBounds(560, 120, 220, 80);

        btnGrass.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnGrass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\transparent.png")); // NOI18N
        btnGrass.setText("病症");
        btnGrass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrassActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrass);
        btnGrass.setBounds(290, 120, 220, 80);

        btnReference.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnReference.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\book.png")); // NOI18N
        btnReference.setText("参考病症");
        getContentPane().add(btnReference);
        btnReference.setBounds(820, 120, 220, 80);

        jButton5.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\cart.png")); // NOI18N
        jButton5.setText("仓库");
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 320, 220, 80);

        jButton6.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\profit1.png")); // NOI18N
        jButton6.setText("利润");
        getContentPane().add(jButton6);
        jButton6.setBounds(290, 320, 220, 80);

        btnSettings.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnSettings.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\settings1.png")); // NOI18N
        btnSettings.setText("设定");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        getContentPane().add(btnSettings);
        btnSettings.setBounds(550, 320, 220, 80);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel2.setText("目录");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 30, 60, 50);

        btnlogout.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\logout1.png")); // NOI18N
        btnlogout.setText("登出");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout);
        btnlogout.setBounds(820, 320, 220, 80);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel3.setText("登入：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(800, 30, 80, 50);

        lblLoggedIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(lblLoggedIn);
        lblLoggedIn.setBounds(870, 30, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\background.jpeg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 610);

        setBounds(0, 0, 1087, 648);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientDetailMenu detail = new PatientDetailMenu(user);
        detail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicalActionPerformed
        // TODO add your handling code here:
        MedicalDetailMenu detail = new MedicalDetailMenu(user);
        detail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMedicalActionPerformed

    private void btnGrassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrassActionPerformed
        // TODO add your handling code here:
        GrassDetailMenu detail = new GrassDetailMenu(user);
        detail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGrassActionPerformed

    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        // TODO add your handling code here:
        SettingsMenu detail = new SettingsMenu(user);
        detail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        LoginUI login = new LoginUI();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrass;
    private javax.swing.JButton btnMedical;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnReference;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLoggedIn;
    // End of variables declaration//GEN-END:variables
}
