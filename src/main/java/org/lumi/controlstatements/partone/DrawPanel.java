package org.lumi.controlstatements.partone;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/2/2017.
 */

public class DrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);

    }

}
