package org.lumi.chaptertwo.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 10/2/2017.
 */

public class Multiples {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = input.nextInt();
        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        if ((num2 % num1) == 0) {
            System.out.printf("%d is a multiple of %d.%n", num1, num2);

        }

    }

}
