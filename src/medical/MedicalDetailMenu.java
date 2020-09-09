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
public class MedicalDetailMenu extends javax.swing.JFrame {

    /**
     * Creates new form MedicalDetailMenu
     */
    private User user;
    
    public MedicalDetailMenu(User user) {
        initComponents();
        this.user = user;
        
        this.lblLoggedIn.setText(user.getUserid());
        setResizable(false);
    }
    
    public MedicalDetailMenu() {
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

        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLoggedIn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAdd.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\add-1.png")); // NOI18N
        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(80, 150, 200, 83);

        jButton2.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\edit-1.png")); // NOI18N
        jButton2.setText("更改");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 150, 200, 83);

        jButton3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\report.png")); // NOI18N
        jButton3.setText("资料");
        getContentPane().add(jButton3);
        jButton3.setBounds(800, 150, 200, 83);

        jButton4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\export.png")); // NOI18N
        jButton4.setText("备用");
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 340, 200, 90);

        jButton5.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\import.png")); // NOI18N
        jButton5.setText("输入");
        getContentPane().add(jButton5);
        jButton5.setBounds(80, 340, 200, 90);

        jButton6.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\back-1.png")); // NOI18N
        jButton6.setText("退出");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(840, 440, 200, 90);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setText("中药");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 50, 140, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel3.setText("登入：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(761, 40, 80, 40);

        lblLoggedIn.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        getContentPane().add(lblLoggedIn);
        lblLoggedIn.setBounds(870, 40, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Desktop\\Pictures\\background.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1070, 550);

        setBounds(0, 0, 1089, 595);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        MainMenu detail = new MainMenu(user);
        detail.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        NewMedicine med = new NewMedicine(user);
        med.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ModifyMedicine med = new ModifyMedicine(user);
        med.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MedicalDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicalDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicalDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicalDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicalDetailMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblLoggedIn;
    // End of variables declaration//GEN-END:variables
}
