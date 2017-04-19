package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class FindTheMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the first number: ");
        float a = input.nextFloat();
        System.out.printf("Please enter the second number: ");
        float b = input.nextFloat();
        System.out.printf("Please enter the third number: ");
        float c = input.nextFloat();

        System.out.printf("The smallest between %f, %f and %f is: %f", a, b, c, minimum3(a, b, c));

    }

    public static float minimum3(float a, float b, float c) {
        return Math.min(Math.min(a, b), c);

    }

}
