/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.BorderLayout;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.util.ArrayList;
import javaClass.User;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sheng
 */
public class PrintForm extends javax.swing.JFrame {

    /**
     * Creates new form PrintForm
     */
    private User user;
    private int option;
    private String bodyContent;
    private String diseaseIC = "";
    private String IC = "";
    private String ID = "";
    private String Name ="";
    private String Phone="";
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
    private String Address = "";
    private String Age = "";
    private String Gender = "";
    private String lastUpdateDateTime = "";
    private ArrayList<String> chufang;
    private ArrayList<String> medicine;
    private ArrayList<String> medicinecategory;
    private ArrayList<String> medicinereference;
    private ArrayList<String> jiliang;
    private ArrayList<String> price;
    private ArrayList<String> totalprice;
    private ArrayList<String> remaining;
    private ArrayList<String> prescriptionID;
    private ArrayList<String> weightlist;
    private String totalweight="";
    private String mainprice="";
    private String medic="";
    private String refer="";
    private String medicName="";
    private String component="";
    private String indication="";
    private String effect="";
    private String scoop="";
    private String weight="";
    private String cost="";
    private String medicPrice="";
    
    public PrintForm() {
        initComponents();
    }
    
    public PrintForm(User user, int option, String bodyContent)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
    }
    
    public PrintForm(User user, int option, String bodyContent,String diseaseIC)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        this.diseaseIC = diseaseIC;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
    }
    
    public PrintForm(User user, int option, String bodyContent,String diseaseIC,  String Name, String Gender, 
            String Age, String Phone, String Address, String Date)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        this.diseaseIC = diseaseIC;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
        this.Phone = Phone;
        this.Date = Date;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
    }
    
    public PrintForm(User user, int option, String bodyContent, String medic, String refer, String medicName,String component,
            String indication, String effect, String scoop, String weight, String cost, String medicPrice, String page)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        this.medic = medic;
        this.refer = refer;
        this.medicName = medicName;
        this.component = component;
        this.indication = indication;
        this.effect = effect;
        this.scoop = scoop;
        this.weight = weight;
        this.cost =cost;
        this.medicPrice = medicPrice;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
    }
    
    public PrintForm(User user, int option, String bodyContent,String diseaseIC,  String Name, String Gender, 
            String Age, String Phone, String Address, String Date ,String ID, String updateDate)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        this.diseaseIC = diseaseIC;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Age = Age;
        this.Phone = Phone;
        this.Date = Date;
        this.ID =ID;
        this.lastUpdateDateTime = updateDate;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
    }
    
    public PrintForm(User user, int option, String bodyContent, String IC, String ID, String Name, String Phone, String Date, String symptom, String category, 
            String pulse,String tongueQuality,String tongueCoating, String shit, String history, String temperature, String blood,
            ArrayList<String> chufang, ArrayList<String> medicine, ArrayList<String> medicinecategory, ArrayList<String> medicineReference,
            ArrayList<String> jiliang, ArrayList<String> price, ArrayList<String> totalprice, String totalweight, String mainprice, ArrayList<String> remaining, ArrayList<String> prescriptionID, ArrayList<String> weightList)
    {
        this.user = user;
        this.option = option;
        this.bodyContent = bodyContent;
        this.IC = IC; 
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Date = Date;
        this.symptom = symptom;
        this.category = category; 
        this.medicinereference = medicineReference;
        this.pulse = pulse;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.shit = shit; 
        this.history = history;
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
        this.weightlist = weightList;
        initComponents();
        //txtAreaPrint = new JTextArea(5, 10);
        printPreview(bodyContent);
        lblName.setText(user.getUserid());
        //1 option from modifypatient
        //2 option from modifypatient
        //3 option from newPatient
        //4 option from newPatientDisease
        //5 option for new medicine
        //6 option for modify medicine
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
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPrint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setText("打印预览");
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(null);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);
        btnBack.setBounds(560, 780, 100, 40);

        btnPrint.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnPrint.setText("打印");
        btnPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrint);
        btnPrint.setBounds(970, 780, 100, 40);

        txtAreaPrint.setColumns(20);
        txtAreaPrint.setFont(new java.awt.Font("STXihei", 1, 10)); // NOI18N
        txtAreaPrint.setRows(5);
        jScrollPane1.setViewportView(txtAreaPrint);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(560, 20, 508, 748);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 90, 1810, 830);

        setBounds(0, 0, 1958, 1037);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // TODO add your handling code here:
            txtAreaPrint.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(option == 1)
        {
            ModifyPatient modify = new ModifyPatient(user, option, diseaseIC, Name, Gender, 
            Age, Phone, Address, Date,ID,lastUpdateDateTime);
            modify.setVisible(true);
            this.dispose();
        }
        else if(option == 2)
        {
            try {
                ModifyChuFang modify = new ModifyChuFang(user);
                modify.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if(option == 3)
        {
            if(diseaseIC.equalsIgnoreCase(""))
            {
                NewPatient modify = new NewPatient(user);
                modify.setVisible(true);
                this.dispose();
            }
            else
            {
                NewPatient modify = new NewPatient(user,diseaseIC, Name, Gender, 
                                                    Age, Phone, Address, Date);
                modify.setVisible(true);
                this.dispose();
            }
        }  
        else if(option == 4)
        {
            try {
                NewPatientDisease1 modify = new NewPatientDisease1(user, IC, ID, Name, Phone, Date, symptom, category, 
                pulse,tongueQuality,tongueCoating, shit, history, temperature, blood,
                chufang, medicine, medicinecategory,medicinereference,
                jiliang, price, totalprice, totalweight, mainprice,remaining,prescriptionID,weightlist);
                modify.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if(option == 5)
        {
            NewMedicine modify = new NewMedicine(user, medic, refer, medicName, component,
            indication, effect, scoop, weight, cost, medicPrice);
            modify.setVisible(true);
            this.dispose();
        }  
        else if(option == 6)
        {
            ModifyMedicine modify = new ModifyMedicine(user,2);
            modify.setVisible(true);
            this.dispose();
        }
        else if(option == 7)
        {
            try {
                ModifyDisease modify = new ModifyDisease(user);
                modify.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if(option == 8)
        {
            try {
                ModifyChuFang modify = new ModifyChuFang(user);
                modify.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    public void printPreview(String bodyContent)
    {
        StringBuilder str = new StringBuilder();
        str.append("\t\t\t\t杏生堂药行\n");
        str.append("\t\t\t107, Jalan PKS2, Pekan Simpang Kuala, \n");
        str.append("\t\t\t            05400 Alor Setar, Kedah\n");
        str.append("--------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        str.append(bodyContent);
        
        txtAreaPrint.setText(str.toString());
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
            java.util.logging.Logger.getLogger(PrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextArea txtAreaPrint;
    // End of variables declaration//GEN-END:variables
}
