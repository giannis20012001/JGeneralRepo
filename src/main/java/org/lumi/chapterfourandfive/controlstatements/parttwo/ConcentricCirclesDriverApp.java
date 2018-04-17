package org.lumi.chapterfourandfive.controlstatements.parttwo;

import javax.swing.JFrame;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 21/3/2017.
 */

public class ConcentricCirclesDriverApp {
    public static void main(String[] args) {
        ConcentricCircles panel = new ConcentricCircles();
        JFrame application = new JFrame(); // creates a new JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);

    }

}
