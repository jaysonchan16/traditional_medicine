/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javaClass.User;
import javaClass.Disease;
import java.awt.Font;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javaClass.Excel;
import javaClass.Patient;
import javaClass.PrintTemplate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sheng
 */
public class ModifyDisease extends javax.swing.JFrame {

    /**
     * Creates new form ModifyDisease
     */
    private User user;
    List<Disease> disease;
    DefaultTableModel model;
    private String ID;
    private String IC;
    private String Name;
    private String Phone;
    private String DiseaseID;
    private String Symptom;
    private String Category;
    private String PulseCondition;
    private String TongueQuality;
    private String TongueCoating;
    private String PeeShit;
    private String History;
    private String Temperature;
    private String BloodPressure;
    private String Date;
    private String from;
    private String to;
    private String initialIC;
    private String initialID;
    private int option = 0;        
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();
    private String userid="";
    
    public ModifyDisease() {
        initComponents();
    }
    
    public ModifyDisease(User user) throws SQLException {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        show_Disease();
        widthTable();
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        disabledTextBox();
        txtDiseaseID.setVisible(false);
        image();
        txtSymptom.setEnabled(false);
        txtCategory.setEnabled(false);
        txtPulse.setEnabled(false);
        txtTongueQuality.setEnabled(false);
        txtTongueCoating.setEnabled(false);
        txtShit.setEnabled(false);
        txtHistory.setEnabled(false);
        txtTemperature.setEnabled(false);
        txtBlood.setEnabled(false);
        btnDelete.setVisible(false);
    }
    
    public ModifyDisease(User user, String IC,String ID,String Name,String Phone,String Date, String symptom,String category,
            String pulse,String tongueQuality,String tongueCoating,String shit,String history,String temperature,String blood) throws SQLException {
        initComponents();
        this.user = user;
        this.IC = IC;
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Date = Date;
        this.Symptom = symptom;
        this.Category = category;
        this.PulseCondition = pulse;
        this.TongueQuality = tongueQuality;
        this.TongueCoating = tongueCoating;
        this.PeeShit = shit;
        this.History = history;
        this.Temperature = temperature;
        this.BloodPressure = blood;
        userid = user.getUserid();
        show_Disease();
        widthTable();
        txtIC.setText(IC);
        txtID.setText(ID);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtSymptom.setText(symptom);
        txtCategory.setText(category);
        txtPulse.setText(pulse);
        txtTongueQuality.setText(tongueQuality);
        txtTongueCoating.setText(tongueCoating);
        txtShit.setText(shit);
        txtHistory.setText(history);
        txtTemperature.setText(temperature);
        txtBlood.setText(blood);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        disabledTextBox();
        txtDiseaseID.setVisible(false);
        image();
        txtSymptom.setEnabled(true);
        txtCategory.setEnabled(true);
        txtPulse.setEnabled(true);
        txtTongueQuality.setEnabled(true);
        txtTongueCoating.setEnabled(true);
        txtShit.setEnabled(true);
        txtHistory.setEnabled(true);
        txtTemperature.setEnabled(true);
        txtBlood.setEnabled(true);
        txtIC.setEnabled(false);
        txtID.setEnabled(false);
        btnFindIC.setEnabled(false);
        btnFindID.setEnabled(false);
        btnDelete.setVisible(false);
    }
    
    public ModifyDisease(User user,String ID, String IC, String Name, String Phone,String DiseaseID, 
            String Symptom, String Category, String PulseCondition, String TongueQuality, String TongueCoating, 
            String PeeShit, String History, String Temperature, String BloodPressure, String from, String to, 
            String initialIC, String initialID, int option) throws SQLException {
        initComponents();
        this.user = user;
        this.ID = ID;
        this.IC = IC;
        this.Name = Name;
        this.Phone = Phone;
        this.DiseaseID = DiseaseID;
        this.Symptom = Symptom;
        this.Category = Category;
        this.PulseCondition = PulseCondition;
        this.TongueQuality = TongueQuality;
        this.TongueCoating = TongueCoating;
        this.PeeShit = PeeShit;
        this.History = History;
        this.Temperature = Temperature;
        this.BloodPressure = BloodPressure;
        this.from = from;
        this.to = to;
        this.initialIC = initialIC;
        this.initialID = initialID;
        this.option = option;
        userid = user.getUserid();
        show_Disease();
        widthTable();
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtIC.setEnabled(false);
        txtID.setEnabled(false);
        btnFindIC.setEnabled(false);
        btnFindID.setEnabled(false);
        txtIC.setText(IC);
        txtID.setText(ID);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtSymptom.setText(Symptom);
        txtCategory.setText(Category);
        txtPulse.setText(PulseCondition);
        txtTongueQuality.setText(TongueQuality);
        txtTongueCoating.setText(TongueCoating);
        txtShit.setText(PeeShit);
        txtDiseaseID.setText(DiseaseID);
        txtHistory.setText(History);
        txtTemperature.setText(Temperature);
        txtBlood.setText(BloodPressure);
        disabledTextBox();
        txtDiseaseID.setVisible(false);
        btnReset.setVisible(false);
        btnDelete.setVisible(false);
        image();
        /*tblDisease.setAutoResizeMode(tblDisease.AUTO_RESIZE_OFF);
        new JScrollPane(tblDisease, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        */
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtDiseaseID = new javax.swing.JTextField();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBlood = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongueCoating = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtShit = new javax.swing.JTextField();
        txtTongueQuality = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtSymptom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnFindIC = new javax.swing.JButton();
        btnFindID = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisease = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 252, 720, 0);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(280, 20, 0, 110);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(280, 20, 0, 120);

        txtDiseaseID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtDiseaseID);
        txtDiseaseID.setBounds(370, 70, 250, 20);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel15.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel15.setText("更改病症");
        panelHeader.add(jLabel15);
        jLabel15.setBounds(570, 0, 180, 70);

        jLabel17.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel17.setText("登入：");
        panelHeader.add(jLabel17);
        jLabel17.setBounds(1100, 0, 100, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1210, 0, 160, 70);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1380, 70);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.setLayout(null);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更新");
        btnModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        panelBody.add(btnModify);
        btnModify.setBounds(360, 460, 110, 40);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelBody.add(btnDelete);
        btnDelete.setBounds(600, 460, 110, 40);

        btnReset.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnReset.setText(" 重启");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelBody.add(btnReset);
        btnReset.setBounds(120, 460, 110, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(10, 460, 100, 40);

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel12.setText("体温：");
        panelBody.add(jLabel12);
        jLabel12.setBounds(40, 410, 60, 30);

        txtTemperature.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTemperature);
        txtTemperature.setBounds(100, 410, 220, 30);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel13.setText("血压：");
        panelBody.add(jLabel13);
        jLabel13.setBounds(330, 410, 60, 30);

        txtBlood.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtBlood);
        txtBlood.setBounds(380, 410, 310, 30);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("病史：");
        panelBody.add(jLabel11);
        jLabel11.setBounds(40, 370, 60, 30);

        txtHistory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtHistory);
        txtHistory.setBounds(100, 370, 590, 30);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("舌苔：");
        panelBody.add(jLabel9);
        jLabel9.setBounds(40, 330, 57, 30);

        txtTongueCoating.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTongueCoating);
        txtTongueCoating.setBounds(100, 330, 220, 30);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("大小便：");
        panelBody.add(jLabel10);
        jLabel10.setBounds(330, 330, 76, 30);

        txtShit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtShit);
        txtShit.setBounds(400, 330, 290, 30);

        txtTongueQuality.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTongueQuality);
        txtTongueQuality.setBounds(380, 290, 310, 30);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("舌质：");
        panelBody.add(jLabel8);
        jLabel8.setBounds(330, 290, 60, 30);

        txtPulse.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPulse);
        txtPulse.setBounds(100, 290, 220, 30);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("脉象：");
        panelBody.add(jLabel3);
        jLabel3.setBounds(40, 290, 60, 30);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("病症分类:");
        panelBody.add(jLabel6);
        jLabel6.setBounds(10, 250, 90, 30);

        txtCategory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtCategory);
        txtCategory.setBounds(100, 250, 590, 30);

        txtSymptom.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtSymptom);
        txtSymptom.setBounds(100, 210, 590, 30);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("主症：");
        panelBody.add(jLabel1);
        jLabel1.setBounds(40, 210, 60, 30);
        panelBody.add(jSeparator3);
        jSeparator3.setBounds(10, 200, 690, 2);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("电话号码：");
        panelBody.add(jLabel7);
        jLabel7.setBounds(10, 160, 100, 30);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPhone);
        txtPhone.setBounds(100, 160, 590, 30);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("名字：");
        panelBody.add(jLabel2);
        jLabel2.setBounds(50, 110, 70, 30);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtName);
        txtName.setBounds(100, 110, 590, 30);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("IC:");
        panelBody.add(jLabel5);
        jLabel5.setBounds(50, 20, 30, 30);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtIC);
        txtIC.setBounds(90, 20, 290, 30);

        btnFindIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindIC.setText("寻找");
        btnFindIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindICActionPerformed(evt);
            }
        });
        panelBody.add(btnFindIC);
        btnFindIC.setBounds(240, 60, 140, 40);

        btnFindID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindID.setText("寻找");
        btnFindID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });
        panelBody.add(btnFindID);
        btnFindID.setBounds(520, 60, 140, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtID);
        txtID.setBounds(420, 20, 270, 30);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("ID:");
        panelBody.add(jLabel4);
        jLabel4.setBounds(390, 20, 25, 30);

        tblDisease.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病人ID", "IC", "名字", "电话号码", "主症", "病症分类", "脉象", "舌质", "舌苔", "大小便", "病史", "体温", "血压", "创建时间", "更新时间", "病症ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisease.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDisease.setRowHeight(25);
        tblDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiseaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisease);

        jScrollPane3.setViewportView(jScrollPane1);

        panelBody.add(jScrollPane3);
        jScrollPane3.setBounds(720, 10, 560, 490);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBody.add(btnPrint);
        btnPrint.setBounds(240, 460, 110, 40);

        btnExcel.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnExcel.setText("Excel");
        btnExcel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        panelBody.add(btnExcel);
        btnExcel.setBounds(480, 460, 110, 40);

        jPanel2.add(panelBody);
        panelBody.setBounds(40, 90, 1300, 540);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("CopyRight © Heng Seng Tong");
        jPanel6.add(jLabel14);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 650, 1370, 50);

        jScrollPane2.setViewportView(jPanel2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 1370, 700);

        setBounds(0, 0, 1385, 745);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindICActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindICActionPerformed

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindIDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(option == 5)
        {
            try {
                ViewDiseaseDetail detail = new ViewDiseaseDetail(user,from,to,initialIC,initialID);
                detail.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if(option == 8) //back to searchdiseasepatient
        {
            try {
                SearchDiseasePatient menu = new SearchDiseasePatient(user);
                menu.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            DiseaseMenu menu = new DiseaseMenu(user);
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if(validateTextBox())
        {
            try {
                Disease disease = new Disease(txtSymptom.getText(),Integer.parseInt(txtTemperature.getText()),txtBlood.getText(),
                        txtPulse.getText(),txtTongueQuality.getText(),txtTongueCoating.getText(),txtShit.getText(),txtCategory.getText(),
                        txtHistory.getText(),txtID.getText(),txtDiseaseID.getText(),userid);
                String result = disease.EditDisease();
                if(result.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更改成功！");
                    model.setRowCount(0);
                    show_Disease();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "ModifyDisease.btnModifyActionPerformed get error on line 394, "+ ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtIC.setText("");
        txtID.setText("");
        txtSymptom.setText("");
        txtCategory.setText("");
        txtPulse.setText("");
        txtTongueQuality.setText("");
        txtTongueCoating.setText("");
        txtShit.setText("");
        txtHistory.setText("");
        txtTemperature.setText("");
        txtBlood.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtDiseaseID.setText("");
        txtIC.setEnabled(true);
        txtID.setEnabled(true);
        btnFindIC.setEnabled(true);
        btnFindID.setEnabled(true);
        txtSymptom.setEnabled(false);
        txtCategory.setEnabled(false);
        txtPulse.setEnabled(false);
        txtTongueQuality.setEnabled(false);
        txtTongueCoating.setEnabled(false);
        txtShit.setEnabled(false);
        txtHistory.setEnabled(false);
        txtTemperature.setEnabled(false);
        txtBlood.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            Disease disease = new Disease(txtDiseaseID.getText(),userid);
            String result = disease.DeleteDisease();
            if(result.equalsIgnoreCase("1"))
            {
                JOptionPane.showMessageDialog(rootPane, "删除成功！");
                model.setRowCount(0);
                show_Disease();
                txtIC.setText("");
                txtID.setText("");
                txtName.setText("");
                txtPhone.setText("");
                txtSymptom.setText("");
                txtCategory.setText("");
                txtPulse.setText("");
                txtTongueQuality.setText("");
                txtTongueCoating.setText("");
                txtShit.setText("");
                txtHistory.setText("");
                txtTemperature.setText("");
                txtBlood.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyDisease.btnDeleteActionPerformed get error on line 433, "+ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiseaseMouseClicked
        // TODO add your handling code here:
        int index = tblDisease.getSelectedRow();
        TableModel model = tblDisease.getModel();
        String patientID = model.getValueAt(index, 0).toString();
        String IC = model.getValueAt(index,1).toString();
        String Name = model.getValueAt(index,2).toString(); //property
        String Phone = model.getValueAt(index,3).toString();//appliance
        String Symptom = model.getValueAt(index,4).toString();//appliance
        String Category = model.getValueAt(index,5).toString();
        String PulseCondition = model.getValueAt(index,6).toString();
        String TongueQuality = model.getValueAt(index,7).toString();
        String TongueCoating = model.getValueAt(index,8).toString();
        String Shit = model.getValueAt(index,9).toString();
        String History = model.getValueAt(index,10).toString();
        String Temperature = model.getValueAt(index,11).toString();
        String BloodPressure = model.getValueAt(index,12).toString();
        String DiseaseID = model.getValueAt(index, 15).toString();
        
        txtDiseaseID.setText(DiseaseID);
        txtID.setText(patientID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtSymptom.setText(Symptom);
        txtCategory.setText(Category);
        txtPulse.setText(PulseCondition);
        txtTongueQuality.setText(TongueQuality);
        txtTongueCoating.setText(TongueCoating);
        txtHistory.setText(History);
        txtTemperature.setText(Temperature);
        txtBlood.setText(BloodPressure);
        txtShit.setText(Shit);
        txtIC.setEnabled(false);
        txtID.setEnabled(false);
        btnFindIC.setEnabled(false);
        btnFindID.setEnabled(false);
        
        disabledTextBox();
    }//GEN-LAST:event_tblDiseaseMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String Name = txtName.getText();
        String Phone = txtPhone.getText();
        String Date = dtf.format(localDate);
        String symptom = txtSymptom.getText();
        String category = txtCategory.getText();
        String pulse = txtPulse.getText();
        String tongueQuality = txtTongueQuality.getText();
        String tongueCoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String history = txtHistory.getText();
        String temperature = txtTemperature.getText();  
        String blood = txtBlood.getText();
        
        String bodyContent = printPreview(IC,ID,Name,Phone,Date,symptom,category,pulse,tongueQuality,tongueCoating,shit,history, temperature, blood);
        PrintForm main = new PrintForm(user,7,bodyContent,IC,ID,Name,Phone,Date,symptom,category,pulse,tongueQuality,tongueCoating,shit,history, temperature, blood);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        Excel exc = new Excel();
        int result = 0;
        result = exc.countModel(model, "ModifyDisease");
        if(result == 1)
        {
            JOptionPane.showMessageDialog(rootPane, "转换成功Excel名字叫ModifyDisease.xlsx");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "确保你删掉旧的ModifyDisease.xlsx才来转换");
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    public void Find()
    {
        String IC = txtIC.getText();
        String ID = txtID.getText();
        Patient patient = new Patient();
        Disease disease = new Disease();
        try {
            if(patient.validatePatient(IC,userid) != 0 || patient.validatePatientID(ID, userid) !=0)
            {
                if(disease.getPatient(IC,ID,userid).getIC().equalsIgnoreCase(IC) || disease.getPatient(IC,ID,userid).getID().equalsIgnoreCase(ID))
                {   
                    String ICdata = disease.getPatient(IC,ID,userid).getIC();
                    String IDdata = disease.getPatient(IC,ID,userid).getID();
                    txtName.setText(disease.getPatient(IC,ID,userid).getName());
                    txtPhone.setText(disease.getPatient(IC,ID,userid).getPhone());
                    txtID.setText(IDdata);
                    txtIC.setText(ICdata);
                    String diseaseID = disease.getDisease(ICdata,userid).getDiseaseID();
                    /*String symptom = disease.getDisease(ICdata,userid).getSymptom();
                    String category = disease.getDisease(ICdata,userid).getCategory();
                    String pulse =  disease.getDisease(ICdata,userid).getPulseCondition();
                    String tonguequality = disease.getDisease(ICdata,userid).getTongueQuality();
                    String tonguecoating = disease.getDisease(ICdata,userid).getTongueCoating();
                    String history = disease.getDisease(ICdata,userid).getHistory();
                    int temperature = disease.getDisease(ICdata,userid).getTemperature();
                    String blood = disease.getDisease(ICdata,userid).getBloodPressure();
                    String peeshit = disease.getDisease(ICdata,userid).getPeeShit();*/
                    if(diseaseID.equalsIgnoreCase("") || diseaseID.contains(""))
                    {
                        txtSymptom.setEnabled(false);
                        txtCategory.setEnabled(false);
                        txtPulse.setEnabled(false);
                        txtTongueQuality.setEnabled(false);
                        txtTongueCoating.setEnabled(false);
                        txtShit.setEnabled(false);
                        txtHistory.setEnabled(false);
                        txtTemperature.setEnabled(false);
                        txtBlood.setEnabled(false);
                        txtIC.setEnabled(true);
                        txtID.setEnabled(true);
                        btnFindIC.setEnabled(true);
                        btnFindID.setEnabled(true);
                        JOptionPane.showMessageDialog(rootPane, "寻找不到病人病症资料");
                    }
                    else
                    {
                        txtDiseaseID.setText(disease.getDisease(ICdata,userid).getDiseaseID());
                        txtSymptom.setText(disease.getDisease(ICdata,userid).getSymptom());
                        txtCategory.setText(disease.getDisease(ICdata,userid).getCategory());
                        txtPulse.setText(disease.getDisease(ICdata,userid).getPulseCondition());
                        txtTongueQuality.setText(disease.getDisease(ICdata,userid).getTongueQuality());
                        txtTongueCoating.setText(disease.getDisease(ICdata,userid).getTongueCoating());
                        txtHistory.setText(disease.getDisease(ICdata,userid).getHistory());
                        txtTemperature.setText(String.valueOf(disease.getDisease(ICdata,userid).getTemperature()));
                        txtBlood.setText(disease.getDisease(ICdata,userid).getBloodPressure());
                        txtShit.setText(disease.getDisease(ICdata,userid).getPeeShit());
                        txtIC.setEnabled(false);
                        txtID.setEnabled(false);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                    /*NewPatient detail = new NewPatient(user,IC,3);
                    detail.setVisible(true);
                    this.dispose();*/
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                /*NewPatient detail = new NewPatient(user,IC,3);
                detail.setVisible(true);
                this.dispose();*/
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyDisease.Find() get error on line 503, " +ex.getMessage());
        }
    }
    
    
    public void show_Disease() throws SQLException
    {
        Disease disease = new Disease();
        List<Disease> diseaseList = new ArrayList<Disease>();
        Object row[] = new Object[16];
        model = (DefaultTableModel)tblDisease.getModel();
        
        if(option == 0)
        {
            diseaseList = disease.getDiseases(userid);
            for(int i =0; i<diseaseList.size(); i++)
            {
                row[0] = diseaseList.get(i).getPatientID();
                //row[1] = diseaseList.get(i).getDiseaseID();
                row[1] = diseaseList.get(i).getIC();
                row[2] = diseaseList.get(i).getName();
                row[3] = diseaseList.get(i).getPhone();
                row[4] = diseaseList.get(i).getSymptom();
                row[5] = diseaseList.get(i).getCategory();
                row[6] = diseaseList.get(i).getPulseCondition();
                row[7] = diseaseList.get(i).getTongueQuality();
                row[8] = diseaseList.get(i).getTongueCoating();
                row[9] = diseaseList.get(i).getPeeShit();
                row[10] = diseaseList.get(i).getHistory();
                row[11] = diseaseList.get(i).getTemperature();
                row[12] = diseaseList.get(i).getBloodPressure();
                row[13] = diseaseList.get(i).getCreateDateTime();
                row[14] = diseaseList.get(i).getLastUpdateDateTime();
                row[15] = diseaseList.get(i).getDiseaseID();
                model.addRow(row);
            }
        }
        else
        {
            diseaseList = disease.getDiseaseIDPatients(DiseaseID,userid);
            for(int i =0; i<diseaseList.size(); i++)
            {
                row[0] = diseaseList.get(0).getPatientID();
                //row[1] = diseaseList.get(i).getDiseaseID();
                row[1] = IC;
                row[2] = Name;
                row[3] = Phone;
                row[4] = diseaseList.get(i).getSymptom();
                row[5] = diseaseList.get(i).getCategory();
                row[6] = diseaseList.get(i).getPulseCondition();
                row[7] = diseaseList.get(i).getTongueQuality();
                row[8] = diseaseList.get(i).getTongueCoating();
                row[9] = diseaseList.get(i).getPeeShit();
                row[10] = diseaseList.get(i).getHistory();
                row[11] = diseaseList.get(i).getTemperature();
                row[12] = diseaseList.get(i).getBloodPressure();
                row[13] = diseaseList.get(i).getCreateDateTime();
                row[14] = diseaseList.get(i).getLastUpdateDateTime();
                row[15] = diseaseList.get(i).getDiseaseID();
                model.addRow(row);
            }
        }
    }
    
    public void disabledTextBox()
    {
        txtSymptom.setEnabled(true);
        txtCategory.setEnabled(true);
        txtPulse.setEnabled(true);
        txtTongueQuality.setEnabled(true);
        txtTongueCoating.setEnabled(true);
        txtShit.setEnabled(true);
        txtHistory.setEnabled(true);
        txtTemperature.setEnabled(true);
        txtBlood.setEnabled(true);
        
    }
    
    public boolean validateTextBox()
    {
        boolean result = false;
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String symptom = txtSymptom.getText();
        String category = txtCategory.getText();
        String pulse = txtPulse.getText();
        String tonguequality = txtTongueQuality.getText();
        String tonguecoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String history = txtHistory.getText();
        int temperature = Integer.parseInt(txtTemperature.getText());
        String blood = txtBlood.getText();
        
        if(IC.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "IC没填！");
        } else if(ID.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "ID没填！");
        } else if (symptom.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "主症没填！");
        } else if (temperature <= 0 && temperature >= 100) {
            JOptionPane.showMessageDialog(rootPane, "体温错误！");
        } else if (blood.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "血压没填！");
        } else if (pulse.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "脉象没填！");
        } else if (tonguequality.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "舌质没填！");
        } else if (tonguecoating.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "舌苔没填！");
        } else if (shit.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "大小便没填！");
        } else if (category.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "病症归类没填！");
        } else if (history.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "病史没填！");
        } else {
            result = true;
        }
        return result;
    }
    
    public void widthTable()
    {
        this.lblName.setText(userid);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JTableHeader tableHeader = tblDisease.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        tblDisease.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //new JScrollPane(tblMedicine, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        TableColumnModel columnModel = tblDisease.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(160);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(100);
        columnModel.getColumn(10).setPreferredWidth(100);
        columnModel.getColumn(11).setPreferredWidth(100);
        columnModel.getColumn(12).setPreferredWidth(100);
        columnModel.getColumn(13).setPreferredWidth(200);
        columnModel.getColumn(14).setPreferredWidth(200);
        columnModel.getColumn(15).setPreferredWidth(200);
        columnModel.getColumn(15).setMinWidth(0);
        columnModel.getColumn(15).setMaxWidth(0);
    }
    
    public void image()
    {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFindIC.setIcon(iconFind);
        btnFindID.setIcon(iconFind);
        ImageIcon iconReset = new ImageIcon(getClass().getResource("/menu/smallReset.png"));
        btnReset.setIcon(iconReset);
        ImageIcon iconDelete = new ImageIcon(getClass().getResource("/menu/smallDelete.png"));
        btnDelete.setIcon(iconDelete);
        ImageIcon iconUpdate = new ImageIcon(getClass().getResource("/menu/smallUpdate.png"));
        btnModify.setIcon(iconUpdate);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/editmedium.png"));
        jLabel15.setIcon(iconModify);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconExcel = new ImageIcon(getClass().getResource("/menu/smallExcel.png"));
        btnExcel.setIcon(iconExcel);
        //setResizable(false);
    }
    
    public String printPreview(String IC, String ID, String Name, String Phone, String Date,String symptom, String category, String pulse,
                             String tongueQuality, String tongueCoating, String shit, String history, String temperature, 
                             String blood)
    {
        PrintTemplate print = new PrintTemplate();
        return print.printDisease(IC, ID, Name, Phone, Date, symptom, category, pulse, tongueQuality, tongueCoating, shit, history, temperature, blood);
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
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyDisease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFindIC;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblDisease;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDiseaseID;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtShit;
    private javax.swing.JTextField txtSymptom;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTongueCoating;
    private javax.swing.JTextField txtTongueQuality;
    // End of variables declaration//GEN-END:variables
}
