/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javaClass.User;
import javaClass.Medicine;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sheng
 */
public class SearchMedicine extends javax.swing.JFrame {

    /**
     * Creates new form SearchMedical
     */
    private User user;
    DefaultTableModel model;
    private String userid = "";
    
    public SearchMedicine() {
        initComponents();
    }

    public SearchMedicine(User user) {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        createColumns();
        show_all_medical();
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        setResizable(false);
        widthTable();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        findHeader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        txtScoop = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtIndication = new javax.swing.JTextArea();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComponent = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtEffect = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtReference = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel21);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel20.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel20.setText("登入：");
        panelHeader.add(jLabel20);
        jLabel20.setBounds(1670, 5, 75, 60);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1752, 5, 127, 60);

        findHeader.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        findHeader.setText("寻找药物");
        panelHeader.add(findHeader);
        findHeader.setBounds(870, 0, 200, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel2.add(btnFind);
        btnFind.setBounds(890, 700, 130, 50);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(90, 700, 130, 50);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("价格:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(570, 520, 60, 40);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPriceKeyPressed(evt);
            }
        });
        jPanel2.add(txtPrice);
        txtPrice.setBounds(680, 520, 330, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("重量:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(570, 450, 60, 40);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWeightKeyPressed(evt);
            }
        });
        jPanel2.add(txtWeight);
        txtWeight.setBounds(680, 450, 330, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("本钱:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 520, 50, 40);

        txtCost.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostKeyPressed(evt);
            }
        });
        jPanel2.add(txtCost);
        txtCost.setBounds(180, 520, 330, 40);

        txtScoop.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtScoop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtScoopKeyPressed(evt);
            }
        });
        jPanel2.add(txtScoop);
        txtScoop.setBounds(180, 450, 330, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("每次每日分量:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 450, 120, 40);

        txtIndication.setColumns(20);
        txtIndication.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtIndication.setRows(5);
        txtIndication.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIndicationKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtIndication);

        jPanel2.add(jScrollPane4);
        jScrollPane4.setBounds(180, 280, 330, 136);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        jPanel2.add(txtName);
        txtName.setBounds(680, 30, 330, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("药物名称:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(540, 30, 110, 40);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("主治:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(100, 280, 44, 40);

        txtComponent.setColumns(20);
        txtComponent.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtComponent.setRows(5);
        txtComponent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComponentKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtComponent);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(680, 100, 330, 136);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("组成/药性:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(540, 100, 100, 40);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("药物分类:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 30, 120, 40);

        txtMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtMedicine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMedicineKeyPressed(evt);
            }
        });
        jPanel2.add(txtMedicine);
        txtMedicine.setBounds(180, 30, 330, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("功效:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(570, 270, 50, 40);

        tblMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "药物分类", "药物名称", "参考病症", "组成", "主治", "药性", "应用", "功效", "每次每日分量", "重量", "本钱", "价格", "药ID", "创建时间", "更新时间"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicine.setRowHeight(25);
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicine);

        jScrollPane5.setViewportView(jScrollPane1);

        jScrollPane2.setViewportView(jScrollPane5);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(1040, 20, 760, 730);

        jLabel10.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel10.setText("ID:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(120, 590, 30, 40);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(180, 590, 330, 40);

        txtEffect.setColumns(20);
        txtEffect.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtEffect.setRows(5);
        txtEffect.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEffectKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtEffect);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(680, 280, 330, 140);

        jLabel11.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel11.setText("参考病症：");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(80, 100, 100, 40);

        txtReference.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtReference.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReferenceKeyPressed(evt);
            }
        });
        jPanel2.add(txtReference);
        txtReference.setBounds(180, 100, 330, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 90, 1860, 780);

        setBounds(0, 0, 1958, 1038);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MedicalDetailMenu menu = new MedicalDetailMenu(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMedicineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMedicineKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String medicine = txtMedicine.getText();
            show_selected_medical("medicine",medicine,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtMedicineKeyPressed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String name = txtName.getText();
            show_selected_medical("name",name,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtComponentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComponentKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String component = txtComponent.getText();
            show_selected_medical("component",component,"property");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtComponentKeyPressed

    private void txtIndicationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIndicationKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String indication = txtIndication.getText();
            show_selected_medical("indications",indication,"appliance");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtIndicationKeyPressed

    private void txtScoopKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtScoopKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String scoop = txtScoop.getText();
            show_selected_medical("scoop",scoop,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtScoopKeyPressed

    private void txtWeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String weight = txtWeight.getText();
            show_selected_medical("gram",weight,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtWeightKeyPressed

    private void txtCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String cost = txtCost.getText();
            show_selected_medical("cost",cost,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtCostKeyPressed

    private void txtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sellprice = txtPrice.getText();
            show_selected_medical("sellprice",sellprice,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtPriceKeyPressed

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:int index = tblPatient.getSelectedRow();
        int index = tblMedicine.getSelectedRow();
        TableModel model = tblMedicine.getModel();
        String medicine = model.getValueAt(index, 0).toString();
        String reference = model.getValueAt(index,1).toString();
        String medicinename = model.getValueAt(index,2).toString();
        String component = model.getValueAt(index,3).toString();
        String indications = model.getValueAt(index,4).toString();
        String effect = model.getValueAt(index,5).toString();
        String scoop = model.getValueAt(index,6).toString();
        String weight = model.getValueAt(index,7).toString();
        String cost = model.getValueAt(index,8).toString();
        String totalprice = model.getValueAt(index,9).toString();
        String ID = model.getValueAt(index,10).toString();
        String createDateTime = model.getValueAt(index,11).toString();
        String lastUpdateTime = model.getValueAt(index,12).toString();
        //option = 2 
//        SearchPatient go through to the modifypatient
        int option = 2;
        ModifyMedicine patient = new ModifyMedicine(user,medicine,reference,medicinename,component,indications,effect,scoop,weight,
                                                    cost, totalprice,ID,createDateTime,lastUpdateTime);
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String ID = txtID.getText();
            show_selected_medical("ID",ID,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtEffectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEffectKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String effect = txtEffect.getText();
            show_selected_medical("effect",effect,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtEffectKeyPressed

    private void txtReferenceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferenceKeyPressed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String reference = txtReference.getText();
            show_selected_medical("reference",reference,"");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtReferenceKeyPressed

    
    private void createColumns()
    {
        model = (DefaultTableModel) tblMedicine.getModel();
//        model.addColumn("药");
//        model.addColumn("名字");
//        model.addColumn("组成/药性");
//        model.addColumn("主治/应用");
//        model.addColumn("功效");
//        model.addColumn("每次每日分量");
//        model.addColumn("重量");
//        model.addColumn("本钱");
//        model.addColumn("价格");
    }
    
    public void show_selected_medical(String contribute,String detail, String contribute1) throws SQLException{
        model.setRowCount(0);
        Medicine medicine = new Medicine();
        List<Medicine> medicineList = new ArrayList<Medicine>();
        medicineList = medicine.getDetail(contribute,detail,contribute1,userid);
        model = (DefaultTableModel)tblMedicine.getModel();
        Object row[] = new Object[13];
        for(int i =0; i<medicineList.size(); i++)
        {
            row[0] = medicineList.get(i).getMedicine();
            row[1] = medicineList.get(i).getName();
            row[2] = medicineList.get(i).getReference();
            row[3] = medicineList.get(i).getComponent();
            row[4] = medicineList.get(i).getIndications();
            row[5] = medicineList.get(i).getEffect();
            row[6] = medicineList.get(i).getScoop();
            row[7] = medicineList.get(i).getGram();
            row[8] = medicineList.get(i).getCost();
            row[9] = medicineList.get(i).getSellprice();
            row[10] = medicineList.get(i).getCode();
            row[11] = medicineList.get(i).getCreateDateTime();
            row[12] = medicineList.get(i).getLastUpdateDateTime();
            model.addRow(row);
        }
    }
    
    public void show_all_medical()
    {
        try {
            model.setRowCount(0);
            Medicine medicine = new Medicine();
            List<Medicine> medicineList = new ArrayList<Medicine>();
            medicineList = medicine.getAllDetail(userid);
            model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[13];
            for(int i =0; i<medicineList.size(); i++)
            {
                row[0] = medicineList.get(i).getMedicine();
                row[1] = medicineList.get(i).getName();
                row[2] = medicineList.get(i).getReference();
                row[3] = medicineList.get(i).getComponent();
                row[4] = medicineList.get(i).getIndications();
                row[5] = medicineList.get(i).getEffect();
                row[6] = medicineList.get(i).getScoop();
                row[7] = medicineList.get(i).getGram();
                row[8] = medicineList.get(i).getCost();
                row[9] = medicineList.get(i).getSellprice();
                row[10] = medicineList.get(i).getCode();
                row[11] = medicineList.get(i).getCreateDateTime();
                row[12] = medicineList.get(i).getLastUpdateDateTime();
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void image()
    {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFind.setIcon(iconFind);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/findmedium.png"));
        findHeader.setIcon(iconHeader);
        this.lblName.setText(userid);
        setResizable(false);
    }
    
    public void widthTable()
    {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        JTableHeader tableHeader = tblMedicine.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
        tblMedicine.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TableColumnModel columnModel = tblMedicine.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(1500);
        columnModel.getColumn(4).setPreferredWidth(1500);
        columnModel.getColumn(5).setPreferredWidth(600);
        columnModel.getColumn(6).setPreferredWidth(150);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(100);
        columnModel.getColumn(9).setPreferredWidth(100);
        columnModel.getColumn(10).setPreferredWidth(150);
        columnModel.getColumn(11).setPreferredWidth(200);
        columnModel.getColumn(12).setPreferredWidth(200);
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
            java.util.logging.Logger.getLogger(SearchMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel findHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTextArea txtComponent;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextArea txtEffect;
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
