/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.DeleteVehicleView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class DeleteVehicleViewController implements ActionListener{
    DeleteVehicleView view;
    Cinema cinema;

    public DeleteVehicleViewController(Cinema cinema) {
        this.view = new DeleteVehicleView();
        this.cinema = cinema;

        // Add ActionListener to the "Delete" button
        this.view.toDelete.addActionListener(this);

        // Add ActionListener to the "Go Back" button
        this.view.goBackButton.addActionListener(this);

        // Add a KeyAdapter to listen for Enter key presses in the text field
        view.vehiclePlate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    performAction(new ActionEvent(view.vehiclePlate, ActionEvent.ACTION_PERFORMED, ""));
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        performAction(e);
    }

    private void performAction(ActionEvent e) {
        String input = view.vehiclePlate.getText();
        if (e.getSource() == view.goBackButton) {
            this.view.dispose();
            ManageVehiclesViewController manageVehiclesViewController = new ManageVehiclesViewController(cinema);
            manageVehiclesViewController.init();
        } else if ((e.getSource() == view.toDelete || e.getSource() == view.vehiclePlate) && !input.equals("") && input.matches("\\d{3}")) {
            if (cinema.vacateParkingLot(input)) {
                view.goBackButton.doClick();
            } else {
                view.title.setText("UNKNOWN PLATE!");
            }
        } else {
            view.title.setText("ENTER A RIGHT PLATE!");
        }
    }
    
    public void init() {
        view.setTitle("Weze Parking [.. / Vehicle Management / Delete Vehicle]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("Delete Vehicle");
    }
}
