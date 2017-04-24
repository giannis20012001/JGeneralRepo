package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/4/2017.
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the dividend: ");
        int dividend = input.nextInt();
        System.out.printf("Please enter the divisor: ");
        int divisor = input.nextInt();

        System.out.println("The GCD is " + findGCD(dividend, divisor));

    }

    public static int findGCD(int dividend, int divisor) {
        int quotient = 0;
        int remainder = 0;

        while (dividend - divisor >= divisor) {
            dividend = dividend - divisor;

        }

        while (divisor - dividend >= dividend) {
            divisor = divisor - dividend;

        }

        while (dividend - divisor >= divisor) {
            dividend = dividend - divisor;

        }


        return divisor;

    }

}
