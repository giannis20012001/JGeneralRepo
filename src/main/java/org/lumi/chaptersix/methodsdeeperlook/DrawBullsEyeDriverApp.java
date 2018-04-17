package org.lumi.chaptersix.methodsdeeperlook;

import javax.swing.JFrame;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class DrawBullsEyeDriverApp {
    public static void main(String[] args) {
        DrawBullsEye panel = new DrawBullsEye();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }

}
