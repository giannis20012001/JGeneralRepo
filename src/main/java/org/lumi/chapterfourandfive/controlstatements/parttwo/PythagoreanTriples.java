package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class PythagoreanTriples {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    if ((Math.pow((double) i, 2) + Math.pow((double) j, 2))
                            == Math.pow((double) k, 2)) {
                        System.out.printf("side a: %d, side b: %d, side c: %d%n", i, j, k);

                    }

                }

            }

        }

    }

}
