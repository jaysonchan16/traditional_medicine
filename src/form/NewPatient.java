/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javaClass.Patient;
import javaClass.User;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.PrintTemplate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class NewPatient extends javax.swing.JFrame {

    /**
     * Creates new form NewPatient
     */
    //private static Statement st;
    private User user;
    private String DiseaseIC = "";
    private String userid = "";
    NewPatientDisease1 diseasepage;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();
    
    public NewPatient(User user) {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        txtName.setEnabled(false);
        txtGender.setEnabled(false);
        txtAge.setEnabled(false);
        txtPhone.setEnabled(false);
        txtAddress.setEnabled(false);
        lblCreateDateTime.setText(dtf.format(localDate));
        image();
    }

    public NewPatient(User user, String DiseaseIC) {
        initComponents();
        this.user = user;
        this.DiseaseIC = DiseaseIC;
        userid = user.getUserid();
        txtIC.setText(DiseaseIC);
        txtIC.setEnabled(false);
        btnFind.setVisible(false);
        txtAddress.setEnabled(true);
        lblCreateDateTime.setText(dtf.format(localDate));
        image();
        
    }

    public NewPatient() {
        initComponents();
        //st = connect.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        headerAdd = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        lblCreateDateTime = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblLastUpdateDateTime = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel17.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel17.setText("登入：");
        panelHeader.add(jLabel17);
        jLabel17.setBounds(1651, 2, 75, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1720, 0, 160, 70);

        headerAdd.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        headerAdd.setText("新增病人");
        panelHeader.add(headerAdd);
        headerAdd.setBounds(820, 0, 260, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.setLayout(null);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("IC:");
        panelBody.add(jLabel4);
        jLabel4.setBounds(110, 80, 130, 40);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtIC);
        txtIC.setBounds(200, 80, 730, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panelBody.add(btnFind);
        btnFind.setBounds(950, 70, 151, 50);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtName);
        txtName.setBounds(200, 150, 900, 40);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("名字：");
        panelBody.add(jLabel1);
        jLabel1.setBounds(110, 150, 70, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("性别：");
        panelBody.add(jLabel2);
        jLabel2.setBounds(110, 220, 145, 40);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtGender);
        txtGender.setBounds(200, 220, 380, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("年龄：");
        panelBody.add(jLabel3);
        jLabel3.setBounds(610, 220, 60, 40);

        txtAge.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtAge);
        txtAge.setBounds(690, 220, 410, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("电话：");
        panelBody.add(jLabel5);
        jLabel5.setBounds(110, 300, 154, 40);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPhone);
        txtPhone.setBounds(200, 300, 900, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("地址：");
        panelBody.add(jLabel6);
        jLabel6.setBounds(110, 380, 154, 40);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        panelBody.add(jScrollPane2);
        jScrollPane2.setBounds(200, 380, 900, 150);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("创建时间：");
        panelBody.add(jLabel9);
        jLabel9.setBounds(90, 570, 100, 40);

        lblCreateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblCreateDateTime);
        lblCreateDateTime.setBounds(180, 570, 390, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("更新时间：");
        panelBody.add(jLabel8);
        jLabel8.setBounds(580, 570, 100, 40);

        lblLastUpdateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblLastUpdateDateTime);
        lblLastUpdateDateTime.setBounds(680, 570, 420, 40);

        btnAdd.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnAdd.setText("新增");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelBody.add(btnAdd);
        btnAdd.setBounds(980, 670, 126, 51);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(90, 680, 126, 50);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBody.add(btnPrint);
        btnPrint.setBounds(830, 670, 130, 50);

        getContentPane().add(panelBody);
        panelBody.setBounds(330, 100, 1200, 810);

        setBounds(0, 0, 1955, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            String name = txtName.getText();
            String gender = txtGender.getText();
            int age = Integer.parseInt(txtAge.getText());
            String IC = txtIC.getText();
            String phone = txtPhone.getText();
            String address = txtAddress.getText();
            HashMap<String,String> map = new HashMap<String,String>();
            
            if (name.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "名字没填！");
            } else if (gender.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "性别没填！");
            } else if (age <= 0 && age >= 100) {
                JOptionPane.showMessageDialog(rootPane, "年龄错误！");
            } else if (phone.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "电话号码没填！");
            } else if (address.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "地址没填！");
            } else {
                Patient patient = new Patient(IC, name, gender, age, phone, address,userid);
                map = patient.AddNewPatient();
                System.out.println(map.get("returnMessage"));
                if (map.get("returnMessage").equalsIgnoreCase("1")) {
                    JOptionPane.showMessageDialog(rootPane, "新增成功,你的ID是：" +map.get("ID"));
                    try {
                        System.out.println("DiseaseIC:"+DiseaseIC);
                        if (!DiseaseIC.equalsIgnoreCase("") && patient.getPatient(DiseaseIC,map.get("ID"),userid).getIC().equalsIgnoreCase(IC)) {
                            diseasepage = new NewPatientDisease1(user, map.get("ID"),
                                    DiseaseIC,
                                    patient.getPatient(DiseaseIC,map.get("ID"),userid).getName(),
                                    patient.getPatient(DiseaseIC,map.get("ID"),userid).getPhone());
                            diseasepage.setVisible(true);
                            this.dispose();
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(rootPane, "NewPatient.btnAddActionPerformed get error on line 246"+ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, map);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "年龄后面不可以有空格/年龄不可以放字母！");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "NewPatient.btnAddActionPerformed get error on line 255"+ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        if (IC.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "IC没填！");
        } else {
            Patient patient = new Patient();
            try {
                if (patient.getPatient(IC,"",userid).getIC().equalsIgnoreCase(IC)) {
                    txtName.setText(patient.getPatient(IC,"",userid).getName());
                    txtGender.setText(patient.getPatient(IC,"",userid).getGender());
                    txtAge.setText(String.valueOf(patient.getPatient(IC,"",userid).getAge()));
                    txtPhone.setText(patient.getPatient(IC,"",userid).getPhone());
                    txtAddress.setText(patient.getPatient(IC,"",userid).getAddress());
                    lblCreateDateTime.setText(patient.getPatient(IC,"",userid).getCreateDateTime());
                    lblLastUpdateDateTime.setText(patient.getPatient(IC,"",userid).getLastUpdateDateTime());
                    txtIC.setEnabled(false);
                    txtName.setEnabled(false);
                    txtGender.setEnabled(false);
                    txtAge.setEnabled(false);
                    txtPhone.setEnabled(false);
                    txtAddress.setEnabled(false);
                    btnAdd.setVisible(false);
                } else{
                    txtIC.setEnabled(false);
                    txtName.setEnabled(true);
                    txtGender.setEnabled(true);
                    txtAge.setEnabled(true);
                    txtPhone.setEnabled(true);
                    txtAddress.setEnabled(true);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "NewPatient.btnFindActionPerformed get error on line 292"+ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if (DiseaseIC.equalsIgnoreCase("")) {
            PatientDetailMenu main = new PatientDetailMenu(user);
            main.setVisible(true);
            this.dispose();
        } else {
            try {
                diseasepage = new NewPatientDisease1(user);
                diseasepage.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "NewPatient.btnBackActionPerformed get error on line 310"+ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String Name = txtName.getText();
        String Gender = txtGender.getText();
        String Age = txtAge.getText();
        String Phone = txtPhone.getText();
        String Address = txtAddress.getText();
        String Date = lblCreateDateTime.getText();
        
        String bodyContent = printPreview("",IC, Name, Gender, Age, Phone, Address, Date);
        PrintForm main = new PrintForm(user,3,bodyContent,DiseaseIC);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrintActionPerformed

    public String printPreview(String ID, String IC, String Name, String Gender, String Age, String Phone, String Address, String Date)
    {
        PrintTemplate print = new PrintTemplate();
        return print.printPatient(ID, IC, Name, Gender, Age, Phone, Address, Date);
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addsmall.png"));
        btnAdd.setIcon(iconAdd);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFind.setIcon(iconFind);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/addmedium.png"));
        headerAdd.setIcon(iconHeader);
        this.lblName.setText(userid);
        setResizable(false);
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
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel headerAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCreateDateTime;
    private javax.swing.JLabel lblLastUpdateDateTime;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
