/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.Font;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javaClass.Bill;
import javaClass.Prescription;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Sheng
 */
public class ProfitForm extends javax.swing.JFrame {

    /**
     * Creates new form ProfitForm
     */
    private User user;
    private String from;
    private String to;
    private String userid="";
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.now();
    List<Bill> billList = new ArrayList<Bill>();
    
    public ProfitForm() {
        initComponents();
    }

    public ProfitForm(User user,String from,String to) throws SQLException {
        initComponents();
        this.user = user;
        this.from = from;
        this.to = to;
        userid = user.getUserid();
        lblName.setText(userid);
        RetrieveData();
        printPreview();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        headerPatient = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProfit = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1160, 0, 75, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1240, 0, 127, 70);

        headerPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        headerPatient.setText("利润");
        panelHeader.add(headerPatient);
        headerPatient.setBounds(490, 0, 230, 70);

        jPanel3.add(panelHeader);
        panelHeader.setBounds(0, 0, 1370, 70);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrint);
        btnPrint.setBounds(1440, 720, 150, 60);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(1640, 720, 150, 60);

        txtProfit.setColumns(20);
        txtProfit.setRows(5);
        jScrollPane1.setViewportView(txtProfit);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(80, 40, 1170, 440);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(30, 120, 1290, 520);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("CopyRight © Heng Seng Tong");
        jPanel6.add(jLabel14);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(0, 650, 1370, 50);

        jScrollPane2.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 1370, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       try {
            // TODO add your handling code here:
            txtProfit.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MonthYear ic = new MonthYear(user);
        ic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
    public void RetrieveData() throws SQLException
    {
         Bill bill = new Bill();
         
         billList = bill.getBillsByDate(userid,from, to);
    
    }
    
    public void printPreview()
    {
        StringBuilder str = new StringBuilder();
        str.append("\t\t\t\t杏生堂药行\n");
        str.append("\t\t\t107, Jalan PKS2, Pekan Simpang Kuala, \n");
        str.append("\t\t\t            05400 Alor Setar, Kedah\n");
        str.append("--------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        str.append("SALES SUMMARY (EXCLUSIVE OF VOID BILL)\t\t\tPrint Date:"+dtf.format(localDate)+"\n");
        str.append("Sales Date From ["+from+"] To ["+to+"]\n");
        str.append("User From [ADMIN] To [ADMIN]\n");
        str.append("--------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        str.append("BILL DATE\tBILL NO.\tUSER\t# ITEMS\tSUBTOTAL\n");
        str.append("--------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i =0; i<billList.size(); i++)
        {
            str.append(billList.get(i).getBillDate()+"\t");
            str.append(billList.get(i).getBillno()+"\t");
            str.append(billList.get(i).getUser()+"\t");
            str.append(billList.get(i).getItems()+"\t");
            str.append(billList.get(i).getSubtotal());
            str.append("\n");
         }
        txtProfit.setText(str.toString());
    }
    
    public void image()
    {
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconPrint = new ImageIcon(getClass().getResource("/menu/smallprint.png"));
        btnPrint.setIcon(iconPrint);
        ImageIcon iconLabel = new ImageIcon(getClass().getResource("/menu/profitmedium.png"));
        headerPatient.setIcon(iconLabel);
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
            java.util.logging.Logger.getLogger(ProfitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfitForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel headerPatient;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextArea txtProfit;
    // End of variables declaration//GEN-END:variables
}
