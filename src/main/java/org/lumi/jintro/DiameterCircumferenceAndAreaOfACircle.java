package org.lumi.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 12/2/2017.
 */
public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        System.out.println("Enter desired radius: ");
        int radius = scanner.nextInt();

        System.out.printf("diameter: %d%n", 2 * radius);
        System.out.printf("circumference: %f%n", 2 * pi * radius);
        System.out.printf("area: %f%n", pi * radius * radius);

    }

}
