package org.lumi.controlstatements.parttwo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class DrawBarChartPrintingProgramDriverApp {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a number between 1 and 30:");
        //Convert input to int
        int number = Integer.parseInt(input);

        if (number >= 1 && number <= 30) {
            //Create the panel with the user's input
            DrawBarChartPrintingProgram panel = new DrawBarChartPrintingProgram(number);

            //Creates a new JFrame
            JFrame application = new JFrame();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            application.add(panel);
            application.setSize(300, 300);
            application.setVisible(true);

        }
        else {
            JOptionPane.showMessageDialog(null, "The number you entered is out of range!");

        }

    }

}
