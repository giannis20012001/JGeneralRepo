package org.lumi.controlstatements;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 5/3/2017.
 */

public class FactorialDriverApp {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter an non negative integer number: ");
        number = scanner.nextInt();
        System.out.printf("The factorial of %d is %d%n", number, Factorial.findFactorial(number));
        System.out.printf("The Euler's Number approximation for %d terms is %f%n", number, Factorial.findEulerNumber(number));
        System.out.printf("The Exponential function approximation for %d terms is %f%n", number, Factorial.findExponentialFunction(number));

    }

}
