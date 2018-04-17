package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the base: ");
        int base = input.nextInt();
        System.out.printf("Please enter the exponent: ");
        int exponent = input.nextInt();

        System.out.println("The result of " + base + "^" + exponent + " is: " + integerPower(base, exponent));

    }

    public static int integerPower(int base, int exponent) {
        int result = 1;
        if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result = result * base;

            }

        }
        else {
            System.out.printf("You have used an incorrect value as exponent!");

        }

        return result;

    }

}
