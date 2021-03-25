/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javaClass.User;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class PatientDetailMenu extends javax.swing.JFrame {

    /**
     * Creates new form PatientDetailMenu
     */
    private User user;
    public PatientDetailMenu(User user) {
        initComponents();
        this.user = user;
        
        this.lblName.setText(user.getUserid());
        //setResizable(false);
        image();
    }
    public PatientDetailMenu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        headerPatient = new javax.swing.JLabel();
        btnAddPatient = new javax.swing.JPanel();
        imgAddPatient = new javax.swing.JLabel();
        lblAddPatient = new javax.swing.JLabel();
        btnFindPatient = new javax.swing.JPanel();
        imgFindPatient = new javax.swing.JLabel();
        lblFindPatient = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JPanel();
        imgBack = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnModifyPatient = new javax.swing.JPanel();
        imgModifyPatient = new javax.swing.JLabel();
        lblModifyPatient = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1160, 0, 75, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1240, 0, 127, 70);

        headerPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        headerPatient.setText("病人");
        panelHeader.add(headerPatient);
        headerPatient.setBounds(610, 0, 230, 70);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1370, 70);

        btnAddPatient.setBackground(new java.awt.Color(0, 204, 204));
        btnAddPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPatientMouseClicked(evt);
            }
        });

        imgAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAddPatientMouseClicked(evt);
            }
        });

        lblAddPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblAddPatient.setText("病人资料");
        lblAddPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddPatientLayout = new javax.swing.GroupLayout(btnAddPatient);
        btnAddPatient.setLayout(btnAddPatientLayout);
        btnAddPatientLayout.setHorizontalGroup(
            btnAddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddPatientLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(btnAddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddPatient))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        btnAddPatientLayout.setVerticalGroup(
            btnAddPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(btnAddPatient);
        btnAddPatient.setBounds(200, 100, 290, 240);

        btnFindPatient.setBackground(new java.awt.Color(153, 255, 255));
        btnFindPatient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindPatientMouseClicked(evt);
            }
        });

        imgFindPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgFindPatientMouseClicked(evt);
            }
        });

        lblFindPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblFindPatient.setText("寻找病人资料");
        lblFindPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFindPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFindPatientLayout = new javax.swing.GroupLayout(btnFindPatient);
        btnFindPatient.setLayout(btnFindPatientLayout);
        btnFindPatientLayout.setHorizontalGroup(
            btnFindPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFindPatientLayout.createSequentialGroup()
                .addGroup(btnFindPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnFindPatientLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblFindPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnFindPatientLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(imgFindPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        btnFindPatientLayout.setVerticalGroup(
            btnFindPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFindPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgFindPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFindPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel2.add(btnFindPatient);
        btnFindPatient.setBounds(200, 380, 290, 240);

        btnBack1.setBackground(new java.awt.Color(255, 204, 204));
        btnBack1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack1MouseClicked(evt);
            }
        });

        imgBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBackMouseClicked(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblBack.setText("退出");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBack1Layout = new javax.swing.GroupLayout(btnBack1);
        btnBack1.setLayout(btnBack1Layout);
        btnBack1Layout.setHorizontalGroup(
            btnBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBack1Layout.createSequentialGroup()
                .addGroup(btnBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnBack1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnBack1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        btnBack1Layout.setVerticalGroup(
            btnBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBack1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel2.add(btnBack1);
        btnBack1.setBounds(840, 380, 290, 240);

        btnModifyPatient.setBackground(new java.awt.Color(255, 255, 204));
        btnModifyPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModifyPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyPatientMouseClicked(evt);
            }
        });

        imgModifyPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgModifyPatientMouseClicked(evt);
            }
        });

        lblModifyPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblModifyPatient.setText("更改病人资料");
        lblModifyPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyPatientLayout = new javax.swing.GroupLayout(btnModifyPatient);
        btnModifyPatient.setLayout(btnModifyPatientLayout);
        btnModifyPatientLayout.setHorizontalGroup(
            btnModifyPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModifyPatientLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblModifyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgModifyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        btnModifyPatientLayout.setVerticalGroup(
            btnModifyPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgModifyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModifyPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel2.add(btnModifyPatient);
        btnModifyPatient.setBounds(840, 100, 290, 240);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("CopyRight © Heng Seng Tong");
        jPanel6.add(jLabel14);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 650, 1370, 50);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1370, 990);

        setBounds(0, 0, 1388, 746);
    }// </editor-fold>//GEN-END:initComponents

    private void imgAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddPatientMouseClicked
        // TODO add your handling code here:
        AddPatient();
    }//GEN-LAST:event_imgAddPatientMouseClicked

    private void lblAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddPatientMouseClicked
        // TODO add your handling code here:
        AddPatient();
    }//GEN-LAST:event_lblAddPatientMouseClicked

    private void btnAddPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPatientMouseClicked
        // TODO add your handling code here:
        AddPatient();
    }//GEN-LAST:event_btnAddPatientMouseClicked

    private void imgFindPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFindPatientMouseClicked
        // TODO add your handling code here:
        FindPatient();
    }//GEN-LAST:event_imgFindPatientMouseClicked

    private void lblFindPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFindPatientMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        FindPatient();
    }//GEN-LAST:event_lblFindPatientMouseClicked

    private void btnFindPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindPatientMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        FindPatient();
    }//GEN-LAST:event_btnFindPatientMouseClicked

    private void imgBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_imgBackMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MouseClicked
        // TODO add your handling code here:
        back();
    }//GEN-LAST:event_btnBack1MouseClicked

    private void imgModifyPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgModifyPatientMouseClicked
        // TODO add your handling code here:
        ModifyPatient();
    }//GEN-LAST:event_imgModifyPatientMouseClicked

    private void lblModifyPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyPatientMouseClicked
        // TODO add your handling code here:
        ModifyPatient();
    }//GEN-LAST:event_lblModifyPatientMouseClicked

    private void btnModifyPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyPatientMouseClicked
        // TODO add your handling code here:
        ModifyPatient();
    }//GEN-LAST:event_btnModifyPatientMouseClicked

    public void AddPatient()
    {
        NewPatient patient = new NewPatient(user);
        patient.setVisible(true);
        this.dispose();
    }
    
    public void PatientDetail()
    {
        MonthYearIC monthyear = new MonthYearIC(user,2);
        monthyear.setVisible(true);
        this.dispose();
    }
    
    public void FindPatient()
    {
        try {
            // TODO add your handling code here:
            SearchPatient search = new SearchPatient(user);
            search.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "PatientDetailMenu.btnFindActionPerformed get error on line 198,"+ex.getMessage());
        }
    }
    
    public void ModifyPatient()
    {
        ModifyPatient patient = new ModifyPatient(user,1);
        patient.setVisible(true);
        this.dispose();
    }
    
    public void back()
    {
        MainMenu detail = new MainMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addbig.png"));
        imgAddPatient.setIcon(iconAdd);
        ImageIcon iconEdit = new ImageIcon(getClass().getResource("/menu/edit.png"));
        imgModifyPatient.setIcon(iconEdit);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/find.png"));
        imgFindPatient.setIcon(iconFind);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/back.png"));
        imgBack.setIcon(iconBack);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/patientmedium.png"));
        headerPatient.setIcon(iconHeader);
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
            java.util.logging.Logger.getLogger(PatientDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDetailMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDetailMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAddPatient;
    private javax.swing.JPanel btnBack1;
    private javax.swing.JPanel btnFindPatient;
    private javax.swing.JPanel btnModifyPatient;
    private javax.swing.JLabel headerPatient;
    private javax.swing.JLabel imgAddPatient;
    private javax.swing.JLabel imgBack;
    private javax.swing.JLabel imgFindPatient;
    private javax.swing.JLabel imgModifyPatient;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddPatient;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFindPatient;
    private javax.swing.JLabel lblModifyPatient;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
