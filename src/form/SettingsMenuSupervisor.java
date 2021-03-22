/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javaClass.User;
import javax.swing.ImageIcon;

/**
 *
 * @author Sheng
 */
public class SettingsMenuSupervisor extends javax.swing.JFrame {

    /**
     * Creates new form SettingsMenuSupervisor
     */
    private User user;
    private String userid = "";
    
    public SettingsMenuSupervisor() {
        initComponents();
    }

    public SettingsMenuSupervisor(User user) {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        image();
        lblLoggedIn.setText(userid);
        //setResizable(false);
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
        jPanel2 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        findHeader = new javax.swing.JLabel();
        lblLoggedIn = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnUpdateAccount = new javax.swing.JPanel();
        ImgUpdateAccount = new javax.swing.JLabel();
        lblUpdateAccount = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        ImgBack = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        findHeader.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        findHeader.setText("设定");
        panelHeader.add(findHeader);
        findHeader.setBounds(870, 0, 200, 70);

        lblLoggedIn.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblLoggedIn);
        lblLoggedIn.setBounds(1730, 10, 170, 50);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1745, 5, 160, 60);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1638, 5, 100, 60);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        btnUpdateAccount.setBackground(new java.awt.Color(255, 204, 204));
        btnUpdateAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnUpdateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateAccountMouseClicked(evt);
            }
        });

        ImgUpdateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgUpdateAccountMouseClicked(evt);
            }
        });

        lblUpdateAccount.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblUpdateAccount.setText("更改账号");
        lblUpdateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUpdateAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnUpdateAccountLayout = new javax.swing.GroupLayout(btnUpdateAccount);
        btnUpdateAccount.setLayout(btnUpdateAccountLayout);
        btnUpdateAccountLayout.setHorizontalGroup(
            btnUpdateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateAccountLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnUpdateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnUpdateAccountLayout.setVerticalGroup(
            btnUpdateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUpdateAccountLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(ImgUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(btnUpdateAccount);
        btnUpdateAccount.setBounds(250, 330, 470, 350);

        btnBack.setBackground(new java.awt.Color(255, 255, 153));
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        ImgBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgBackMouseClicked(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblBack.setText("退出");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(btnBack);
        btnBack.setBounds(1180, 330, 470, 350);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel12);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1940, 990);

        setBounds(0, 0, 1958, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void ImgUpdateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgUpdateAccountMouseClicked
        // TODO add your handling code here:
        UpdatePassword();
    }//GEN-LAST:event_ImgUpdateAccountMouseClicked

    private void lblUpdateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUpdateAccountMouseClicked
        // TODO add your handling code here:
        UpdatePassword();
    }//GEN-LAST:event_lblUpdateAccountMouseClicked

    private void btnUpdateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateAccountMouseClicked
        // TODO add your handling code here:
        UpdatePassword();
    }//GEN-LAST:event_btnUpdateAccountMouseClicked

    private void ImgBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgBackMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_ImgBackMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBackMouseClicked

    public void back()
    {
        MainMenu detail = new MainMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void UpdatePassword()
    {
        ChangePassword pass = new ChangePassword(user);
        pass.setVisible(true);
        this.dispose();
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconModifyDisease = new ImageIcon(getClass().getResource("/menu/edit.png"));
        ImgUpdateAccount.setIcon(iconModifyDisease);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/back.png"));
        ImgBack.setIcon(iconBack);
        ImageIcon iconSettings = new ImageIcon(getClass().getResource("/menu/settingsmedium.png"));
        findHeader.setIcon(iconSettings);
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
            java.util.logging.Logger.getLogger(SettingsMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsMenuSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsMenuSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgBack;
    private javax.swing.JLabel ImgUpdateAccount;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnUpdateAccount;
    private javax.swing.JLabel findHeader;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLoggedIn;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUpdateAccount;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
