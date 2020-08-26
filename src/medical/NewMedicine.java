/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class NewMedicine extends javax.swing.JFrame {

    /**
     * Creates new form NewMedicine
     */
    private User user;
    
    public NewMedicine() {
        initComponents();
    }

    public NewMedicine(User user) {
        initComponents();
        this.user = user;
        
        if(comboMedicine.getSelectedItem() == "单调药粉")
        {
            System.out.println(1);
            lblzhucheng.setText("药性"); 
            lblzhuzi.setText("应用"); 
        }
        else
        {
            System.out.println(2);
            lblzhucheng.setText("组成"); 
            lblzhuzi.setText("主治"); 
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtComponent = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtIndication = new javax.swing.JTextField();
        comboMedicine = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblzhucheng = new javax.swing.JLabel();
        lblzhuzi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEffect = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtScoop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtComponent.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtComponent);
        txtComponent.setBounds(190, 190, 870, 41);

        btnAdd.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnAdd.setText("新增");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(920, 740, 130, 60);

        txtIndication.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIndication);
        txtIndication.setBounds(190, 270, 870, 41);

        comboMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "复方药粉", "药丸", "药水", "单调药粉" }));
        comboMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMedicineMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboMedicineMouseExited(evt);
            }
        });
        comboMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineActionPerformed(evt);
            }
        });
        comboMedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMedicineKeyPressed(evt);
            }
        });
        getContentPane().add(comboMedicine);
        comboMedicine.setBounds(190, 110, 120, 40);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("药：");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 110, 38, 40);

        lblzhucheng.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhucheng.setText("组成：");
        getContentPane().add(lblzhucheng);
        lblzhucheng.setBounds(110, 190, 70, 30);

        lblzhuzi.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhuzi.setText("主治：");
        getContentPane().add(lblzhuzi);
        lblzhuzi.setBounds(110, 270, 70, 30);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("功效：");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 350, 57, 26);

        txtEffect.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtEffect);
        txtEffect.setBounds(190, 350, 870, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("每次每日分量：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 430, 140, 30);

        txtScoop.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtScoop);
        txtScoop.setBounds(190, 430, 860, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("重量：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 510, 60, 30);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtWeight);
        txtWeight.setBounds(190, 510, 860, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("本钱：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 590, 60, 30);

        txtCost.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtCost);
        txtCost.setBounds(190, 590, 860, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPrice);
        txtPrice.setBounds(190, 670, 860, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("价格：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 670, 60, 30);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel9.setText("新增");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 20, 60, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(40, 740, 130, 60);

        setBounds(0, 0, 1137, 866);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String component = txtComponent.getText();
        String indication = txtIndication.getText();
        String effect = txtEffect.getText();
        String scoop = txtScoop.getText();
        String weight = txtWeight.getText();
        String cost = txtCost.getText();
        String price = txtPrice.getText();
        
        if(comboMedicine.getSelectedItem() != "单调药粉")
        {
            if(component.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane,"组成没填！");
            }
            else if(indication.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane,"主治没填！");
            }
        } 
        else if(comboMedicine.getSelectedItem() == "单调药粉")
        {
            if(component.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane,"药性没填！");
            }
            else if(indication.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane,"应用没填！");
            }
        }
        else if(effect.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane,"功效没填！");
        }
        else if(scoop.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane,"每次每日分量没填！");
        }
        else if(weight.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane,"重量没填！");
        }
        else if(cost.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane,"本钱没填！");
        }
        else if(price.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane,"价格没填！");
        }
         
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MedicalDetailMenu menu = new MedicalDetailMenu(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMedicineMouseClicked
        // TODO add your handling code here:
        if(comboMedicine.getSelectedItem() == "单调药粉")
        {
            System.out.println(1);
            lblzhucheng.setText("药性"); 
            lblzhuzi.setText("应用"); 
        }
        else
        {
            System.out.println(2);
            lblzhucheng.setText("组成"); 
            lblzhuzi.setText("主治"); 
        }
    }//GEN-LAST:event_comboMedicineMouseClicked

    private void comboMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMedicineMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_comboMedicineMouseExited

    private void comboMedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMedicineKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedicineKeyPressed

    private void comboMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineActionPerformed
        // TODO add your handling code here:
        if(comboMedicine.getSelectedItem() == "单调药粉")
        {
            System.out.println(1);
            lblzhucheng.setText("药性"); 
            lblzhuzi.setText("应用"); 
        }
        else
        {
            System.out.println(2);
            lblzhucheng.setText("组成"); 
            lblzhuzi.setText("主治"); 
        }
    }//GEN-LAST:event_comboMedicineActionPerformed

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
            java.util.logging.Logger.getLogger(NewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> comboMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblzhucheng;
    private javax.swing.JLabel lblzhuzi;
    private javax.swing.JTextField txtComponent;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtEffect;
    private javax.swing.JTextField txtIndication;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtScoop;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
