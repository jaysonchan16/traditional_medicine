/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import medical.LoginUI;
import javaClass.User;
import javax.swing.ImageIcon;
import medical.LoginUI2;

/**
 *
 * @author Sheng
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    private User user;
    public MainMenu(User user) {
        initComponents();
        this.user = user;
        this.lblName.setText(user.getUserid());
        image();
        setResizable(false);
    }
    
    public MainMenu(int test) {
        initComponents();
        if(test == 1)
        {
            DiseaseMenu menu = new DiseaseMenu(user);
            menu.setVisible(true);
            this.dispose();
        }
//        this.lblLoggedIn.setText(user.getUserid());
        setResizable(false);
    }
    public MainMenu() {
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

        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblhome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnStorage = new javax.swing.JPanel();
        imgStorage = new javax.swing.JLabel();
        lblStorage = new javax.swing.JLabel();
        btnPatient = new javax.swing.JPanel();
        imgPatient = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        btnDisease = new javax.swing.JPanel();
        imgDisease = new javax.swing.JLabel();
        lblDisease = new javax.swing.JLabel();
        btnProfit = new javax.swing.JPanel();
        imgProfit = new javax.swing.JLabel();
        lblProfit = new javax.swing.JLabel();
        btnReference = new javax.swing.JPanel();
        imgReference = new javax.swing.JLabel();
        lblReference = new javax.swing.JLabel();
        btnMedicine = new javax.swing.JPanel();
        imgMedicine = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        btnSetting = new javax.swing.JPanel();
        imgSetting = new javax.swing.JLabel();
        lblSetting = new javax.swing.JLabel();
        btnLogout = new javax.swing.JPanel();
        imgLogout = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));
        panelHeader.setLayout(null);
        panelHeader.add(lbllogo);
        lbllogo.setBounds(14, 2, 231, 63);

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");
        panelHeader.add(jLabel13);
        jLabel13.setBounds(1612, 5, 100, 60);

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        panelHeader.add(lblName);
        lblName.setBounds(1719, 5, 160, 60);

        lblhome.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblhome.setText("目录");
        panelHeader.add(lblhome);
        lblhome.setBounds(882, 2, 127, 63);

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1930, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel12);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        btnStorage.setBackground(new java.awt.Color(255, 204, 0));
        btnStorage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnStorage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStorageMouseClicked(evt);
            }
        });

        imgStorage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgStorageMouseClicked(evt);
            }
        });

        lblStorage.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblStorage.setText("仓库");
        lblStorage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStorageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnStorageLayout = new javax.swing.GroupLayout(btnStorage);
        btnStorage.setLayout(btnStorageLayout);
        btnStorageLayout.setHorizontalGroup(
            btnStorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnStorageLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(btnStorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnStorageLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblStorage))
                    .addComponent(imgStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        btnStorageLayout.setVerticalGroup(
            btnStorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnStorageLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(imgStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnStorage);
        btnStorage.setBounds(60, 490, 390, 290);

        btnPatient.setBackground(new java.awt.Color(204, 255, 204));
        btnPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPatientMouseClicked(evt);
            }
        });

        imgPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgPatientMouseClicked(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblPatient.setText("病人");
        lblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPatientMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPatientLayout = new javax.swing.GroupLayout(btnPatient);
        btnPatient.setLayout(btnPatientLayout);
        btnPatientLayout.setHorizontalGroup(
            btnPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPatientLayout.createSequentialGroup()
                .addGroup(btnPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPatientLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(imgPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnPatientLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        btnPatientLayout.setVerticalGroup(
            btnPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPatientLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(imgPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnPatient);
        btnPatient.setBounds(60, 140, 390, 290);

        btnDisease.setBackground(new java.awt.Color(204, 204, 255));
        btnDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiseaseMouseClicked(evt);
            }
        });

        imgDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgDiseaseMouseClicked(evt);
            }
        });

        lblDisease.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblDisease.setText("病症");
        lblDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiseaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnDiseaseLayout = new javax.swing.GroupLayout(btnDisease);
        btnDisease.setLayout(btnDiseaseLayout);
        btnDiseaseLayout.setHorizontalGroup(
            btnDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDiseaseLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(btnDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnDiseaseLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDisease))
                    .addComponent(imgDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        btnDiseaseLayout.setVerticalGroup(
            btnDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDiseaseLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(imgDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnDisease);
        btnDisease.setBounds(510, 140, 390, 290);

        btnProfit.setBackground(new java.awt.Color(0, 255, 153));
        btnProfit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnProfit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfitMouseClicked(evt);
            }
        });

        imgProfit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgProfitMouseClicked(evt);
            }
        });

        lblProfit.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblProfit.setText("利润");
        lblProfit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnProfitLayout = new javax.swing.GroupLayout(btnProfit);
        btnProfit.setLayout(btnProfitLayout);
        btnProfitLayout.setHorizontalGroup(
            btnProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfitLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(btnProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfitLayout.createSequentialGroup()
                        .addComponent(lblProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addComponent(imgProfit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136))
        );
        btnProfitLayout.setVerticalGroup(
            btnProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProfitLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(imgProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnProfit);
        btnProfit.setBounds(510, 490, 390, 290);

        btnReference.setBackground(new java.awt.Color(241, 216, 171));
        btnReference.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReferenceMouseClicked(evt);
            }
        });

        imgReference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgReferenceMouseClicked(evt);
            }
        });

        lblReference.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblReference.setText("参考病症");
        lblReference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReferenceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnReferenceLayout = new javax.swing.GroupLayout(btnReference);
        btnReference.setLayout(btnReferenceLayout);
        btnReferenceLayout.setHorizontalGroup(
            btnReferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReferenceLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(btnReferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgReference, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReference, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );
        btnReferenceLayout.setVerticalGroup(
            btnReferenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReferenceLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(imgReference, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblReference, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnReference);
        btnReference.setBounds(1460, 140, 390, 290);

        btnMedicine.setBackground(new java.awt.Color(255, 255, 204));
        btnMedicine.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedicineMouseClicked(evt);
            }
        });

        imgMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgMedicineMouseClicked(evt);
            }
        });

        lblMedicine.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblMedicine.setText("药");
        lblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnMedicineLayout = new javax.swing.GroupLayout(btnMedicine);
        btnMedicine.setLayout(btnMedicineLayout);
        btnMedicineLayout.setHorizontalGroup(
            btnMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMedicineLayout.createSequentialGroup()
                .addGroup(btnMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnMedicineLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnMedicineLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(imgMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        btnMedicineLayout.setVerticalGroup(
            btnMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMedicineLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(imgMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnMedicine);
        btnMedicine.setBounds(980, 140, 390, 290);

        btnSetting.setBackground(new java.awt.Color(255, 204, 204));
        btnSetting.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingMouseClicked(evt);
            }
        });

        imgSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSettingMouseClicked(evt);
            }
        });

        lblSetting.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblSetting.setText("设定");
        lblSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSettingLayout = new javax.swing.GroupLayout(btnSetting);
        btnSetting.setLayout(btnSettingLayout);
        btnSettingLayout.setHorizontalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnSettingLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imgSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );
        btnSettingLayout.setVerticalGroup(
            btnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSettingLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(imgSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnSetting);
        btnSetting.setBounds(980, 490, 390, 290);

        btnLogout.setBackground(new java.awt.Color(255, 153, 255));
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        imgLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLogoutMouseClicked(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblLogout.setText("登出");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLogoutLayout = new javax.swing.GroupLayout(btnLogout);
        btnLogout.setLayout(btnLogoutLayout);
        btnLogoutLayout.setHorizontalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLogoutLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                        .addComponent(imgLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        btnLogoutLayout.setVerticalGroup(
            btnLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLogoutLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(imgLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnLogout);
        btnLogout.setBounds(1460, 490, 390, 290);

        setBounds(0, 0, 1955, 1035);
    }// </editor-fold>//GEN-END:initComponents

    private void imgStorageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgStorageMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_imgStorageMouseClicked

    private void lblStorageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStorageMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblStorageMouseClicked

    private void btnStorageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStorageMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnStorageMouseClicked

    private void imgPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgPatientMouseClicked
        // TODO add your handling code here:
        patient();
    }//GEN-LAST:event_imgPatientMouseClicked

    private void lblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPatientMouseClicked
        // TODO add your handling code here:
        patient();
    }//GEN-LAST:event_lblPatientMouseClicked

    private void btnPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientMouseClicked
        // TODO add your handling code here:
        patient();
    }//GEN-LAST:event_btnPatientMouseClicked

    private void imgDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgDiseaseMouseClicked
        // TODO add your handling code here:
        disease();
    }//GEN-LAST:event_imgDiseaseMouseClicked

    private void lblDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiseaseMouseClicked
        // TODO add your handling code here:
        disease();
    }//GEN-LAST:event_lblDiseaseMouseClicked

    private void btnDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiseaseMouseClicked
        // TODO add your handling code here:
        disease();
    }//GEN-LAST:event_btnDiseaseMouseClicked

    private void imgProfitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProfitMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_imgProfitMouseClicked

    private void lblProfitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfitMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblProfitMouseClicked

    private void btnProfitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfitMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnProfitMouseClicked

    private void imgReferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgReferenceMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_imgReferenceMouseClicked

    private void lblReferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReferenceMouseClicked
        // TODO add your handling code here:
 
    }//GEN-LAST:event_lblReferenceMouseClicked

    private void btnReferenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReferenceMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnReferenceMouseClicked

    private void imgMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgMedicineMouseClicked
        // TODO add your handling code here:
        medicine();
    }//GEN-LAST:event_imgMedicineMouseClicked

    private void lblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMouseClicked
        // TODO add your handling code here:
        medicine();
    }//GEN-LAST:event_lblMedicineMouseClicked

    private void btnMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedicineMouseClicked
        // TODO add your handling code here:
        medicine();
    }//GEN-LAST:event_btnMedicineMouseClicked

    private void imgSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSettingMouseClicked
        // TODO add your handling code here:
        setting();
    }//GEN-LAST:event_imgSettingMouseClicked

    private void lblSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingMouseClicked
        // TODO add your handling code here:
        setting();
    }//GEN-LAST:event_lblSettingMouseClicked

    private void btnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingMouseClicked
        // TODO add your handling code here:
        setting();
    }//GEN-LAST:event_btnSettingMouseClicked

    private void imgLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLogoutMouseClicked
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_imgLogoutMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_btnLogoutMouseClicked

    public void patient()
    {
        PatientDetailMenu detail = new PatientDetailMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void medicine()
    {
        MedicalDetailMenu detail = new MedicalDetailMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void disease()
    {
        DiseaseMenu detail = new DiseaseMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void setting()
    {
        SettingsMenu detail = new SettingsMenu(user);
        detail.setVisible(true);
        this.dispose();
    }
    
    public void logout()
    {
        LoginUI2 login = new LoginUI2();
        login.setVisible(true);
        this.dispose();
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconPatient = new ImageIcon(getClass().getResource("/menu/patient.png"));
        imgPatient.setIcon(iconPatient);
        ImageIcon iconDisease = new ImageIcon(getClass().getResource("/menu/disease.png"));
        imgDisease.setIcon(iconDisease);
        ImageIcon iconMedicine = new ImageIcon(getClass().getResource("/menu/medicine.png"));
        imgMedicine.setIcon(iconMedicine);
        ImageIcon iconReference = new ImageIcon(getClass().getResource("/menu/refer.png"));
        imgReference.setIcon(iconReference);
        ImageIcon iconStorage = new ImageIcon(getClass().getResource("/menu/stock.png"));
        imgStorage.setIcon(iconStorage);
        ImageIcon iconProfit = new ImageIcon(getClass().getResource("/menu/profit.png"));
        imgProfit.setIcon(iconProfit);
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/menu/settings.png"));
        imgSetting.setIcon(iconSetting);
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/menu/logout.png"));
        imgLogout.setIcon(iconLogout);
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/menu/homemedium.png"));
        lblhome.setIcon(iconHome);
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDisease;
    private javax.swing.JPanel btnLogout;
    private javax.swing.JPanel btnMedicine;
    private javax.swing.JPanel btnPatient;
    private javax.swing.JPanel btnProfit;
    private javax.swing.JPanel btnReference;
    private javax.swing.JPanel btnSetting;
    private javax.swing.JPanel btnStorage;
    private javax.swing.JLabel imgDisease;
    private javax.swing.JLabel imgLogout;
    private javax.swing.JLabel imgMedicine;
    private javax.swing.JLabel imgPatient;
    private javax.swing.JLabel imgProfit;
    private javax.swing.JLabel imgReference;
    private javax.swing.JLabel imgSetting;
    private javax.swing.JLabel imgStorage;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDisease;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblProfit;
    private javax.swing.JLabel lblReference;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblStorage;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
