package org.lumi.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class TrianglePrintingProgram {
    public void firstApproach() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println();
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println();
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
            for (int k = 10; k >= i; k--) {
                System.out.print(" ");

            }

        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

    }

    public void secondApproach() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == 1) {
                    for (int k = 1; k <= i; k++) {
                        System.out.printf("*");

                    }

                    System.out.printf("%-5s", " ");

                }
                else if (j == 2) {
                    for (int k = 10; k >= i; k--) {
                        System.out.printf("*");

                    }

                    System.out.printf("%-5s", " ");


                }
                else if (j == 3) {
                    for (int k = 10; k >= i; k--) {
                        System.out.print("*");

                    }

                    System.out.printf("%-5s", " ");

                }
                else {
                    for (int k = 10; k > 1; k--) {
                        System.out.print("");

                    }

                    for (int l = 1; l <= i; l++) {
                        System.out.print("*");

                    }

                }

            }

            System.out.println();

        }

    }

}
