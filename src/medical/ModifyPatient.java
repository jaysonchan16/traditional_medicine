/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private String Name;
    private String Gender;
    private String Age;
    private String Phone;
    private String Address;
    private String createDateTime;
    private String lastUpdateDateTime;
    private int option;
    private String from;
    private String to;
    private String initialIC;
    private String initialID; 
    
    public ModifyPatient() {
        initComponents();
    }

    public ModifyPatient(User user, int option) {
        initComponents();
        this.user = user;
        this.option = option;
        setResizable(false);
    }
    
    public ModifyPatient(User user,String ID,String IC,String Name,String Gender,String Age,String Phone,String Address,String createDateTime,String lastUpdateDateTime,int option){
        initComponents();
        this.user = user;
        this.ID = ID;
        this.IC = IC;
        this.Gender = Gender;
        this.Age= Age;
        this.Phone = Phone;
        this.Address = Address;
        this.createDateTime = createDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.option = option;
        
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtGender.setText(Gender);
        txtAge.setText(Age);
        txtPhone.setText(Phone);
        txtAddress.setText(Address);
        btnFind.setEnabled(false);
        txtID.setEnabled(false);
        setResizable(false);
    }

    public ModifyPatient(User user,String ID,String IC,String Name,String Gender,String Age,String Phone,String Address,String createDateTime,String lastUpdateDateTime,int option, String from, String to){
        initComponents();
        this.user = user;
        this.ID = ID;
        this.IC = IC;
        this.Gender = Gender;
        this.Age= Age;
        this.Phone = Phone;
        this.Address = Address;
        this.createDateTime = createDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.option = option;
        this.from = from;
        this.to = to;
        
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtGender.setText(Gender);
        txtAge.setText(Age);
        txtPhone.setText(Phone);
        txtAddress.setText(Address);
        btnFind.setEnabled(false);
        txtID.setEnabled(false);
        setResizable(false);
    }
    
        public ModifyPatient(User user,String ID,String IC,String Name,String Gender,String Age,String Phone,String Address,String createDateTime,String lastUpdateDateTime,int option, String from, String to, String initialIC, String initialID){
        initComponents();
        this.user = user;
        this.ID = ID;
        this.IC = IC;
        this.Gender = Gender;
        this.Age= Age;
        this.Phone = Phone;
        this.Address = Address;
        this.createDateTime = createDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.option = option;
        this.from = from;
        this.to = to;
        this.initialIC = initialIC;
        this.initialID = initialID;
        
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtGender.setText(Gender);
        txtAge.setText(Age);
        txtPhone.setText(Phone);
        txtAddress.setText(Address);
        btnFind.setEnabled(false);
        txtID.setEnabled(false);
        setResizable(false);
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
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCreateDateTime = new javax.swing.JLabel();
        lblLastUpdateDateTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        menus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 170, 27, 26);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtICActionPerformed(evt);
            }
        });
        txtIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtICKeyPressed(evt);
            }
        });
        getContentPane().add(txtIC);
        txtIC.setBounds(410, 170, 1470, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("姓名：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 320, 60, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(410, 320, 1470, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("性别：");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 380, 57, 30);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtGender);
        txtGender.setBounds(410, 380, 1470, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("年龄：");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 440, 70, 30);

        txtAge.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtAge);
        txtAge.setBounds(410, 440, 1470, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("电话号码：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 500, 110, 30);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPhone);
        txtPhone.setBounds(410, 500, 1470, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("地址：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 560, 60, 30);

        btnUpdate.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnUpdate.setText("更改");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(880, 830, 110, 50);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(1010, 830, 110, 50);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(320, 830, 110, 50);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 110, 25, 26);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(410, 110, 1470, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(1770, 230, 110, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(280, 300, 1600, 20);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("创造时间:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 710, 90, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("更新时间：");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 770, 100, 40);

        lblCreateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(lblCreateDateTime);
        lblCreateDateTime.setBounds(410, 710, 710, 40);

        lblLastUpdateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(lblLastUpdateDateTime);
        lblLastUpdateDateTime.setBounds(410, 770, 710, 40);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 560, 1470, 136);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sheng\\Documents\\NetBeansProjects\\medical\\Pictures\\heng seng tong-04.png")); // NOI18N
        jPanel2.add(jLabel13);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 60);

        panelHeader.setBackground(new java.awt.Color(204, 255, 255));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel7.setText("更改病人资料");
        panelHeader.add(jLabel7);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(230, 0, 1710, 60);

        menus.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(menus);
        menus.setBounds(0, 60, 230, 930);

        setBounds(0, 0, 1955, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        IC = txtIC.getText();
        ID = txtID.getText();
        
         if (IC.equalsIgnoreCase("") && ID.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "IC和ID没填！");
        } else {
            try {
                    Patient patient = new Patient();
                    if(patient.getPatient(IC,ID).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID).getID().equalsIgnoreCase(ID))
                    {
                        txtIC.setText(patient.getPatient(IC, ID).getIC());
                        txtID.setText(patient.getPatient(IC, ID).getID());
                        txtName.setText(patient.getPatient(IC,ID).getName());
                        txtGender.setText(patient.getPatient(IC,ID).getGender());
                        txtAge.setText(String.valueOf(patient.getPatient(IC, ID).getAge()));
                        txtPhone.setText(patient.getPatient(IC,ID).getPhone());
                        txtAddress.setText(patient.getPatient(IC,ID).getAddress());
                        lblCreateDateTime.setText(patient.getPatient(IC,ID).getCreateDateTime());
                        lblLastUpdateDateTime.setText(patient.getPatient(IC,ID).getLastUpdateDateTime());
                        txtID.setEnabled(false);
                        btnFind.setEnabled(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                        /*NewPatient detail = new NewPatient(user,IC);
                        detail.setVisible(true);
                        this.dispose();*/
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
         }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         try {
            String ID = txtID.getText();
            String IC = txtIC.getText();
            String name = txtName.getText();
            String gender = txtGender.getText();
            int age = Integer.parseInt(txtAge.getText());
            String phone = txtPhone.getText();
            String address = txtAddress.getText();
            
            Patient patient = new Patient(IC,name,gender,age,phone,address,ID);
            String result = patient.EditPatient();
            if (result.equalsIgnoreCase("1")) {
                JOptionPane.showMessageDialog(rootPane, "更改成功");
            } else {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "年龄不可以有字母！");
        }
         
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:
        /*ID = txtID.getText();
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
          /*  }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }*/
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtICKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtICKeyPressed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtICActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {                                          
            // TODO add your handling code here:
            String IC = txtIC.getText();
            Patient patient = new Patient(IC);
            String result = patient.DeletePatient();
            if (result.equalsIgnoreCase("1")) {
                JOptionPane.showMessageDialog(rootPane, "删除成功");
            } else {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        System.out.println(option);
        System.out.println(from);
        System.out.println(to);
        if(option == 2){
            try {
                SearchPatient patient = new SearchPatient(user);
                patient.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        else if(option == 1){
            PatientDetailMenu patient = new PatientDetailMenu(user);
            patient.setVisible(true);
            this.dispose();
        } 
        else if(option == 3){
            try {
                System.out.println("initialIC:"+initialIC);
                System.out.println("initialID:"+initialID);
                System.out.println("IC:"+IC);
                System.out.println("ID:"+ID);
                MonthlyPatientDiseaseReport report = new MonthlyPatientDiseaseReport(user,from,to,IC, ID);
                report.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        else if(option == 4){
            try {
                System.out.println("initialIC:"+initialIC);
                System.out.println("initialID:"+initialID);
                System.out.println("IC:"+IC);
                System.out.println("ID:"+ID);
                ViewPatientDetail patient = new ViewPatientDetail(user,from,to,initialIC, initialID);
                patient.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        else if(option == 5)//back to viewdiseasedetail
        {
            try {
                ViewDiseaseDetail detail = new ViewDiseaseDetail(user,from,to,initialIC, initialID);
                detail.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
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
    public javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreateDateTime;
    private javax.swing.JLabel lblLastUpdateDateTime;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextArea txtAddress;
    public javax.swing.JTextField txtAge;
    public javax.swing.JTextField txtGender;
    public javax.swing.JTextField txtIC;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
