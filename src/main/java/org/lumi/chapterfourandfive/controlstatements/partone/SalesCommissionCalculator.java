package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        int itemsSold;
        int itemId;
        double earnings = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter item ID (enter -1 to exit): ");
        itemId = scanner.nextInt();
        while (itemId != -1) {
            if (itemId == 1) {
                System.out.printf("Enter number of items sold: ");
                itemsSold = scanner.nextInt();
                earnings = earnings + (itemsSold * 239.99) * 0.09;
                System.out.printf("Earnings for product 1 are: %.02f%n", (itemsSold * 239.99) * 0.09);

            }
            else if (itemId == 2) {
                System.out.printf("Enter number of items sold: ");
                itemsSold = scanner.nextInt();
                earnings = earnings + (itemsSold * 129.75) * 0.09;
                System.out.printf("Earnings for product 2 are: %.02f%n", (itemsSold * 129.75) * 0.09);

            }
            else if (itemId == 3) {
                System.out.printf("Enter number of items sold: ");
                itemsSold = scanner.nextInt();
                earnings = earnings + (itemsSold * 99.95) * 0.09;
                System.out.printf("Earnings for product 3 are: %.02f%n", (itemsSold * 99.95) * 0.09);

            }
            else if (itemId == 4) {
                System.out.printf("Enter number of items sold: ");
                itemsSold = scanner.nextInt();
                earnings = earnings + (itemsSold * 350.89) * 0.09;
                System.out.printf("Earnings for product 4 are: %.02f%n", (itemsSold * 350.89) * 0.09);

            }
            else {
                System.out.println("You have provided an invalid item ID!");
                System.out.println("Please provide a new one!");

            }

            System.out.printf("Enter item ID (enter -1 to exit): ");
            itemId = scanner.nextInt();

        }

        System.out.printf("Total earnings are: %.02f", (earnings + 200));

    }

}
