package org.lumi.chaptersix.methodsdeeperlook;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 29/3/2017.
 */

@SuppressWarnings("Duplicates")
public class DrawRandom extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ArrayList<Integer> size;

        for (int i = 0; i < 10; i++) {
            switch (chooseRandomInteger()) {
                case 1:
                    size = chooseRandomSize();
                    g.setColor(createRandomColors());
                    g.fillRect(size.get(0), size.get(1), size.get(2), size.get(3));
                    size.clear();
                    break;

                case 2:
                    size = chooseRandomSize();
                    g.setColor(createRandomColors());
                    g.fillOval(size.get(0), size.get(1), size.get(2), size.get(3));
                    size.clear();
                    break;

            }

        }

    }

    //==================================================================================================================
    //Private methods
    //==================================================================================================================
    private Color createRandomColors() {
        int red = randomNumbers.nextInt(256);
        int green = randomNumbers.nextInt(256);
        int blue = randomNumbers.nextInt(256);

        return new Color(red, green, blue);

    }

    private int chooseRandomInteger() {
        return 1 + randomNumbers.nextInt(2);

    }

    private ArrayList<Integer> chooseRandomSize() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1 + randomNumbers.nextInt(250));
        list.add(1 + randomNumbers.nextInt(250));
        list.add(1 + randomNumbers.nextInt(125));
        list.add(1 + randomNumbers.nextInt(125));

        return list;

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static Color color;

}
