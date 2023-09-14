/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class DataPlayerForm extends javax.swing.JFrame {
    private final boolean isSinglePlayer;
    private final Map<String, Integer> players;
    

    /**
     * Creates new form DataPlayerForm
     * @param isSinglePlayer
     */
    public DataPlayerForm(boolean isSinglePlayer) {
        this.isSinglePlayer = isSinglePlayer;
        this.players = new HashMap<>();
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

        PlayerID = new javax.swing.JLabel();
        PlayerName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        RegisterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlayerID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PlayerID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerID.setText("Player 1");

        PlayerName.setBackground(new java.awt.Color(242, 242, 242));
        PlayerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PlayerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PlayerName.setText("Juan");
        PlayerName.setBorder(null);
        PlayerName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PlayerName.setFocusable(false);
        PlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerNameActionPerformed(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(0, 0, 0));
        RegisterButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterButton.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        RegisterButton.setText("Regist 1st");
        RegisterButton.setToolTipText("");
        RegisterButton.setBorder(null);
        RegisterButton.setBorderPainted(false);
        RegisterButton.setPreferredSize(new java.awt.Dimension(100, 50));
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PlayerName)
                    .addComponent(jSeparator1)
                    .addComponent(PlayerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(PlayerID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayerNameActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        if (isSinglePlayer && RegisterButton.getText().equals("Regist 1st")) {
            this.dispose();
            players.put(PlayerName.getText(), 0);
            players.put("Machine", 0);
            new GameView(players).setVisible(true);
        } else {
            String playerName = PlayerName.getText();            
            players.put(PlayerName.getText(), 0);
            
            if (players.size() == 2) {
                this.dispose();
                new GameView(players).setVisible(true);
            }
            
            PlayerID.setText("Player  2");
            RegisterButton.setText("Regist 2nd");
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlayerID;
    private javax.swing.JTextField PlayerName;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
