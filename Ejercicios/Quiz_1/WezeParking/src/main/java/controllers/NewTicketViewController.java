/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.NewTicketView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class NewTicketViewController implements ActionListener{
    NewTicketView view;
    Cinema cinema;

    public NewTicketViewController(Cinema cinema) {
        this.view = new NewTicketView();
        this.cinema = cinema;

        // Add ActionListener to the "Send" button
        this.view.toSend.addActionListener(this);

        // Add ActionListener to the "Go Back" button
        this.view.goBackButton.addActionListener(this);

        // Add a KeyAdapter to listen for Enter key presses in the text field
        view.ticketName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    performAction(new ActionEvent(view.ticketName, ActionEvent.ACTION_PERFORMED, ""));
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        performAction(e);
    }

    private void performAction(ActionEvent e) {
        String name = view.ticketName.getText();
        if (e.getSource() == view.goBackButton) {
            this.view.dispose();
            ManageTicketsViewController manageTicketsViewController = new ManageTicketsViewController(cinema);
            manageTicketsViewController.init();
        } else if ((e.getSource() == view.toSend || e.getSource() == view.ticketName) && !name.equals("")) {
            cinema.newTicket(name);
            view.goBackButton.doClick();
        } else {
            view.title.setText("ENTER A NAME!");
        }
    }
    
    public void init() {
        view.setTitle("Weze Parking [Cinema Tickets Management / New Ticket]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("New Ticket");
    }
}
