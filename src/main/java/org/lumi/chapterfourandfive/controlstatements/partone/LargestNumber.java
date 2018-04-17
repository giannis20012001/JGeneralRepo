package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.printf("Enter %d number: ", counter);
            number = scanner.nextInt();
            if (number > largest) {
                largest = number;

            }

            counter++;

        }

        System.out.printf("The largest number is %d.%n", largest);

    }

}
