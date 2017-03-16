package org.lumi.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class SidesOfARightTriangle {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.printf("Enter length of the first side of right triangle: ");
        int a = sn.nextInt();
        System.out.printf("Enter length of the second side of right triangle: ");
        int b = sn.nextInt();
        System.out.printf("Enter length of the third side of right triangle: ");
        int c = sn.nextInt();

        if (a < 0) {
            System.out.println("The length of the first side entered is a negative!");

        }
        else if (b < 0) {
            System.out.println("The length of the second side entered is a negative!");

        }
        else if (c < 0) {
            System.out.println("The length of the third side entered is a negative!");

        }
        else {
            if(((a *  a) + (b * b)) == (c * c)) {
                System.out.println("Sides entered can form a right triangle!");

            }
            else {
                System.out.println("Sides entered cannot form a right triangle!");

            }

        }

    }

}
