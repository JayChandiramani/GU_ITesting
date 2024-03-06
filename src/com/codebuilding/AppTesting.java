package com.codebuilding;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppTesting {
    private JPanel PanelName;
    private JButton ButtonMSG;

    public AppTesting() {
        ButtonMSG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You just got trolled.","Troll.exe",JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        JFrame Frametest;
        Frametest = new JFrame("AppTesting");
        Frametest.setContentPane(new AppTesting().PanelName);
        Frametest.pack();
        Frametest.setVisible(true);


    }
    }

