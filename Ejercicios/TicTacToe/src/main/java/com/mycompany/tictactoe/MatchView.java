/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MatchView extends javax.swing.JFrame {
    private final String typeOfGame;
    private final boolean isVSMachine;
    private final Map<Integer, Player> players;
    private final List<Game> games;
    private int turn;
    private int idGame;

    /**
     * Creates new form GameView
     * @param typeOfGame
     * @param isVSMachine
     * @param players
     */
    public MatchView(String typeOfGame, boolean isVSMachine, Map<Integer, Player> players) {
        initComponents();
        this.typeOfGame = typeOfGame;
        this.isVSMachine = isVSMachine;
        this.players = players;
        this.turn = 1;
        this.idGame = 0;
        this.games = new ArrayList<>() {{
            switch (typeOfGame) {
                case "unique" -> {
                    add(new Game());
                    LabelTypeOfGame.setText("Unique");
                }
                case "2 out of 3" -> {
                    add(new Game());
                    add(new Game());
                    add(new Game());
                    LabelTypeOfGame.setText("2 out of 3");
                }
                case "deathmatch" -> {
                    add(new Game());
                    LabelTypeOfGame.setText("DeathMatch");
                }
            }
        }};
        
        LabelPlayer1Name_1.setText(players.get(1).getName());
        LabelPlayer2Name_1.setText(players.get(2).getName());
        LabelPlayer1Name_2.setText(players.get(1).getName());
        LabelPlayer2Name_2.setText(players.get(2).getName());
        shootWarning("");
        setPoints();
        setTurn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        GamePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DataPanel = new javax.swing.JPanel();
        LabelPlayer1Name_1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelPlayer2Name_1 = new javax.swing.JLabel();
        LabelTypeOfGame = new javax.swing.JLabel();
        LabelPlayer1Name_2 = new javax.swing.JLabel();
        LabelPlayer2Name_2 = new javax.swing.JLabel();
        LabelPlayer1Points = new javax.swing.JLabel();
        LabelPlayer2Points = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelTurnOf = new javax.swing.JLabel();
        LabelWarning = new javax.swing.JLabel();
        BoardPanel = new javax.swing.JPanel();
        ButtonBox11 = new javax.swing.JButton();
        ButtonBox12 = new javax.swing.JButton();
        ButtonBox13 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonBox21 = new javax.swing.JButton();
        ButtonBox22 = new javax.swing.JButton();
        ButtonBox23 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonBox33 = new javax.swing.JButton();
        ButtonBox32 = new javax.swing.JButton();
        ButtonBox31 = new javax.swing.JButton();
        ButtonEndGame = new javax.swing.JButton();
        ButtonReturnToMenu = new javax.swing.JButton();
        ButtonResetGame = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(630, 380));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        GamePanel.setBackground(new java.awt.Color(255, 255, 255));
        GamePanel.setMaximumSize(new java.awt.Dimension(630, 380));
        GamePanel.setMinimumSize(new java.awt.Dimension(630, 380));
        GamePanel.setPreferredSize(new java.awt.Dimension(630, 380));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTacToe");

        LabelPlayer1Name_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPlayer1Name_1.setText("<<Player1.Name>>");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VS");

        LabelPlayer2Name_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPlayer2Name_1.setText("<<Player2.Name>>");

        LabelTypeOfGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTypeOfGame.setText("<<Partida.Tipo>>");

        LabelPlayer1Name_2.setText("<<Player1.Name>>");

        LabelPlayer2Name_2.setText("<<Player2.Name>>");

        LabelPlayer1Points.setText("<<Player1.Puntos>>");

        LabelPlayer2Points.setText("<<Player2.Puntos>>");

        jLabel2.setText("Turn Of:");

        LabelTurnOf.setText("<<Game.TurnOf>>");

        LabelWarning.setText("<<Warning>>");

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DataPanelLayout.createSequentialGroup()
                                .addComponent(LabelPlayer1Name_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPlayer1Points))
                            .addGroup(DataPanelLayout.createSequentialGroup()
                                .addComponent(LabelPlayer2Name_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPlayer2Points))
                            .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelPlayer1Name_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelPlayer2Name_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelTypeOfGame, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DataPanelLayout.createSequentialGroup()
                        .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DataPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTurnOf))
                            .addComponent(LabelWarning))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LabelPlayer1Name_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPlayer2Name_1)
                .addGap(18, 18, 18)
                .addComponent(LabelTypeOfGame)
                .addGap(18, 18, 18)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPlayer1Name_2)
                    .addComponent(LabelPlayer1Points))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPlayer2Name_2)
                    .addComponent(LabelPlayer2Points))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelTurnOf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelWarning)
                .addGap(14, 14, 14))
        );

        ButtonBox11.setContentAreaFilled(false);
        ButtonBox11.setFocusable(false);
        ButtonBox11.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox11ActionPerformed(evt);
            }
        });

        ButtonBox12.setContentAreaFilled(false);
        ButtonBox12.setFocusable(false);
        ButtonBox12.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox12ActionPerformed(evt);
            }
        });

        ButtonBox13.setContentAreaFilled(false);
        ButtonBox13.setFocusable(false);
        ButtonBox13.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox13ActionPerformed(evt);
            }
        });

        ButtonBox21.setContentAreaFilled(false);
        ButtonBox21.setFocusable(false);
        ButtonBox21.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox21ActionPerformed(evt);
            }
        });

        ButtonBox22.setContentAreaFilled(false);
        ButtonBox22.setFocusable(false);
        ButtonBox22.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox22ActionPerformed(evt);
            }
        });

        ButtonBox23.setContentAreaFilled(false);
        ButtonBox23.setFocusable(false);
        ButtonBox23.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox23ActionPerformed(evt);
            }
        });

        ButtonBox33.setContentAreaFilled(false);
        ButtonBox33.setFocusable(false);
        ButtonBox33.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox33ActionPerformed(evt);
            }
        });

        ButtonBox32.setContentAreaFilled(false);
        ButtonBox32.setFocusable(false);
        ButtonBox32.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox32ActionPerformed(evt);
            }
        });

        ButtonBox31.setContentAreaFilled(false);
        ButtonBox31.setFocusable(false);
        ButtonBox31.setPreferredSize(new java.awt.Dimension(60, 60));
        ButtonBox31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBox31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BoardPanelLayout = new javax.swing.GroupLayout(BoardPanel);
        BoardPanel.setLayout(BoardPanelLayout);
        BoardPanelLayout.setHorizontalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardPanelLayout.createSequentialGroup()
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BoardPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)))
                    .addGroup(BoardPanelLayout.createSequentialGroup()
                        .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ButtonBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BoardPanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(ButtonBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BoardPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ButtonBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BoardPanelLayout.setVerticalGroup(
            BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BoardPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ButtonEndGame.setText("End Game");
        ButtonEndGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEndGameActionPerformed(evt);
            }
        });

        ButtonReturnToMenu.setText("Return to Menu");
        ButtonReturnToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReturnToMenuActionPerformed(evt);
            }
        });

        ButtonResetGame.setText("Reset Game");
        ButtonResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GamePanelLayout.createSequentialGroup()
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(GamePanelLayout.createSequentialGroup()
                                .addComponent(ButtonReturnToMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonResetGame))
                            .addComponent(DataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonEndGame)
                            .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEndGame)
                    .addComponent(ButtonReturnToMenu)
                    .addComponent(ButtonResetGame))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox11ActionPerformed
        ButtonBox11.setText(this.turn == 1 ? "X" : "O");
        toMove("11");
    }//GEN-LAST:event_ButtonBox11ActionPerformed

    private void ButtonBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox12ActionPerformed
        ButtonBox12.setText(this.turn == 1 ? "X" : "O");
        toMove("12");
    }//GEN-LAST:event_ButtonBox12ActionPerformed

    private void ButtonBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox13ActionPerformed
        ButtonBox13.setText(this.turn == 1 ? "X" : "O");
        toMove("13");
    }//GEN-LAST:event_ButtonBox13ActionPerformed

    private void ButtonBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox21ActionPerformed
        ButtonBox21.setText(this.turn == 1 ? "X" : "O");
        toMove("21");
    }//GEN-LAST:event_ButtonBox21ActionPerformed

    private void ButtonBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox22ActionPerformed
        ButtonBox22.setText(this.turn == 1 ? "X" : "O");
        toMove("22");
    }//GEN-LAST:event_ButtonBox22ActionPerformed

    private void ButtonBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox23ActionPerformed
        ButtonBox23.setText(this.turn == 1 ? "X" : "O");
        toMove("23");
    }//GEN-LAST:event_ButtonBox23ActionPerformed

    private void ButtonBox31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox31ActionPerformed
        ButtonBox31.setText(this.turn == 1 ? "X" : "O");
        toMove("31");
    }//GEN-LAST:event_ButtonBox31ActionPerformed

    private void ButtonBox32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox32ActionPerformed
        ButtonBox32.setText(this.turn == 1 ? "X" : "O");
        toMove("32");
    }//GEN-LAST:event_ButtonBox32ActionPerformed

    private void ButtonBox33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBox33ActionPerformed
        ButtonBox33.setText(this.turn == 1 ? "X" : "O");
        toMove("33");
    }//GEN-LAST:event_ButtonBox33ActionPerformed

    private void ButtonEndGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEndGameActionPerformed
        toEndMatch();
    }//GEN-LAST:event_ButtonEndGameActionPerformed

    private void ButtonReturnToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReturnToMenuActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_ButtonReturnToMenuActionPerformed

    private void ButtonResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetGameActionPerformed
        this.dispose();
        new MatchView(typeOfGame, isVSMachine, players).setVisible(true);
    }//GEN-LAST:event_ButtonResetGameActionPerformed
    
    private void toPressButton(String location) {
        switch (location) {
            case "11" -> ButtonBox11.doClick();
            case "12" -> ButtonBox12.doClick();
            case "13" -> ButtonBox13.doClick();
            case "21" -> ButtonBox21.doClick();
            case "22" -> ButtonBox22.doClick();
            case "23" -> ButtonBox23.doClick();
            case "31" -> ButtonBox31.doClick();
            case "32" -> ButtonBox32.doClick();
            case "33" -> ButtonBox33.doClick();
        }
    }
    
    private void toCleanBoard() {
        ButtonBox11.setText("");
        ButtonBox12.setText("");
        ButtonBox13.setText("");
        ButtonBox21.setText("");
        ButtonBox22.setText("");
        ButtonBox23.setText("");
        ButtonBox31.setText("");
        ButtonBox32.setText("");
        ButtonBox33.setText("");
    }
    
    private void shootWarning(String warning) {
        LabelWarning.setText(warning);
        System.out.println(warning);
    }
    
    private void toEndMatch() {
        this.dispose();
        new EndGameView(players).setVisible(true);
    }
    
    private void setPoints() {
        LabelPlayer1Points.setText(players.get(1).getPunctuation());
        LabelPlayer2Points.setText(players.get(2).getPunctuation());
    }
    
    private void setTurn() {
        turn = turn == 1 ? 2 : 1;
        LabelTurnOf.setText(players.get(turn).getName());
    }
    
    private void toMove(String location) {
        switch (typeOfGame) {
            case "unique" -> toMoveUnique(location);
            case "2 out of 3" -> toMove2OutOf3(location);
            case "deathmatch" -> toMoveDeathMatch(location);
        }
        setPoints();
    }
    
    private void toMoveUnique(String location) { // Method to move when it's a Unique Game Match
        try {
            if (players.get(turn).getName().equals("Machine")) {
                location = MachinePlayer.toPlay(games.get(idGame).freeBoxes());
                toPressButton(location);
                games.get(idGame).setBox(location, turn);
            } else {
                games.get(idGame).setBox(location, turn);
            }            
            
            if (games.get(idGame).doesGameEnd()) {
                int winner = games.get(idGame).getWinner();
                
                if (winner != 0) { // Puntua si no es empate
                    players.get(winner).addOnePoint();
                }
                
                toEndMatch();
            }
            setTurn();
        } catch (RuntimeException e) {
            shootWarning(""+e);
        }
    }
    
    private void toMove2OutOf3(String location) {
        try {
            if (players.get(turn).getName().equals("Machine")) {
                location = MachinePlayer.toPlay(games.get(idGame).freeBoxes());
                switch (location) {
                    case "11" -> ButtonBox11.doClick();
                    case "12" -> ButtonBox12.doClick();
                    case "13" -> ButtonBox13.doClick();
                    case "21" -> ButtonBox21.doClick();
                    case "22" -> ButtonBox22.doClick();
                    case "23" -> ButtonBox23.doClick();
                    case "31" -> ButtonBox31.doClick();
                    case "32" -> ButtonBox32.doClick();
                    case "33" -> ButtonBox33.doClick();
                }
                games.get(idGame).setBox(location, turn);
            } else {
                games.get(idGame).setBox(location, turn);
            } 
            
            if (games.get(idGame).doesGameEnd()) {
                int winner = games.get(idGame).getWinner();
                
                if (winner != 0) { // Puntua si no es empate
                    players.get(winner).addOnePoint();
                }
                
                if (idGame == 1 && (players.get(1).getPunctuation().equals("2") || players.get(2).getPunctuation().equals("2"))) {
                    toEndMatch();
                }
                
                if (idGame == 2) {
                    toEndMatch();
                }
                
                idGame += 1;
                toCleanBoard();
            }
            setTurn();
        } catch (RuntimeException e) {
            shootWarning(""+e);
        }
    }
    
    private void toMoveDeathMatch(String location) {
        try {
            if (players.get(turn).getName().equals("Machine")) {
                location = MachinePlayer.toPlay(games.get(idGame).freeBoxes());
                switch (location) {
                    case "11" -> ButtonBox11.doClick();
                    case "12" -> ButtonBox12.doClick();
                    case "13" -> ButtonBox13.doClick();
                    case "21" -> ButtonBox21.doClick();
                    case "22" -> ButtonBox22.doClick();
                    case "23" -> ButtonBox23.doClick();
                    case "31" -> ButtonBox31.doClick();
                    case "32" -> ButtonBox32.doClick();
                    case "33" -> ButtonBox33.doClick();
                }
                games.get(idGame).setBox(location, turn);
            } else {
                games.get(idGame).setBox(location, turn);
            } 
            
            if(games.get(idGame).doesGameEnd()) {
                int winner = games.get(idGame).getWinner();
                
                if (winner == 0) {
                    games.add(new Game());
                    idGame += 1;
                    toCleanBoard();
                } else {
                    players.get(winner).addOnePoint();
                    toEndMatch();
                }
                
                if (idGame > 9) {
                    toEndMatch();
                }
            }
            setTurn();
        } catch (RuntimeException e) {
            shootWarning(""+e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoardPanel;
    private javax.swing.JButton ButtonBox11;
    private javax.swing.JButton ButtonBox12;
    private javax.swing.JButton ButtonBox13;
    private javax.swing.JButton ButtonBox21;
    private javax.swing.JButton ButtonBox22;
    private javax.swing.JButton ButtonBox23;
    private javax.swing.JButton ButtonBox31;
    private javax.swing.JButton ButtonBox32;
    private javax.swing.JButton ButtonBox33;
    private javax.swing.JButton ButtonEndGame;
    private javax.swing.JButton ButtonResetGame;
    private javax.swing.JButton ButtonReturnToMenu;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JPanel GamePanel;
    private javax.swing.JLabel LabelPlayer1Name_1;
    private javax.swing.JLabel LabelPlayer1Name_2;
    private javax.swing.JLabel LabelPlayer1Points;
    private javax.swing.JLabel LabelPlayer2Name_1;
    private javax.swing.JLabel LabelPlayer2Name_2;
    private javax.swing.JLabel LabelPlayer2Points;
    private javax.swing.JLabel LabelTurnOf;
    private javax.swing.JLabel LabelTypeOfGame;
    private javax.swing.JLabel LabelWarning;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
