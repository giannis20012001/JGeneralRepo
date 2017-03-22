package org.lumi.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class TrianglePrintingProgram {
    public static void main(String[] args) {
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

}
