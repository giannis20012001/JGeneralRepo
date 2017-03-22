package org.lumi.controlstatements.parttwo;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class SmallestValue {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int temp;
        int numberCounter;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter the number of integers to input: ");

        numberCounter = input.nextInt();
        while (numberCounter > 0) {
            System.out.printf("Enter number: ");
            temp = input.nextInt();

            if (temp <= min) {
                min = temp;

            }

            numberCounter--;

        }

        System.out.printf("%nThe smallest number entered is: %d%n", min);

    }

}
