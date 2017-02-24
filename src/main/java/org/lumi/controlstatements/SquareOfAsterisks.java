package org.lumi.controlstatements;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class SquareOfAsterisks {
    public static void main(String[] args) {
        int sideSize;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter square side size (enter -1 to exit): ");
        sideSize = scanner.nextInt();
        while (sideSize != -1) {
            if (sideSize >= 1) {
                if (sideSize <= 20) {
                    if (sideSize != 1) {
                        int i = 1;
                        int j = 1;

                        while (i <= sideSize) {

                            while (j <= sideSize) {
                                if (i == 1) {
                                    System.out.printf("*");

                                }
                                else if (i == sideSize) {
                                    System.out.printf("*");

                                }
                                else {
                                    System.out.printf("*%n");

                                }

                                j++;

                            }

                            System.out.println();
                            j=0;
                            i++;

                        }

                    }
                    else {
                        System.out.println("*");

                    }

                }
                else {
                    System.out.println("You have entered a side with size bigger than 20!");
                    System.out.println("Please re-enter side!");

                }

            }
            else {
                System.out.println("You have entered a side with size smaller than 1!");
                System.out.println("Please re-enter side!");

            }

            System.out.printf("Enter square side size (enter -1 to exit): ");
            sideSize = scanner.nextInt();

        }

    }

}
