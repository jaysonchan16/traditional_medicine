/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.SQLException;
import javaClass.Code;
import javaClass.Disease;
import javaClass.GrassMedicinePill;
import javaClass.GrassMedicinePotion;
import javaClass.Patient;
import javaClass.TraditionalMedicinePill;
import javaClass.TraditionalMedicinePotion;
import javaClass.User;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    private User user;
    private String userid = "";
    
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(User user)
    {
        this.user = user;
        initComponents();
        userid = user.getUserid();
        lblName.setText(userid);
        lblConfirmEmail.setVisible(false);
        lblOldEmail.setVisible(false);
        lblNewEmail.setVisible(false);
        txtOldEmail.setVisible(false);
        txtNewEmail.setVisible(false);
        txtConfirmEmail.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        findHeader = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNewID = new javax.swing.JTextField();
        txtConfirmID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblConfirmEmail = new javax.swing.JLabel();
        txtOldID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtOldPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        lblOldEmail = new javax.swing.JLabel();
        txtConfirmEmail = new javax.swing.JTextField();
        txtOldEmail = new javax.swing.JTextField();
        txtNewEmail = new javax.swing.JTextField();
        lblNewEmail = new javax.swing.JLabel();
        lblNewEmail2 = new javax.swing.JLabel();
        txtSecurityAnswer1 = new javax.swing.JTextField();
        lblConfirmEmail2 = new javax.swing.JLabel();
        comboSecurityQuestion2 = new javax.swing.JComboBox<>();
        lblConfirmEmail6 = new javax.swing.JLabel();
        txtSecurityAnswer2 = new javax.swing.JTextField();
        lblConfirmEmail7 = new javax.swing.JLabel();
        lblConfirmEmail3 = new javax.swing.JLabel();
        comboSecurityQuestion3 = new javax.swing.JComboBox<>();
        lblConfirmEmail8 = new javax.swing.JLabel();
        txtSecurityAnswer3 = new javax.swing.JTextField();
        comboSecurityQuestion1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 70);

        jLabel20.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel20.setText("登入：");
        panelHeader.add(jLabel20);
        jLabel20.setBounds(1130, 0, 75, 70);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1200, 0, 127, 70);

        findHeader.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        findHeader.setText("更改密码");
        panelHeader.add(findHeader);
        findHeader.setBounds(540, 0, 190, 70);

        jPanel2.add(panelHeader);
        panelHeader.setBounds(0, 0, 1370, 70);

        panelBody.setBackground(new java.awt.Color(255, 255, 255));
        panelBody.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelBody.setLayout(null);

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel1.setText("旧账号:");
        panelBody.add(jLabel1);
        jLabel1.setBounds(10, 10, 80, 30);

        jLabel3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel3.setText("新账号:");
        panelBody.add(jLabel3);
        jLabel3.setBounds(10, 50, 63, 30);

        txtNewID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtNewID);
        txtNewID.setBounds(120, 50, 470, 30);

        txtConfirmID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtConfirmID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmIDActionPerformed(evt);
            }
        });
        panelBody.add(txtConfirmID);
        txtConfirmID.setBounds(730, 50, 470, 30);

        jLabel2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel2.setText("确认新账号:");
        panelBody.add(jLabel2);
        jLabel2.setBounds(600, 50, 120, 30);

        jLabel5.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel5.setText("旧密码:");
        panelBody.add(jLabel5);
        jLabel5.setBounds(10, 90, 63, 30);

        jLabel6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel6.setText("新密码:");
        panelBody.add(jLabel6);
        jLabel6.setBounds(10, 130, 80, 30);

        lblConfirmEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail.setText("确认电子邮件：");
        panelBody.add(lblConfirmEmail);
        lblConfirmEmail.setBounds(600, 210, 140, 30);

        txtOldID.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtOldID);
        txtOldID.setBounds(120, 10, 470, 30);

        btnBack.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnBack.setText("退出");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        panelBody.add(btnBack);
        btnBack.setBounds(10, 500, 130, 50);

        btnUpdate.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        btnUpdate.setText("更改");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelBody.add(btnUpdate);
        btnUpdate.setBounds(1070, 500, 130, 50);

        txtConfirmPassword.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(730, 130, 470, 30);

        txtNewPassword.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtNewPassword);
        txtNewPassword.setBounds(120, 130, 470, 30);

        txtOldPassword.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtOldPassword);
        txtOldPassword.setBounds(120, 90, 470, 30);

        jLabel8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        jLabel8.setText("确认密码：");
        panelBody.add(jLabel8);
        jLabel8.setBounds(600, 130, 95, 30);

        lblOldEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblOldEmail.setText("旧电子邮件：");
        panelBody.add(lblOldEmail);
        lblOldEmail.setBounds(10, 170, 114, 30);

        txtConfirmEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtConfirmEmail);
        txtConfirmEmail.setBounds(730, 210, 470, 30);

        txtOldEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtOldEmail);
        txtOldEmail.setBounds(120, 170, 470, 30);

        txtNewEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtNewEmail);
        txtNewEmail.setBounds(120, 210, 470, 30);

        lblNewEmail.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblNewEmail.setText("新电子邮件：");
        panelBody.add(lblNewEmail);
        lblNewEmail.setBounds(10, 210, 120, 30);

        lblNewEmail2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblNewEmail2.setText("安全问题1:");
        panelBody.add(lblNewEmail2);
        lblNewEmail2.setBounds(10, 250, 120, 30);

        txtSecurityAnswer1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        txtSecurityAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecurityAnswer1ActionPerformed(evt);
            }
        });
        panelBody.add(txtSecurityAnswer1);
        txtSecurityAnswer1.setBounds(120, 290, 1080, 30);

        lblConfirmEmail2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail2.setText("安全问题2:");
        panelBody.add(lblConfirmEmail2);
        lblConfirmEmail2.setBounds(10, 330, 100, 30);

        comboSecurityQuestion2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(comboSecurityQuestion2);
        comboSecurityQuestion2.setBounds(120, 330, 1080, 30);

        lblConfirmEmail6.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail6.setText("答案1:");
        panelBody.add(lblConfirmEmail6);
        lblConfirmEmail6.setBounds(20, 290, 100, 30);

        txtSecurityAnswer2.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtSecurityAnswer2);
        txtSecurityAnswer2.setBounds(120, 370, 1080, 30);

        lblConfirmEmail7.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail7.setText("答案2:");
        panelBody.add(lblConfirmEmail7);
        lblConfirmEmail7.setBounds(20, 370, 100, 30);

        lblConfirmEmail3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail3.setText("安全问题3:");
        panelBody.add(lblConfirmEmail3);
        lblConfirmEmail3.setBounds(10, 410, 100, 30);

        comboSecurityQuestion3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(comboSecurityQuestion3);
        comboSecurityQuestion3.setBounds(120, 410, 1080, 30);

        lblConfirmEmail8.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        lblConfirmEmail8.setText("答案3:");
        panelBody.add(lblConfirmEmail8);
        lblConfirmEmail8.setBounds(20, 450, 100, 30);

        txtSecurityAnswer3.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(txtSecurityAnswer3);
        txtSecurityAnswer3.setBounds(120, 450, 1080, 30);

        comboSecurityQuestion1.setFont(new java.awt.Font("STXihei", 1, 18)); // NOI18N
        panelBody.add(comboSecurityQuestion1);
        comboSecurityQuestion1.setBounds(120, 250, 1080, 30);

        jPanel2.add(panelBody);
        panelBody.setBounds(90, 80, 1220, 560);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("CopyRight © Heng Seng Tong");
        jPanel3.add(jLabel13);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 650, 1370, 50);

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1370, 990);

        setBounds(0, 0, 1386, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmIDActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        try {
            // TODO add your handling code here:
            User usert = new User();
            boolean result = usert.ValidateAdmin(userid);
            if(result)
            {
                SettingsMenuSupervisor visor = new SettingsMenuSupervisor(user);
                visor.setVisible(true);
                this.dispose();
            }
            else
            {
                SettingsMenu detail = new SettingsMenu(user);
                detail.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            // TODO add your handling code here:
            Find();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSecurityAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecurityAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecurityAnswer1ActionPerformed

    public void Find() throws SQLException
    {
        String oldID = txtOldID.getText();
        String newID = txtNewID.getText();
        String confirmID = txtConfirmID.getText();
        String oldPassword = txtOldPassword.getText();
        String newPassword = txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        String oldEmail = txtOldEmail.getText();
        String newEmail = txtNewEmail.getText();
        String confirmEmail = txtConfirmEmail.getText();
        String SecurityQuestion1 = comboSecurityQuestion1.getSelectedItem().toString();
        String SecurityQuestion2 = comboSecurityQuestion2.getSelectedItem().toString();
        String SecurityQuestion3 = comboSecurityQuestion3.getSelectedItem().toString();
        String SecurityAnswer1 = txtSecurityAnswer1.getText();
        String SecurityAnswer2 = txtSecurityAnswer2.getText();
        String SecurityAnswer3 = txtSecurityAnswer3.getText();
        
        boolean resultValidateUsername = user.ValidateUser(userid);
        
        if(newID.equalsIgnoreCase(confirmID))
        {
            if(oldID.equalsIgnoreCase("") && newID.equalsIgnoreCase("") && confirmID.equalsIgnoreCase("")
                    && oldEmail.equalsIgnoreCase("") && newEmail.equalsIgnoreCase("") && confirmEmail.equalsIgnoreCase(""))
            {
                UpdatePassword(newPassword, confirmPassword, oldPassword,user.getUserid());
            }
            else if(oldID.equalsIgnoreCase("") && newID.equalsIgnoreCase("") && confirmID.equalsIgnoreCase("")
                    && oldPassword.equalsIgnoreCase("") && newPassword.equalsIgnoreCase("") && confirmPassword.equalsIgnoreCase(""))
            {
                UpdateEmail(newEmail, confirmEmail, oldEmail, user.getUserid());
            }
            else if(oldID.equalsIgnoreCase("") && newID.equalsIgnoreCase("") && confirmID.equalsIgnoreCase(""))
            {
                UpdateEmailPassword(newPassword, confirmPassword, oldPassword, newEmail, confirmEmail, oldEmail, user.getUserid());
            }
            else if(oldID.equalsIgnoreCase(user.getUserid()))
            {
                ModifyID(resultValidateUsername,oldID, newID,confirmID, oldPassword, newPassword, confirmPassword, oldEmail, newEmail, confirmEmail);
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "原本的ID不一致！");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "ID不一致！");
        }
        
    }
    
    public void UpdateEmailPassword(String newPassword, String confirmPassword, String oldPassword, String newEmail, String confirmEmail, String oldEmail, String Userid) throws SQLException
    {
        UpdatePassword(newPassword, confirmPassword, oldPassword,user.getUserid());
        UpdateEmail(newEmail, confirmEmail, oldEmail, user.getUserid());
    }
    
    public void ModifyID(boolean resultValidateUsername,String oldID, String newID, String confirmID, String oldPassword, String newPassword, String confirmPassword, String oldEmail, String newEmail, String confirmEmail) throws SQLException
    {
        if(resultValidateUsername)
                {
                    User user = new User();
                    Code code = new Code();
                    Disease disease = new Disease();
                    GrassMedicinePill  medicinepill = new GrassMedicinePill();
                    GrassMedicinePotion medicinepotion = new GrassMedicinePotion();
                    Patient  patient = new Patient();
                    TraditionalMedicinePill traditionalpill = new TraditionalMedicinePill();
                    TraditionalMedicinePotion traditionalpotion = new TraditionalMedicinePotion();
                    String resultDisease = disease.UpdateUser(oldID, newID);
                    String resultCode = code.UpdateUser(oldID, newID);
                    String resultmedicinepill = medicinepill.UpdateUser(oldID, newID);
                    String resultmedicinepotion = medicinepotion.UpdateUser(oldID, newID);
                    String resultpatient = patient.UpdateUser(oldID, newID);
                    String resulttraditionalpill = traditionalpill.UpdateUser(oldID, newID);
                    String resulttraditionalpotion = traditionalpotion.UpdateUser(oldID, newID);
                    String resultUser = user.UpdateUsername(oldID, newID);

                    if(!oldID.equalsIgnoreCase("") && !newID.equalsIgnoreCase("") && !confirmID.equalsIgnoreCase(""))
                    {
                        if(resultDisease != null && resultDisease.equalsIgnoreCase("1"))
                        {
                            if(resultmedicinepill != null && resultmedicinepill.equalsIgnoreCase("1"))
                            {
                                if(resultmedicinepotion != null && resultmedicinepotion.equalsIgnoreCase("1"))
                                {
                                    if(resultpatient != null && resultpatient.equalsIgnoreCase("1"))
                                    {
                                        if(resulttraditionalpill != null && resulttraditionalpill.equalsIgnoreCase("1"))
                                        {
                                            if(resulttraditionalpotion != null && resulttraditionalpotion.equalsIgnoreCase("1"))
                                            {
                                                if(resultCode != null && resultCode.equalsIgnoreCase("1"))
                                                {
                                                    if(resultUser != null && resultUser.equalsIgnoreCase("1"))
                                                    {
                                                        JOptionPane.showMessageDialog(rootPane, "ID 更改！");
                                                        lblName.setText(user.getUserid());
                                                        this.user = user;
                                                        if(!oldPassword.equalsIgnoreCase("") && !newPassword.equalsIgnoreCase("") && !confirmPassword.equalsIgnoreCase(""))
                                                        {
                                                            UpdatePassword(newPassword, confirmPassword, oldPassword,newID);
                                                        }
                                                        if(!oldEmail.equalsIgnoreCase("") && !newEmail.equalsIgnoreCase("") && !confirmEmail.equalsIgnoreCase(""))
                                                        {
                                                            UpdateEmail(newEmail, confirmEmail, oldEmail, newID);
                                                        }
                                                    }
                                                    else
                                                    {
                                                        JOptionPane.showMessageDialog(rootPane, "ID不能更改！");
                                                        disease.UpdateUser(oldID, user.getUserid());
                                                        medicinepill.UpdateUser(oldID, user.getUserid());
                                                        medicinepotion.UpdateUser(oldID, user.getUserid());
                                                        patient.UpdateUser(oldID, user.getUserid());
                                                        traditionalpill.UpdateUser(oldID, user.getUserid());
                                                        traditionalpotion.UpdateUser(oldID, user.getUserid());
                                                        user.UpdateUsername(oldID, user.getUserid());
                                                    }
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(rootPane, "系统 ID 在 database不能更改！");
                                                    disease.UpdateUser(oldID, user.getUserid());
                                                    medicinepill.UpdateUser(oldID, user.getUserid());
                                                    medicinepotion.UpdateUser(oldID, user.getUserid());
                                                    patient.UpdateUser(oldID, user.getUserid());
                                                    traditionalpill.UpdateUser(oldID, user.getUserid());
                                                    traditionalpotion.UpdateUser(oldID, user.getUserid());
                                                }
                                            }
                                            else
                                            {
                                                JOptionPane.showMessageDialog(rootPane, "复方药粉 ID 在 database不能更改！");
                                                disease.UpdateUser(oldID, user.getUserid());
                                                medicinepill.UpdateUser(oldID, user.getUserid());
                                                medicinepotion.UpdateUser(oldID, user.getUserid());
                                                patient.UpdateUser(oldID, user.getUserid());
                                                traditionalpill.UpdateUser(oldID, user.getUserid());
                                            }
                                        }
                                        else
                                        {
                                            JOptionPane.showMessageDialog(rootPane, "单味药粉 ID 在 database不能更改！");
                                            disease.UpdateUser(oldID, user.getUserid());
                                            medicinepill.UpdateUser(oldID, user.getUserid());
                                            medicinepotion.UpdateUser(oldID, user.getUserid());
                                            patient.UpdateUser(oldID, user.getUserid());
                                        }
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "病人database不能更改！");
                                        disease.UpdateUser(oldID, user.getUserid());
                                        medicinepill.UpdateUser(oldID, user.getUserid());
                                        medicinepotion.UpdateUser(oldID, user.getUserid());
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(rootPane, "药丸 ID 在 database不能更改！");
                                    disease.UpdateUser(oldID, user.getUserid());
                                    medicinepill.UpdateUser(oldID, user.getUserid());
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(rootPane, "药丸 ID 在 database不能更改！");
                                disease.UpdateUser(oldID, user.getUserid());
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(rootPane, "病症 ID 在 database不能更改！");
                        }
                    }
                    else if(oldID.equalsIgnoreCase("") && newID.equalsIgnoreCase("") && confirmID.equalsIgnoreCase(""))
                    {
                        UpdatePassword(newPassword, confirmPassword, oldPassword,user.getUserid());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "ID 资料没填");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "ID 已用过！");
                }
    }
    
    public void UpdatePassword(String newPassword, String confirmPassword, String oldPassword, String userid) throws SQLException
    {
        if(newPassword.equalsIgnoreCase(confirmPassword))
        {
            if(oldPassword.equalsIgnoreCase(user.getPassword()))
            {
                String resultUser = user.UpdatePassword(userid,newPassword);
                if(resultUser != null && resultUser.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更新密码成功！");
                }
                else
                {
                     JOptionPane.showMessageDialog(rootPane, "更新密码失败！");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "原本的密码不一致！");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "密码不一致！");
        }
    }
    
 public void UpdateEmail(String newEmail, String confirmEmail, String oldEmail, String userid) throws SQLException
    {
        if(newEmail.equalsIgnoreCase(confirmEmail))
        {
            if(oldEmail.equalsIgnoreCase(user.getEmail()))
            {
                String resultUser = user.UpdateEmail(userid,newEmail);
                if(resultUser != null && resultUser.equalsIgnoreCase("1"))
                {
                    JOptionPane.showMessageDialog(rootPane, "更新电子邮件成功！");
                }
                else
                {
                     JOptionPane.showMessageDialog(rootPane, "更新电子邮件失败！");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "原本的电子邮件不一致！");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "电子邮件不一致！");
        }
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/smallBack.png"));
        btnBack.setIcon(iconBack);
        ImageIcon iconModify = new ImageIcon(getClass().getResource("/menu/smallEdit.png"));
        btnUpdate.setIcon(iconModify);
        ImageIcon iconHeader = new ImageIcon(getClass().getResource("/menu/accountmedium.png"));
        findHeader.setIcon(iconHeader);
        this.lblName.setText(userid);
        //setResizable(false);
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboSecurityQuestion1;
    private javax.swing.JComboBox<String> comboSecurityQuestion2;
    private javax.swing.JComboBox<String> comboSecurityQuestion3;
    private javax.swing.JLabel findHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmEmail;
    private javax.swing.JLabel lblConfirmEmail2;
    private javax.swing.JLabel lblConfirmEmail3;
    private javax.swing.JLabel lblConfirmEmail6;
    private javax.swing.JLabel lblConfirmEmail7;
    private javax.swing.JLabel lblConfirmEmail8;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewEmail;
    private javax.swing.JLabel lblNewEmail2;
    private javax.swing.JLabel lblOldEmail;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextField txtConfirmEmail;
    private javax.swing.JTextField txtConfirmID;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtNewID;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtOldEmail;
    private javax.swing.JTextField txtOldID;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtSecurityAnswer1;
    private javax.swing.JTextField txtSecurityAnswer2;
    private javax.swing.JTextField txtSecurityAnswer3;
    // End of variables declaration//GEN-END:variables
}
