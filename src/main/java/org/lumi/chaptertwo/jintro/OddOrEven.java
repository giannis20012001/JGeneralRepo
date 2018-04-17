package org.lumi.chaptertwo.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 10/2/2017.
 */

public class OddOrEven {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = input.nextInt();

        if ((num % 2) == 0) {
            System.out.println("The given number is odd!");

        }

        if ((num % 2) != 0) {
            System.out.println("The given number is not odd!");

        }

    }

}
