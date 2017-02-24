package org.lumi.controlstatements;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class Mystery3 {
    public static void main(String[] args) {
        int row = 10;
        while (row >= 1) {
            int column = 1;
            while (column <= 10) {
                System.out.print(row % 2 == 1 ? "<" : ">");
                ++column;

            }

            --row;
            System.out.println();

        }

    }

}
