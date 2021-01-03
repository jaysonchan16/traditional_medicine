/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.SQLException;
import javaClass.User;
import javax.swing.ImageIcon;

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
        
        this.lblName.setText(user.getUserid());
        image();
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

        btnAddMedicine = new javax.swing.JPanel();
        imgAddMedicine = new javax.swing.JLabel();
        lblAddMedicine = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        imgBack = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        btnFindMedicine = new javax.swing.JPanel();
        imgFindMedicine = new javax.swing.JLabel();
        lblFindMedicine = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnModifyMedicine = new javax.swing.JPanel();
        imgModifyMedicine = new javax.swing.JLabel();
        lblModifyMedicine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAddMedicine.setBackground(new java.awt.Color(153, 255, 204));
        btnAddMedicine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMedicineMouseClicked(evt);
            }
        });

        imgAddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgAddMedicineMouseClicked(evt);
            }
        });

        lblAddMedicine.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblAddMedicine.setText("新增药");
        lblAddMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddMedicineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddMedicineLayout = new javax.swing.GroupLayout(btnAddMedicine);
        btnAddMedicine.setLayout(btnAddMedicineLayout);
        btnAddMedicineLayout.setHorizontalGroup(
            btnAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddMedicineLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(imgAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddMedicineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddMedicine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAddMedicineLayout.setVerticalGroup(
            btnAddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddMedicineLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(imgAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnAddMedicine);
        btnAddMedicine.setBounds(230, 150, 470, 350);

        btnBack.setBackground(new java.awt.Color(255, 204, 255));
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
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

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(imgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnBack);
        btnBack.setBounds(1170, 560, 470, 350);

        btnFindMedicine.setBackground(new java.awt.Color(255, 204, 0));
        btnFindMedicine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindMedicineMouseClicked(evt);
            }
        });

        imgFindMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgFindMedicineMouseClicked(evt);
            }
        });

        lblFindMedicine.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblFindMedicine.setText("药资料");
        lblFindMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFindMedicineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFindMedicineLayout = new javax.swing.GroupLayout(btnFindMedicine);
        btnFindMedicine.setLayout(btnFindMedicineLayout);
        btnFindMedicineLayout.setHorizontalGroup(
            btnFindMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFindMedicineLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnFindMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgFindMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btnFindMedicineLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblFindMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnFindMedicineLayout.setVerticalGroup(
            btnFindMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFindMedicineLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(imgFindMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFindMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnFindMedicine);
        btnFindMedicine.setBounds(230, 560, 470, 350);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1670, 5, 75, 60);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1752, 5, 127, 60);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setText("药");
        panelHeader.add(jLabel1);
        jLabel1.setBounds(863, 2, 140, 66);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel12);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        btnModifyMedicine.setBackground(new java.awt.Color(102, 255, 0));
        btnModifyMedicine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModifyMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyMedicineMouseClicked(evt);
            }
        });

        imgModifyMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgModifyMedicineMouseClicked(evt);
            }
        });

        lblModifyMedicine.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblModifyMedicine.setText("更改药");
        lblModifyMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyMedicineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyMedicineLayout = new javax.swing.GroupLayout(btnModifyMedicine);
        btnModifyMedicine.setLayout(btnModifyMedicineLayout);
        btnModifyMedicineLayout.setHorizontalGroup(
            btnModifyMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyMedicineLayout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(btnModifyMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModifyMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgModifyMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
        );
        btnModifyMedicineLayout.setVerticalGroup(
            btnModifyMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyMedicineLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(imgModifyMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblModifyMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnModifyMedicine);
        btnModifyMedicine.setBounds(1170, 160, 470, 350);

        setBounds(0, 0, 1957, 1034);
    }// </editor-fold>//GEN-END:initComponents

    private void imgAddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgAddMedicineMouseClicked
        // TODO add your handling code here:
        AddMedicine();
    }//GEN-LAST:event_imgAddMedicineMouseClicked

    private void lblAddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddMedicineMouseClicked
        // TODO add your handling code here:
        AddMedicine();

    }//GEN-LAST:event_lblAddMedicineMouseClicked

    private void btnAddMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMedicineMouseClicked
        // TODO add your handling code here:
        AddMedicine();
    }//GEN-LAST:event_btnAddMedicineMouseClicked

    private void imgBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackMouseClicked
        // TODO add your handling code here:
        MainMenu();
    }//GEN-LAST:event_imgBackMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        MainMenu();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        MainMenu();
    }//GEN-LAST:event_btnBackMouseClicked

    private void imgFindMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFindMedicineMouseClicked
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            FindMedicine();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_imgFindMedicineMouseClicked

    private void lblFindMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFindMedicineMouseClicked
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            FindMedicine();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_lblFindMedicineMouseClicked

    private void btnFindMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMedicineMouseClicked
        try {
            // TODO add your handling code here:
            // TODO add your handling code here:
            FindMedicine();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnFindMedicineMouseClicked

    private void imgModifyMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgModifyMedicineMouseClicked
        // TODO add your handling code here:
        EditMedicine();
    }//GEN-LAST:event_imgModifyMedicineMouseClicked

    private void lblModifyMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyMedicineMouseClicked
        // TODO add your handling code here:
        EditMedicine();
    }//GEN-LAST:event_lblModifyMedicineMouseClicked

    private void btnModifyMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyMedicineMouseClicked
        // TODO add your handling code here:
        EditMedicine();
    }//GEN-LAST:event_btnModifyMedicineMouseClicked
    
    public void MainMenu()
    {
        MainMenu detail = new MainMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void AddMedicine()
    {
        NewMedicine med = new NewMedicine(user);
        med.setVisible(true);
        this.dispose();
    }
    
    public void EditMedicine()
    {
        ModifyMedicine med = new ModifyMedicine(user);
        med.setVisible(true);
        this.dispose();
    }
    
    public void FindMedicine() throws SQLException
    {
        SearchMedicine medical = new SearchMedicine(user);
        medical.setVisible(true);
        this.dispose();
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addbig.png"));
        imgAddMedicine.setIcon(iconAdd);
        ImageIcon iconEdit = new ImageIcon(getClass().getResource("/menu/edit.png"));
        imgModifyMedicine.setIcon(iconEdit);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/find.png"));
        imgFindMedicine.setIcon(iconFind);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/back.png"));
        imgBack.setIcon(iconBack);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/caoyao.png"));
        jLabel1.setIcon(iconHeader);
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
    private javax.swing.JPanel btnAddMedicine;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnFindMedicine;
    private javax.swing.JPanel btnModifyMedicine;
    private javax.swing.JLabel imgAddMedicine;
    private javax.swing.JLabel imgBack;
    private javax.swing.JLabel imgFindMedicine;
    private javax.swing.JLabel imgModifyMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddMedicine;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFindMedicine;
    private javax.swing.JLabel lblModifyMedicine;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
