package org.lumi.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 10/2/2017.
 */

public class ComparingIntegers {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        num1 = input.nextInt();

        System.out.println("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger.%n", num1);

        }

        if (num1 < num2) {
            System.out.printf("%d is larger.%n", num2);

        }

        if (num1 == num2) {
            System.out.println("These numbers are equal.");

        }

    }

}
