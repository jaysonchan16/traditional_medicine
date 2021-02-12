/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javaClass.GrassMedicinePotion;
import javaClass.GrassMedicinePill;
import javaClass.TraditionalMedicinePotion;
import javaClass.TraditionalMedicinePill;
import javaClass.User;
import javaClass.Code;
import java.awt.Font;
import java.awt.ScrollPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javaClass.Prescription;
import javaClass.PrintTemplate;
import javaClass.Reference;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class ModifyMedicine extends javax.swing.JFrame {

    /**
     * Creates new form ModifyMedicine
     */
    DefaultTableModel model ;
    private User user;
    private String modifyMedicine;
    private String modifyMedicinename;
    private String modifyComponent;
    private String modifyIndications;
    private String modifyEffect;
    private String modifyScoop;
    private String modifyWeight;
    private String modifyCost;
    private String modifyTotalprice;
    private String modifyID;
    private String modifyCreateDateTime;
    private String modifyLastUpdateTime;
    private String userid = "";
    private String modifyReference = "";
    private String modifyProperty = "";
    private String modifyAppliance = "";
    private int option = 0;
    
    public ModifyMedicine() {
        initComponents();
    }

    public ModifyMedicine(User user,int option) {
        this.user = user;
        initComponents();
        this.option = option;
        txtName.setEnabled(false);
        //txtFixedName.setVisible(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtReference.setVisible(false);
        txtPrice.setEnabled(false);
        comboReference.setEnabled(false);
        userid = user.getUserid();
        comboReference();
        comboMedicine();
        changeLabel();
        createColumns(1,"","");
        widthTable();
        image();
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        btnUpdate.setVisible(false);
        txtMedicine.setVisible(false);
        btnReset.setVisible(false);
        radioReferenceName.setVisible(false);
        radioDetails.setVisible(false);
        txtFixedName.setVisible(false);
    }
    
    public ModifyMedicine(User user,String medicine, String reference, String medicinename, String component, String indications,
            String property, String appliance, String effect,String scoop,String weight, String cost, 
            String totalprice,String ID,String createDateTime,String lastUpdateTime,int option)
    {
        initComponents();
        this.user = user;
        this.modifyMedicine = medicine;
        this.modifyReference = reference;
        this.modifyMedicinename =medicinename;
        this.modifyComponent = component;
        this.modifyIndications =indications;
        this.modifyProperty = property;
        this.modifyAppliance = appliance;
        this.modifyEffect = effect;
        this.modifyScoop = scoop;
        this.modifyWeight = weight;
        this.modifyCost = cost;
        this.modifyTotalprice = totalprice;
        this.modifyID  = ID;
        this.modifyCreateDateTime =createDateTime;
        this.modifyLastUpdateTime = lastUpdateTime;
        userid = user.getUserid();
        txtFixedName.setVisible(false);
        txtMedicine.setEnabled(false);
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtReference.setEnabled(false);
        txtPrice.setEnabled(false);
        txtID.setEnabled(false);
        comboMedicine.setVisible(false);
        comboReference.setVisible(false);
        btnFind.setEnabled(false);
        txtFixedName.setVisible(false);
        comboReference();
        comboMedicine();
        changeLabelSearch(medicine);
        createColumns(3,ID,medicine); 
        widthTable();
        image();
        txtMedicine.setText(modifyMedicine);
        txtID.setText(modifyID);
        txtReference.setText(modifyReference);
        txtName.setText(medicinename);
        txtFixedName.setText(medicinename);
        if(modifyComponent.equalsIgnoreCase(""))
        {
            txtComponent.setText(modifyProperty);
        }
        else
        {
            txtComponent.setText(modifyComponent);
        }
        if(indications.equalsIgnoreCase(""))
        {
            txtIndication.setText(modifyAppliance);
        }
        else
        {
            txtIndication.setText(modifyIndications);
        }
        txtEffect.setText(modifyEffect);
        txtScoop.setText(modifyScoop);
        txtWeight.setText(modifyWeight);
        txtCost.setText(modifyCost);
        txtPrice.setText(modifyTotalprice);
        radioReferenceName.setVisible(false);
        radioDetails.setVisible(false);
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        btnModify.setVisible(true);
        btnFind.setEnabled(false);
        btnUpdate.setVisible(false);
        btnReset.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboMedicine = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblzhucheng = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComponent = new javax.swing.JTextArea();
        lblzhuzi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIndication = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtScoop = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        txtMedicine = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEffect = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        comboReference = new javax.swing.JComboBox<>();
        txtReference = new javax.swing.JTextField();
        radioReferenceName = new javax.swing.JRadioButton();
        radioDetails = new javax.swing.JRadioButton();
        txtFixedName = new javax.swing.JTextField();

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

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel4.setText("更改药资料");
        panelHeader.add(jLabel4);
        jLabel4.setBounds(874, 5, 207, 60);

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

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("药物分类：");
        panelBody.add(jLabel1);
        jLabel1.setBounds(100, 20, 95, 40);

        comboMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineActionPerformed(evt);
            }
        });
        panelBody.add(comboMedicine);
        comboMedicine.setBounds(230, 20, 220, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("ID:");
        panelBody.add(jLabel3);
        jLabel3.setBounds(140, 70, 30, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtID);
        txtID.setBounds(230, 70, 500, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panelBody.add(btnFind);
        btnFind.setBounds(740, 70, 90, 40);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panelBody.add(txtName);
        txtName.setBounds(230, 170, 600, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("药物名称：");
        panelBody.add(jLabel2);
        jLabel2.setBounds(90, 170, 100, 40);

        lblzhucheng.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhucheng.setText("组成：");
        panelBody.add(lblzhucheng);
        lblzhucheng.setBounds(130, 220, 60, 30);

        txtComponent.setColumns(20);
        txtComponent.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtComponent.setRows(5);
        jScrollPane3.setViewportView(txtComponent);

        panelBody.add(jScrollPane3);
        jScrollPane3.setBounds(230, 220, 600, 100);

        lblzhuzi.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhuzi.setText("主治：");
        panelBody.add(lblzhuzi);
        lblzhuzi.setBounds(130, 330, 60, 30);

        txtIndication.setColumns(20);
        txtIndication.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtIndication.setRows(5);
        jScrollPane2.setViewportView(txtIndication);

        panelBody.add(jScrollPane2);
        jScrollPane2.setBounds(230, 330, 600, 90);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("功效：");
        panelBody.add(jLabel5);
        jLabel5.setBounds(130, 430, 60, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("每次每日分量：");
        panelBody.add(jLabel6);
        jLabel6.setBounds(50, 530, 133, 40);

        txtScoop.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtScoop);
        txtScoop.setBounds(230, 530, 600, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("重量：");
        panelBody.add(jLabel7);
        jLabel7.setBounds(120, 580, 57, 40);

        lblCost.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblCost.setText("本钱 RM/GM: RM");
        panelBody.add(lblCost);
        lblCost.setBounds(30, 630, 190, 40);

        lblPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblPrice.setText("价格 RM/GM: RM");
        panelBody.add(lblPrice);
        lblPrice.setBounds(30, 680, 190, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtPrice);
        txtPrice.setBounds(230, 680, 610, 40);

        txtCost.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtCost);
        txtCost.setBounds(230, 630, 610, 40);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtWeight);
        txtWeight.setBounds(230, 580, 540, 40);

        lblWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblWeight.setText("GM");
        panelBody.add(lblWeight);
        lblWeight.setBounds(780, 580, 60, 40);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelBody.add(btnDelete);
        btnDelete.setBounds(720, 780, 130, 50);

        btnUpdate.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnUpdate.setText("更新");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelBody.add(btnUpdate);
        btnUpdate.setBounds(580, 780, 130, 50);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(20, 780, 130, 50);

        tblMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicine.setFocusable(false);
        tblMedicine.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblMedicine.setRowHeight(25);
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicine);

        jScrollPane4.setViewportView(jScrollPane1);

        panelBody.add(jScrollPane4);
        jScrollPane4.setBounds(870, 20, 860, 780);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelBody.add(btnPrint);
        btnPrint.setBounds(440, 780, 130, 50);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更改");
        btnModify.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        panelBody.add(btnModify);
        btnModify.setBounds(160, 780, 130, 50);

        txtMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtMedicine);
        txtMedicine.setBounds(230, 20, 600, 40);

        btnReset.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnReset.setText("重启");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelBody.add(btnReset);
        btnReset.setBounds(300, 780, 130, 50);

        txtEffect.setColumns(20);
        txtEffect.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtEffect.setRows(5);
        jScrollPane5.setViewportView(txtEffect);

        panelBody.add(jScrollPane5);
        jScrollPane5.setBounds(230, 430, 600, 90);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("参考病症：");
        panelBody.add(jLabel8);
        jLabel8.setBounds(90, 120, 100, 40);

        comboReference.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboReference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReferenceActionPerformed(evt);
            }
        });
        panelBody.add(comboReference);
        comboReference.setBounds(230, 120, 220, 40);

        txtReference.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtReference);
        txtReference.setBounds(230, 120, 600, 40);

        radioReferenceName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        radioReferenceName.setText("更新参考病症和药物名称");
        radioReferenceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReferenceNameActionPerformed(evt);
            }
        });
        panelBody.add(radioReferenceName);
        radioReferenceName.setBounds(30, 730, 250, 40);

        radioDetails.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        radioDetails.setText("更新组成，主治，功效，每次每日分量，重要，本钱，价格");
        radioDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDetailsActionPerformed(evt);
            }
        });
        panelBody.add(radioDetails);
        radioDetails.setBounds(300, 730, 540, 40);
        panelBody.add(txtFixedName);
        txtFixedName.setBounds(10, 180, 90, 30);

        getContentPane().add(panelBody);
        panelBody.setBounds(100, 90, 1770, 840);

        setBounds(0, 0, 1956, 1030);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineActionPerformed
        /*try {*/
            // TODO add your handling code here:
            String medicineName = comboMedicine.getSelectedItem().toString();
            txtName.setText("");
            txtFixedName.setText("");
            txtComponent.setText("");
            txtIndication.setText("");
            txtEffect.setText("");
            txtScoop.setText("");
            txtWeight.setText("");
            txtCost.setText("");
            txtPrice.setText("");
            txtID.setText("");
            //txtID.setEnabled(true);
            txtName.setEnabled(false);
            txtComponent.setEnabled(false);
            txtIndication.setEnabled(false);
            txtEffect.setEnabled(false);
            txtScoop.setEnabled(false);
            txtWeight.setEnabled(false);
            txtCost.setEnabled(false);
            txtPrice.setEnabled(false);
            btnFind.setEnabled(true);
            btnModify.setVisible(true);
            btnUpdate.setVisible(false);
            createColumns(1,"","");
            changeLabel();
            widthTable();
            //comboReference(medicineName);
        /*} catch (SQLException ex) {
            ex.printStackTrace();
        }*/
    }//GEN-LAST:event_comboMedicineActionPerformed

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
        btnFind.setEnabled(false);
        int index = tblMedicine.getSelectedRow();
        TableModel model = tblMedicine.getModel();
        String medicine = model.getValueAt(index, 0).toString();
        String ID = model.getValueAt(index, 1).toString();
        String Reference = model.getValueAt(index,2).toString();
        String Name = model.getValueAt(index,3).toString();
        String Component = model.getValueAt(index,4).toString(); //property
        String Indications = model.getValueAt(index,5).toString();//appliance
        String Effect = model.getValueAt(index,6).toString();//appliance
        String Scoop = model.getValueAt(index,7).toString();
        String Gram = model.getValueAt(index,8).toString();
        String Cost = model.getValueAt(index,9).toString();
        String Sellprice = model.getValueAt(index,10).toString();
        
        txtMedicine.setText(medicine);
        txtID.setText(ID);
        txtName.setText(Name);
        txtFixedName.setText(Name);
        txtComponent.setText(Component);
        txtIndication.setText(Indications);
        txtEffect.setText(Effect);
        txtScoop.setText(Scoop);
        txtWeight.setText(Gram);
        txtCost.setText(Cost);
        txtPrice.setText(Sellprice);
        btnFind.setEnabled(true);
        txtMedicine.setVisible(true);
        txtMedicine.setEnabled(false);
        comboMedicine.setVisible(false);
        btnFind.setEnabled(false);
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtID.setEnabled(false);
        txtPrice.setEnabled(false);
        btnModify.setVisible(true);
        txtReference.setVisible(true);
        txtReference.setText(Reference);
        txtReference.setEnabled(false);
        btnReset.setVisible(true);
        btnUpdate.setVisible(false);
        comboReference.setVisible(false);
        radioReferenceName.setVisible(false);
        radioDetails.setVisible(false);
        //disabledTextBox();
        
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtPrice.setEnabled(false);
        txtID.setEnabled(false);
        btnFind.setEnabled(false);
        btnModify.setVisible(true);
        btnUpdate.setVisible(false);
        comboMedicine.setVisible(false);
        comboReference.setVisible(false);
        txtMedicine.setVisible(true);
        txtReference.setVisible(true);
        btnReset.setVisible(true);
        if(ID.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "ID没填！");
        }
        else
        {
            createColumns(2,ID,""); 
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(option == 2)
        {
            MedicalDetailMenu menu = new MedicalDetailMenu(user);
            menu.setVisible(true);
            this.dispose();
        }
        else
        {
            try {
                SearchMedicine medicine = new SearchMedicine(user);
                medicine.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String oldName = txtFixedName.getText();
        String oldReference = txtReference.getText();
        String component = txtComponent.getText();
        String indication = txtIndication.getText();
        String effect = txtEffect.getText();
        String scoop = txtScoop.getText();
        String gram = txtWeight.getText();
        String cost = txtCost.getText();
        String price = txtPrice.getText();
        String ID = txtID.getText();
        String code = ID.substring(0,9);
        String result;
        String reference = comboReference.getSelectedItem().toString();
        int referenceName = 0;
        int details = 0;
        Prescription pre = new Prescription();
        System.out.println(name);
        System.out.println(oldName);
        System.out.println(reference);
        System.out.println(oldReference);
        if(radioReferenceName.isSelected())
        {
            referenceName = 1;
        }
        else if(radioDetails.isSelected())
        {
            details = 1;
        }
        
        try
        {
            if(name.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写名字！");
            }
            else if(referenceName == 0 && details == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "请选着更新参考病症和药物名称或者更新组成，主治，功效，每次每日分量，重要，本钱，价格！");
            }
            else if(component.equalsIgnoreCase(""))
            {
                if(comboMedicine.getSelectedItem().equals("单味药粉"))
                {
                    JOptionPane.showMessageDialog(rootPane, "请填写药性！");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "请填写组成！");
                }
            }
            else if(indication.equalsIgnoreCase(""))
            {
                if(comboMedicine.getSelectedItem().equals("单味药粉"))
                {
                    JOptionPane.showMessageDialog(rootPane, "请填写应用！");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "请填写主治！");
                }
            }
            else if(effect.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写功效！");
            }
            else if(scoop.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写每次每日分量！");
            }
            else if(gram.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写重量！");
            }
            else if(cost.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写本钱！");
            }
            else if(price.equalsIgnoreCase(""))
            {
                JOptionPane.showMessageDialog(rootPane, "请填写价格！");
            }
            else
            {
                if(code.equalsIgnoreCase("GrasMedPi"))
                {
                    GrassMedicinePill pill = new GrassMedicinePill();
                    result = pill.EditGrassMedicinePill(ID, name, reference, component, indication, effect, scoop, gram, cost, price, referenceName, details, userid);
                    if(result.equalsIgnoreCase("1"))
                    {
                        //JOptionPane.showMessageDialog(rootPane, "更改成功");
                        if (JOptionPane.showConfirmDialog(null, "你要更改所有资料?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            String updateReference = pre.EditPrescriptionNewDetails("药丸", userid, "Reference", reference, oldReference, oldName);
                            if(updateReference.equalsIgnoreCase("1"))
                            {
                                String updateName = pre.EditPrescriptionNewDetails("药丸", userid, "Name", name, reference, oldName);
                                if(updateName.equalsIgnoreCase("1"))
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新成功！");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新药名失败！");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "更新失败！");
                            }
                        } else {
                            System.out.println("no");
                        }
                        model.setRowCount(0);
                        show_medical();
                        resetTextBox();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, result);
                    }
                }
                else if(code.equalsIgnoreCase("GrasMedPo"))
                {
                    GrassMedicinePotion pill = new GrassMedicinePotion();
                    result = pill.EditGrassMedicinePotion(ID, name, reference, component, indication, effect, scoop, gram, cost, price, referenceName, details, userid);
                    if(result.equalsIgnoreCase("1"))
                    {
                        if (JOptionPane.showConfirmDialog(null, "你要更改所有资料?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            String updateReference = pre.EditPrescriptionNewDetails("药水", userid, "Reference", reference, oldReference, oldName);
                            if(updateReference.equalsIgnoreCase("1"))
                            {
                                String updateName = pre.EditPrescriptionNewDetails("药水", userid, "Name", name, reference, oldName);
                                if(updateName.equalsIgnoreCase("1"))
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新成功！");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新药名失败！");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "更新失败！");
                            }
                        } else {
                            System.out.println("no");
                        }
                        model.setRowCount(0);
                        show_medical();
                        resetTextBox();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, result);
                    }
                }
                else if(code.equalsIgnoreCase("TradMedPi"))
                {
                    TraditionalMedicinePill pill = new TraditionalMedicinePill();
                    result = pill.EditTraditionalMedicinePill(ID, name, reference, component, indication, effect, scoop, gram, cost, price, referenceName, details, userid);
                    if(result.equalsIgnoreCase("1"))
                    {
                        if (JOptionPane.showConfirmDialog(null, "你要更改所有资料?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            String updateReference = pre.EditPrescriptionNewDetails("单味药粉", userid, "Reference", reference, oldReference, oldName);
                            if(updateReference.equalsIgnoreCase("1"))
                            {
                                String updateName = pre.EditPrescriptionNewDetails("单味药粉", userid, "Name", name, reference, oldName);
                                if(updateName.equalsIgnoreCase("1"))
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新成功！");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新药名失败！");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "更新失败！");
                            }
                        } else {
                            System.out.println("no");
                        }
                        model.setRowCount(0);
                        show_medical();
                        resetTextBox();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, result);
                    }
                }
                else if(code.equalsIgnoreCase("TradMedPo"))
                {
                    TraditionalMedicinePotion pill = new TraditionalMedicinePotion();    
                    result = pill.EditTraditionalMedicinePotion(ID, name, reference, component, indication, effect, scoop, gram, cost, price, referenceName, details, userid);
                    if(result.equalsIgnoreCase("1"))
                    {
                       if (JOptionPane.showConfirmDialog(null, "你要更改所有资料?", "WARNING",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                           String updateReference = pre.EditPrescriptionNewDetails("复方药粉", userid, "Reference", reference, oldReference, oldName);
                            if(updateReference.equalsIgnoreCase("1"))
                            {
                                String updateName = pre.EditPrescriptionNewDetails("复方药粉", userid, "Name", name, reference, oldName);
                                if(updateName.equalsIgnoreCase("1"))
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新成功！");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "更新药名失败！");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "更新失败！");
                            }
                        } else {
                            System.out.println("no");
                        }
                       model.setRowCount(0);
                       show_medical();
                       resetTextBox();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, result); 
                    }
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyMedicine.btnModifyActionPerformed get error on line 464, "+ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        String code = ID.substring(0,9);
        String result;
        try
        {
            if(code.equalsIgnoreCase("GrasMedPi"))
            {
                GrassMedicinePill pill = new GrassMedicinePill();
                result =pill.DeleteGrassMedicinePill(ID,userid);
                if(result.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "删除成功");
                    model.setRowCount(0);
                    show_medical();
                    resetTextBox();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result);
                }
            }
            else if(code.equalsIgnoreCase("GrasMedPo"))
            {
                GrassMedicinePotion pill = new GrassMedicinePotion();    
                result = pill.DeleteGrassMedicinePotion(ID,userid);
                if(result.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "删除成功");
                    model.setRowCount(0);
                    show_medical();
                    resetTextBox();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result);
                }
            }
            else if(code.equalsIgnoreCase("TradMedPi"))
            {
                TraditionalMedicinePill pill = new TraditionalMedicinePill(); 
                result = pill.DeleteTraditionalMedicinePill(ID,userid);
                if(result.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "删除成功");
                    model.setRowCount(0);
                    show_medical();
                    resetTextBox();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result);
                }
            }
            else if(code.equalsIgnoreCase("TradMedPo"))
            {
                TraditionalMedicinePotion pill = new TraditionalMedicinePotion();  
                result = pill.DeleteTraditionalMedicinePotion(ID,userid);
                if(result.equalsIgnoreCase("1"))
                {
                   JOptionPane.showMessageDialog(rootPane, "删除成功"); 
                   model.setRowCount(0);
                   show_medical();
                   resetTextBox();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, result); 
                }
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyMedicine.btnDeleteActionPerformed get error on line 529, "+ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String medicine = comboMedicine.getSelectedItem().toString();
        String Name = txtName.getText();
        String component = txtComponent.getText();
        String indication = txtIndication.getText();
        String effect = txtEffect.getText();
        String scoop = txtScoop.getText();
        String weight = txtWeight.getText();
        String cost = txtCost.getText();
        String price = txtPrice.getText();
        String reference = comboReference.getSelectedItem().toString();
        
        String bodyContent = printPreview(medicine,reference,Name,component,indication,effect,scoop,weight,cost,price);
        PrintForm main = new PrintForm(user,6,bodyContent);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        btnUpdate.setVisible(true);
        btnModify.setVisible(false);
        comboReference.setVisible(true);
        txtReference.setVisible(false);
        txtID.setEnabled(false);
        btnFind.setEnabled(false);
        txtName.setEnabled(true);
        txtComponent.setEnabled(true);
        txtIndication.setEnabled(true);
        txtEffect.setEnabled(true);
        txtScoop.setEnabled(true);
        txtWeight.setEnabled(true);
        txtCost.setEnabled(true);
        txtPrice.setEnabled(true);
        comboReference.setEnabled(true);
        radioReferenceName.setVisible(true);
        radioDetails.setVisible(true);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        comboMedicine.setVisible(true);
        comboReference.setVisible(true);
        txtMedicine.setVisible(false);
        txtReference.setVisible(false);
        txtID.setEnabled(true);
        btnFind.setEnabled(true);
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtPrice.setEnabled(false);
        btnReset.setVisible(false);
        txtID.setText("");
        txtName.setText("");
        txtComponent.setText("");
        txtIndication.setText("");
        txtEffect.setText("");
        txtScoop.setText("");
        txtWeight.setText("");
        txtCost.setText("");
        txtPrice.setText("");
        radioReferenceName.setVisible(false);
        radioDetails.setVisible(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void radioReferenceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReferenceNameActionPerformed
        // TODO add your handling code here:
        if(radioReferenceName.isSelected())
        {
            radioDetails.setSelected(false);
        }
    }//GEN-LAST:event_radioReferenceNameActionPerformed

    private void comboReferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReferenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReferenceActionPerformed

    private void radioDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDetailsActionPerformed
        // TODO add your handling code here:
        if(radioDetails.isSelected())
        {
            radioReferenceName.setSelected(false);
        }
    }//GEN-LAST:event_radioDetailsActionPerformed

    public String printPreview(String medicine, String reference, String Name, String component, String indication, String effect, String scoop, String weight, String cost, String price)
    {
        PrintTemplate print = new PrintTemplate();
        return print.printMedicine(medicine,reference,Name,component,indication,effect,scoop,weight,cost,price);
    }
    
    public void createColumns(int count, String ID, String medicine)
    {
        
        // count 0 就是我们一按进这个page的
        // count 1 就是换combo box
        // count 2 就是按寻找的时候
        // count 3 是来之SearchMedicine.java 那里来
        model = (DefaultTableModel)tblMedicine.getModel();
        if(count != 0 || count != 3)
        {
            model.setColumnCount(0);
            model.setRowCount(0);
        }
        if(comboMedicine.getSelectedItem().equals("单味药粉") || medicine.equals("单味药粉"))
        {
            try {
                lblzhucheng.setText("药性:");
                lblzhuzi.setText("应用:");
                model.addColumn("药物分类");
                model.addColumn("ID");
                model.addColumn("参考病症");
                model.addColumn("药物名称");
                model.addColumn("药性");
                model.addColumn("应用");
                model.addColumn("功效");
                model.addColumn("每次每日分量");
                model.addColumn("重量");
                model.addColumn("本钱");
                model.addColumn("价格");
                model.addColumn("更新时间");
                model.addColumn("创建时间");
                if(count == 0 || count == 1)
                {
                    show_medical();
                }
                else if(count == 2)
                {
                    show_medical_ID(ID);
                }
                else 
                {
                    show_medical_search_ID(ID, medicine);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "ModifyMedicine.createColumns get error on line 573, "+ex.getMessage());
            }
        }
        else
        {
            try {
                lblzhucheng.setText("组成:");
                lblzhuzi.setText("主治:");
                model.addColumn("药物分类");
                model.addColumn("ID");
                model.addColumn("参考病症");
                model.addColumn("药物名称");
                model.addColumn("组成");
                model.addColumn("主治");
                model.addColumn("功效");
                model.addColumn("每次每日分量");
                model.addColumn("重量");
                model.addColumn("本钱");
                model.addColumn("价格");
                model.addColumn("更新时间");
                model.addColumn("创建时间");
                if(count == 0 || count == 1)
                {
                    show_medical();
                }
                else if(count == 2)
                {
                    show_medical_ID(ID);
                }
                else
                {
                    show_medical_search_ID(ID, medicine);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "ModifyMedicine.createColumns get error on line 601, "+ex.getMessage());
            }
        }
    }
    
    public void show_medical() throws SQLException{
        
        if(comboMedicine.getSelectedItem().equals("单味药粉")) // traitional medicine potion
        {
            TraditionalMedicinePill medic = new TraditionalMedicinePill();
            List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
            medicList = medic.getTraditionalMedicinePill(userid);
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getProperty();
                row[5] = medicList.get(i).getAppliance();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("复方药粉"))
        {
            TraditionalMedicinePotion medic = new TraditionalMedicinePotion();
            List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
            medicList = medic.getTraditionalMedicinePotion(userid);
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("药丸"))
        {
            GrassMedicinePill medic = new GrassMedicinePill();
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = medic.getGrassMedicinePill(userid);
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("药水"))
        {
            GrassMedicinePotion medic = new GrassMedicinePotion();
            List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
            medicList = medic.getGrassMedicinePotion(userid);
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        widthTable();
    }
    
    public void show_medical_ID(String ID) throws SQLException{
        
        if(comboMedicine.getSelectedItem().equals("单味药粉")) // traitional medicine potion
        {
            TraditionalMedicinePill medic = new TraditionalMedicinePill();
            List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
            medicList = medic.findTraditionalMedicinePillDetails("ID",ID,userid);
            if(medic.validateAddTraditionalMedicinePill("ID", ID,userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getProperty());
                txtIndication.setText(medicList.get(0).getAppliance());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getProperty();
                row[5] = medicList.get(i).getAppliance();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("复方药粉"))
        {
            TraditionalMedicinePotion medic = new TraditionalMedicinePotion();
            List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
            medicList = medic.findTraditionalMedicinePotionDetails("ID",ID,userid);
            if(medic.validateTraditionalMedicinePotion("ID", ID, userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("药丸"))
        {
            GrassMedicinePill medic = new GrassMedicinePill();
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = medic.findGrassMedicinePillDetails("ID",ID, userid);
            if(medic.validateGrassMedicinePill("ID", ID, userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem().equals("药水"))
        {
            GrassMedicinePotion medic = new GrassMedicinePotion();
            List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
            medicList = medic.findGrassMedicinePotionDetails("ID",ID,userid);
            if(medic.validateAddGrassMedicinePotion("ID", ID,userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        widthTable();
    }

    public void show_medical_search_ID(String ID, String medicine) throws SQLException{
        
        if(medicine.equals("单味药粉")) // traitional medicine potion
        {
            TraditionalMedicinePill medic = new TraditionalMedicinePill();
            List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
            medicList = medic.findTraditionalMedicinePillDetails("ID",ID,userid);
            if(medic.validateAddTraditionalMedicinePill("ID", ID,userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getProperty());
                txtIndication.setText(medicList.get(0).getAppliance());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getProperty();
                row[5] = medicList.get(i).getAppliance();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(medicine.equals("复方药粉"))
        {
            TraditionalMedicinePotion medic = new TraditionalMedicinePotion();
            List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
            medicList = medic.findTraditionalMedicinePotionDetails("ID",ID,userid);
            if(medic.validateTraditionalMedicinePotion("ID", ID, userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(medicine.equals("药丸"))
        {
            GrassMedicinePill medic = new GrassMedicinePill();
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = medic.findGrassMedicinePillDetails("ID",ID, userid);
            if(medic.validateGrassMedicinePill("ID", ID, userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(medicine.equals("药水"))
        {
            GrassMedicinePotion medic = new GrassMedicinePotion();
            List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
            medicList = medic.findGrassMedicinePotionDetails("ID",ID,userid);
            if(medic.validateAddGrassMedicinePotion("ID", ID,userid) == 0)
            {
                JOptionPane.showMessageDialog(rootPane, "ID错误或是药选项错误");
            }
            else
            {
                txtName.setText(medicList.get(0).getName());
                txtComponent.setText(medicList.get(0).getComponent());
                txtIndication.setText(medicList.get(0).getIndications());
                txtEffect.setText(medicList.get(0).getEffect());
                txtScoop.setText(String.valueOf(medicList.get(0).getScoop()));
                txtWeight.setText(String.valueOf(medicList.get(0).getGram()));
                txtCost.setText(String.valueOf(medicList.get(0).getCost()));
                txtPrice.setText(String.valueOf(medicList.get(0).getSellprice()));
                //disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getMedicine();
                row[1] = medicList.get(i).getCode();
                row[2] = medicList.get(i).getReference();
                row[3] = medicList.get(i).getName();
                row[4] = medicList.get(i).getComponent();
                row[5] = medicList.get(i).getIndications();
                row[6] = medicList.get(i).getEffect();
                row[7] = medicList.get(i).getScoop();
                row[8] = medicList.get(i).getGram();
                row[9] = medicList.get(i).getCost();
                row[10] = medicList.get(i).getSellprice();
                row[11] = medicList.get(i).getLastUpdateDateTime();
                row[12] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        widthTable();
    }
    
    public void disabledTextBox()
    {
        
        txtName.setEnabled(true);
        txtComponent.setEnabled(true);
        txtIndication.setEnabled(true);
        txtEffect.setEnabled(true);
        txtScoop.setEnabled(true);
        txtWeight.setEnabled(true);
        txtCost.setEnabled(true);
        txtPrice.setEnabled(true);
        txtID.setEnabled(false);
    }
    
    public void comboMedicine()
    {
        try {
            Code code = new Code();
            
            for(int i = 0; i < code.getComboMedicine(userid).size(); i++)
            {
                System.out.println(code.getComboMedicine(userid).get(i).toString());
                comboMedicine.addItem(code.getComboMedicine(userid).get(i).getCode());
            }
            //comboReference(code.getComboMedicine(userid).get(0).getCode());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "comboMedicine get error on line 886, "+ex.getMessage());
        }
    }
    
    public void changeLabel()
    {
        if(comboMedicine.getSelectedItem().equals("药丸"))
        {
            lblWeight.setText("'S");
            lblCost.setText("本钱 RM/'S: RM");
            lblPrice.setText("价格 RM/'S: RM");
        }
        else if(comboMedicine.getSelectedItem().equals("药水"))
        {
            lblWeight.setText("ML");
            lblCost.setText("本钱 RM/10 ML: RM");
            lblPrice.setText("价格 RM/10 ML: RM");
        }
        else
        {
            lblWeight.setText("GM");
            lblCost.setText("本钱 RM/GM: RM");
            lblPrice.setText("价格 RM/GM: RM");
        }
    }
    
    public void widthTable()
    {
        this.lblName.setText(userid);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        tblMedicine.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tblMedicine.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(1500);
        columnModel.getColumn(5).setPreferredWidth(1500);
        columnModel.getColumn(6).setPreferredWidth(600);
        columnModel.getColumn(7).setPreferredWidth(150);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(100);
        columnModel.getColumn(10).setPreferredWidth(100);
        columnModel.getColumn(11).setPreferredWidth(200);
        columnModel.getColumn(12).setPreferredWidth(200);
    }
    
    public void changeLabelSearch(String medicine)
    {
        if(medicine.equals("药丸"))
        {
            lblWeight.setText("'S");
            lblCost.setText("本钱 RM/'S: RM");
            lblPrice.setText("价格 RM/'S: RM");
        }
        else if(medicine.equals("药水"))
        {
            lblWeight.setText("ML");
            lblCost.setText("本钱 RM/10 ML: RM");
            lblPrice.setText("价格 RM/10 ML: RM");
        }
        else
        {
            lblWeight.setText("GM");
            lblCost.setText("本钱 RM/GM: RM");
            lblPrice.setText("价格 RM/GM: RM");
        }
    }
    
    public void resetTextBox()
    {
        txtID.setText("");
        txtName.setText("");
        txtComponent.setText("");
        txtIndication.setText("");
        txtEffect.setText("");
        txtScoop.setText("");
        txtWeight.setText("");
        txtCost.setText("");
        txtPrice.setText("");
        txtID.setEnabled(true);
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtPrice.setEnabled(false);
        comboMedicine.setVisible(true);
        txtMedicine.setVisible(false);
        btnFind.setEnabled(true);
        comboReference.setEnabled(false);
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
        ImageIcon iconUpdateMedium = new ImageIcon(getClass().getResource("/menu/editmedium.png"));
        jLabel4.setIcon(iconUpdateMedium);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/smallEdit.png"));
        btnModify.setIcon(iconModify);
        ImageIcon iconReset = new ImageIcon(getClass().getResource("/menu/smallReset.png"));
        btnReset.setIcon(iconReset);
        setResizable(false);
    }
    
    /*public void comboReference(String medicine) throws SQLException
    {
        comboReference.removeAllItems();
        if(medicine.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill grasspill = new GrassMedicinePill();
            
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = grasspill.findReference(medicine, userid);
            
            for(int i =0; i<medicList.size(); i++)
            {
                comboReference.addItem(medicList.get(i).getReference());
            }
        }
        else if(medicine.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion grasspotion = new GrassMedicinePotion();
            
            List<GrassMedicinePotion> grassList = new ArrayList<GrassMedicinePotion>();
            grassList = grasspotion.findReference(medicine,userid);
            
            for(int i =0; i<grassList.size(); i++)
            {
                comboReference.addItem(grassList.get(i).getReference());
            }
        }
        else if(medicine.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill traditionalpill = new TraditionalMedicinePill();
            
            List<TraditionalMedicinePill> traditionPillList = new ArrayList<TraditionalMedicinePill>();
            traditionPillList = traditionalpill.findReference(medicine,userid);
            
            for(int i =0; i<traditionPillList.size(); i++)
            {
                comboReference.addItem(traditionPillList.get(i).getReference());
            }
        }
        else if(medicine.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion traditionalpotion = new TraditionalMedicinePotion();
            
            List<TraditionalMedicinePotion> traditionMedicList = new ArrayList<TraditionalMedicinePotion>();
            traditionMedicList = traditionalpotion.findReference(medicine,userid);
            
            for(int i =0; i<traditionMedicList.size(); i++)
            {
                comboReference.addItem(traditionMedicList.get(i).getReference());
            }
        }
    }*/
    
    public void comboReference()
    {
        try {
            Reference reference = new Reference();
            
            for(int i = 0; i < reference.getReferences().size(); i++)
            {
                System.out.println(reference.getReferences().get(i).toString());
                comboReference.addItem(reference.getReferences().get(i).getReference());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(ModifyMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboMedicine;
    private javax.swing.JComboBox<String> comboReference;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblzhucheng;
    private javax.swing.JLabel lblzhuzi;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JRadioButton radioDetails;
    private javax.swing.JRadioButton radioReferenceName;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTextArea txtComponent;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextArea txtEffect;
    private javax.swing.JTextField txtFixedName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtIndication;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtReference;
    private javax.swing.JTextField txtScoop;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
