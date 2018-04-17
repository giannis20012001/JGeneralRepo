package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class CalculatingPi {
    public static void main(String[] args) {
        double pi = 4;
        int counter = 1;

        for (int i = 3; i <= 200000; i += 2) {
            if (counter % 2 != 0) {
                pi = pi - 4.0/i;

            }
            else {
                pi = pi + 4.0/i;

            }

            counter++;
            System.out.printf("Pi: %f%n", pi);

        }

    }

}
