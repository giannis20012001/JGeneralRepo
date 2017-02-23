package org.lumi.controlstatements;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/2/2017.
 */

public class GraphicsContorlLoopsOne extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        int minWidth = 0;
        int maxWidth = getWidth();
        int minHeight = 0;
        int maxHeight = getHeight();
        int counter = ((maxWidth + maxHeight) / 2 )/ 15;

        super.paintComponent(g);
        while (counter > 0) {
            minWidth = minWidth + counter;
            maxWidth = maxWidth - counter;
            minHeight = minHeight + counter;
            maxHeight = maxHeight - counter;
            g.drawLine(0, 0, minWidth, maxHeight);
            g.drawLine(getWidth(), getHeight(), minWidth, maxHeight);
            g.drawLine(0, getHeight(), minWidth, minHeight);
            g.drawLine(getWidth(), 0, minWidth, minHeight);
            counter--;

        }


    }

}
