/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javaClass.Patient;
import javaClass.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaClass.PrintTemplate;
import javax.swing.ImageIcon;
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
    private String userid = "";
    
    public ModifyPatient() {
        initComponents();
    }

    //option 2 from printform
    //option 1 back to disease menu
    //option 1 back to search patient
    public ModifyPatient(User user, int option) {
        initComponents();
        this.user = user;
        this.option = option;
        userid = user.getUserid();
        setResizable(false);
        image();
    }
    
    public ModifyPatient(User user, int option, String ID, String IC, String Name, String Gender, 
            String Age, String Phone, String Address, String createDateTime, String lastUpdateDateTime){
        initComponents();
        this.user = user;
        this.IC = IC;
        this.Name = Name;
        this.Gender = Gender;
        this.Age= Age;
        this.Phone = Phone;
        this.Address = Address;
        this.createDateTime = createDateTime;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.option = option;
        userid = user.getUserid();
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtGender.setText(Gender);
        txtAge.setText(Age);
        txtPhone.setText(Phone);
        txtAddress.setText(Address);
        lblCreateDateTime.setText(createDateTime);
        lblLastUpdateDateTime.setText(lastUpdateDateTime);
        btnFind.setEnabled(false);
        txtID.setEnabled(false);
        setResizable(false);
        image();
    }        
            
    public ModifyPatient(User user,String ID,String IC,String Name,String Gender,String Age,
            String Phone,String Address,String createDateTime,String lastUpdateDateTime,int option){
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
        userid = user.getUserid();
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtGender.setText(Gender);
        txtAge.setText(Age);
        txtPhone.setText(Phone);
        txtAddress.setText(Address);
        lblCreateDateTime.setText(createDateTime);
        lblLastUpdateDateTime.setText(lastUpdateDateTime);
        btnFind.setEnabled(false);
        txtID.setEnabled(false);
        setResizable(false);
        image();
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
        userid = user.getUserid();
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
        image();
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
        userid = user.getUserid();
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
        image();
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
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtIC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        lblCreateDateTime = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblLastUpdateDateTime = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
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
        lblName.setBounds(1733, 5, 160, 60);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel7.setText("更改病人资料");
        panelHeader.add(jLabel7);
        jLabel7.setBounds(874, 5, 260, 60);

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

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("ID:");
        panelBody.add(jLabel8);
        jLabel8.setBounds(160, 30, 25, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        panelBody.add(txtID);
        txtID.setBounds(210, 30, 1470, 40);

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
        panelBody.add(txtIC);
        txtIC.setBounds(210, 90, 1470, 40);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        panelBody.add(jLabel1);
        jLabel1.setBounds(160, 90, 27, 40);
        panelBody.add(jSeparator1);
        jSeparator1.setBounds(80, 220, 1600, 20);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("姓名：");
        panelBody.add(jLabel2);
        jLabel2.setBounds(150, 240, 60, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panelBody.add(txtName);
        txtName.setBounds(210, 240, 1470, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("性别：");
        panelBody.add(jLabel3);
        jLabel3.setBounds(150, 300, 57, 40);

        txtGender.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtGender);
        txtGender.setBounds(210, 300, 1470, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("年龄：");
        panelBody.add(jLabel4);
        jLabel4.setBounds(150, 360, 70, 40);

        txtAge.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtAge);
        txtAge.setBounds(210, 360, 1470, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("电话号码：");
        panelBody.add(jLabel5);
        jLabel5.setBounds(110, 420, 110, 40);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPhone);
        txtPhone.setBounds(210, 420, 1470, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("地址：");
        panelBody.add(jLabel6);
        jLabel6.setBounds(140, 480, 60, 30);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        panelBody.add(jScrollPane1);
        jScrollPane1.setBounds(210, 480, 1470, 136);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("创造时间:");
        panelBody.add(jLabel9);
        jLabel9.setBounds(110, 630, 90, 40);

        lblCreateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblCreateDateTime);
        lblCreateDateTime.setBounds(210, 630, 710, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("更新时间：");
        panelBody.add(jLabel10);
        jLabel10.setBounds(110, 690, 100, 40);

        lblLastUpdateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblLastUpdateDateTime);
        lblLastUpdateDateTime.setBounds(210, 690, 710, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(120, 750, 110, 50);

        btnUpdate.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnUpdate.setText("更新");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelBody.add(btnUpdate);
        btnUpdate.setBounds(1440, 750, 110, 50);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelBody.add(btnDelete);
        btnDelete.setBounds(1570, 750, 110, 50);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panelBody.add(btnFind);
        btnFind.setBounds(1570, 150, 110, 50);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBody.add(btnPrint);
        btnPrint.setBounds(1310, 750, 110, 50);

        getContentPane().add(panelBody);
        panelBody.setBounds(70, 90, 1780, 820);

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
                    if(patient.getPatient(IC,ID,userid).getIC().equalsIgnoreCase(IC) || patient.getPatient(IC,ID,userid).getID().equalsIgnoreCase(ID))
                    {
                        txtIC.setText(patient.getPatient(IC, ID,userid).getIC());
                        txtID.setText(patient.getPatient(IC, ID,userid).getID());
                        txtName.setText(patient.getPatient(IC,ID,userid).getName());
                        txtGender.setText(patient.getPatient(IC,ID,userid).getGender());
                        txtAge.setText(String.valueOf(patient.getPatient(IC, ID,userid).getAge()));
                        txtPhone.setText(patient.getPatient(IC,ID,userid).getPhone());
                        txtAddress.setText(patient.getPatient(IC,ID,userid).getAddress());
                        lblCreateDateTime.setText(patient.getPatient(IC,ID,userid).getCreateDateTime());
                        lblLastUpdateDateTime.setText(patient.getPatient(IC,ID,userid).getLastUpdateDateTime());
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
            
            Patient patient = new Patient(IC,name,gender,age,phone,address,ID,userid);
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
            Patient patient = new Patient(IC,userid);
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
        else if(option == 8) //back to searchdiseasepatient
        {
            try {
                SearchDiseasePatient patient = new SearchDiseasePatient(user);
                patient.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String Name = txtName.getText();
        String Gender = txtGender.getText();
        String Age = txtAge.getText();
        String Phone = txtPhone.getText();
        String Address = txtAddress.getText();
        String Date = lblCreateDateTime.getText();
        String updateDate = lblLastUpdateDateTime.getText();
        String bodyContent = printPreview(ID,IC, Name, Gender, Age, Phone, Address, Date);
        PrintForm main = new PrintForm(user,1,bodyContent,IC, Name, Gender, Age, Phone, Address, Date, ID, updateDate);
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
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFind.setIcon(iconFind);
        ImageIcon iconDelete = new ImageIcon(getClass().getResource("/menu/smallDelete.png"));
        btnDelete.setIcon(iconDelete);
        ImageIcon iconUpdate = new ImageIcon(getClass().getResource("/menu/smallUpdate.png"));
        btnUpdate.setIcon(iconUpdate);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/editmedium.png"));
        jLabel7.setIcon(iconModify);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
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
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCreateDateTime;
    private javax.swing.JLabel lblLastUpdateDateTime;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
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
