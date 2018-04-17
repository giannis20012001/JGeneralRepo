package org.lumi.chaptertwo.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 12/2/2017.
 */

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int negative = 0;
        int positive = 0;
        int zeros = 0;

        System.out.print("Enter first number: ");
        number = input.nextInt();
        if (number > 0) {
            positive = positive + 1;
        }

        if (number < 0) {
            negative = negative + 1;

        }

        if (number == 0) {
            zeros = zeros + 1;

        }

        System.out.print("Enter second number: ");
        number = input.nextInt();
        if (number > 0) {
            positive = positive + 1;
        }

        if (number < 0) {
            negative = negative + 1;

        }

        if (number == 0) {
            zeros = zeros + 1;

        }

        System.out.print("Enter third number: ");
        number = input.nextInt();
        if (number > 0) {
            positive = positive + 1;
        }

        if (number < 0) {
            negative = negative + 1;

        }

        if (number == 0) {
            zeros = zeros + 1;

        }

        System.out.print("Enter fourth number: ");
        number = input.nextInt();
        if (number > 0) {
            positive = positive + 1;
        }

        if (number < 0) {
            negative = negative + 1;

        }

        if (number == 0) {
            zeros = zeros + 1;

        }

        System.out.print("Enter fifth number: ");
        number = input.nextInt();
        if (number > 0) {
            positive = positive + 1;
        }

        if (number < 0) {
            negative = negative + 1;

        }

        if (number == 0) {
            zeros = zeros + 1;

        }

        System.out.printf("From the numbers given, %d where zeros!%n", zeros);
        System.out.printf("From the numbers given, %d where positive!%n", positive);
        System.out.printf("From the numbers given, %d where negative!%n", negative);

    }

}
