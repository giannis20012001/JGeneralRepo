package org.lumi.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 12/2/2017.
 */

public class SeparatingTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();
        int temp;
        int first;
        int second;
        int third;
        int fourth;
        int fifth;

        temp = number;
        if (number >= 10000) {
            if (number <= 99999) {
                first = temp / 10000;
                temp = temp % 10000;
                second = temp / 1000;
                temp = temp % 1000;
                third = temp / 100;
                temp = temp % 100;
                fourth = temp / 10;
                fifth = temp % 10;

                System.out.printf("%d   %d   %d   %d   %d%n", first, second, third, fourth, fifth);

            }

        }

        if (number > 99999) {
            System.out.println("The number you entered is larger than five digits!");

        }

        if (number < 10000) {
            System.out.println("The number you entered is lower than five digits!");

        }

    }

}
