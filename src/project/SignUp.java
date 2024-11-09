/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class SignUp extends JFrame {
    
    JPanel SPanel = new JPanel();
    JPanel SPanel2 = new JPanel();
    JPanel SPanel3 = new JPanel();
    JLabel SLabel = new JLabel("Add Employee");
    JLabel UserLabel = new JLabel("Username");
    JLabel PassLabel = new JLabel("Password");

       
    
    SignUp(){
       
       //panel
       add(SLabel);
       add(SPanel);
       add(SPanel2);
       add(SPanel3);
       
       this.setSize(1040, 780);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setName("Sign Up");
       this.setLayout(null);
       
       //Sign-up Panel
       SPanel.setSize(520, 780);
       SPanel.setLayout(null);
       SPanel.setBackground(new java.awt.Color(242, 250, 10));
       SPanel2.setSize(520, 780);
       SPanel2.setBounds(520, 0, 520, 780);
       SPanel2.setLayout(null);
       SPanel2.setBackground(new java.awt.Color(80, 46, 218));
       SPanel3.setBackground(Color.GREEN);
       SPanel3.setBounds(620, 150, 300, 400);
       SPanel3.setLayout(null);
       
       //Labels
       SLabel.setBounds(670, 100, 300, 50);
       SLabel.setFont( new Font("Arial", Font.BOLD, 30));
    }
    
}
