package org.lumi.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis (A.K.A lumi) on 30/1/2017.
 */

public class Arithmetic {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");

        num1 = input.nextInt();

        System.out.println("Enter second integer: ");
        num2 = input.nextInt();

        System.out.printf("%s%d%n", "Sum is: ", num1 + num2);
        System.out.printf("%s%d%n", "Product is: ", num1 * num2);
        System.out.printf("%s%d%n", "Quotient is: ", num1 / num2);

    }

}
