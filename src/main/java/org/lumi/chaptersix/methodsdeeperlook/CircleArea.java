package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the desired circle radius: ");
        double number = input.nextDouble();

        System.out.println("The circle area is: " + circleArea(number));

    }

    public static double circleArea(double radius) {
        return (2 * Math.PI * radius);

    }

}
