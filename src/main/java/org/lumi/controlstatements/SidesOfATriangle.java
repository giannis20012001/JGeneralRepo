package org.lumi.controlstatements;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.printf("Enter length of the first side of triangle: ");
        int a = sn.nextInt();
        System.out.printf("Enter length of the second side of triangle: ");
        int b = sn.nextInt();
        System.out.printf("Enter length of the third side of triangle: ");
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
            if((a + b) > c) {
                if ((a + c) > b) {
                    if ((b + c) > a) {
                        System.out.println("Sides entered can form a triangle!");
                    }
                    else {
                        System.out.println("Sides entered cannot form a triangle!");

                    }

                }
                else {
                    System.out.println("Sides entered cannot form a triangle!");

                }

            }
            else {
                System.out.println("Sides entered cannot form a triangle!");

            }

        }

    }

}
