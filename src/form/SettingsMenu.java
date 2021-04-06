/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.SQLException;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class SettingsMenu extends javax.swing.JFrame {

    /**
     * Creates new form SettingsMenu
     */
    private User user;
    private String userid ="";
    
    public SettingsMenu() {
        initComponents();
    }
    
    public SettingsMenu(User user) throws SQLException {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        image();
        lblLoggedIn.setText(user.getUserid());
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
        btnBack = new javax.swing.JPanel();
        ImgBack = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnDeleteAccount = new javax.swing.JPanel();
        ImgDeleteAccount = new javax.swing.JLabel();
        lblDeleteAccount = new javax.swing.JLabel();
        btnUpdateAccount = new javax.swing.JPanel();
        ImgUpdateAccount = new javax.swing.JLabel();
        lblUpdateAccount = new javax.swing.JLabel();
        btnAddAccount = new javax.swing.JPanel();
        ImgAddAccount = new javax.swing.JLabel();
        lblAddAccount = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        btnModifyDatabase = new javax.swing.JPanel();
        ImgModifyDatabase = new javax.swing.JLabel();
        lblModifyDatabase = new javax.swing.JLabel();

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
        findHeader.setBounds(520, 0, 200, 70);

        lblLoggedIn.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblLoggedIn);
        lblLoggedIn.setBounds(1200, 0, 170, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1745, 5, 160, 60);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1110, 0, 100, 70);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1370, 70);

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
                .addGap(90, 90, 90)
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(btnBack);
        btnBack.setBounds(690, 370, 290, 240);

        btnDeleteAccount.setBackground(new java.awt.Color(204, 204, 255));
        btnDeleteAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAccountMouseClicked(evt);
            }
        });

        ImgDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgDeleteAccountMouseClicked(evt);
            }
        });

        lblDeleteAccount.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblDeleteAccount.setText("删除下线账号");
        lblDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeleteAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteAccountLayout = new javax.swing.GroupLayout(btnDeleteAccount);
        btnDeleteAccount.setLayout(btnDeleteAccountLayout);
        btnDeleteAccountLayout.setHorizontalGroup(
            btnDeleteAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDeleteAccountLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(ImgDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDeleteAccountLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(lblDeleteAccount)
                .addGap(66, 66, 66))
        );
        btnDeleteAccountLayout.setVerticalGroup(
            btnDeleteAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDeleteAccountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(btnDeleteAccount);
        btnDeleteAccount.setBounds(830, 100, 290, 240);

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
                .addGap(91, 91, 91)
                .addGroup(btnUpdateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ImgUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        btnUpdateAccountLayout.setVerticalGroup(
            btnUpdateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnUpdateAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel2.add(btnUpdateAccount);
        btnUpdateAccount.setBounds(470, 100, 290, 240);

        btnAddAccount.setBackground(new java.awt.Color(204, 255, 204));
        btnAddAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAccountMouseClicked(evt);
            }
        });

        ImgAddAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgAddAccountMouseClicked(evt);
            }
        });

        lblAddAccount.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblAddAccount.setText("注册下线账号");
        lblAddAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddAccountLayout = new javax.swing.GroupLayout(btnAddAccount);
        btnAddAccount.setLayout(btnAddAccountLayout);
        btnAddAccountLayout.setHorizontalGroup(
            btnAddAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddAccountLayout.createSequentialGroup()
                .addGroup(btnAddAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAddAccountLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblAddAccount))
                    .addGroup(btnAddAccountLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(ImgAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        btnAddAccountLayout.setVerticalGroup(
            btnAddAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddAccountLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel2.add(btnAddAccount);
        btnAddAccount.setBounds(100, 100, 290, 240);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("CopyRight © Heng Seng Tong");
        jPanel6.add(jLabel25);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 650, 1370, 50);

        btnModifyDatabase.setBackground(new java.awt.Color(204, 255, 255));
        btnModifyDatabase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModifyDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyDatabaseMouseClicked(evt);
            }
        });

        ImgModifyDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgModifyDatabaseMouseClicked(evt);
            }
        });

        lblModifyDatabase.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblModifyDatabase.setText("更改database");
        lblModifyDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyDatabaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyDatabaseLayout = new javax.swing.GroupLayout(btnModifyDatabase);
        btnModifyDatabase.setLayout(btnModifyDatabaseLayout);
        btnModifyDatabaseLayout.setHorizontalGroup(
            btnModifyDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModifyDatabaseLayout.createSequentialGroup()
                .addGroup(btnModifyDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnModifyDatabaseLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblModifyDatabase))
                    .addGroup(btnModifyDatabaseLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(ImgModifyDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        btnModifyDatabaseLayout.setVerticalGroup(
            btnModifyDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyDatabaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImgModifyDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModifyDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel2.add(btnModifyDatabase);
        btnModifyDatabase.setBounds(300, 370, 290, 240);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1370, 700);

        setBounds(0, 0, 1387, 748);
    }// </editor-fold>//GEN-END:initComponents

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

    private void ImgDeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgDeleteAccountMouseClicked
        try {
            // TODO add your handling code here:
            delete();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ImgDeleteAccountMouseClicked

    private void lblDeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeleteAccountMouseClicked
        try {
            // TODO add your handling code here:
            delete();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lblDeleteAccountMouseClicked

    private void btnDeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAccountMouseClicked
        try {
            // TODO add your handling code here:
            delete();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteAccountMouseClicked

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

    private void ImgAddAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgAddAccountMouseClicked
        // TODO add your handling code here:
        register();
    }//GEN-LAST:event_ImgAddAccountMouseClicked

    private void lblAddAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddAccountMouseClicked
        // TODO add your handling code here:
        register();
    }//GEN-LAST:event_lblAddAccountMouseClicked

    private void btnAddAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAccountMouseClicked
        // TODO add your handling code here:
        register();
    }//GEN-LAST:event_btnAddAccountMouseClicked

    private void ImgModifyDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgModifyDatabaseMouseClicked
        // TODO add your handling code here:
        ModifyDatabase();
    }//GEN-LAST:event_ImgModifyDatabaseMouseClicked

    private void lblModifyDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyDatabaseMouseClicked
        // TODO add your handling code here:
        ModifyDatabase();
    }//GEN-LAST:event_lblModifyDatabaseMouseClicked

    private void btnModifyDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyDatabaseMouseClicked
        // TODO add your handling code here:
        ModifyDatabase();
    }//GEN-LAST:event_btnModifyDatabaseMouseClicked

    public void ModifyDatabase()
    {
        ModifyDatabase detail = new ModifyDatabase(user);
        detail.setVisible(true);
        this.dispose();
    }
    
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
    
    public void register()
    {
        RegisterSupervisor visor = new RegisterSupervisor(user);
        visor.setVisible(true);
        this.dispose();
    }
    
    public void delete() throws SQLException
    {
        User usert = new User();
        if(usert.ValidateSupervisor())
        {
            JOptionPane.showMessageDialog(rootPane, "没有第二个账号！");
        }
        else
        {   
            DeleteSupervisorAcc acc = new DeleteSupervisorAcc(user);
            acc.setVisible(true);
            this.dispose();
        }
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addbig.png"));
        ImgAddAccount.setIcon(iconAdd);
        ImageIcon iconModifyDisease = new ImageIcon(getClass().getResource("/menu/edit.png"));
        ImgUpdateAccount.setIcon(iconModifyDisease);
        ImageIcon iconDelete = new ImageIcon(getClass().getResource("/menu/delete.png"));
        ImgDeleteAccount.setIcon(iconDelete);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/back.png"));
        ImgBack.setIcon(iconBack);
        ImageIcon iconSettings = new ImageIcon(getClass().getResource("/menu/settingsmedium.png"));
        findHeader.setIcon(iconSettings);
        ImageIcon iconDatabase = new ImageIcon(getClass().getResource("/menu/databaseSettingsMedium.png"));
        ImgModifyDatabase.setIcon(iconDatabase);
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
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgAddAccount;
    private javax.swing.JLabel ImgBack;
    private javax.swing.JLabel ImgDeleteAccount;
    private javax.swing.JLabel ImgModifyDatabase;
    private javax.swing.JLabel ImgUpdateAccount;
    private javax.swing.JPanel btnAddAccount;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnDeleteAccount;
    private javax.swing.JPanel btnModifyDatabase;
    private javax.swing.JPanel btnUpdateAccount;
    private javax.swing.JLabel findHeader;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddAccount;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDeleteAccount;
    private javax.swing.JLabel lblLoggedIn;
    private javax.swing.JLabel lblModifyDatabase;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblUpdateAccount;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
