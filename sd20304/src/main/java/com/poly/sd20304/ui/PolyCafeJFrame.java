/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poly.sd20304.ui;

import com.poly.sd20304.controller.PolyCafeController;
import com.poly.sd20304.util.XIcon;

/**
 *
 * @author lovep
 */
public class PolyCafeJFrame extends javax.swing.JFrame implements PolyCafeController {

    /**
     * Creates new form PolyCafeJFrame
     */
    public PolyCafeJFrame() {       
        init();
        initComponents();
        
    }

    @Override
    public void init() {
        this.showWelcomeJDialog(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPhoto = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        btnSales = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnCategoryManager = new javax.swing.JButton();
        btnDrinkManager1 = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPhoto.setText("Photo");
        getContentPane().add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 110, -1, -1));

        lblFullName.setText("FullName");
        getContentPane().add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 138, -1, -1));

        btnSales.setText("Bán hàng");
        getContentPane().add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 223, 101, -1));

        btnExit.setText("Kết thúc");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 317, -1, -1));

        btnHistory.setText("Lịch sử");
        getContentPane().add(btnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 223, -1, -1));

        btnChangePassword.setText("Đổi mật khẩu");
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 317, -1, -1));

        btnCategoryManager.setText("Loại đồ uống");
        btnCategoryManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategoryManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        btnDrinkManager1.setText("Đồ uống");
        btnDrinkManager1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkManager1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDrinkManager1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poly/cafe/icons/coffee-shop.jpg"))); // NOI18N
        getContentPane().add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrinkManager1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkManager1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDrinkManager1ActionPerformed

    private void btnCategoryManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryManagerActionPerformed
        showCategoryJDialog(this);
    }//GEN-LAST:event_btnCategoryManagerActionPerformed

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
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PolyCafeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolyCafeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnCategoryManager;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDrinkManager1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnSales;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhoto;
    // End of variables declaration//GEN-END:variables

}
