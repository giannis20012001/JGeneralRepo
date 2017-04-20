package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.println("Number " + i + " is a perfect Number!");

            }

        }

    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        previousFactor = 1;

        for (int i = 1; i < number; i++) {
            if (findFactors(number)) {
                sum = sum + previousFactor;
                previousFactor++;

            }

        }

        if (sum == number) {
            return true;

        }

        return false;

    }

    private static boolean findFactors(int number) {
        if (number % previousFactor == 0) {
            return true;

        }

        previousFactor++;

        return false;

    }

    private static int previousFactor;

}
