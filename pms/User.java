/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nist.pms;

import javax.swing.JFrame;

/**
 *
 * @author Rishika Gupta
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        userbttn = new javax.swing.JButton();
        veteranpetbttn = new javax.swing.JButton();
        managepetbttn = new javax.swing.JButton();
        lostfoundbttn = new javax.swing.JButton();
        aboutpetbttn2 = new javax.swing.JButton();
        backgroundimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userbttn.setForeground(new java.awt.Color(108, 168, 183));
        userbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-user-40.png"))); // NOI18N
        userbttn.setText("User");
        userbttn.setBorder(null);
        userbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbttnActionPerformed(evt);
            }
        });

        veteranpetbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veteranpetbttn.setForeground(new java.awt.Color(108, 168, 183));
        veteranpetbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-vaccine-40.png"))); // NOI18N
        veteranpetbttn.setText("Veteran Info");
        veteranpetbttn.setBorder(null);
        veteranpetbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veteranpetbttnActionPerformed(evt);
            }
        });

        managepetbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        managepetbttn.setForeground(new java.awt.Color(108, 168, 183));
        managepetbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-dog-35.png"))); // NOI18N
        managepetbttn.setText("Manage Pet");
        managepetbttn.setBorder(null);
        managepetbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepetbttnActionPerformed(evt);
            }
        });

        lostfoundbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lostfoundbttn.setForeground(new java.awt.Color(108, 168, 183));
        lostfoundbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-alert-40.png"))); // NOI18N
        lostfoundbttn.setText("Lost And Found");
        lostfoundbttn.setBorder(null);
        lostfoundbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostfoundbttnActionPerformed(evt);
            }
        });

        aboutpetbttn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aboutpetbttn2.setForeground(new java.awt.Color(108, 168, 183));
        aboutpetbttn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-pet-40 (1).png"))); // NOI18N
        aboutpetbttn2.setText("About Pet");
        aboutpetbttn2.setBorder(null);
        aboutpetbttn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutpetbttn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lostfoundbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veteranpetbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managepetbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutpetbttn2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(userbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(aboutpetbttn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(managepetbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(veteranpetbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(lostfoundbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/pexels-evgenii-seleznev-9238891_ccexpress (1).jpeg"))); // NOI18N
        backgroundimage.setPreferredSize(new java.awt.Dimension(1911, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backgroundimage, javax.swing.GroupLayout.PREFERRED_SIZE, 1343, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backgroundimage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbttnActionPerformed
        // TODO add your handling code here:
        UserDisplay u = new UserDisplay();
        u.setVisible(true);
    }//GEN-LAST:event_userbttnActionPerformed

    private void veteranpetbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veteranpetbttnActionPerformed
        // TODO add your handling code here:
        Veteraninfo info = new Veteraninfo();
        info.setVisible(true);

    }//GEN-LAST:event_veteranpetbttnActionPerformed

    private void managepetbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepetbttnActionPerformed
        // TODO add your handling code here:
        Managepet pet = new Managepet();
        pet.setVisible(true);

    }//GEN-LAST:event_managepetbttnActionPerformed

    private void lostfoundbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostfoundbttnActionPerformed
        // TODO add your handling code here:
       LostFound lost = new LostFound();
        lost.setVisible(true);
    }//GEN-LAST:event_lostfoundbttnActionPerformed

    private void aboutpetbttn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutpetbttn2ActionPerformed
        // TODO add your handling code here:
        AboutPage1 page = new AboutPage1();
        page.setVisible(true);
    }//GEN-LAST:event_aboutpetbttn2ActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutpetbttn2;
    private javax.swing.JLabel backgroundimage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lostfoundbttn;
    private javax.swing.JButton managepetbttn;
    private javax.swing.JButton userbttn;
    private javax.swing.JButton veteranpetbttn;
    // End of variables declaration//GEN-END:variables
}
