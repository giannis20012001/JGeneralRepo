package org.lumi.controlstatements;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class Factorial {
    public static int findFactorial(int number) {
        int factorial = 1;
        int counter = 0;

        if (number > 1) {
            while (counter < number) {
                factorial = factorial * (number - counter);
                counter++;

            }

        }
        else if (number == 1) {
            factorial = 1;

        }
        else if (number == 0) {
            factorial = 1;

        }
        else {
            System.out.println("You have entered a negative number!");

        }

        return factorial;

    }

    @SuppressWarnings("Duplicates")
    public static double findEulerNumber(int terms) {
        int counter = 1;
        double eulerNumber = 1;

        if (terms > 1) {
            while (counter <= terms) {
                eulerNumber = eulerNumber + (1 / (double) findFactorial(counter));
                counter++;

            }

        }
        else if (terms == 1) {
            eulerNumber = 1;

        }
        else if (terms == 0) {
            eulerNumber = 0;

        }
        else {
            System.out.println("You have entered a negative number!");

        }

        return eulerNumber;

    }

    @SuppressWarnings("Duplicates")
    public static double findExponentialFunction(int x) {
        int counter = 1;
        double e = 1;

        if (x > 1) {
            while (counter <= x) {
                e = e + (findPower(x, counter) / (double) findFactorial(counter));
                counter++;

            }

        }
        else if (x == 1) {
            e = 1;

        }
        else if (x == 0) {
            e = 0;

        }
        else {
            System.out.println("You have entered a negative number!");

        }

        return e;

    }

    public static int findPower(int base, int exponent) {
        int counter = 1;
        int number = 1;

        while (counter <= exponent) {
            number = number * base;
            counter++;

        }

        return number;

    }

}
