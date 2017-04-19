package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the number: ");
        int number = input.nextInt();

        System.out.println(isPerfect(number) ?
                "Number " + number + " is a perfect Number!":
                "Number " + number + " is not a perfect Number!");

    }

    private static int findFactors(int number) {
        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                //

            }

        }

        return 0;

    }

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum = sum + findFactors(number);

        }

        findFactors(number);
        return false;

    }

}
