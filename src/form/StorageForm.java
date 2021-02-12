/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javaClass.Code;
import javaClass.Excel;
import javaClass.GrassMedicinePill;
import javaClass.GrassMedicinePotion;
import javaClass.Medicine;
import javaClass.TraditionalMedicinePill;
import javaClass.TraditionalMedicinePotion;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sheng
 */
public class StorageForm extends javax.swing.JFrame {

    /**
     * Creates new form StorageForm
     */
    private User user;
    private String userid = "";
    DefaultTableModel model ;
    TableModel tablemodel;
    JTable table;
    
    public StorageForm() {
        initComponents();
    }

    public StorageForm(User user) throws SQLException {
        initComponents();
        this.user = user;
        userid = user.getUserid();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        medicineCategory();
        FindByMedicineName2(String.valueOf(comboBoxName.getSelectedItem()));
        show_table();
        color_table();
        widthTable();
        image();
        //getNewRenderedTable(table);
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
        jLabel20 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        findHeader = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        comboBoxName = new javax.swing.JComboBox<>();
        comboBoxMedicine = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStorage = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
        findHeader.setText("创库");
        panelHeader.add(findHeader);
        findHeader.setBounds(870, 0, 200, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.setLayout(null);

        btnFind.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnFind.setText("寻找");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        panelBody.add(btnFind);
        btnFind.setBounds(350, 740, 130, 50);

        comboBoxName.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(comboBoxName);
        comboBoxName.setBounds(170, 180, 170, 40);

        comboBoxMedicine.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        comboBoxMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "复方药粉" }));
        panelBody.add(comboBoxMedicine);
        comboBoxMedicine.setBounds(170, 70, 170, 40);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("病症分类:");
        panelBody.add(jLabel1);
        jLabel1.setBounds(70, 180, 90, 40);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("药:");
        panelBody.add(jLabel2);
        jLabel2.setBounds(120, 70, 40, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(30, 740, 130, 50);

        tblStorage.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblStorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "药", "病症分类", "ID", "重量", "本钱", "价格"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStorage.setRowHeight(25);
        jScrollPane1.setViewportView(tblStorage);

        jScrollPane2.setViewportView(jScrollPane1);

        panelBody.add(jScrollPane2);
        jScrollPane2.setBounds(510, 50, 1190, 680);

        jPanel2.setBackground(new java.awt.Color(151, 254, 63));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.add(jPanel2);
        jPanel2.setBounds(1610, 750, 30, 30);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("足够");
        panelBody.add(jLabel3);
        jLabel3.setBounds(1650, 750, 90, 30);

        jPanel3.setBackground(new java.awt.Color(254, 115, 63));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.add(jPanel3);
        jPanel3.setBounds(1310, 750, 30, 30);

        jLabel4.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel4.setText("即将完");
        panelBody.add(jLabel4);
        jLabel4.setBounds(1350, 750, 90, 30);

        jPanel4.setBackground(new java.awt.Color(254, 254, 63));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.add(jPanel4);
        jPanel4.setBounds(1460, 750, 30, 30);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("不足够");
        panelBody.add(jLabel5);
        jLabel5.setBounds(1500, 750, 90, 30);

        btnExcel.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnExcel.setText("Excel");
        btnExcel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });
        panelBody.add(btnExcel);
        btnExcel.setBounds(190, 740, 130, 50);

        getContentPane().add(panelBody);
        panelBody.setBounds(100, 90, 1752, 820);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        setBounds(0, 0, 1958, 1036);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainMenu menu = new MainMenu(user);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        Excel exc = new Excel();
        int result = 0;
        result = exc.countModel(model, "Storage");
        if(result == 1)
        {
            JOptionPane.showMessageDialog(rootPane, "转换成功Excel名字叫Storage.xlsx");
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "确保你删掉旧的Storage.xlsx才来转换");
        }
    }//GEN-LAST:event_btnExcelActionPerformed

    private void createColumns()
    {
        model = (DefaultTableModel) tblStorage.getModel();
    }
    
    public void medicineCategory() throws SQLException
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
            JOptionPane.showMessageDialog(rootPane, "StorageForm.medicineCategory() get error on line 737,"+ex.getMessage());
        }
        
    }
    
    public void medicineName(String name) throws SQLException
    {
        comboBoxName.removeAllItems();
        if(name.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();
            if(pill.comboName(userid).size() <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "请添加药");
                DiseaseMenu detail = new DiseaseMenu(user);
                detail.setVisible(true);
                this.dispose();
            }
            else
            {
                for(int i = 0; i < pill.comboName(userid).size(); i++)
                {
                    comboBoxName.addItem(pill.comboName(userid).get(i).getName());
                }
                FindByMedicineName(pill.comboName(userid).get(0).getName());
            }
        }
        else if(name.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion potion = new GrassMedicinePotion();
            if(potion.comboName(userid).size() <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "请添加药");
                DiseaseMenu detail = new DiseaseMenu(user);
                detail.setVisible(true);
                this.dispose();
            }
            else
            {
                for(int i = 0; i < potion.comboName(userid).size(); i++)
                {
                    comboBoxName.addItem(potion.comboName(userid).get(i).getName());
                }
                FindByMedicineName(potion.comboName(userid).get(0).getName());
            }
        }
        else if(name.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill pill = new GrassMedicinePill();
            if(pill.comboName(userid).size() <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "请添加药");
                DiseaseMenu detail = new DiseaseMenu(user);
                detail.setVisible(true);
                this.dispose();
            }
            else
            {
                for(int i = 0; i < pill.comboName(userid).size(); i++)
                {
                    comboBoxName.addItem(pill.comboName(userid).get(i).getName());
                }
                FindByMedicineName(pill.comboName(userid).get(0).getName());
            }
        }
        else if(name.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
            if(potion.comboName(userid).size() <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "请添加药");
                DiseaseMenu detail = new DiseaseMenu(user);
                detail.setVisible(true);
                this.dispose();
            }
            else
            {
                for(int i = 0; i < potion.comboName(userid).size(); i++)
                {
                    comboBoxName.addItem(potion.comboName(userid).get(i).getName());
                }
                FindByMedicineName(potion.comboName(userid).get(0).getName());
            }
        }
        
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
            }
            else if(medicine.equalsIgnoreCase("药水"))
            {
                List<GrassMedicinePotion> medicList = new ArrayList<GrassMedicinePotion>();
                GrassMedicinePotion potion = new GrassMedicinePotion();
                medicList = potion.findGrassMedicinePotionDetails("name", name,userid);
            }
            else if(medicine.equalsIgnoreCase("药丸"))
            {
                List<GrassMedicinePill> medicList = new ArrayList<GrassMedicinePill>();
                GrassMedicinePill pill = new GrassMedicinePill();
                medicList = pill.findGrassMedicinePillDetails("name", name,userid);
            }
            else if(medicine.equalsIgnoreCase("复方药粉"))
            {
                List<TraditionalMedicinePotion> medicList = new ArrayList<TraditionalMedicinePotion>();
                TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
                medicList = potion.findTraditionalMedicinePotionDetails("name", name,userid);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "StorageForm.FindByMedicineName() get error on line 371,"+ex.getMessage());
        }
    }
    
    public void FindByMedicineName2(String name)
    {
        String medicine = (String)comboBoxMedicine.getSelectedItem();
        System.out.println("name:"+name);
        System.out.println("medicine:"+medicine);
        if(medicine.equalsIgnoreCase("单味药粉"))
        {
            TraditionalMedicinePill pill = new TraditionalMedicinePill();
            
        }
        else if(medicine.equalsIgnoreCase("药水"))
        {
            GrassMedicinePotion pill = new GrassMedicinePotion();
            
        }
        else if(medicine.equalsIgnoreCase("药丸"))
        {
            GrassMedicinePill pill =new GrassMedicinePill();
            
        }
        else if(medicine.equalsIgnoreCase("复方药粉"))
        {
            TraditionalMedicinePotion potion = new TraditionalMedicinePotion();
            
        }
    }
    
    public void show_table() throws SQLException
    {
        Medicine medicine = new Medicine();
        List<Medicine> medicineList = new ArrayList<Medicine>();
        try {
                medicineList = medicine.getAllDetail(userid);
                model = (DefaultTableModel) tblStorage.getModel();
                Object row[] = new Object[6];
                for(int i =0; i<medicineList.size(); i++)
                {
                    row[0] = medicineList.get(i).getMedicine();
                    row[1] = medicineList.get(i).getName();
                    row[2] = medicineList.get(i).getCode();
                    row[3] = medicineList.get(i).getGram();
                    row[4] = medicineList.get(i).getCost();
                    row[5] = medicineList.get(i).getSellprice();
                    model.addRow(row);
                }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "ModifyChuFang.show_table get error on line 328,"+ex.getMessage());
        }
    }
    
    public void color_table()
    {
        tblStorage.setDefaultRenderer(Object.class, new PriorityCellRenderer());
        tblStorage.getTableHeader().setReorderingAllowed(false);
    }
    
    //change the colour
    public class PriorityCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            float weight = Float.parseFloat(table.getValueAt(row, 3).toString());
            
            if (weight >= 0 && weight <= 50) {
                setBackground(new Color(254, 115, 63));  // or background
            }
            else if(weight >= 50 && weight <= 120)
            {
                setBackground(new Color(254, 254, 63));  // or background
            }
            else
            {
                setBackground(new Color(151, 254, 63));  // or background
            }
            return this;
        }
    }
    
    public void widthTable()
    {
        this.lblName.setText(user.getUserid());
        JTableHeader tableHeader = tblStorage.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
    }
        
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/smallFind.png"));
        btnFind.setIcon(iconFind);
        ImageIcon iconExcel = new ImageIcon(getClass().getResource("/menu/smallExcel.png"));
        btnExcel.setIcon(iconExcel);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/stockmedium.png"));
        findHeader.setIcon(iconHeader);
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
            java.util.logging.Logger.getLogger(StorageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorageForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorageForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> comboBoxMedicine;
    private javax.swing.JComboBox<String> comboBoxName;
    private javax.swing.JLabel findHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblStorage;
    // End of variables declaration//GEN-END:variables
}
