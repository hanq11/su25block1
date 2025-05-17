/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sd20304.controller;

import com.poly.sd20304.ui.WelcomeJDialog;
import com.poly.sd20304.util.XDialog;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author lovep
 */
public interface PolyCafeController {
    void init();

    default void exit(){
        if(XDialog.confirm("Bạn muốn kết thúc?")){
             System.exit(0);
        }
    }
    default void showJDialog(JDialog dialog){
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    default void showWelcomeJDialog(JFrame frame){
        this.showJDialog(new WelcomeJDialog(frame, true));
    }
    
}
