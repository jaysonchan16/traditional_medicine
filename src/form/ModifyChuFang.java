/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javaClass.Code;
import javaClass.GrassMedicinePill;
import javaClass.GrassMedicinePotion;
import javaClass.Prescription;
import javaClass.PrintTemplate;
import javaClass.TraditionalMedicinePill;
import javaClass.TraditionalMedicinePotion;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Sheng
 */
public class ModifyChuFang extends javax.swing.JFrame {

    /**
     * Creates new form ModifyChuFang1
     */
    private User user;
    DefaultTableModel model;
    public String price;
    public int updatedelete = 0;
    private String ID;
    private String IC;
    private String Name;
    private String Phone;
    private String PrescriptionID;
    private String Chufang;
    private String CategoryTable;
    private String NameTable;
    private String Jiliang;
    private String Price;
    private String TotalPrice;
    private String DiseaseID;
    private String from="";
    private String to="";
    private String initialIC="";
    private String initialID="";
    private String Reference;
    private String initialweight;
    private String latest;
    private String bill;
    private int option = 0;
    private String userid = "";
    private int firstReferenceGrassMedicinePill = 0;
    private int firstReferenceGrassMedicinePotion = 0;
    private int firstReferenceTraditionalMedicinePill = 0;
    private int firstReferenceTraditionalMedicinePotion = 0;
    
    public ModifyChuFang() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        createColumns();
    }
    public ModifyChuFang(User user) throws SQLException {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        this.user = user;
        userid = user.getUserid();
        textboxShow();
        createColumns();
        //medicineCategory();
        //FindByMedicineName2(String.valueOf(comboMedicineNameGrassPill.getSelectedItem()));
        show_table();
        widthTable();
        image();
        comboReference(comboBoxMedicine.getSelectedItem().toString());
        medicineName(comboBoxMedicine.getSelectedItem().toString(), comboBoxReferenceTraditionalPotion.getSelectedItem().toString());
        txtDisease.setVisible(false);
        lblJiliang.setVisible(false);
        txtRemaining.setVisible(false);
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
        btnFindMedic.setVisible(false);
    }
    
    public ModifyChuFang(User user, String ID, String IC, String Name, String Phone, String PrescriptionID, String Chufang,
            String CategoryTable, String Reference, String NameTable, String Jiliang, String Price, String TotalPrice, String initialweight, 
            String latest, String bill, String DiseaseID, String from, String to,
            String initialIC, String initialID, int option) throws SQLException
    {
        initComponents();
        this.user = user;
        this.ID = ID;
        this.IC = IC;
        this.Name = Name;
        this.Phone = Phone;
        this.PrescriptionID = PrescriptionID;
        this.Chufang = Chufang;
        this.CategoryTable = CategoryTable;
        this.NameTable = NameTable;
        this.Jiliang = Jiliang;
        this.Price = Price;
        this.TotalPrice = TotalPrice;
        this.DiseaseID = DiseaseID;
        this.latest = latest;
        this.bill = bill;
        this.Reference = Reference;
        this.initialweight = initialweight;
        this.from = from;
        this.to = to;
        this.initialIC = initialIC;
        this.initialID = initialID;
        this.option = option;
        userid = user.getUserid();
        createColumns();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        //medicineCategory();
        //FindByMedicineName2(String.valueOf(comboMedicineNameGrassPill.getSelectedItem()));
        txtPrice.setText("");
        show_table();
        widthTable();
        txtPrescriptionID.setVisible(false);
        btnReset.setVisible(false);
        image();
        txtDisease.setVisible(false);
        txtPrescriptionID.setText(PrescriptionID);
        txtIC.setText(IC);
        txtIC.setEnabled(false);
        txtID.setText(ID);
        txtID.setEnabled(false);
        txtName.setText(Name);
        txtName.setEnabled(false);
        txtPhone.setText(Phone);
        txtPhone.setEnabled(false);
        btnFindIC.setEnabled(false);
        btnFindID.setEnabled(false);
        txtChufang.setText(Chufang);
        comboBoxMedicine.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        txtMedicine.setText(CategoryTable);
        txtMedicineName.setText(NameTable);
        txtJiliang.setText(Jiliang);
        txtPrice.setText(Price);
        txtTotalPrice.setText(TotalPrice);
        txtDisease.setText(DiseaseID);
        txtReference.setText(Reference);
        comboReference(comboBoxMedicine.getSelectedItem().toString());
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
        lblJiliang.setVisible(false);
        txtRemaining.setVisible(false);
        btnFindMedic.setVisible(false);
        medicineName(comboBoxMedicine.getSelectedItem().toString(), comboBoxReferenceTraditionalPotion.getSelectedItem().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChufang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnFindIC = new javax.swing.JButton();
        btnFindID = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtChufang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtTotalPrice = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        btnModifyMedicine = new javax.swing.JButton();
        txtJiliang = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        spinnerJiLiang = new javax.swing.JSpinner();
        txtDisease = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtReference = new javax.swing.JTextField();
        txtRemaining = new javax.swing.JTextField();
        lblJiliang = new javax.swing.JLabel();
        btnFindMedic = new javax.swing.JButton();
        txtMedicineID = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        comboBoxNameTraditionalPotion = new javax.swing.JComboBox<>();
        comboBoxNameTraditionalPill = new javax.swing.JComboBox<>();
        comboMedicineNameGrassPotion = new javax.swing.JComboBox<>();
        comboMedicineNameGrassPill = new javax.swing.JComboBox<>();
        comboReferenceGrassPill = new javax.swing.JComboBox<>();
        comboReferenceGrassPotion = new javax.swing.JComboBox<>();
        comboBoxReferenceTraditionalPill = new javax.swing.JComboBox<>();
        comboBoxReferenceTraditionalPotion = new javax.swing.JComboBox<>();
        comboBoxMedicine = new javax.swing.JComboBox<>();
        txtPrescriptionID = new javax.swing.JTextField();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        tblChufang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblChufang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病人ID", "病人IC", "名字", "电话号码", "处方", "药物分类", "参考病症", "药物名称", "剂量", "价格/G", "总价值", "创新时间 ", "更新时间", "主症", "病症分类", "脉象", "舌质", "舌苔", "大小便", "病史", "体温", "血压", "病症ID", "处方ID", "最新", "Bill", "initialweight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChufang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblChufang.setRowHeight(25);
        tblChufang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChufangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChufang);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(880, 30, 810, 760);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("IC：");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 40, 60, 40);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtIC);
        txtIC.setBounds(160, 40, 280, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtID);
        txtID.setBounds(500, 40, 250, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("ID:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(460, 40, 30, 40);

        btnFindIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindIC.setText("寻找");
        btnFindIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindICActionPerformed(evt);
            }
        });
        jPanel2.add(btnFindIC);
        btnFindIC.setBounds(340, 90, 100, 40);

        btnFindID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindID.setText("寻找");
        btnFindID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });
        jPanel2.add(btnFindID);
        btnFindID.setBounds(650, 90, 100, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtName);
        txtName.setBounds(160, 140, 590, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("姓名：");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(80, 140, 70, 40);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("电话号码：");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 200, 95, 40);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtPhone);
        txtPhone.setBounds(160, 200, 590, 40);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(30, 260, 730, 20);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("处方：");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(110, 280, 69, 40);

        txtChufang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtChufang);
        txtChufang.setBounds(160, 280, 590, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("药物分类：");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 340, 110, 40);

        txtMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtMedicine);
        txtMedicine.setBounds(330, 340, 420, 40);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更新");
        btnModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel2.add(btnModify);
        btnModify.setBounds(650, 750, 100, 40);

        btnReset.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnReset.setText("重启");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset);
        btnReset.setBounds(160, 750, 100, 40);

        txtTotalPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtTotalPrice);
        txtTotalPrice.setBounds(160, 640, 590, 40);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(520, 750, 100, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("总价值:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 640, 63, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("价格/G:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 580, 70, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("剂量：");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 520, 69, 40);

        txtMedicineName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtMedicineName);
        txtMedicineName.setBounds(620, 460, 130, 40);

        btnModifyMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModifyMedicine.setText("更改");
        btnModifyMedicine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModifyMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMedicineActionPerformed(evt);
            }
        });
        jPanel2.add(btnModifyMedicine);
        btnModifyMedicine.setBounds(280, 750, 100, 40);

        txtJiliang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtJiliang);
        txtJiliang.setBounds(240, 520, 510, 40);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrint);
        btnPrint.setBounds(400, 750, 100, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("药物名称：");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 460, 100, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtPrice);
        txtPrice.setBounds(160, 580, 590, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(40, 750, 100, 40);

        spinnerJiLiang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        spinnerJiLiang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerJiLiangStateChanged(evt);
            }
        });
        jPanel2.add(spinnerJiLiang);
        spinnerJiLiang.setBounds(160, 520, 80, 40);
        jPanel2.add(txtDisease);
        txtDisease.setBounds(520, 10, 90, 22);

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel12.setText("参考病症：");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(70, 400, 95, 40);

        txtReference.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtReference);
        txtReference.setBounds(620, 400, 130, 40);
        jPanel2.add(txtRemaining);
        txtRemaining.setBounds(160, 700, 590, 40);

        lblJiliang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblJiliang.setText("剩下剂量:");
        jPanel2.add(lblJiliang);
        lblJiliang.setBounds(60, 700, 90, 40);

        btnFindMedic.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindMedic.setText("寻找");
        btnFindMedic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindMedicActionPerformed(evt);
            }
        });
        jPanel2.add(btnFindMedic);
        btnFindMedic.setBounds(770, 460, 100, 40);
        jPanel2.add(txtMedicineID);
        txtMedicineID.setBounds(760, 280, 110, 40);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jPanel2.add(txtWeight);
        txtWeight.setBounds(790, 580, 70, 40);

        comboBoxNameTraditionalPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxNameTraditionalPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameTraditionalPotionActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxNameTraditionalPotion);
        comboBoxNameTraditionalPotion.setBounds(160, 460, 320, 40);

        comboBoxNameTraditionalPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxNameTraditionalPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameTraditionalPillActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxNameTraditionalPill);
        comboBoxNameTraditionalPill.setBounds(160, 460, 380, 40);

        comboMedicineNameGrassPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicineNameGrassPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineNameGrassPotionActionPerformed(evt);
            }
        });
        jPanel2.add(comboMedicineNameGrassPotion);
        comboMedicineNameGrassPotion.setBounds(160, 460, 430, 40);

        comboMedicineNameGrassPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicineNameGrassPill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboMedicineNameGrassPillMouseClicked(evt);
            }
        });
        comboMedicineNameGrassPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineNameGrassPillActionPerformed(evt);
            }
        });
        comboMedicineNameGrassPill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboMedicineNameGrassPillKeyPressed(evt);
            }
        });
        jPanel2.add(comboMedicineNameGrassPill);
        comboMedicineNameGrassPill.setBounds(160, 460, 460, 40);

        comboReferenceGrassPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboReferenceGrassPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReferenceGrassPillActionPerformed(evt);
            }
        });
        jPanel2.add(comboReferenceGrassPill);
        comboReferenceGrassPill.setBounds(160, 400, 320, 40);

        comboReferenceGrassPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboReferenceGrassPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReferenceGrassPotionActionPerformed(evt);
            }
        });
        jPanel2.add(comboReferenceGrassPotion);
        comboReferenceGrassPotion.setBounds(160, 400, 380, 40);

        comboBoxReferenceTraditionalPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxReferenceTraditionalPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxReferenceTraditionalPillActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxReferenceTraditionalPill);
        comboBoxReferenceTraditionalPill.setBounds(160, 400, 420, 40);

        comboBoxReferenceTraditionalPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxReferenceTraditionalPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxReferenceTraditionalPotionActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxReferenceTraditionalPotion);
        comboBoxReferenceTraditionalPotion.setBounds(160, 400, 460, 40);

        comboBoxMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "复方药粉", "药丸", "药水", "单味药粉" }));
        comboBoxMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMedicineActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxMedicine);
        comboBoxMedicine.setBounds(160, 340, 170, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 100, 1720, 820);

        txtPrescriptionID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPrescriptionID);
        txtPrescriptionID.setBounds(390, 120, 90, 20);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setText("更改处方");
        panelHeader.add(jLabel1);
        jLabel1.setBounds(953, 5, 160, 60);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1651, -1, 100, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1758, 5, 160, 60);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        setBounds(0, 0, 1958, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindICActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        if(IC.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane, "请输入IC");
        }
        else
        {
            Find();
        }
    }//GEN-LAST:event_btnFindICActionPerformed

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        if(ID.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(rootPane, "请输入ID");
        }
        else
        {
            Find();
        }
    }//GEN-LAST:event_btnFindIDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(option == 5)
        {
            try {
                ViewDiseaseDetail disease = new ViewDiseaseDetail(user,from,to,initialIC,initialID);
                disease.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if(option == 8)//back to searchdiseasepatient
        {
            try {
                SearchDiseasePatient patient = new SearchDiseasePatient(user);
                patient.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            DiseaseMenu disease = new DiseaseMenu(user);
            disease.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtMedicine.setEnabled(false);
        txtMedicineName.setEnabled(false);
        txtJiliang.setEnabled(false);
        txtMedicine.setVisible(true);
        txtMedicineName.setVisible(true);
        txtJiliang.setVisible(true);
        comboBoxMedicine.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        spinnerJiLiang.setVisible(false);
        txtPrescriptionID.setText("");
        txtID.setText("");
        txtIC.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtChufang.setText("");
        txtMedicine.setText("");
        txtMedicineName.setText("");
        txtJiliang.setText("");
        price = txtPrice.getText();
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
        txtPrice.setText("");
        txtTotalPrice.setText("");
        updatedelete = 0;
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnModifyMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMedicineActionPerformed
        try {
            // TODO add your handling code here:
            txtMedicine.setVisible(false);
            comboBoxMedicine.setVisible(true);
            txtMedicineName.setVisible(false);
            comboMedicineNameGrassPill.setVisible(true);
            txtJiliang.setVisible(false);
            txtReference.setVisible(false);
            spinnerJiLiang.setVisible(true);
            txtTotalPrice.setText("0.00");
            spinnerJiLiang.setValue(0);
            //FindByMedicineName2(String.valueOf(comboMedicineNameGrassPill.getSelectedItem()));
            updatedelete = 1;
            comboReference(comboBoxMedicine.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnModifyMedicineActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String diseaseID = txtDisease.getText();
        
        String bodyContent = printPreview(IC,ID,name,phone,diseaseID);
        PrintForm main = new PrintForm(user,7,bodyContent);
        main.setVisible(true);
        this.dispose();
        /*PrintForm print = new PrintForm(user,1);
        print.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if(updatedelete == 1)
        {
            update();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "你没有更改资料!");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void spinnerJiLiangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerJiLiangStateChanged
        // TODO add your handling code here:
        String jiliang = spinnerJiLiang.getValue().toString();
        float jiliang1 = Float.valueOf(jiliang);
        float totalprice = Float.valueOf(txtPrice.getText());
        float total = jiliang1 * totalprice;

        txtTotalPrice.setText(String.valueOf(total));
    }//GEN-LAST:event_spinnerJiLiangStateChanged

    private void tblChufangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChufangMouseClicked
        // TODO add your handling code here:
        txtMedicine.setEnabled(false);
        txtMedicineName.setEnabled(false);
        txtJiliang.setEnabled(false);
        txtMedicine.setVisible(true);
        txtReference.setVisible(true);
        txtMedicineName.setVisible(true);
        txtJiliang.setVisible(true);
        comboBoxMedicine.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        spinnerJiLiang.setVisible(false);
        txtID.setEnabled(true);
        txtIC.setEnabled(true);
        int index = tblChufang.getSelectedRow();
        TableModel model = tblChufang.getModel();
        String ID = model.getValueAt(index, 0).toString();
        String IC = model.getValueAt(index,1).toString();
        String Name = model.getValueAt(index,2).toString();
        String Phone = model.getValueAt(index,3).toString();
        String Chufang = model.getValueAt(index,4).toString();
        String medicine = model.getValueAt(index,5).toString();
        String reference = model.getValueAt(index,6).toString();
        String medicineName = model.getValueAt(index,7).toString();
        String Jiliang = model.getValueAt(index,8).toString();
        String price = model.getValueAt(index,9).toString();
        String totalprice = model.getValueAt(index,10).toString();
        String diseaseID = model.getValueAt(index,22).toString();
        String prescriptionID = model.getValueAt(index, 23).toString();
        
        txtID.setText(ID);
        txtIC.setText(IC);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtChufang.setText(Chufang);
        txtMedicine.setText(medicine);
        txtMedicineName.setText(medicineName);
        txtJiliang.setText(Jiliang);
        txtPrice.setText(price);
        txtTotalPrice.setText(totalprice);
        txtPrescriptionID.setText(prescriptionID);
        txtDisease.setText(diseaseID);
        txtReference.setText(reference);
        btnFindMedic.setVisible(true);
        updatedelete = 0;
    }//GEN-LAST:event_tblChufangMouseClicked

    private void btnFindMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindMedicActionPerformed
        btnDelete.setEnabled(true);
        spinnerJiLiang.setEnabled(true);
        btnFindMedic.setEnabled(false);
        MedicineContent();
    }//GEN-LAST:event_btnFindMedicActionPerformed

    private void comboBoxNameTraditionalPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameTraditionalPotionActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboBoxNameTraditionalPotionActionPerformed

    private void comboBoxNameTraditionalPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameTraditionalPillActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboBoxNameTraditionalPillActionPerformed

    private void comboMedicineNameGrassPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPotionActionPerformed
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPotionActionPerformed

    private void comboMedicineNameGrassPillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillMouseClicked
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillMouseClicked

    private void comboMedicineNameGrassPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillActionPerformed

    private void comboMedicineNameGrassPillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillKeyPressed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillKeyPressed

    private void comboReferenceGrassPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReferenceGrassPillActionPerformed
        try {
            medicineName(comboBoxMedicine.getSelectedItem().toString(), comboReferenceGrassPill.getSelectedItem().toString());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboReferenceGrassPillActionPerformed

    private void comboReferenceGrassPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReferenceGrassPotionActionPerformed
        // TODO add your handling code here:
        try {
            medicineName(comboBoxMedicine.getSelectedItem().toString(), comboReferenceGrassPotion.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboReferenceGrassPotionActionPerformed

    private void comboBoxReferenceTraditionalPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxReferenceTraditionalPillActionPerformed
        try {

            medicineName(comboBoxMedicine.getSelectedItem().toString(), comboBoxReferenceTraditionalPill.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxReferenceTraditionalPillActionPerformed

    private void comboBoxReferenceTraditionalPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxReferenceTraditionalPotionActionPerformed
        // TODO add your handling code here:
        try {
            medicineName(comboBoxMedicine.getSelectedItem().toString(), comboBoxReferenceTraditionalPotion.getSelectedItem().toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboBoxReferenceTraditionalPotionActionPerformed

    private void comboBoxMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMedicineActionPerformed
        try {
            
            String medicine = comboBoxMedicine.getSelectedItem().toString();
            System.out.print("comboMedicine"+medicine);
            comboReference(medicine);
            //getReferenceName(medicine);
            //medicineName(name);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.comboBoxMedicineActionPerformed get error on line 609,"+ex.getMessage());
        }
    }//GEN-LAST:event_comboBoxMedicineActionPerformed

    
    /**
     * @param args the command line arguments
     */
    
    private void createColumns()
    {
        model = (DefaultTableModel) tblChufang.getModel();
        /*model.addColumn("病人ID");
        model.addColumn("病人IC");
        model.addColumn("名字");
        model.addColumn("电话号码");
        model.addColumn("处方");
        model.addColumn("药物种类");
        model.addColumn("药物名称");
        model.addColumn("剂量");
        model.addColumn("价格/G");
        model.addColumn("总价值");
        model.addColumn("创新时间");
        model.addColumn("更新时间");
        model.addColumn("主症");
        model.addColumn("病症分类");
        model.addColumn("脉象");
        model.addColumn("舌质");
        model.addColumn("舌苔");
        model.addColumn("大小便");
        model.addColumn("病史");
        model.addColumn("体温");
        model.addColumn("血压");
        model.addColumn("病症ID");
        model.addColumn("处方ID");*/
    }
    
    public void show_table()
    {
        Prescription prescription = new Prescription();
        List<Prescription> prescriptionList = new ArrayList<Prescription>();
        try {
            //option 5 is from ViewDiseaseDetail
            //option 8 is from SearchDiseasePatient
            if(option == 10 || option == 5 || option == 8)
            {
                prescriptionList = prescription.getPrescriptionsID(PrescriptionID,userid);
                model = (DefaultTableModel)tblChufang.getModel();
                Object row[] = new Object[27];
                for(int i =0; i<prescriptionList.size(); i++)
                {
                    row[0] = prescriptionList.get(i).getPatientID();
                    row[1] = prescriptionList.get(i).getIC();
                    row[2] = prescriptionList.get(i).getName();
                    row[3] = prescriptionList.get(i).getPhone();
                    row[4] = prescriptionList.get(i).getChufang();
                    row[5] = prescriptionList.get(i).getCategorytable();
                    row[6] = prescriptionList.get(i).getReference();
                    row[7] = prescriptionList.get(i).getNametable();
                    row[8] = prescriptionList.get(i).getJiliang();
                    row[9] = prescriptionList.get(i).getPrice();
                    row[10] = prescriptionList.get(i).getTotalprice();
                    row[11] = prescriptionList.get(i).getCreateDateTime();
                    row[12] = prescriptionList.get(i).getLastUpdateDateTime();
                    row[13] = prescriptionList.get(i).getSymptom();
                    row[14] = prescriptionList.get(i).getCategory();
                    row[15] = prescriptionList.get(i).getPulseCondition();
                    row[16] = prescriptionList.get(i).getTongueQuality();
                    row[17] = prescriptionList.get(i).getTongueCoating();
                    row[18] = prescriptionList.get(i).getPeeShit();
                    row[19] = prescriptionList.get(i).getHistory();
                    row[20] = prescriptionList.get(i).getTemperature();
                    row[21] = prescriptionList.get(i).getBloodPressure();
                    row[22] = prescriptionList.get(i).getDiseaseID();
                    row[23] = prescriptionList.get(i).getPrescriptionID();
                    row[24] = prescriptionList.get(i).getLatest();
                    row[25] = prescriptionList.get(i).getBillno();
                    row[26] = prescriptionList.get(i).getInitialWeight();
                    model.addRow(row);
                }
            }
            else
            {
                prescriptionList = prescription.getPrescriptions(userid);
                model = (DefaultTableModel)tblChufang.getModel();
                Object row[] = new Object[27];
                for(int i =0; i<prescriptionList.size(); i++)
                {
                    row[0] = prescriptionList.get(i).getPatientID();
                    row[1] = prescriptionList.get(i).getIC();
                    row[2] = prescriptionList.get(i).getName();
                    row[3] = prescriptionList.get(i).getPhone();
                    row[4] = prescriptionList.get(i).getChufang();
                    row[5] = prescriptionList.get(i).getCategorytable();
                    row[6] = prescriptionList.get(i).getReference();
                    row[7] = prescriptionList.get(i).getNametable();
                    row[8] = prescriptionList.get(i).getJiliang();
                    row[9] = prescriptionList.get(i).getPrice();
                    row[10] = prescriptionList.get(i).getTotalprice();
                    row[11] = prescriptionList.get(i).getCreateDateTime();
                    row[12] = prescriptionList.get(i).getLastUpdateDateTime();
                    row[13] = prescriptionList.get(i).getSymptom();
                    row[14] = prescriptionList.get(i).getCategory();
                    row[15] = prescriptionList.get(i).getPulseCondition();
                    row[16] = prescriptionList.get(i).getTongueQuality();
                    row[17] = prescriptionList.get(i).getTongueCoating();
                    row[18] = prescriptionList.get(i).getPeeShit();
                    row[19] = prescriptionList.get(i).getHistory();
                    row[20] = prescriptionList.get(i).getTemperature();
                    row[21] = prescriptionList.get(i).getBloodPressure();
                    row[22] = prescriptionList.get(i).getDiseaseID();
                    row[23] = prescriptionList.get(i).getPrescriptionID();
                    row[24] = prescriptionList.get(i).getLatest();
                    row[25] = prescriptionList.get(i).getBillno();
                    row[26] = prescriptionList.get(i).getInitialWeight();
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.show_table get error on line 328,"+ex.getMessage());
        }
    }
    
    public void comboReference(String medicine) throws SQLException
    {
        //comboReferenceGrassPill.removeAllItems();
        String repeat = "";
        if(medicine.equalsIgnoreCase("药丸") && firstReferenceGrassMedicinePill == 0)
        {
            GrassMedicinePill grasspill = new GrassMedicinePill();

            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = grasspill.findReference(medicine, userid);

            for(int i =0; i<medicList.size(); i++)
            {
                if(repeat.equalsIgnoreCase("") || !repeat.equalsIgnoreCase(medicList.get(i).getReference()))
                {
                    comboReferenceGrassPill.addItem(medicList.get(i).getReference());
                    repeat = medicList.get(i).getReference();
                    //AutoCompleteDecorator.decorate(comboReference);
                }
            }
            firstReferenceGrassMedicinePill = 1;
            GrassPillReference();
            medicineName(medicine,medicList.get(0).getReference());
        }
        else if(medicine.equalsIgnoreCase("药水") && firstReferenceGrassMedicinePotion == 0)
        {
            GrassMedicinePotion grasspotion = new GrassMedicinePotion();

            List<GrassMedicinePotion> grassList = new ArrayList<GrassMedicinePotion>();
            grassList = grasspotion.findReference(medicine,userid);

            for(int i =0; i<grassList.size(); i++)
            {
                if(repeat.equalsIgnoreCase("") || !repeat.equalsIgnoreCase(grassList.get(i).getReference()))
                {
                    comboReferenceGrassPotion.addItem(grassList.get(i).getReference());
                    repeat = grassList.get(i).getReference();
                    //AutoCompleteDecorator.decorate(comboReference);
                }
            }
            firstReferenceGrassMedicinePotion = 1;
            GrassPotionReference();
            medicineName(medicine,grassList.get(0).getReference());
        }
        else if(medicine.equalsIgnoreCase("单味药粉") && firstReferenceTraditionalMedicinePill == 0)
        {
            TraditionalMedicinePill traditionalpill = new TraditionalMedicinePill();

            List<TraditionalMedicinePill> traditionPillList = new ArrayList<TraditionalMedicinePill>();
            traditionPillList = traditionalpill.findReference(medicine,userid);

            for(int i =0; i<traditionPillList.size(); i++)
            {
                if(repeat.equalsIgnoreCase("") || !repeat.equalsIgnoreCase(traditionPillList.get(i).getReference()))
                {
                    comboBoxReferenceTraditionalPill.addItem(traditionPillList.get(i).getReference());
                    repeat = traditionPillList.get(i).getReference();
                    //AutoCompleteDecorator.decorate(comboReference);
                }
            }
            firstReferenceTraditionalMedicinePill = 1;
            TraditionalPillReference();
            medicineName(medicine,traditionPillList.get(0).getReference());
        }
        else if(medicine.equalsIgnoreCase("复方药粉") && firstReferenceTraditionalMedicinePotion == 0)
        { 
            TraditionalMedicinePotion traditionalpotion = new TraditionalMedicinePotion();

            List<TraditionalMedicinePotion> traditionMedicList = new ArrayList<TraditionalMedicinePotion>();
            traditionMedicList = traditionalpotion.findReference(medicine,userid);

            for(int i =0; i<traditionMedicList.size(); i++)
            {
                if(repeat.equalsIgnoreCase("") || !repeat.equalsIgnoreCase(traditionMedicList.get(i).getReference()))
                {
                    comboBoxReferenceTraditionalPotion.addItem(traditionMedicList.get(i).getReference());
                    repeat = traditionMedicList.get(i).getReference();
                    //AutoCompleteDecorator.decorate(comboReference);
                }
            }
            firstReferenceTraditionalMedicinePotion = 1;
            TraditionalPotionReference();
            medicineName(medicine,traditionMedicList.get(0).getReference());
        }
        else if (medicine.equalsIgnoreCase("药丸") && firstReferenceGrassMedicinePill == 1 )
        {
            GrassPillReference();
        }
        else if(medicine.equalsIgnoreCase("药水") && firstReferenceGrassMedicinePotion == 1)
        {
            GrassPotionReference();
        }
        else if(medicine.equalsIgnoreCase("单味药粉") && firstReferenceTraditionalMedicinePill == 1)
        {
            TraditionalPillReference();
        }
        else if(medicine.equalsIgnoreCase("复方药粉") && firstReferenceTraditionalMedicinePotion == 1)
        {
            TraditionalPotionReference();
        }
    }
    
    public void TraditionalPillReference()
    {
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(true);
        comboBoxReferenceTraditionalPotion.setVisible(false);
    }
    
    public void GrassPotionReference()
    {
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(true);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(false);
    }
    
    public void GrassPillReference()
    {
        comboReferenceGrassPill.setVisible(true);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(false);
    }
    
    public void TraditionalPotionReference()
    {
        comboReferenceGrassPill.setVisible(false);
        comboReferenceGrassPotion.setVisible(false);
        comboBoxReferenceTraditionalPill.setVisible(false);
        comboBoxReferenceTraditionalPotion.setVisible(true);
    }
    
     public void TraditionalPillName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(true);
        comboBoxNameTraditionalPotion.setVisible(false);
    }
    
    public void GrassPotionName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(true);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
    }
    
    public void GrassPillName()
    {
        comboMedicineNameGrassPill.setVisible(true);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
    }
    
    public void TraditionalPotionName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(true);
    }
    
    public void FindByMedicineName(String name)
    {
        String medicine = (String)comboBoxMedicine.getSelectedItem();
        System.out.println("name:"+name);
        System.out.println("medicine:"+medicine);
        try
        {
            if(medicine.equalsIgnoreCase("单味药粉"))
            {
                List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
                TraditionalMedicinePill pill = new TraditionalMedicinePill();
                medicList = pill.findTraditionalMedicinePillDetails("name", name,userid);
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
            }
            else if(medicine.equalsIgnoreCase("药水"))
            {
                List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
                GrassMedicinePotion potion = new GrassMedicinePotion();
                medicList = potion.findGrassMedicinePotionDetails("name", name,userid);
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
            }
            else if(medicine.equalsIgnoreCase("药丸"))
            {
                List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
                GrassMedicinePill pill = new GrassMedicinePill();
                medicList = pill.findGrassMedicinePillDetails("name", name,userid);
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
            }
            else if(medicine.equalsIgnoreCase("复方药粉"))
            {
                List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
                TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
                medicList = potion.findTraditionalMedicinePotionDetails("name", name,userid);
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "ModifyChufang.FindByMedicineName() get error on line 371,"+ex.getMessage());
        }
    }
    
    /*public void FindByMedicineName2(String name)
    {
        String medicine = (String)comboBoxMedicine.getSelectedItem();
        System.out.println("name:"+name);
        System.out.println("medicine:"+medicine);
        if(medicine.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();
            //txtPrice.setText(String.valueOf(pill.findTraditionalMedicinePillName(name,userid).get(0).getSellprice()));
        }
        else if(medicine.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion pill = new GrassMedicinePotion();
            //txtPrice.setText(String.valueOf(pill.findGrassMedicinePotionName(name,userid).get(0).getSellprice()));
        }
        else if(medicine.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill pill =new GrassMedicinePill();
            //txtPrice.setText(String.valueOf(pill.findGrassMedicinePillName(name,userid).get(0).getSellprice()));
        }
        else if(medicine.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
            //txtPrice.setText(String.valueOf(potion.findTraditionalMedicinePotionName(name,userid).get(0).getSellprice()));
        }
    }*/
    
    public void Find()
    {
        updatedelete=0;
        String IC = txtIC.getText();
        String ID = txtID.getText();
        
        Prescription prescription = new Prescription();
        try {
            if(prescription.getPatient(IC,ID,userid).getIC().equalsIgnoreCase(IC) || prescription.getPatient(IC,ID,userid).getID().equalsIgnoreCase(ID))
            {
                String ICdata = prescription.getPatient(IC,ID,userid).getIC();
                String IDdata = prescription.getPatient(IC,ID,userid).getID();
                txtName.setText(prescription.getPatient(IC,ID,userid).getName());
                txtPhone.setText(prescription.getPatient(IC,ID,userid).getPhone());
                txtID.setText(IDdata);
                txtIC.setText(ICdata);
                txtChufang.setText(String.valueOf(prescription.getPrescription(ICdata,userid).getChufang()));
                txtMedicine.setText(prescription.getPrescription(ICdata,userid).getCategorytable());
                txtReference.setText(prescription.getPrescription(ICdata,userid).getReference());
                txtMedicineName.setText(prescription.getPrescription(ICdata,userid).getNametable());
                txtJiliang.setText(String.valueOf(prescription.getPrescription(ICdata,userid).getJiliang()));
                txtPrice.setText(String.valueOf(prescription.getPrescription(ICdata,userid).getPrice()));
                txtTotalPrice.setText(String.valueOf(prescription.getPrescription(ICdata,userid).getTotalprice()));
                txtPrescriptionID.setText(String.valueOf(prescription.getPrescription(ICdata,userid).getPrescriptionID()));
                txtIC.setEnabled(false);
                txtID.setEnabled(false);
                btnFindMedic.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                NewPatient detail = new NewPatient(user,IC);
                detail.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyChufang.Find() get error on line 615,"+ex.getMessage());
        }
    }
    
    public void medicineName(String name, String reference) throws SQLException
    {
        System.out.println("medicineName");
        comboMedicineNameGrassPill.removeAllItems();
        comboBoxNameTraditionalPill.removeAllItems();
        comboMedicineNameGrassPotion.removeAllItems();
        comboBoxNameTraditionalPotion.removeAllItems();
        if(name.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();

            for(int i = 0; i < pill.comboNameReference(name,reference,userid).size(); i++)
            {
               comboBoxNameTraditionalPill.addItem(pill.comboNameReference(name,reference,userid).get(i).getName());
               AutoCompleteDecorator.decorate(comboBoxNameTraditionalPill);
            }
            TraditionalPillName();
        }
        else if(name.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion potion = new GrassMedicinePotion();

            for(int i = 0; i < potion.comboNameReference(name,reference,userid).size(); i++)
            {
                comboMedicineNameGrassPotion.addItem(potion.comboNameReference(name,reference,userid).get(i).getName());
                AutoCompleteDecorator.decorate(comboMedicineNameGrassPotion);
            }
            GrassPotionName();
        }
        else if(name.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill pill = new GrassMedicinePill();

            for(int i = 0; i < pill.comboNameReference(name,reference,userid).size(); i++)
            {
                comboMedicineNameGrassPill.addItem(pill.comboNameReference(name,reference,userid).get(i).getName());
                AutoCompleteDecorator.decorate(comboMedicineNameGrassPill);
            }
            GrassPillName();
        }
        else if(name.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion potion = new TraditionalMedicinePotion();

            for(int i = 0; i < potion.comboNameReference(name,reference,userid).size(); i++)
            {
                comboBoxNameTraditionalPotion.addItem(potion.comboNameReference(name,reference,userid).get(i).getName());
                AutoCompleteDecorator.decorate(comboBoxNameTraditionalPotion);
            }
            TraditionalPotionName();
        }
    }
    
    /*public void medicineCategory() throws SQLException
    {
        try {
            Code code = new Code();
            
            for(int i = 0; i < code.getComboMedicine(userid).size(); i++)
            {
                if(i != 0)
                {
                    comboBoxMedicine.addItem(code.getComboMedicine(userid).get(i).getCode());
                }
            }
            medicineName(code.getComboMedicine(userid).get(0).getCode());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.medicineCategory() get error on line 737,"+ex.getMessage());
        }
        
    }*/
    
    public void update()
    {
        try {
            String prescriptionID = txtPrescriptionID.getText();
            String medicine = comboBoxMedicine.getSelectedItem().toString();
            String name = comboMedicineNameGrassPill.getSelectedItem().toString();
            int jiliang = Integer.parseInt(spinnerJiLiang.getValue().toString());
            float price = Float.parseFloat(txtPrice.getText());
            float totalPrice = Float.parseFloat(txtTotalPrice.getText());
            Prescription pre = new Prescription(prescriptionID, medicine, name, jiliang, price, totalPrice,userid);
            String result= pre.EditPrescription();
                    
            if(result.equalsIgnoreCase("1"))
            {
                JOptionPane.showMessageDialog(rootPane, "更新成功！");
                model.setRowCount(0);
                show_table();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.update() on line 744 get error, "+result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.update() on line 747 get error, "+ex.getMessage());
        }
    }
    
    public void delete()
    {
        try {
            String prescriptionID = txtPrescriptionID.getText();
            Prescription pre = new Prescription(prescriptionID,userid);
            String result = pre.DeletePrescription();
            if(result.equalsIgnoreCase("1"))
            {
                JOptionPane.showMessageDialog(rootPane, "删除成功！");
                model.setRowCount(0);
                show_table();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.delete() on line 763 get error, "+result);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.delete() on line 769 get error, "+ex.getMessage());
        }
    }
    
    public void widthTable()
    {
        this.lblName.setText(user.getUserid());
        JTableHeader tableHeader = tblChufang.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        tblChufang.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //new JScrollPane(tblMedicine, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        TableColumnModel columnModel = tblChufang.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(160);
        columnModel.getColumn(4).setPreferredWidth(40);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(90);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(100);
        columnModel.getColumn(10).setPreferredWidth(100);
        columnModel.getColumn(11).setPreferredWidth(200);
        columnModel.getColumn(12).setPreferredWidth(200);
        columnModel.getColumn(13).setPreferredWidth(100);
        columnModel.getColumn(14).setPreferredWidth(100);
        columnModel.getColumn(15).setPreferredWidth(100);
        columnModel.getColumn(16).setPreferredWidth(100);
        columnModel.getColumn(17).setPreferredWidth(100);
        columnModel.getColumn(18).setPreferredWidth(100);
        columnModel.getColumn(19).setPreferredWidth(100);
        columnModel.getColumn(20).setPreferredWidth(200);
        columnModel.getColumn(21).setPreferredWidth(170);
        columnModel.getColumn(22).setPreferredWidth(170);
        
        
        columnModel.getColumn(21).setMinWidth(0);
        columnModel.getColumn(21).setMaxWidth(0);
        columnModel.getColumn(22).setMinWidth(0);
        columnModel.getColumn(22).setMaxWidth(0);
    }
    
    public void textboxShow()
    {
        comboBoxMedicine.setVisible(false);
        comboMedicineNameGrassPill.setVisible(false);
        spinnerJiLiang.setVisible(false);
        txtMedicine.setEnabled(false);
        txtMedicineName.setEnabled(false);
        txtJiliang.setEnabled(false);
        txtChufang.setEnabled(false);
        txtPrice.setEnabled(false);
        txtTotalPrice.setEnabled(false);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtPrescriptionID.setVisible(false);
        txtReference.setEnabled(false);
        txtPrice.setText("");
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFindIC.setIcon(iconFind);
        btnFindID.setIcon(iconFind);
        btnFindMedic.setIcon(iconFind);
        ImageIcon iconReset = new ImageIcon(getClass().getResource("/menu/smallReset.png"));
        btnReset.setIcon(iconReset);
        ImageIcon iconDelete = new ImageIcon(getClass().getResource("/menu/smallDelete.png"));
        btnDelete.setIcon(iconDelete);
        ImageIcon iconUpdate = new ImageIcon(getClass().getResource("/menu/smallUpdate.png"));
        btnModify.setIcon(iconUpdate);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/smallEdit.png"));
        btnModifyMedicine.setIcon(iconModify);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/editmedium.png"));
        jLabel1.setIcon(iconHeader);
        this.lblName.setText(userid);
        setResizable(false);
    }
    
    public String printPreview(String IC,String ID,String name,String phone,String diseaseID)
    {
        PrintTemplate print = new PrintTemplate();
        return print.printAllDisease(IC, ID, name, phone, diseaseID);
    }
    
    public String MedicineReference()
    {
        String reference="";
        if(comboReferenceGrassPill.isVisible() == true)
        {
            reference = comboReferenceGrassPill.getSelectedItem().toString();
        }
        else if(comboReferenceGrassPotion.isVisible() == true)
        {
            reference = comboReferenceGrassPotion.getSelectedItem().toString();
        }
        else if(comboBoxReferenceTraditionalPill.isVisible() == true)
        {
            reference = comboBoxReferenceTraditionalPill.getSelectedItem().toString();
        }
        else if(comboBoxReferenceTraditionalPotion.isVisible() == true)
        {
            reference = comboBoxReferenceTraditionalPotion.getSelectedItem().toString();
        }
        return reference;
    }
    
    public String MedicineName()
    {
        String medicName = "";
        
        if(comboMedicineNameGrassPill.isVisible() == true)
        {
            medicName = comboMedicineNameGrassPill.getSelectedItem().toString();
        }
        else if(comboMedicineNameGrassPotion.isVisible() == true)
        {
            medicName = comboMedicineNameGrassPotion.getSelectedItem().toString();
        }
        else if(comboBoxNameTraditionalPill.isVisible() == true)
        {
            medicName = comboBoxNameTraditionalPill.getSelectedItem().toString();
        }
        else if(comboBoxNameTraditionalPotion.isVisible() == true)
        {
            medicName = comboBoxNameTraditionalPotion.getSelectedItem().toString();
        }
        return medicName;
    }
    
    public void MedicineContent()
    {
        String medicine = comboBoxMedicine.getSelectedItem().toString();
        String name = MedicineName();
        String reference = MedicineReference();
        String sellprice="";
        String medicineid="";
        String weightText ="";
        try
            {
                if(medicine.equalsIgnoreCase("单味药粉"))
                {
                    TraditionalMedicinePill pill = new TraditionalMedicinePill();
                    if(pill.findTraditionalMedicinePillName(name,reference,userid).size() != 0)
                    {
                        sellprice = String.valueOf(pill.findTraditionalMedicinePillName(name,reference,userid).get(0).getSellprice());
                        medicineid = pill.findTraditionalMedicinePillName(name,reference,userid).get(0).getCode();
                        weightText = String.valueOf(pill.findTraditionalMedicinePillName(name,reference,userid).get(0).getGram());
                        txtPrice.setText(sellprice);
                        txtMedicineID.setText(medicineid);
                        txtWeight.setText(weightText);
                        String jiliang = spinnerJiLiang.getValue().toString();
                        float weight = Float.valueOf(txtWeight.getText());
                        float price = Float.valueOf(txtPrice.getText());
                        float jiliang1 = Float.valueOf(jiliang);
                        float remaining = weight - jiliang1;
                        txtRemaining.setText(String.valueOf(remaining));
                        float totalprice = price * jiliang1;
                        txtTotalPrice.setText(String.valueOf(totalprice));
                    }
                    else
                    {
                        //txtMedicineName.setEnabled(true);
                        btnFindMedic.setEnabled(true);
                        //JOptionPane.showMessageDialog(rootPane, "系统没这资料!");
                    }
                }
                else if(medicine.equalsIgnoreCase("药水"))
                {
                    GrassMedicinePotion pill = new GrassMedicinePotion();
                    if(pill.findGrassMedicinePotionName(name,reference,userid).size() != 0)
                    {
                        sellprice = String.valueOf(pill.findGrassMedicinePotionName(name,reference,userid).get(0).getSellprice());
                        medicineid = pill.findGrassMedicinePotionName(name,reference,userid).get(0).getCode();
                        weightText = String.valueOf(pill.findGrassMedicinePotionName(name,reference,userid).get(0).getGram());
                        txtPrice.setText(sellprice);
                        txtMedicineID.setText(medicineid);
                        txtWeight.setText(weightText);
                        String jiliang = spinnerJiLiang.getValue().toString();
                        float weight = Float.valueOf(txtWeight.getText());
                        float jiliang1 = Float.valueOf(jiliang);
                        float remaining = weight - jiliang1;
                        float price = Float.valueOf(txtPrice.getText());
                        txtRemaining.setText(String.valueOf(remaining));
                        float totalprice = price * jiliang1;
                        txtTotalPrice.setText(String.valueOf(totalprice));
                    }
                    else
                    {
                        //txtMedicineName.setEnabled(true);
                        btnFindMedic.setEnabled(true);
                        //JOptionPane.showMessageDialog(rootPane, "系统没这资料!");
                    }
                }
                else if(medicine.equalsIgnoreCase("药丸"))
                {
                    GrassMedicinePill pill =new GrassMedicinePill();
                    if(pill.findGrassMedicinePillName(name,reference,userid).size() != 0)
                    {
                        sellprice = String.valueOf(pill.findGrassMedicinePillName(name,reference,userid).get(0).getSellprice());
                        medicineid = pill.findGrassMedicinePillName(name,reference,userid).get(0).getCode();
                        weightText = String.valueOf(pill.findGrassMedicinePillName(name,reference,userid).get(0).getGram());
                        txtPrice.setText(sellprice);
                        txtMedicineID.setText(medicineid);
                        txtWeight.setText(weightText);
                        String jiliang = spinnerJiLiang.getValue().toString();
                        float weight = Float.valueOf(txtWeight.getText());
                        float jiliang1 = Float.valueOf(jiliang);
                        float remaining = weight - jiliang1;
                        float price = Float.valueOf(txtPrice.getText());
                        txtRemaining.setText(String.valueOf(remaining));
                        float totalprice = price * jiliang1;
                        txtTotalPrice.setText(String.valueOf(totalprice));
                    }
                    else
                    {
                        //txtMedicineName.setEnabled(true);
                        btnFindMedic.setEnabled(true);
                        //JOptionPane.showMessageDialog(rootPane, "系统没这资料!");
                    }
                    
                }
                else if(medicine.equalsIgnoreCase("复方药粉"))
                {
                    TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
                    if(potion.findTraditionalMedicinePotionName(name,reference,userid).size() != 0)
                    {
                        sellprice = String.valueOf(potion.findTraditionalMedicinePotionName(name,reference,userid).get(0).getSellprice());
                        medicineid = potion.findTraditionalMedicinePotionName(name,reference,userid).get(0).getCode();
                        weightText = String.valueOf(potion.findTraditionalMedicinePotionName(name,reference,userid).get(0).getGram());
                        txtPrice.setText(sellprice);
                        txtMedicineID.setText(medicineid);
                        txtWeight.setText(weightText);
                        String jiliang = spinnerJiLiang.getValue().toString();
                        float weight = Float.valueOf(txtWeight.getText());
                        float jiliang1 = Float.valueOf(jiliang);
                        float remaining = weight - jiliang1;
                        float price = Float.valueOf(txtPrice.getText());
                        txtRemaining.setText(String.valueOf(remaining));
                        float totalprice = price * jiliang1;
                        txtTotalPrice.setText(String.valueOf(totalprice));
                    }
                    else
                    {
                        //txtMedicineName.setEnabled(true);
                        btnFindMedic.setEnabled(true);
                        //JOptionPane.showMessageDialog(rootPane, "系统没这资料!");
                    }
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.FindByMedicineName2() get error on line 863,"+ex.getMessage());
            }
    }
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
            java.util.logging.Logger.getLogger(ModifyChuFang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyChuFang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyChuFang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyChuFang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyChuFang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindIC;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnFindMedic;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnModifyMedicine;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> comboBoxMedicine;
    private javax.swing.JComboBox<String> comboBoxNameTraditionalPill;
    private javax.swing.JComboBox<String> comboBoxNameTraditionalPotion;
    private javax.swing.JComboBox<String> comboBoxReferenceTraditionalPill;
    private javax.swing.JComboBox<String> comboBoxReferenceTraditionalPotion;
    private javax.swing.JComboBox<String> comboMedicineNameGrassPill;
    private javax.swing.JComboBox<String> comboMedicineNameGrassPotion;
    private javax.swing.JComboBox<String> comboReferenceGrassPill;
    private javax.swing.JComboBox<String> comboReferenceGrassPotion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblJiliang;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JSpinner spinnerJiLiang;
    private javax.swing.JTable tblChufang;
    private javax.swing.JTextField txtChufang;
    private javax.swing.JTextField txtDisease;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJiliang;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtMedicineID;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrescriptionID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtReference;
    private javax.swing.JTextField txtRemaining;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
