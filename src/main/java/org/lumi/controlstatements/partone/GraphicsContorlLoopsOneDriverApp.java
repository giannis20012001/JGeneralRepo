package org.lumi.controlstatements.partone;

import javax.swing.JFrame;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/2/2017.
 */

public class GraphicsContorlLoopsOneDriverApp {
    public static void main(String[] args) {
        GraphicsContorlLoopsOne panel = new GraphicsContorlLoopsOne();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }

}
