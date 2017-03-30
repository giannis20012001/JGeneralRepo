package org.lumi.controlstatements.parttwo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class ShapesDriverApp {
    public static void main(String[] args) {
        //Obtain user's choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles \n " +
                        "Enter 2 to draw ovals");
        //Convert input to int
        int choice = Integer.parseInt(input);

        //Create the panel with the user's input
        Shapes panel = new Shapes(choice);
        //Creates a new JFrame
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);

    }

}
