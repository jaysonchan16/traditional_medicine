/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    
    public ModifyMedicine() {
        initComponents();
    }

    public ModifyMedicine(User user) {
        this.user = user;
        initComponents();
        txtName.setEnabled(false);
        txtComponent.setEnabled(false);
        txtIndication.setEnabled(false);
        txtEffect.setEnabled(false);
        txtScoop.setEnabled(false);
        txtWeight.setEnabled(false);
        txtCost.setEnabled(false);
        txtPrice.setEnabled(false);
        createColumns(0,"");
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
        comboMedicine = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblzhucheng = new javax.swing.JLabel();
        txtComponent = new javax.swing.JTextField();
        lblzhuzi = new javax.swing.JLabel();
        txtIndication = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEffect = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtScoop = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("药：");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 50, 38, 26);

        comboMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "复方药粉", "药丸", "药水", "单调药粉" }));
        comboMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(comboMedicine);
        comboMedicine.setBounds(160, 50, 110, 40);

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicine);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(660, 50, 540, 860);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("名字：");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 210, 57, 30);

        txtName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(150, 210, 400, 40);

        lblzhucheng.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhucheng.setText("组成：");
        getContentPane().add(lblzhucheng);
        lblzhucheng.setBounds(100, 290, 60, 30);

        txtComponent.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtComponent);
        txtComponent.setBounds(150, 290, 400, 40);

        lblzhuzi.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblzhuzi.setText("主治：");
        getContentPane().add(lblzhuzi);
        lblzhuzi.setBounds(100, 370, 60, 30);

        txtIndication.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtIndication);
        txtIndication.setBounds(150, 370, 400, 40);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("功效：");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 450, 60, 30);

        txtEffect.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtEffect);
        txtEffect.setBounds(150, 450, 400, 40);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("每次每日分量：");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 530, 133, 30);

        txtScoop.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtScoop);
        txtScoop.setBounds(150, 530, 400, 40);

        jLabel7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel7.setText("重量：");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 610, 57, 30);

        txtCost.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtCost);
        txtCost.setBounds(150, 690, 400, 40);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("本钱：");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 690, 57, 30);

        txtWeight.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtWeight);
        txtWeight.setBounds(150, 610, 400, 40);

        jLabel9.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel9.setText("价格：");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 780, 60, 26);

        txtPrice.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtPrice);
        txtPrice.setBounds(150, 780, 400, 40);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 130, 30, 30);

        txtID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        getContentPane().add(txtID);
        txtID.setBounds(150, 130, 400, 40);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind);
        btnFind.setBounds(560, 130, 90, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(30, 850, 130, 60);

        btnModify.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnModify.setText("更改");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnModify);
        btnModify.setBounds(370, 850, 130, 60);

        btnDelete.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnDelete.setText("删除");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(520, 850, 130, 60);

        setBounds(0, 0, 1247, 985);
    }// </editor-fold>//GEN-END:initComponents

    private void comboMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedicineActionPerformed
        // TODO add your handling code here:
        createColumns(1,"");
    }//GEN-LAST:event_comboMedicineActionPerformed

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
        int index = tblMedicine.getSelectedRow();
        TableModel model = tblMedicine.getModel();
        String ID = model.getValueAt(index, 0).toString();
        String Name = model.getValueAt(index,1).toString();
        String Component = model.getValueAt(index,2).toString(); //property
        String Indications = model.getValueAt(index,3).toString();//appliance
        String Effect = model.getValueAt(index,4).toString();//appliance
        String Scoop = model.getValueAt(index,5).toString();
        String Gram = model.getValueAt(index,6).toString();
        String Cost = model.getValueAt(index,7).toString();
        String Sellprice = model.getValueAt(index,8).toString();
        
        txtID.setText(ID);
        txtName.setText(Name);
        txtComponent.setText(Component);
        txtIndication.setText(Indications);
        txtEffect.setText(Effect);
        txtScoop.setText(Scoop);
        txtWeight.setText(Gram);
        txtCost.setText(Cost);
        txtPrice.setText(Sellprice);
        
        disabledTextBox();
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        
        if(ID.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(rootPane, "ID没填！");
        }
        else
        {
            createColumns(2,ID); 
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MedicalDetailMenu menu = new MedicalDetailMenu(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String component = txtComponent.getText();
        String indication = txtIndication.getText();
        String effect = txtEffect.getText();
        String scoop = txtScoop.getText();
        String gram = txtWeight.getText();
        String cost = txtCost.getText();
        String price = txtPrice.getText();
        String ID = txtID.getText();
        String code = ID.substring(0,9);
        
        try
        {
            if(code.equalsIgnoreCase("GrasMedPi"))
            {
                GrassMedicinePill pill = new GrassMedicinePill();
                if(pill.EditGrassMedicinePill(ID, name, component, indication, effect, scoop, gram, cost, price).equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更改成功");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, pill.EditGrassMedicinePill(ID, name, component, indication, effect, scoop, gram, cost, price));
                }
            }
            else if(code.equalsIgnoreCase("GrasMedPo"))
            {
                GrassMedicinePotion pill = new GrassMedicinePotion();        
                if(pill.EditGrassMedicinePotion(ID, name, component, indication, effect, scoop, gram, cost, price).equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更改成功");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, pill.EditGrassMedicinePotion(ID, name, component, indication, effect, scoop, gram, cost, price));
                }
            }
            else if(code.equalsIgnoreCase("TradMedPi"))
            {
                TraditionalMedicinePill pill = new TraditionalMedicinePill();      
                if(pill.EditTraditionalMedicinePill(ID, name, component, indication, effect, scoop, gram, cost, price).equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更改成功");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, pill.EditTraditionalMedicinePill(ID, name, component, indication, effect, scoop, gram, cost, price));
                }
            }
            else if(code.equalsIgnoreCase("TradMedPo"))
            {
                TraditionalMedicinePotion pill = new TraditionalMedicinePotion();     
                if(pill.EditTraditionalMedicinePotion(ID, name, component, indication, effect, scoop, gram, cost, price).equalsIgnoreCase("1"))
                {
                   JOptionPane.showMessageDialog(rootPane, "更改成功"); 
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, pill.EditTraditionalMedicinePotion(ID, name, component, indication, effect, scoop, gram, cost, price)); 
                }
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    public void createColumns(int count, String ID)
    {
        // count 0 就是我们一按进这个page的
        // count 1 就是换combo box
        // count 2 就是按寻找的时候
        model = (DefaultTableModel)tblMedicine.getModel();
        if(count != 0)
        {
            model.setColumnCount(0);
            model.setRowCount(0);
        }
        if(comboMedicine.getSelectedItem() == "单调药粉")
        {
            try {
                System.out.println(1);
                lblzhucheng.setText("药性");
                lblzhuzi.setText("应用");
                model.addColumn("ID");
                model.addColumn("名字");
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
                else
                {
                    show_medical_ID(ID);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
        else
        {
            try {
                System.out.println(2);
                lblzhucheng.setText("组成");
                lblzhuzi.setText("主治");
                model.addColumn("ID");
                model.addColumn("名字");
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
                else
                {
                    show_medical_ID(ID);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    
    public void show_medical() throws SQLException{
        
        if(comboMedicine.getSelectedItem() == "单调药粉") // traitional medicine potion
        {
            TraditionalMedicinePill medic = new TraditionalMedicinePill();
            List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
            medicList = medic.getTraditionalMedicinePill();
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getProperty();
                row[3] = medicList.get(i).getAppliance();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "复方药粉")
        {
            TraditionalMedicinePotion medic = new TraditionalMedicinePotion();
            List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
            medicList = medic.getTraditionalMedicinePotion();
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "药丸")
        {
            GrassMedicinePill medic = new GrassMedicinePill();
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = medic.getGrassMedicinePill();
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "药水")
        {
            GrassMedicinePotion medic = new GrassMedicinePotion();
            List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
            medicList = medic.getGrassMedicinePotion();
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
    }
    
    public void show_medical_ID(String ID) throws SQLException{
        
        if(comboMedicine.getSelectedItem() == "单调药粉") // traitional medicine potion
        {
            TraditionalMedicinePill medic = new TraditionalMedicinePill();
            List<TraditionalMedicinePill> medicList = new ArrayList<TraditionalMedicinePill>();
            medicList = medic.getTraditionalMedicinePillID(ID);
            if(medic.validateAddTraditionalMedicinePill("ID", ID) == 0)
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
                disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getProperty();
                row[3] = medicList.get(i).getAppliance();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "复方药粉")
        {
            TraditionalMedicinePotion medic = new TraditionalMedicinePotion();
            List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
            medicList = medic.getTraditionalMedicinePotionID(ID);
            if(medic.validateTraditionalMedicinePotion("ID", ID) == 0)
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
                disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "药丸")
        {
            GrassMedicinePill medic = new GrassMedicinePill();
            List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
            medicList = medic.getGrassMedicinePillID(ID);
            if(medic.validateGrassMedicinePill("ID", ID) == 0)
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
                disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
        else if(comboMedicine.getSelectedItem() == "药水")
        {
            GrassMedicinePotion medic = new GrassMedicinePotion();
            List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
            medicList = medic.getGrassMedicinePotionID(ID);
            if(medic.validateAddGrassMedicinePotion("ID", ID) == 0)
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
                disabledTextBox();
            }
            DefaultTableModel model = (DefaultTableModel)tblMedicine.getModel();
            Object row[] = new Object[11];
            for(int i =0; i<medicList.size(); i++)
            {
                row[0] = medicList.get(i).getCode();
                row[1] = medicList.get(i).getName();
                row[2] = medicList.get(i).getComponent();
                row[3] = medicList.get(i).getIndications();
                row[4] = medicList.get(i).getEffect();
                row[5] = medicList.get(i).getScoop();
                row[6] = medicList.get(i).getGram();
                row[7] = medicList.get(i).getCost();
                row[8] = medicList.get(i).getSellprice();
                row[9] = medicList.get(i).getLastUpdateDateTime();
                row[10] = medicList.get(i).getCreateDateTime();
                model.addRow(row);
            }
        }
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
    private javax.swing.JComboBox<String> comboMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblzhucheng;
    private javax.swing.JLabel lblzhuzi;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTextField txtComponent;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtEffect;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIndication;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtScoop;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
