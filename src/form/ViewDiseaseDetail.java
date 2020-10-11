/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javaClass.Prescription;
import javaClass.TablePrintable;
import javaClass.User;
import java.awt.Font;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sheng
 */
public class ViewDiseaseDetail extends javax.swing.JFrame {

    /**
     * Creates new form ViewDiseaseDetail
     */
    private User user;
    private String from;
    private String to;
    private String initialIC;
    private String initialID;
    DefaultTableModel model ;
    public ViewDiseaseDetail() {
        initComponents();
    }

    public ViewDiseaseDetail(User user, String from, String to, String initialIC, String initialID) throws SQLException
    {
        initComponents();
        this.user = user;
        this.from = from;
        this.to = to;
        this.initialIC = initialIC;
        this.initialID = initialID;
        createColumns();
        show_patient();
        widthTable();
        JTableHeader tableHeader = tblDisease.getTableHeader();
        tableHeader.setFont(new Font("STXihei", Font.BOLD, 18));
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

        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        headerPatient = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisease = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1670, 5, 75, 60);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1752, 5, 127, 60);

        headerPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        headerPatient.setText("病症资料");
        panelHeader.add(headerPatient);
        headerPatient.setBounds(920, 0, 230, 70);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1940, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel12);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        tblDisease.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        tblDisease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDisease.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblDisease.setRowHeight(25);
        tblDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiseaseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisease);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 60, 1790, 620);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrint);
        btnPrint.setBounds(1610, 720, 100, 40);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(1730, 720, 100, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 100, 1870, 800);

        setBounds(0, 0, 1955, 1036);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiseaseMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tblDisease.getModel();
        int index = tblDisease.getSelectedRow();
        TableModel model = tblDisease.getModel();
        int column = tblDisease.getSelectedColumn();
        String ID = model.getValueAt(index, 0).toString();
        String IC = model.getValueAt(index,1).toString();
        String Name = model.getValueAt(index,2).toString();
        String Gender = model.getValueAt(index,3).toString();
        String Age = model.getValueAt(index,4).toString();
        String Phone = model.getValueAt(index,5).toString();
        String Address = model.getValueAt(index,6).toString();
        String Symptom = model.getValueAt(index,7).toString();
        String Category = model.getValueAt(index,8).toString();
        String PulseCondition = model.getValueAt(index,9).toString();
        String TongueQuality = model.getValueAt(index,10).toString();
        String TongueCoating = model.getValueAt(index,11).toString();
        String PeeShit = model.getValueAt(index,12).toString();
        String History = model.getValueAt(index,13).toString();
        String Temperature = model.getValueAt(index,14).toString();
        String BloodPressure = model.getValueAt(index,15).toString();
        String Chufang = model.getValueAt(index,16).toString();
        String CategoryTable = model.getValueAt(index,17).toString();
        String NameTable = model.getValueAt(index,18).toString();
        String Jiliang = model.getValueAt(index,19).toString();
        String Price = model.getValueAt(index,20).toString();
        String TotalPrice = model.getValueAt(index,21).toString();
        String CreateDateTime = model.getValueAt(index,22).toString();
        String LastUpdateDateTime = model.getValueAt(index,23).toString();
        String DiseaseID = model.getValueAt(index,24).toString();
        String PrescriptionID = model.getValueAt(index,25).toString();
        
        System.out.println(model.getValueAt(index, 0).toString());
        System.out.println(column);
        System.out.println(index);
        System.out.println(model.getValueAt(index, index));
        
        int option =5;
        
        if (column >= 0 && column <= 6)
        {
            ModifyPatient patient = new ModifyPatient(user,ID,IC,Name,Gender,Age,Phone,Address,CreateDateTime,LastUpdateDateTime, option, from, to, initialIC, initialID);
            patient.setVisible(true);
            this.dispose();
        }
        else if(column >= 7 && column <= 15)
        {
            try {
                ModifyDisease disease = new ModifyDisease(user,ID,IC,Name,Phone,DiseaseID,Symptom,Category,PulseCondition,TongueQuality,TongueCoating,PeeShit,History,Temperature,BloodPressure, from, to, initialIC, initialID, option);
                disease.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            try {
                ModifyChuFang chufang = new ModifyChuFang(user,ID,IC,Name,Phone,PrescriptionID,Chufang,CategoryTable,NameTable,Jiliang,Price,TotalPrice,from,to,initialIC,initialID,option);
                chufang.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblDiseaseMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MonthYearIC ic = new MonthYearIC(user,5);
        ic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        //Option 1: Cannot fitwidth and header too messy
        /*try {
            // TODO add your handling code here:
        /*    HashPrintRequestAttributeSet attr = new HashPrintRequestAttributeSet();
            attr.add(new MediaPrintableArea(500f, 1000f, 750/72f, 1000/72f, MediaPrintableArea.INCH));       

            PrinterJob job = PrinterJob.getPrinterJob();
            
            MessageFormat[] header = new MessageFormat[3];

            header[0] = new MessageFormat("");
            header[1] = new MessageFormat("zhe sheng tang" );
            header[2] = new MessageFormat("                  n" );

            MessageFormat[] footer = new MessageFormat[2];
            footer[0] = new MessageFormat("");
            footer[1] = new MessageFormat("-{1}-");
            //job.print(attr);
            job.setPrintable(new MyTablePrintable(tblDisease, JTable.PrintMode.FIT_WIDTH, header, footer));
            job.printDialog();
            job.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }*/
        
        
        //Option 2: Cannot change the font size for jtable
        try {
            // TODO add your handling code here:
            model = (DefaultTableModel) tblDisease.getModel();
            
            StringBuilder builder = new StringBuilder();
            builder.append("\t 杏生堂药行 \n");
            builder.append("\t Heng Seng Tong Medicall Hall \n");
            builder.append("\t 107, Jalan PKS2, Pekan Simpang Kuala \n");
            builder.append("\t 05400 Alor Setar, Kedah \n");
            MessageFormat header = new MessageFormat(builder.toString());
            
            JTable table = new JTable(model) {
                @Override
                public Printable getPrintable(JTable.PrintMode printMode, MessageFormat headerFormat, MessageFormat footerFormat) {
                    return new TablePrintable(tblDisease, JTable.PrintMode.FIT_WIDTH, header, footerFormat);
                }
            };
            
            
            table.print();
        
        //Option 3: use text area
          /*  StringBuilder builder = new StringBuilder();
            builder.append("\t\t 杏生堂药行 \n");
            builder.append("\t\t Heng Seng Tong Medicall Hall \n");
            builder.append("\t 107, Jalan PKS2, Pekan Simpang Kuala \n");
            builder.append("\t 05400 Alor Setar, Kedah \n");
            builder.append("----------------------------------------------------------------------------------------------------------------------\n");
            builder.append("ID\t\t");
            builder.append("IC\t\t");
            builder.append("病人名字\t\t");
            builder.append("性别\t\t");
            builder.append("年龄\t\t");
            builder.append("电话号码\t\t");
            builder.append("主症\t\t");
            builder.append("病症分类\t\t");
            builder.append("脉象\t\t");
            builder.append("舌质\t\t");
            builder.append("舌苔\t\t");
            builder.append("大小便\t\t");
            builder.append("病史\t\t");
            builder.append("体温\t\t");
            builder.append("血压\t\t");
            builder.append("处方\t\t");
            builder.append("药物种类\t\t");
            builder.append("药物名称\t\t");
            builder.append("剂量\t\t");
            builder.append("价格/G\t\t");
            builder.append("总价值\t\t");
            builder.append("----------------------------------------------------------------------------------------------------------------------\n");
            txtPrint.setText(builder.toString());
            txtPrint.print();*/
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    
    private void createColumns()
    {
        model = (DefaultTableModel) tblDisease.getModel();
        model.addColumn("ID");
        model.addColumn("IC");
        model.addColumn("病人名字");
        model.addColumn("性别");
        model.addColumn("年龄");
        model.addColumn("电话号码");
        model.addColumn("地址");
        model.addColumn("主症");
        model.addColumn("病症分类");
        model.addColumn("脉象");
        model.addColumn("舌质");
        model.addColumn("舌苔");
        model.addColumn("大小便");  
        model.addColumn("病史"); 
        model.addColumn("体温"); 
        model.addColumn("血压"); 
        model.addColumn("处方");
        model.addColumn("药物种类");
        model.addColumn("药物名称");
        model.addColumn("剂量");
        model.addColumn("价格/G");
        model.addColumn("总价值");
        model.addColumn("创建时间");
        model.addColumn("更新时间");
        model.addColumn("病症ID");
        model.addColumn("处方ID");
    }
    
    public void show_patient() throws SQLException{
         Prescription prescription = new Prescription();
         List<Prescription> prescriptionList = new ArrayList<Prescription>();
         /*if(option == 3)
         {
             patientList = patient.getPatients();
         }
         else
         {*/
             prescriptionList = prescription.getPrescriptions(from, to, initialIC, initialID);
         //}
         
         model = (DefaultTableModel)tblDisease.getModel();
         Object row[] = new Object[26];
         for(int i =0; i<prescriptionList.size(); i++)
         {
             row[0] = prescriptionList.get(i).getPatientID();
             row[1] = prescriptionList.get(i).getIC();
             row[2] = prescriptionList.get(i).getName();
             row[3] = prescriptionList.get(i).getGender();
             row[4] = prescriptionList.get(i).getAge();
             row[5] = prescriptionList.get(i).getPhone();
             row[6] = prescriptionList.get(i).getAddress();
             row[7] = prescriptionList.get(i).getSymptom();
             row[8] = prescriptionList.get(i).getCategory();
             row[9] = prescriptionList.get(i).getPulseCondition();
             row[10] = prescriptionList.get(i).getTongueQuality();
             row[11] = prescriptionList.get(i).getTongueCoating();
             row[12] = prescriptionList.get(i).getPeeShit();
             row[13] = prescriptionList.get(i).getHistory();
             row[14] = prescriptionList.get(i).getTemperature();
             row[15] = prescriptionList.get(i).getBloodPressure();
             row[16] = prescriptionList.get(i).getChufang();
             row[17] = prescriptionList.get(i).getCategorytable();
             row[18] = prescriptionList.get(i).getNametable();
             row[19] = prescriptionList.get(i).getJiliang();
             row[20] = prescriptionList.get(i).getPrice();
             row[21] = prescriptionList.get(i).getTotalprice();
             row[22] = prescriptionList.get(i).getCreateDateTime();
             row[23] = prescriptionList.get(i).getLastUpdateDateTime();
             row[24] = prescriptionList.get(i).getDiseaseID();
             row[25] = prescriptionList.get(i).getPrescriptionID();
             model.addRow(row);
         }
    }
    
    public void widthTable()
    {
        tblDisease.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //new JScrollPane(tblMedicine, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        TableColumnModel columnModel = tblDisease.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(70);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(70);
        columnModel.getColumn(7).setPreferredWidth(80);
        columnModel.getColumn(8).setPreferredWidth(50);
        columnModel.getColumn(9).setPreferredWidth(100);
        columnModel.getColumn(10).setPreferredWidth(100);
        
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
            java.util.logging.Logger.getLogger(ViewDiseaseDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDiseaseDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDiseaseDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDiseaseDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDiseaseDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel headerPatient;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTable tblDisease;
    // End of variables declaration//GEN-END:variables
}
