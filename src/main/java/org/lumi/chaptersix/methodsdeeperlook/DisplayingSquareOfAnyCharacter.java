package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class DisplayingSquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the side: ");
        int number = input.nextInt();
        System.out.printf("Please enter the fill character: ");
        char fill = input.next(".").charAt(0);

        squareOfAsterisks(number, fill);

    }

    public static void squareOfAsterisks(int side, char fillCharacter) {
        System.out.println();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);

            }

            System.out.println();

        }

    }

}
