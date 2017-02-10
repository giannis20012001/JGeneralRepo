package org.lumi.JIntro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 10/2/2017.
 */

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        num2 = input.nextInt();
        System.out.println("Enter third integer: ");
        num3 = input.nextInt();

        System.out.printf("The sum is: %d%n", (num1 + num2 + num3));
        System.out.printf("The average is: %d%n", ((num1 + num2 + num3) / 3));
        System.out.printf("The product is: %d%n", (num1 * num2 * num3));

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.printf("%d is the largest%n", num1);

            }

        }

        if (num2 > num1) {
            if (num2 > num3) {
                System.out.printf("%d is the largest%n", num2);

            }

        }

        if (num3 > num1) {
            if (num3 > num2) {
                System.out.printf("%d is the largest%n", num3);

            }

        }

        if (num1 < num2) {
            if (num1 < num3) {
                System.out.printf("%d is the smallest%n", num1);

            }

        }

        if (num2 < num1) {
            if (num2 < num3) {
                System.out.printf("%d is the smallest%n", num2);

            }

        }

        if (num3 < num1) {
            if (num3 < num2) {
                System.out.printf("%d is the smallest%n", num3);

            }

        }

    }

}
