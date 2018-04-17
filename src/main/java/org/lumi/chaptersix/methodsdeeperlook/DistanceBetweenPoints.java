package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter point x1 coordinate: ");
        double x1 = input.nextDouble();
        System.out.printf("Enter point y1 coordinate: ");
        double y1 = input.nextDouble();
        System.out.printf("Enter point x2 coordinate: ");
        double x2 = input.nextDouble();
        System.out.printf("Enter point y2 coordinate: ");
        double y2 = input.nextDouble();

        System.out.println("The distance between (" + x1 + ", " + y1 + ") & (" + x2 + ", " + y2 + ") is: "
                + distance(x1, y1, x2,y2));

    }

    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

}
