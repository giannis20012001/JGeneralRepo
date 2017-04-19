package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class DisplayingSquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the side: ");
        squareOfAsterisks(input.nextInt());

    }

    public static void squareOfAsterisks(int side) {
        System.out.println();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

    }

}
