package org.lumi.chapterfourandfive.controlstatements.parttwo;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 16/3/2017.
 */

public class ConcentricCircles extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 12; i++) {
            g.drawOval(140 - (i * 10), 140 - (i * 10),
                    20 + (i * 20), 20 + (i * 20));

        }

    }

}