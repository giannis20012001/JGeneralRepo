package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class DecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {
        int decimalNumber;
        int binaryNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a positive (standard) binary number up to 10 digits (enter -1 to exit): ");
        binaryNumber = scanner.nextInt();
        while (binaryNumber != -1) {
            int temp;
            int first;
            int second;
            int third;
            int fourth;
            int fifth;
            int sixth;
            int seventh;
            int eighth;
            int ninth;
            int tenth;

            temp = binaryNumber;
            first = temp / 1000000000;
            temp = temp % 1000000000;
            second = temp / 100000000;
            temp = temp % 100000000;
            third = temp / 10000000;
            temp = temp % 10000000;
            fourth = temp / 1000000;
            temp = temp % 1000000;
            fifth = temp / 100000;
            temp = temp % 100000;
            sixth = temp / 10000;
            temp = temp % 10000;
            seventh = temp / 1000;
            temp = temp % 1000;
            eighth = temp / 100;
            temp = temp % 100;
            ninth = temp / 10;
            tenth = temp % 10;

            if (((first == 0) || (first == 1)) &&
                    ((second == 0) || (second == 1)) &&
                    ((third == 0) || (third == 1)) &&
                    ((fourth == 0) || (fourth == 1)) &&
                    ((fifth == 0) || (fifth == 1)) &&
                    ((sixth == 0) || (sixth == 1)) &&
                    ((seventh == 0) || (seventh == 1)) &&
                    ((eighth == 0) || (eighth == 1)) &&
                    ((ninth == 0) || (ninth == 1)) &&
                    ((tenth == 0) || (tenth == 1))) {
                decimalNumber = (tenth * 1) + (ninth * 2) + (eighth * 4) + (seventh * 8) +
                        (sixth * 16) + (fifth * 32) + (fourth * 64) +
                        (third * 128 + (second * 256) + (first * 512));
                System.out.printf("The binary: %d is equivalent to decimal %d%n", binaryNumber, decimalNumber);

            }
            else {
                System.out.println("You have not entered a positive (standard) binary number!");
                System.out.println("Please re-enter number!");

            }

            System.out.printf("Enter a positive (standard) binary number up to 10 digits (enter -1 to exit): ");
            binaryNumber = scanner.nextInt();

        }

    }

}
