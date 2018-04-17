package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class HypotenuseCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the first side: ");
        double side1 = input.nextDouble();
        System.out.printf("Please enter the second side: ");
        double side2 = input.nextDouble();

        System.out.println("The hypotenuse is: " + hypotenuse(side1, side2));
        System.out.println("Using the Math.hypot function the result is: " + Math.hypot(side1, side2));

    }

    public static double hypotenuse(double sideA, double sideB) {
        return Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));

    }

}
