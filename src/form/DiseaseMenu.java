/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import javaClass.User;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheng
 */
public class DiseaseMenu extends javax.swing.JFrame {

    /**
     * Creates new form DiseaseMenu
     */
    private User user;
    public DiseaseMenu() {
        initComponents();
    }
    
    public DiseaseMenu(User user) {
        initComponents();
        this.user = user;
        this.lblName.setText(user.getUserid());
        setResizable(false);
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

        jLabel3 = new javax.swing.JLabel();
        panelHeader = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAddDisease = new javax.swing.JPanel();
        ImgAddDisease = new javax.swing.JLabel();
        lblAddDisease = new javax.swing.JLabel();
        btnModifyDisease = new javax.swing.JPanel();
        ImgModifyDisease = new javax.swing.JLabel();
        lblModifyDisease = new javax.swing.JLabel();
        btnFindChuFang = new javax.swing.JPanel();
        ImgModifyChuFang = new javax.swing.JLabel();
        lblModifyChuFang = new javax.swing.JLabel();
        btnFindDisease = new javax.swing.JPanel();
        ImgFindDisease = new javax.swing.JLabel();
        lblFindDisease = new javax.swing.JLabel();
        btnReportDisease = new javax.swing.JPanel();
        ImgDiseaseReport = new javax.swing.JLabel();
        lblDiseaseReport = new javax.swing.JLabel();
        btnBack = new javax.swing.JPanel();
        ImgBack = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(770, 56, 0, 10);

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));
        panelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        panelHeader.setForeground(new java.awt.Color(153, 153, 153));

        jLabel13.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel13.setText("登入：");

        lblName.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        jLabel1.setText("病症");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(634, 634, 634)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 696, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllogo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(panelHeader);
        panelHeader.setBounds(0, 0, 1930, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("CopyRight © Heng Seng Tong");
        jPanel1.add(jLabel12);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 940, 1940, 50);

        btnAddDisease.setBackground(new java.awt.Color(255, 255, 153));
        btnAddDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAddDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddDiseaseMouseClicked(evt);
            }
        });

        ImgAddDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgAddDiseaseMouseClicked(evt);
            }
        });

        lblAddDisease.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblAddDisease.setText("新增病症");
        lblAddDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddDiseaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAddDiseaseLayout = new javax.swing.GroupLayout(btnAddDisease);
        btnAddDisease.setLayout(btnAddDiseaseLayout);
        btnAddDiseaseLayout.setHorizontalGroup(
            btnAddDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddDiseaseLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnAddDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgAddDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnAddDiseaseLayout.setVerticalGroup(
            btnAddDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddDiseaseLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(ImgAddDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnAddDisease);
        btnAddDisease.setBounds(230, 150, 470, 350);

        btnModifyDisease.setBackground(new java.awt.Color(255, 204, 51));
        btnModifyDisease.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnModifyDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyDiseaseMouseClicked(evt);
            }
        });

        ImgModifyDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgModifyDiseaseMouseClicked(evt);
            }
        });

        lblModifyDisease.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblModifyDisease.setText("更改病症");
        lblModifyDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyDiseaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnModifyDiseaseLayout = new javax.swing.GroupLayout(btnModifyDisease);
        btnModifyDisease.setLayout(btnModifyDiseaseLayout);
        btnModifyDiseaseLayout.setHorizontalGroup(
            btnModifyDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModifyDiseaseLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnModifyDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModifyDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgModifyDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnModifyDiseaseLayout.setVerticalGroup(
            btnModifyDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnModifyDiseaseLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(ImgModifyDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblModifyDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnModifyDisease);
        btnModifyDisease.setBounds(780, 150, 470, 350);

        btnFindChuFang.setBackground(new java.awt.Color(255, 102, 51));
        btnFindChuFang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindChuFang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindChuFangMouseClicked(evt);
            }
        });

        ImgModifyChuFang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgModifyChuFangMouseClicked(evt);
            }
        });

        lblModifyChuFang.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblModifyChuFang.setText("更改处方");
        lblModifyChuFang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblModifyChuFangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFindChuFangLayout = new javax.swing.GroupLayout(btnFindChuFang);
        btnFindChuFang.setLayout(btnFindChuFangLayout);
        btnFindChuFangLayout.setHorizontalGroup(
            btnFindChuFangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFindChuFangLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnFindChuFangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModifyChuFang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgModifyChuFang, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        btnFindChuFangLayout.setVerticalGroup(
            btnFindChuFangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFindChuFangLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(ImgModifyChuFang, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblModifyChuFang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnFindChuFang);
        btnFindChuFang.setBounds(1340, 150, 470, 350);

        btnFindDisease.setBackground(new java.awt.Color(204, 255, 153));
        btnFindDisease.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnFindDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindDiseaseMouseClicked(evt);
            }
        });

        ImgFindDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgFindDiseaseMouseClicked(evt);
            }
        });

        lblFindDisease.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblFindDisease.setText("寻找病症");
        lblFindDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFindDiseaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnFindDiseaseLayout = new javax.swing.GroupLayout(btnFindDisease);
        btnFindDisease.setLayout(btnFindDiseaseLayout);
        btnFindDiseaseLayout.setHorizontalGroup(
            btnFindDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFindDiseaseLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnFindDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFindDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgFindDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        btnFindDiseaseLayout.setVerticalGroup(
            btnFindDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnFindDiseaseLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(ImgFindDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFindDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnFindDisease);
        btnFindDisease.setBounds(780, 560, 470, 350);

        btnReportDisease.setBackground(new java.awt.Color(255, 153, 153));
        btnReportDisease.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnReportDisease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportDiseaseMouseClicked(evt);
            }
        });

        ImgDiseaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgDiseaseReportMouseClicked(evt);
            }
        });

        lblDiseaseReport.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblDiseaseReport.setText("病症报告");
        lblDiseaseReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiseaseReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnReportDiseaseLayout = new javax.swing.GroupLayout(btnReportDisease);
        btnReportDisease.setLayout(btnReportDiseaseLayout);
        btnReportDiseaseLayout.setHorizontalGroup(
            btnReportDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReportDiseaseLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(btnReportDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiseaseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImgDiseaseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        btnReportDiseaseLayout.setVerticalGroup(
            btnReportDiseaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportDiseaseLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(ImgDiseaseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDiseaseReport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnReportDisease);
        btnReportDisease.setBounds(230, 560, 470, 350);

        btnBack.setBackground(new java.awt.Color(0, 255, 204));
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        ImgBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImgBackMouseClicked(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("STXihei", 1, 24)); // NOI18N
        lblBack.setText("退出");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBackLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(ImgBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(btnBack);
        btnBack.setBounds(1340, 560, 470, 350);

        setBounds(0, 0, 1933, 1036);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddDiseaseMouseClicked
        // TODO add your handling code here:
        AddDisease();
            
    }//GEN-LAST:event_lblAddDiseaseMouseClicked

    private void ImgAddDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgAddDiseaseMouseClicked
        // TODO add your handling code here:
        AddDisease();
    }//GEN-LAST:event_ImgAddDiseaseMouseClicked

    private void btnAddDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDiseaseMouseClicked
        // TODO add your handling code here:
        AddDisease();
    }//GEN-LAST:event_btnAddDiseaseMouseClicked

    private void btnModifyDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyDiseaseMouseClicked
        // TODO add your handling code here:
        ModifyDisease();
    }//GEN-LAST:event_btnModifyDiseaseMouseClicked

    private void ImgModifyDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgModifyDiseaseMouseClicked
        // TODO add your handling code here:
        ModifyDisease();
    }//GEN-LAST:event_ImgModifyDiseaseMouseClicked

    private void lblModifyDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyDiseaseMouseClicked
        // TODO add your handling code here:
        ModifyDisease();
    }//GEN-LAST:event_lblModifyDiseaseMouseClicked

    private void btnFindChuFangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindChuFangMouseClicked
        // TODO add your handling code here:
        ModifyChuFang();
    }//GEN-LAST:event_btnFindChuFangMouseClicked

    private void lblModifyChuFangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblModifyChuFangMouseClicked
        // TODO add your handling code here:
        ModifyChuFang();
    }//GEN-LAST:event_lblModifyChuFangMouseClicked

    private void ImgModifyChuFangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgModifyChuFangMouseClicked
        // TODO add your handling code here:
        ModifyChuFang();
    }//GEN-LAST:event_ImgModifyChuFangMouseClicked

    private void btnReportDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportDiseaseMouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        ReportDisease();
    }//GEN-LAST:event_btnReportDiseaseMouseClicked

    private void ImgDiseaseReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgDiseaseReportMouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        ReportDisease();
    }//GEN-LAST:event_ImgDiseaseReportMouseClicked

    private void lblDiseaseReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiseaseReportMouseClicked
        // TODO add your handling code here:
                // TODO add your handling code here:
        ReportDisease();
    }//GEN-LAST:event_lblDiseaseReportMouseClicked

    private void btnFindDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindDiseaseMouseClicked
        // TODO add your handling code here:
        findDisease();
    }//GEN-LAST:event_btnFindDiseaseMouseClicked

    private void ImgFindDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgFindDiseaseMouseClicked
        // TODO add your handling code here:
        findDisease();
    }//GEN-LAST:event_ImgFindDiseaseMouseClicked

    private void lblFindDiseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFindDiseaseMouseClicked
        // TODO add your handling code here:
        findDisease();
    }//GEN-LAST:event_lblFindDiseaseMouseClicked

    private void ImgBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImgBackMouseClicked
        // TODO add your handling code here:
        Back();
    }//GEN-LAST:event_ImgBackMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        Back();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        Back();
    }//GEN-LAST:event_btnBackMouseClicked

    public void findDisease()
    {
        try {
            // TODO add your handling code here:
            SearchDiseasePatient detail = new SearchDiseasePatient(user);
            detail.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "DiseaseMenu.findDisease get an error on line 539,"+ex.getMessage());
        }
    }
    
    public void ModifyChuFang()
    {
        try {
            // TODO add your handling code here:
            ModifyChuFang modify = new ModifyChuFang(user);
            modify.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "DiseaseMenu.btnModifyChufangActionPerformed get an error on line 551,"+ex.getMessage());
        }
    }
    
    public void ReportDisease()
    {
        MonthYearIC ic = new MonthYearIC(user,5);
        ic.setVisible(true);
        this.dispose();
    }
    
    public void AddDisease()
    {
        try {
            // TODO add your handling code here:
            NewPatientDisease patient = new NewPatientDisease(user);
            patient.setVisible(true);
            this.dispose();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "DiseaseMenu.btnAddDiseaseActionPerformed get an error on line 570,"+ex.getMessage());
            }
    }
    
    public void ModifyDisease()
    {
        try {
            // TODO add your handling code here:
            SearchDiseasePatient detail = new SearchDiseasePatient(user);
            detail.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void Back()
    {
        MainMenu main = new MainMenu(user);
        main.setVisible(true);
        this.dispose();
    }
    
    public void image()
    {
        ImageIcon iconLogo = new ImageIcon(getClass().getResource("/menu/hengsengtong.png"));
        lbllogo.setIcon(iconLogo);
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/addbig.png"));
        ImgAddDisease.setIcon(iconAdd);
        ImageIcon iconModifyDisease = new ImageIcon(getClass().getResource("/menu/edit.png"));
        ImgModifyDisease.setIcon(iconModifyDisease);
        ImageIcon iconModifyChuFang = new ImageIcon(getClass().getResource("/menu/edit.png"));
        ImgModifyChuFang.setIcon(iconModifyChuFang);
        ImageIcon iconReference = new ImageIcon(getClass().getResource("/menu/reference.png"));
        ImgDiseaseReport.setIcon(iconReference);
        ImageIcon iconFind = new ImageIcon(getClass().getResource("/menu/find.png"));
        ImgFindDisease.setIcon(iconFind);
        ImageIcon iconBack = new ImageIcon(getClass().getResource("/menu/back.png"));
        ImgBack.setIcon(iconBack);
       
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
            java.util.logging.Logger.getLogger(DiseaseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseaseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseaseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseaseMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseaseMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgAddDisease;
    private javax.swing.JLabel ImgBack;
    private javax.swing.JLabel ImgDiseaseReport;
    private javax.swing.JLabel ImgFindDisease;
    private javax.swing.JLabel ImgModifyChuFang;
    private javax.swing.JLabel ImgModifyDisease;
    private javax.swing.JPanel btnAddDisease;
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel btnFindChuFang;
    private javax.swing.JPanel btnFindDisease;
    private javax.swing.JPanel btnModifyDisease;
    private javax.swing.JPanel btnReportDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddDisease;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDiseaseReport;
    private javax.swing.JLabel lblFindDisease;
    private javax.swing.JLabel lblModifyChuFang;
    private javax.swing.JLabel lblModifyDisease;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JPanel panelHeader;
    // End of variables declaration//GEN-END:variables
}
