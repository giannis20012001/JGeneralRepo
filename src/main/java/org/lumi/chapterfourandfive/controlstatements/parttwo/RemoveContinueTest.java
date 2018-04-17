package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/3/2017.
 */

public class RemoveContinueTest {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5)
                continue;

            System.out.printf("%d ", count);

        }

        System.out.printf("%nUsed continue to skip printing 5%n");
        System.out.println();
        System.out.println();

        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                //

            }
            else {
                System.out.printf("%d ", count);

            }

        }

        System.out.printf("%nUsed continue to skip printing 5%n");

    }

}
