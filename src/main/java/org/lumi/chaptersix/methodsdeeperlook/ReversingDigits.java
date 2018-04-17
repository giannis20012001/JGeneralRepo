package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/4/2017.
 */

public class ReversingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter number to invert: ");
        System.out.println(reverseInt(input.nextInt()));

    }

    public static int reverseInt(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;

        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();

        }

        return (int)reversedNum;

    }

}
