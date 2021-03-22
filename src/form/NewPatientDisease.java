/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javaClass.Bill;
import javaClass.Code;
import javaClass.Disease;
import javaClass.GrassMedicinePill;
import javaClass.GrassMedicinePotion;
import javaClass.Patient;
import javaClass.Prescription;
import javaClass.PrintTemplate;
import javaClass.TraditionalMedicinePill;
import javaClass.TraditionalMedicinePotion;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Sheng
 */
public class NewPatientDisease extends javax.swing.JFrame {

    /**
     * Creates new form NewPatientDisease1
     */
    private User user;
    private String id;
    private String ic;
    private String name;
    private String phone;
    private String Date="";
    private String symptom="";
    private String category="";
    private String pulse ="";
    private String tongueQuality ="";
    private String tongueCoating ="";
    private String shit="";
    private String history="";
    private String temperature="";
    private String blood="";
    private ArrayList<String> chufang;
    private ArrayList<String> medicine;
    private ArrayList<String> medicinecategory;
    private ArrayList<String> medicineReference;
    private ArrayList<String> jiliang;
    private ArrayList<String> price;
    private ArrayList<String> totalprice;
    private ArrayList<String> remaining;
    private ArrayList<String> prescriptionID;
    private ArrayList<String> weightList;
    private String totalweight="";
    private String mainprice="";
    DefaultTableModel model;
    private String comboBox = "";
    HashMap<String,String> save = new HashMap<String,String>();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();
    private String userid = "";
    private ArrayList<String> medicineNames = new ArrayList<String>();
    private int firstReferenceGrassMedicinePill = 0;
    private int firstReferenceGrassMedicinePotion = 0;
    private int firstReferenceTraditionalMedicinePill = 0;
    private int firstReferenceTraditionalMedicinePotion = 0;
    
    public NewPatientDisease(User user) throws SQLException {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        createColumns();
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtRemaining.setEnabled(false);
        spinnerJiLiang.setEnabled(false);
        comboReference(comboBoxMedicine.getSelectedItem().toString());
        //medicineCategory();
        //FindByMedicineName2(String.valueOf(comboBoxName.getSelectedItem()));
        //setResizable(false);
        txtchufang.setEnabled(false);
        txtPrice.setEnabled(false);
        txtTotalPrice.setEnabled(false);
        image();
        txtchufang.setText("1");
        lblCreateDateTime.setText(dtf.format(localDate));
        btnReset.setVisible(false);
        btnModify.setVisible(false);
        btnDelete.setEnabled(false);
        btnAddRow.setEnabled(false);
        txtWeight.setVisible(false);
        txtMedicineID.setVisible(false);
        lblTotalPrice.setVisible(false);
        spinnerJiLiang.setValue(1);
        TableColumnModel columnModel = tblDisease.getColumnModel();
        columnModel.getColumn(7).setMinWidth(0);
        columnModel.getColumn(7).setMaxWidth(0);
        columnModel.getColumn(8).setMinWidth(0);
        columnModel.getColumn(8).setMaxWidth(0);
        columnModel.getColumn(9).setMinWidth(0);
        columnModel.getColumn(9).setMaxWidth(0);
    }
    
    public NewPatientDisease(User user,String id, String ic, String name, String phone) throws SQLException {
        initComponents();
        userid = user.getUserid();
        comboReference(comboBoxMedicine.getSelectedItem().toString());
        //medicineCategory();
        //FindByMedicineName2(String.valueOf(comboBoxName.getSelectedItem()));
        createColumns();
        this.user = user;
        this.id = id;
        this.ic = ic;
        this.name = name;
        this.phone = phone;
        btnFindIC.setEnabled(false);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtIC.setEnabled(false);
        txtIC.setText(ic);
        txtID.setEnabled(false);
        txtID.setText(id);
        btnFindID.setEnabled(false);
        txtName.setText(name);
        txtPhone.setText(phone);
        txtRemaining.setEnabled(false);
        spinnerJiLiang.setEnabled(false);
        //lblID.setText(String.valueOf(id));
        //setResizable(false);
        model = (DefaultTableModel)tblDisease.getModel();
        txtchufang.setEnabled(false);
        txtPrice.setEnabled(false);
        txtchufang.setText("1");
        txtTotalPrice.setEnabled(false);
        image();
        lblCreateDateTime.setText(dtf.format(localDate));
        btnReset.setVisible(false);
        btnModify.setVisible(false);
        btnDelete.setEnabled(false);
        btnAddRow.setEnabled(false);
        txtWeight.setVisible(false);
        txtMedicineID.setVisible(false);
        spinnerJiLiang.setValue(1);
        lblTotalPrice.setVisible(false);
        TableColumnModel columnModel = tblDisease.getColumnModel();
        columnModel.getColumn(7).setMinWidth(0);
        columnModel.getColumn(7).setMaxWidth(0);
        columnModel.getColumn(8).setMinWidth(0);
        columnModel.getColumn(8).setMaxWidth(0);
        columnModel.getColumn(9).setMinWidth(0);
        columnModel.getColumn(9).setMaxWidth(0);
    }
    
    public NewPatientDisease(User user,String IC, String ID, String Name, String Phone, String Date, String symptom, String category, 
            String pulse,String tongueQuality,String tongueCoating, String shit, String history, String temperature, String blood,
            ArrayList<String> chufang, ArrayList<String> medicine, ArrayList<String> medicinecategory, ArrayList<String> medicineReference,
            ArrayList<String> jiliang, ArrayList<String> price, ArrayList<String> totalprice, String totalweight, String mainprice, ArrayList<String> remaining, ArrayList<String> prescriptionID, ArrayList<String> weightList) throws SQLException {
        initComponents();
        userid = user.getUserid();
        //medicineCategory();
        //FindByMedicineName2(String.valueOf(comboBoxName.getSelectedItem()));
        createColumns();
        this.user = user;
        this.id = ID;
        this.ic = IC;
        this.name = Name;
        this.phone = Phone;
        this.Date = Date;
        this.symptom = symptom;
        this.category = category; 
        this.pulse = pulse;
        this.tongueQuality =tongueQuality;
        this.tongueCoating =  tongueCoating;
        this.shit = shit;
        this.history= history;
        this.temperature = temperature;
        this.blood = blood;
        this.chufang = chufang;
        this.medicine = medicine;
        this.medicinecategory = medicinecategory;
        this.jiliang = jiliang;
        this.price = price;
        this.totalprice = totalprice;
        this.totalweight = totalweight;
        this.mainprice = mainprice;
        this.remaining = remaining;
        this.prescriptionID = prescriptionID;
        this.weightList = weightList;
        this.medicineReference=medicineReference;
        lblCreateDateTime.setText(Date);
        txtSymptom.setText(symptom);
        txtCategory.setText(category);
        txtPulse.setText(pulse);
        txtTongueQuality.setText(tongueQuality);
        txtTongueCoating.setText(tongueCoating);
        txtShit.setText(shit);
        txtHistory.setText(history);
        txtTemperature.setText(temperature);
        txtBlood.setText(blood);
        lblTotalJiliang.setText(totalweight);
        lblTotalPriceRM.setText(mainprice);
        for (int i = 0; i < chufang.size(); i++){
            populate(chufang.get(i),medicine.get(i),medicineReference.get(i),medicinecategory.get(i),
                    jiliang.get(i),price.get(i),totalprice.get(i),remaining.get(i),prescriptionID.get(i),weightList.get(i));
        }
        int pluschufang = chufang.size()+1;
        txtchufang.setText(String.valueOf(pluschufang));
        btnFindIC.setEnabled(false);
        txtName.setEnabled(false);
        txtPhone.setEnabled(false);
        txtIC.setEnabled(false);
        comboReference(comboBoxMedicine.getSelectedItem().toString());
        txtIC.setText(IC);
        txtID.setEnabled(false);
        txtID.setText(ID);
        btnFindID.setEnabled(false);
        txtName.setText(Name);
        txtPhone.setText(Phone);
        txtRemaining.setEnabled(false);
        spinnerJiLiang.setEnabled(false);
        //lblID.setText(String.valueOf(id));
        //setResizable(false);
        model = (DefaultTableModel)tblDisease.getModel();
        txtchufang.setEnabled(false);
        txtPrice.setEnabled(false);
        txtTotalPrice.setEnabled(false);
        image();
        lblItems.setText(String.valueOf(model.getRowCount()));
        lblCreateDateTime.setText(dtf.format(localDate));
        btnReset.setVisible(false);
        btnModify.setVisible(false);
        btnDelete.setEnabled(false);
        btnAddRow.setEnabled(false);
        txtWeight.setVisible(false);
        txtMedicineID.setVisible(false);
        spinnerJiLiang.setValue(1);
        lblTotalPrice.setVisible(false);
        TableColumnModel columnModel = tblDisease.getColumnModel();
        columnModel.getColumn(7).setMinWidth(0);
        columnModel.getColumn(7).setMaxWidth(0);
        columnModel.getColumn(8).setMinWidth(0);
        columnModel.getColumn(8).setMaxWidth(0);
        columnModel.getColumn(9).setMinWidth(0);
        columnModel.getColumn(9).setMaxWidth(0);
    }
    
    public NewPatientDisease() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        headerAdd = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnFindIC = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnFindID = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblCreateDateTime = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtSymptom = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtTongueCoating = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTongueQuality = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtShit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtHistory = new javax.swing.JTextField();
        txtBlood = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtchufang = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboBoxMedicine = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        spinnerJiLiang = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnAddRow = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnAddData = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisease = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblTotalJiliang = new javax.swing.JLabel();
        lblTotalPriceRM = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtWeight = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRemaining = new javax.swing.JTextField();
        txtMedicineID = new javax.swing.JTextField();
        btnFindMedic = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        comboReferenceGrassPill = new javax.swing.JComboBox<>();
        comboMedicineNameGrassPill = new javax.swing.JComboBox<>();
        comboReferenceGrassPotion = new javax.swing.JComboBox<>();
        comboBoxReferenceTraditionalPill = new javax.swing.JComboBox<>();
        comboBoxReferenceTraditionalPotion = new javax.swing.JComboBox<>();
        comboMedicineNameGrassPotion = new javax.swing.JComboBox<>();
        comboBoxNameTraditionalPill = new javax.swing.JComboBox<>();
        comboBoxNameTraditionalPotion = new javax.swing.JComboBox<>();
        lblItems = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel23.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel23.setText("登入：");
        panelHeader.add(jLabel23);
        jLabel23.setBounds(1651, 2, 75, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1720, 0, 160, 70);

        headerAdd.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        headerAdd.setText("新增病症");
        panelHeader.add(headerAdd);
        headerAdd.setBounds(880, 0, 250, 70);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("IC:");
        panelBody.add(jLabel1);
        jLabel1.setBounds(110, 20, 27, 40);

        txtIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtIC);
        txtIC.setBounds(160, 20, 470, 40);

        btnFindIC.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindIC.setText("寻找");
        btnFindIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindICActionPerformed(evt);
            }
        });
        panelBody.add(btnFindIC);
        btnFindIC.setBounds(640, 20, 110, 40);

        jLabel14.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel14.setText("ID:");
        panelBody.add(jLabel14);
        jLabel14.setBounds(770, 20, 40, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtID);
        txtID.setBounds(810, 20, 630, 40);

        btnFindID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindID.setText("寻找");
        btnFindID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });
        panelBody.add(btnFindID);
        btnFindID.setBounds(1460, 20, 110, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtName);
        txtName.setBounds(160, 70, 1410, 40);

        lblCreateDateTime.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblCreateDateTime);
        lblCreateDateTime.setBounds(810, 120, 760, 40);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel13.setText("日期：");
        panelBody.add(jLabel13);
        jLabel13.setBounds(760, 120, 60, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("姓名：");
        panelBody.add(jLabel3);
        jLabel3.setBounds(100, 70, 57, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("电话号码：");
        panelBody.add(jLabel4);
        jLabel4.setBounds(60, 120, 100, 40);

        txtPhone.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPhone);
        txtPhone.setBounds(160, 120, 590, 40);
        panelBody.add(jSeparator1);
        jSeparator1.setBounds(60, 170, 1510, 20);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("主症：");
        panelBody.add(jLabel2);
        jLabel2.setBounds(100, 180, 57, 40);

        txtSymptom.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtSymptom);
        txtSymptom.setBounds(160, 180, 590, 40);

        jLabel22.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel22.setText("病症分类：");
        panelBody.add(jLabel22);
        jLabel22.setBounds(760, 180, 95, 40);

        txtCategory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtCategory);
        txtCategory.setBounds(850, 180, 720, 40);

        txtTongueCoating.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTongueCoating);
        txtTongueCoating.setBounds(1020, 230, 550, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("舌苔：");
        panelBody.add(jLabel9);
        jLabel9.setBounds(960, 230, 60, 40);

        txtTongueQuality.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTongueQuality);
        txtTongueQuality.setBounds(570, 230, 370, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("舌质：");
        panelBody.add(jLabel8);
        jLabel8.setBounds(510, 230, 60, 40);

        txtPulse.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });
        panelBody.add(txtPulse);
        txtPulse.setBounds(160, 230, 330, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("脉象：");
        panelBody.add(jLabel7);
        jLabel7.setBounds(100, 230, 57, 40);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("大小便：");
        panelBody.add(jLabel10);
        jLabel10.setBounds(80, 280, 90, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("体温：");
        panelBody.add(jLabel5);
        jLabel5.setBounds(100, 330, 60, 40);

        txtTemperature.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtTemperature);
        txtTemperature.setBounds(160, 330, 590, 40);

        txtShit.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtShit);
        txtShit.setBounds(160, 280, 590, 40);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("病史：");
        panelBody.add(jLabel11);
        jLabel11.setBounds(790, 280, 60, 40);

        txtHistory.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtHistory);
        txtHistory.setBounds(850, 280, 720, 40);

        txtBlood.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtBlood);
        txtBlood.setBounds(850, 330, 720, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("血压：");
        panelBody.add(jLabel6);
        jLabel6.setBounds(790, 330, 60, 40);
        panelBody.add(jSeparator2);
        jSeparator2.setBounds(60, 380, 1540, 20);

        txtchufang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtchufang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchufangActionPerformed(evt);
            }
        });
        panelBody.add(txtchufang);
        txtchufang.setBounds(160, 390, 180, 40);

        jLabel16.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel16.setText("处方：");
        panelBody.add(jLabel16);
        jLabel16.setBounds(90, 390, 60, 40);

        jLabel17.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel17.setText("药物分类：");
        panelBody.add(jLabel17);
        jLabel17.setBounds(360, 390, 100, 40);

        comboBoxMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "复方药粉", "药丸", "药水", "单味药粉" }));
        comboBoxMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMedicineActionPerformed(evt);
            }
        });
        panelBody.add(comboBoxMedicine);
        comboBoxMedicine.setBounds(450, 390, 170, 40);

        jLabel18.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel18.setText("药物名称：");
        panelBody.add(jLabel18);
        jLabel18.setBounds(60, 490, 95, 40);

        spinnerJiLiang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        spinnerJiLiang.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        spinnerJiLiang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerJiLiangStateChanged(evt);
            }
        });
        panelBody.add(spinnerJiLiang);
        spinnerJiLiang.setBounds(160, 590, 100, 40);

        jLabel19.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel19.setText("剂量：");
        panelBody.add(jLabel19);
        jLabel19.setBounds(90, 590, 60, 40);

        jLabel20.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel20.setText("价格/G:");
        panelBody.add(jLabel20);
        jLabel20.setBounds(60, 640, 100, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPrice);
        txtPrice.setBounds(160, 640, 580, 40);

        jLabel21.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel21.setText("总价值：");
        panelBody.add(jLabel21);
        jLabel21.setBounds(70, 690, 90, 40);

        txtTotalPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtTotalPrice.setText("0.0");
        panelBody.add(txtTotalPrice);
        txtTotalPrice.setBounds(160, 690, 580, 40);

        btnAddRow.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnAddRow.setText("添加");
        btnAddRow.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });
        panelBody.add(btnAddRow);
        btnAddRow.setBounds(630, 740, 110, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(50, 800, 110, 40);
        panelBody.add(jSeparator3);
        jSeparator3.setBounds(50, 790, 1520, 10);

        btnAddData.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnAddData.setText("新增");
        btnAddData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });
        panelBody.add(btnAddData);
        btnAddData.setBounds(1450, 800, 120, 40);

        tblDisease.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "处方", "药物分类", "参考病症", "药物名称", "剂量 (GM)", "价格/G (RM)", "总价值 (RM)", "剩下剂量", "MedicineID", "重量"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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

        jScrollPane2.setViewportView(jScrollPane1);

        panelBody.add(jScrollPane2);
        jScrollPane2.setBounds(760, 400, 830, 340);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBody.add(btnPrint);
        btnPrint.setBounds(1320, 800, 120, 40);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelBody.add(btnDelete);
        btnDelete.setBounds(470, 740, 120, 40);

        jLabel12.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel12.setText("total:");
        panelBody.add(jLabel12);
        jLabel12.setBounds(760, 740, 60, 40);

        lblTotalJiliang.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblTotalJiliang);
        lblTotalJiliang.setBounds(1160, 740, 140, 40);

        lblTotalPriceRM.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblTotalPriceRM);
        lblTotalPriceRM.setBounds(1440, 740, 110, 40);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更改");
        btnModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        panelBody.add(btnModify);
        btnModify.setBounds(310, 740, 120, 40);

        btnReset.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnReset.setText("重启");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelBody.add(btnReset);
        btnReset.setBounds(160, 740, 120, 40);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtWeight);
        txtWeight.setBounds(500, 590, 70, 40);

        jLabel15.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel15.setText("剩下剂量:");
        panelBody.add(jLabel15);
        jLabel15.setBounds(60, 540, 90, 40);

        txtRemaining.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtRemaining);
        txtRemaining.setBounds(160, 540, 580, 40);
        panelBody.add(txtMedicineID);
        txtMedicineID.setBounds(630, 390, 110, 40);

        btnFindMedic.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFindMedic.setText("寻找");
        btnFindMedic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindMedicActionPerformed(evt);
            }
        });
        panelBody.add(btnFindMedic);
        btnFindMedic.setBounds(630, 490, 110, 40);

        jLabel25.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel25.setText("参考病症：");
        panelBody.add(jLabel25);
        jLabel25.setBounds(50, 440, 100, 40);

        comboReferenceGrassPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboReferenceGrassPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReferenceGrassPillActionPerformed(evt);
            }
        });
        panelBody.add(comboReferenceGrassPill);
        comboReferenceGrassPill.setBounds(160, 440, 460, 40);

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
        panelBody.add(comboMedicineNameGrassPill);
        comboMedicineNameGrassPill.setBounds(160, 490, 460, 40);

        comboReferenceGrassPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboReferenceGrassPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReferenceGrassPotionActionPerformed(evt);
            }
        });
        panelBody.add(comboReferenceGrassPotion);
        comboReferenceGrassPotion.setBounds(160, 440, 460, 40);

        comboBoxReferenceTraditionalPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxReferenceTraditionalPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxReferenceTraditionalPillActionPerformed(evt);
            }
        });
        panelBody.add(comboBoxReferenceTraditionalPill);
        comboBoxReferenceTraditionalPill.setBounds(160, 440, 460, 40);

        comboBoxReferenceTraditionalPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxReferenceTraditionalPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxReferenceTraditionalPotionActionPerformed(evt);
            }
        });
        panelBody.add(comboBoxReferenceTraditionalPotion);
        comboBoxReferenceTraditionalPotion.setBounds(160, 440, 460, 40);

        comboMedicineNameGrassPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicineNameGrassPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineNameGrassPotionActionPerformed(evt);
            }
        });
        panelBody.add(comboMedicineNameGrassPotion);
        comboMedicineNameGrassPotion.setBounds(160, 490, 460, 40);

        comboBoxNameTraditionalPill.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxNameTraditionalPill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameTraditionalPillActionPerformed(evt);
            }
        });
        panelBody.add(comboBoxNameTraditionalPill);
        comboBoxNameTraditionalPill.setBounds(160, 490, 460, 40);

        comboBoxNameTraditionalPotion.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxNameTraditionalPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxNameTraditionalPotionActionPerformed(evt);
            }
        });
        panelBody.add(comboBoxNameTraditionalPotion);
        comboBoxNameTraditionalPotion.setBounds(160, 490, 460, 40);

        lblItems.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(lblItems);
        lblItems.setBounds(820, 740, 90, 40);
        panelBody.add(lblTotalPrice);
        lblTotalPrice.setBounds(990, 820, 0, 0);

        jPanel2.add(panelBody);
        panelBody.setBounds(110, 80, 1610, 850);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel24);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        jScrollPane3.setViewportView(jPanel2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 1940, 990);

        setBounds(0, 0, 1956, 1035);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindICActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindICActionPerformed

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        // TODO add your handling code here:
        Find();
    }//GEN-LAST:event_btnFindIDActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void comboBoxMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMedicineActionPerformed
        try {
            // TODO add your handling code here:
            //txtMedicineName.setText("");
            txtMedicineID.setText("");
            spinnerJiLiang.setEnabled(false);
            spinnerJiLiang.setValue(1);
            txtRemaining.setText("");
            txtWeight.setText("");
            txtPrice.setText("");
            txtTotalPrice.setText("");
            //txtMedicineName.setEnabled(true);
            btnFindMedic.setEnabled(true);
            String medicine = comboBoxMedicine.getSelectedItem().toString();
            System.out.print("comboMedicine"+medicine);
            comboReference(medicine);
            //getReferenceName(medicine);
            //medicineName(name);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.comboBoxMedicineActionPerformed get error on line 609,"+ex.getMessage());
        }

    }//GEN-LAST:event_comboBoxMedicineActionPerformed

    private void spinnerJiLiangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerJiLiangStateChanged
        // TODO add your handling code here:
        String jiliang = spinnerJiLiang.getValue().toString();
        if(!txtWeight.getText().isEmpty())
        {
            float weight = Float.valueOf(txtWeight.getText());
            float jiliang1 = Float.valueOf(jiliang);
            float totalprice = Float.valueOf(txtPrice.getText());
            float total = jiliang1 * totalprice;
            float remaining = weight - jiliang1;
            txtTotalPrice.setText(String.valueOf(total));
            txtRemaining.setText(String.valueOf(remaining));
        }
    }//GEN-LAST:event_spinnerJiLiangStateChanged

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        // TODO add your handling code here:
        float remaining = Float.valueOf(txtRemaining.getText());
        String name = MedicineName();
        if(remaining >= 0.0)
        {
            if(save.isEmpty())
            {
                saveDataTable();
            }
            else
            {
                if(save.containsKey(comboBoxMedicine.getSelectedItem().toString()))
                {
                    if(save.get(comboBoxMedicine.getSelectedItem().toString()).equalsIgnoreCase(name))
                    {
                        JOptionPane.showMessageDialog(rootPane, "资料已经存在了");
                    }
                    else
                    {
                        System.out.println("c");
                        saveDataTable();
                    }
                }
                else
                {
                    saveDataTable();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "剂量已经不够了！");
        }
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DiseaseMenu main = new DiseaseMenu(user);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
        // TODO add your handling code here:
        try {
            String patientID = txtID.getText();
            String symptom = txtSymptom.getText();
            int temperature = Integer.parseInt(txtTemperature.getText());
            String blood = txtBlood.getText();
            String pulse = txtPulse.getText();
            String tonguequality = txtTongueQuality.getText();
            String tonguecoating = txtTongueCoating.getText();
            String shit = txtShit.getText();
            String category = txtCategory.getText();
            String history = txtHistory.getText();
            String billDate = lblCreateDateTime.getText();
            int items = Integer.parseInt(lblItems.getText());
            double subtotal = Double.parseDouble(lblTotalPrice.getText());
            
            HashMap<String,String> map = new HashMap<String,String>();
            HashMap<String,String> mapBill = new HashMap<String,String>();
            int rows=tblDisease.getRowCount();

            if (symptom.equalsIgnoreCase("")) {
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
            } else if (rows == 0) {
                JOptionPane.showMessageDialog(null,"一定要添加至少一个资料");
            }
            else {
                Disease disease = new Disease(symptom, temperature, blood, pulse, tonguequality,
                    tonguecoating, shit, category, history, patientID,"",userid);
                try {
                    map = disease.AddDisease();
                    if (map.get("returnMessage").equalsIgnoreCase("1")) {
                        Bill bill = new Bill(billDate, Integer.parseInt(map.get("Bill")), userid, items, subtotal);
                        mapBill = bill.AddBill();
                        if(mapBill.get("returnMessage").equalsIgnoreCase("1"))
                        {
                            Prescription prescription = new Prescription();
                            HashMap<String,String> prescriptionMap = new HashMap<String,String>();
                            for(int row = 0; row<rows; row++)
                            {
                                String chufang = (String)tblDisease.getValueAt(row, 0);
                                String categorytable = (String)tblDisease.getValueAt(row, 1);
                                String reference = (String)tblDisease.getValueAt(row, 2);
                                String nametable = (String)tblDisease.getValueAt(row, 3);
                                String jiliang = (String)tblDisease.getValueAt(row, 4);
                                String price = (String)tblDisease.getValueAt(row, 5);
                                String totalprice = (String)tblDisease.getValueAt(row, 6);
                                String remaining = (String)tblDisease.getValueAt(row, 7);
                                String ID = (String)tblDisease.getValueAt(row, 8);
                                String weight = (String)tblDisease.getValueAt(row, 9);
                                prescriptionMap = prescription.addPrescription(Integer.valueOf(chufang), categorytable, reference, nametable, Integer.valueOf(jiliang), Float.valueOf(price), Float.valueOf(totalprice), patientID, map.get("ID"),"Prescription",userid, remaining, ID, Float.valueOf(weight));
                            }
                            if(prescriptionMap.get("returnMessage").equalsIgnoreCase("1"))
                            {
                                JOptionPane.showMessageDialog(rootPane, "病症已新增！ID 是 "+map.get("ID"));
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "新增失败");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(rootPane, "新增失败");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "新增失败");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.btnAddDataActionPerformed get error on line 543,"+ex.getMessage());
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "体温后面不可以有空格/体温不可以放字母！/资料没填完毕！");
        }
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void tblDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiseaseMouseClicked
        // TODO add your handling code here:
        btnAddRow.setVisible(false);
        btnReset.setVisible(true);
        btnDelete.setVisible(false);
        btnModify.setVisible(true);
        int index = tblDisease.getSelectedRow();
        TableModel tblmodel = tblDisease.getModel();
        String chufang = tblmodel.getValueAt(index, 0).toString();
        String price = tblmodel.getValueAt(index,4).toString();
        String totalprice = tblmodel.getValueAt(index,5).toString();

        txtchufang.setText(chufang);
        txtPrice.setText(price);
        txtTotalPrice.setText(totalprice);
    }//GEN-LAST:event_tblDiseaseMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String IC = txtIC.getText();
        String ID = txtID.getText();
        String Name = txtName.getText();
        String Phone = txtPhone.getText();
        String Date = lblCreateDateTime.getText();
        String symptom = txtSymptom.getText();
        String category = txtCategory.getText();
        String pulse = txtPulse.getText();
        String tongueQuality = txtTongueQuality.getText();
        String tongueCoating = txtTongueCoating.getText();
        String shit = txtShit.getText();
        String history = txtHistory.getText();
        String temperature = txtTemperature.getText();
        String blood = txtBlood.getText();
        String totalweight = lblTotalJiliang.getText();
        String mainPrice = lblTotalPriceRM.getText();
        ArrayList<String> chufang = new ArrayList<String>();
        ArrayList<String> medicine = new ArrayList<String>();
         ArrayList<String> medicineReference = new ArrayList<String>();
        ArrayList<String> medicinecategory = new ArrayList<String>();
        ArrayList<String> jiliang = new ArrayList<String>();
        ArrayList<String> price = new ArrayList<String>();
        ArrayList<String> totalprice = new ArrayList<String>();
        ArrayList<String> remaining = new ArrayList<String>();
        ArrayList<String> prescriptionID = new ArrayList<String>();
        ArrayList<String> weight = new ArrayList<String>();
        for (int count = 0; count < model.getRowCount(); count++){
            chufang.add(model.getValueAt(count, 0).toString());
            medicine.add(model.getValueAt(count, 1).toString());
            medicineReference.add(model.getValueAt(count, 2).toString());
            medicinecategory.add(model.getValueAt(count, 3).toString());
            jiliang.add(model.getValueAt(count, 4).toString());
            price.add(model.getValueAt(count, 5).toString());
            totalprice.add(model.getValueAt(count, 6).toString());
            remaining.add(model.getValueAt(count, 7).toString());
            prescriptionID.add(model.getValueAt(count, 8).toString());
            weight.add(model.getValueAt(count,9).toString());
        }
        String bodyContent = printPreview(IC,ID,Name,Phone,Date,symptom,category,pulse,tongueQuality,tongueCoating,shit,history, temperature, blood,
            chufang,medicine,medicinecategory,medicineReference,jiliang,price, totalprice, totalweight, mainPrice);
        PrintForm main = new PrintForm(user,4,bodyContent,IC,ID,Name,Phone,Date,symptom,category,pulse,tongueQuality,tongueCoating,shit,history, temperature, blood,
            chufang,medicine,medicinecategory,medicineReference, jiliang,price, totalprice, totalweight, mainPrice, remaining, prescriptionID,weight);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int index = model.getRowCount()-1;
        TableModel tableModel = tblDisease.getModel();
        String medicine = tableModel.getValueAt(index,1).toString();
        String name = tableModel.getValueAt(index,3).toString();
        if(save.get(medicine).equalsIgnoreCase(name))
        {
            save.remove(medicine);
            model.removeRow(model.getRowCount() - 1);
            chufang();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "删除失败！");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        float remaining = Float.valueOf(txtRemaining.getText());
        String name = MedicineName();
        if(remaining >= 0.0)
        {
            if(save.containsKey(comboBoxMedicine.getSelectedItem().toString()))
            {
                if(save.get(comboBoxMedicine.getSelectedItem().toString()).equalsIgnoreCase(name))
                {
                    JOptionPane.showMessageDialog(rootPane, "资料已经存在了");
                }
                else
                {
                    modify();
                }
            }
            else
            {
                modify();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "剂量已经不够了！");
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        comboBoxMedicine.setVisible(true);
        spinnerJiLiang.setVisible(true);
        btnReset.setVisible(false);
        btnModify.setVisible(false);
        btnAddRow.setVisible(true);
        btnDelete.setVisible(true);
        txtchufang.setText(String.valueOf(tblDisease.getRowCount()+1));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnFindMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindMedicActionPerformed
        btnDelete.setEnabled(true);
        btnAddRow.setEnabled(true);
        spinnerJiLiang.setEnabled(true);
        btnFindMedic.setEnabled(false);
        MedicineContent();
    }//GEN-LAST:event_btnFindMedicActionPerformed

    private void comboReferenceGrassPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReferenceGrassPillActionPerformed
        try {
            medicineName(comboBoxMedicine.getSelectedItem().toString(), comboReferenceGrassPill.getSelectedItem().toString());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboReferenceGrassPillActionPerformed

    private void comboMedicineNameGrassPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillActionPerformed

    private void comboMedicineNameGrassPillKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillKeyPressed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillKeyPressed

    private void comboMedicineNameGrassPillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPillMouseClicked
        // TODO add your handling code here:
         btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPillMouseClicked

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

    private void comboMedicineNameGrassPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineNameGrassPotionActionPerformed
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboMedicineNameGrassPotionActionPerformed

    private void comboBoxNameTraditionalPillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameTraditionalPillActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboBoxNameTraditionalPillActionPerformed

    private void comboBoxNameTraditionalPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxNameTraditionalPotionActionPerformed
        // TODO add your handling code here:
        btnFindMedic.setEnabled(true);
    }//GEN-LAST:event_comboBoxNameTraditionalPotionActionPerformed

    private void txtchufangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchufangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchufangActionPerformed

    private void createColumns()
    {
        model = (DefaultTableModel) tblDisease.getModel();
    }
    
    public void Find()
    {
        String IC = "";
        String ID = "";
        
        IC = txtIC.getText();
        ID = txtID.getText();
        
        Patient patient = new Patient();
        
        try {
            String resultIC = patient.getPatient(IC,ID,userid).getIC();
            String resultID = patient.getPatient(IC,ID,userid).getID();
            
            if(ID.equalsIgnoreCase("") && IC.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写IC 或者ID！");
            }
            else if(ID.equalsIgnoreCase(""))
            {
                if(resultIC.equalsIgnoreCase(IC))
                {    
                    txtName.setText(patient.getPatient(IC,ID,userid).getName());
                    txtPhone.setText(patient.getPatient(IC,ID,userid).getPhone());
                    txtID.setText(patient.getPatient(IC,ID,userid).getID());
                    txtIC.setText(patient.getPatient(IC,ID,userid).getIC());
                    txtIC.setEnabled(false);
                    txtID.setEnabled(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                    NewPatient detail = new NewPatient(user,IC,2);
                    detail.setVisible(true);
                    this.dispose();
                }
            }
            else if(IC.equalsIgnoreCase(""))
            {
                if(resultID != null && resultID.equalsIgnoreCase(ID))
                {
                    txtName.setText(patient.getPatient(IC,ID,userid).getName());
                    txtPhone.setText(patient.getPatient(IC,ID,userid).getPhone());
                    txtID.setText(patient.getPatient(IC,ID,userid).getID());
                    txtIC.setText(patient.getPatient(IC,ID,userid).getIC());
                    txtIC.setEnabled(false);
                    txtID.setEnabled(false);
                }
                else 
                {
                    JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "寻找不到病人资料");
                NewPatient detail = new NewPatient(user,IC,2);
                detail.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.Find() get error on line 718,"+ex.getMessage());
        }
    }
    
    public void medicineCategory() throws SQLException
    {
        try {
            Code code = new Code();
            
            for(int i = 0; i < code.getComboMedicine(userid).size(); i++)
            {
                comboBoxMedicine.addItem(code.getComboMedicine(userid).get(i).getCode());
            }
            comboReference(code.getComboMedicine(userid).get(0).getCode());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "NewPatientDisease.medicineCategory() get error on line 737,"+ex.getMessage());
        }
        
    }
    
    /*public void getReferenceName(String medicine) throws SQLException
    {
        comboMedicineName.removeAllItems();
        comboReference.removeAllItems();;
        HashMap<String,String> referenceName = new HashMap<String,String>();
        
        if(medicine.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();
            for(int i = 0; i < pill.findReferenceName(medicine,userid).size(); i++)
            {
                referenceName = pill.findReferenceName(medicine,userid).get(i);
                Iterator it = referenceName.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry)it.next();
                    System.out.println(pair.getKey() + " = " + pair.getValue());
                    it.remove(); // avoids a ConcurrentModificationException
                }
                //comboMedicineName.addItem(pill.comboName(userid).get(i).getName());
            }
            
            
        }
    }*/
    
    
    public void medicineName(String name, String reference) throws SQLException
    {
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
    
    public void TraditionalPillName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(true);
        comboBoxNameTraditionalPotion.setVisible(false);
        btnFindMedic.setEnabled(true);
    }
    
    public void GrassPotionName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(true);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
        btnFindMedic.setEnabled(true);
    }
    
    public void GrassPillName()
    {
        comboMedicineNameGrassPill.setVisible(true);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(false);
        btnFindMedic.setEnabled(true);
    }
    
    public void TraditionalPotionName()
    {
        comboMedicineNameGrassPill.setVisible(false);
        comboMedicineNameGrassPotion.setVisible(false);
        comboBoxNameTraditionalPill.setVisible(false);
        comboBoxNameTraditionalPotion.setVisible(true);
        btnFindMedic.setEnabled(true);
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
            //medicineName(medicine,medicList.get(0).getReference());
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
            //medicineName(medicine,grassList.get(0).getReference());
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
            //medicineName(medicine,traditionPillList.get(0).getReference());
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
            //medicineName(medicine,traditionMedicList.get(0).getReference());
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
    
    private void populate(String chufang, String medicine, String reference, String name, String jiliang, String price, String totalPrice, String remaining, String prescriptionID, String weight)
    {
        model = (DefaultTableModel)tblDisease.getModel();
        String []rowData ={chufang,medicine,reference,name,jiliang,price,totalPrice,remaining,prescriptionID,weight};
        model.addRow(rowData);
    }
    
    public void modify()
    {
        int i = tblDisease.getSelectedRow();
        int index = tblDisease.getSelectedRow();
        TableModel model = tblDisease.getModel();
        String medicine = model.getValueAt(index, 1).toString();
        String name = model.getValueAt(index,3).toString();
        String medicName = MedicineName();
        String medicReference = MedicineReference();
        if(save.get(medicine).equalsIgnoreCase(name))
        {
            save.remove(medicine);
            if(i >= 0) 
            {
                model.setValueAt(comboBoxMedicine.getSelectedItem().toString(), i, 1);
                model.setValueAt(medicReference, i, 2);
                model.setValueAt(medicName, i, 3);
                model.setValueAt(spinnerJiLiang.getValue().toString(), i, 4);
                model.setValueAt(txtPrice.getText(), i, 5);
                model.setValueAt(txtTotalPrice.getText(), i, 6);
                model.setValueAt(txtRemaining.getText(), i, 7);
                model.setValueAt(txtMedicineID.getText(), i, 8);
                model.setValueAt(txtWeight.getText(), i, 9);
                save.put(comboBoxMedicine.getSelectedItem().toString(), medicName);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "更新失败！");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "更新失败！");
        }
    }
    
    public void image()
    {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JTableHeader tableHeader = tblDisease.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconDelete = new ImageIcon(getClass().getResource("/menu/smallDelete.png"));
        btnDelete.setIcon(iconDelete);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/smallEdit.png"));
        btnModify.setIcon(iconModify);
        ImageIcon iconReset = new ImageIcon(getClass().getResource("/menu/smallReset.png"));
        btnReset.setIcon(iconReset);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addsmall.png"));
        btnAddRow.setIcon(iconAdd);
        btnAddData.setIcon(iconAdd);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFindIC.setIcon(iconFind);
        btnFindID.setIcon(iconFind);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/addmedium.png"));
        headerAdd.setIcon(iconHeader);
        this.lblName.setText(userid);
        //setResizable(false);
    }
    
    public String printPreview(String IC, String ID, String Name, String Phone, String Date,String symptom, String category, String pulse,
                             String tongueQuality, String tongueCoating, String shit, String history, String temperature, 
                             String blood, ArrayList<String> chufang, ArrayList<String> medicine, ArrayList<String> medicinecategory,ArrayList<String> medicineReference,
                             ArrayList<String> jiliang, ArrayList<String> price, ArrayList<String> totalprice, String totalweight, String mainprice)
    {
        PrintTemplate print = new PrintTemplate();
        return print.printDiseasePatient(IC, ID, Name, Phone, Date, symptom, category, pulse, tongueQuality, tongueCoating, shit, history, temperature, blood, chufang, medicinecategory, medicineReference, medicine, jiliang, price, totalprice,totalweight, mainprice);
    }
    
    public HashMap<String,String> saveDataTable()
    {
        String reference ="";
        String name = "";
        
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
        
        if(comboMedicineNameGrassPill.isVisible() == true)
        {
            name = comboMedicineNameGrassPill.getSelectedItem().toString();
        }
        else if(comboMedicineNameGrassPotion.isVisible() == true)
        {
            name = comboMedicineNameGrassPotion.getSelectedItem().toString();
        }
        else if(comboBoxNameTraditionalPill.isVisible() == true)
        {
            name = comboBoxNameTraditionalPill.getSelectedItem().toString();
        }
        else if(comboBoxNameTraditionalPotion.isVisible() == true)
        {
            name = comboBoxNameTraditionalPotion.getSelectedItem().toString();
        }
        
            populate(String.valueOf(model.getRowCount()+1),comboBoxMedicine.getSelectedItem().toString(),reference,name,
                        spinnerJiLiang.getValue().toString(),txtPrice.getText(),txtTotalPrice.getText(),txtRemaining.getText(),txtMedicineID.getText(),txtWeight.getText());
            save.put(comboBoxMedicine.getSelectedItem().toString(), name);
            chufang();
            return save;
    }
    
    public void chufang()
    {
        float totalprice = 0;
        float totalweight = 0;
        for(int i = 0; i < tblDisease.getRowCount(); i++){
            float AmountPrice = Float.parseFloat(tblDisease.getValueAt(i, 6)+"");
            totalprice = AmountPrice+totalprice;
        }
        for(int i = 0; i < tblDisease.getRowCount(); i++){
            float AmountWeight = Float.parseFloat(tblDisease.getValueAt(i, 4)+"");
            totalweight = AmountWeight+totalweight;
        }
        txtchufang.setText(String.valueOf(model.getRowCount()+1));
        lblItems.setText(String.valueOf(model.getRowCount()));
        lblTotalPriceRM.setText("RM"+String.valueOf(totalprice));
        lblTotalPrice.setText(String.valueOf(totalprice));
        lblTotalJiliang.setText(String.valueOf(totalweight)+"GM");
    }
    
    public void minuschufang()
    {
        int chufang = Integer.valueOf(txtchufang.getText()) + 1;
        float totalprice = 0;
        float totalweight = 0;
        for(int i = 0; i < tblDisease.getRowCount(); i++){
            float AmountPrice = Float.parseFloat(tblDisease.getValueAt(i, 5)+"");
            totalprice = AmountPrice+totalprice;
        }
        for(int i = 0; i < tblDisease.getRowCount(); i++){
            float AmountWeight = Float.parseFloat(tblDisease.getValueAt(i, 3)+"");
            totalweight = AmountWeight+totalweight;
        }
        txtchufang.setText(String.valueOf(chufang));
        lblTotalPriceRM.setText("RM"+String.valueOf(totalprice));
        lblTotalJiliang.setText(String.valueOf(totalweight)+"GM");
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
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatientDisease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatientDisease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindIC;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnFindMedic;
    private javax.swing.JButton btnModify;
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
    private javax.swing.JLabel headerAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCreateDateTime;
    private javax.swing.JLabel lblItems;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTotalJiliang;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPriceRM;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JSpinner spinnerJiLiang;
    private javax.swing.JTable tblDisease;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtHistory;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMedicineID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtRemaining;
    private javax.swing.JTextField txtShit;
    private javax.swing.JTextField txtSymptom;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtTongueCoating;
    private javax.swing.JTextField txtTongueQuality;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtchufang;
    // End of variables declaration//GEN-END:variables
}
