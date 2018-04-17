package org.lumi.chapterfourandfive.controlstatements.partone;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class MultiplesOfTwo {
    public static void main(String[] args) {
        int counter = 1;
        int gard = 1;
        int base = 2;

        while (gard == 1) {
            base = base * 2;
            if (counter % 10 == 0) {
                System.out.println();

            }
            
            System.out.printf("%d ", base);
            counter++;

        }

    }

}
