package org.lumi.methodsdeeperlook;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

public class DrawBullsEye extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color colorOne = createFiveRandomColors().get(0);
        Color colorTwo = createFiveRandomColors().get(1);
        Color colorThree = createFiveRandomColors().get(2);
        Color colorFour = createFiveRandomColors().get(3);
        Color colorFive = createFiveRandomColors().get(4);

        //draw the fist circle
        g.setColor(colorOne);
        g.fillOval(10, 10, 200, 200);

        //draw the second circle
        g.setColor(colorTwo);
        g.fillOval(30, 30, 160, 160);

        //draw the third circle
        g.setColor(colorThree);
        g.fillOval(50, 50, 120, 120);

        //draw the fourth circle
        g.setColor(colorFour);
        g.fillOval(70, 70, 80, 80);

        //draw the fifth circle
        g.setColor(colorFive);
        g.fillOval(90, 90, 40, 40);

    }

    //==================================================================================================================
    //Private methods
    //==================================================================================================================
    private ArrayList<Color> createFiveRandomColors() {
        ArrayList<Color> list = new ArrayList<Color>();
        int red;
        int green;
        int blue;

        for (int i = 0; i < 5; i++) {
            red = randomNumbers.nextInt(256);
            green = randomNumbers.nextInt(256);
            blue = randomNumbers.nextInt(256);
            list.add(new Color(red, green, blue));

        }

        return list;

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static Color color;

}
