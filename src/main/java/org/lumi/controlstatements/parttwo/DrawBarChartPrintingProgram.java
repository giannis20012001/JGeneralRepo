package org.lumi.controlstatements.parttwo;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class DrawBarChartPrintingProgram extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < this.number; i++) {
            g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);

        }

    }

    //==================================================================================================================
    //Class constructor
    //==================================================================================================================
    /**
     * Constructor sets the user's choice.
     */
    public DrawBarChartPrintingProgram(int number) {
        this.number = number;

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    //User's choice of which shape to draw
    private int number;

}
