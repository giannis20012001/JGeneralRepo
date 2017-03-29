package org.lumi.controlstatements.parttwo;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class Shapes extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        //Draws a cascade of shapes starting from the top-left corner
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            //pick the shape based on the user's choice
            switch (choice) {
                case 1: // draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;

                case 2: // draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;

            }

        }

    }

    //==================================================================================================================
    //Class constructor
    //==================================================================================================================
    /**
     * Constructor sets the user's choice.
     */
    public Shapes(int userChoice) {
        choice = userChoice;

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    //User's choice of which shape to draw
    private int choice;
}
