package org.lumi.controlstatements.partone;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class CheckerboardPatternOfAsterisks {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 8) {
            while (j <= 8) {
                System.out.print("* ");
                j++;

            }

            System.out.println();
            if (i % 2 != 0) {
                System.out.print(" ");

            }

            j = 1;
            i++;

        }

    }

}
