package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the first number: ");
        int numberA = input.nextInt();
        System.out.printf("Please enter the second number: ");
        int numberB = input.nextInt();

        System.out.println(isMultiple(numberA, numberB) ?
                "Number " + numberB + " is a multiple of " + numberA :
                "Number " + numberB + " is not a multiple of " + numberA);

    }

    public static boolean isMultiple(int numberA, int numberB) {
        if (numberA % numberB == 0) {
            return true;

        }

        return false;

    }

}
