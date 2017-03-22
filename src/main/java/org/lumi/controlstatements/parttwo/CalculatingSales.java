package org.lumi.controlstatements.parttwo;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class CalculatingSales {
    public static void main(String[] args) {
        double total = 0;
        Scanner intput = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the product number.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (intput.hasNext()) {
            int productNumber = intput.nextInt();
            System.out.printf("%s", "Enter the quantity sold: ");
            int quantitySold = intput.nextInt();

            switch (productNumber) {
                case 1:
                    total = total + (double) quantitySold * 2.98;
                    break;

                case 2:
                    total = total + (double) quantitySold * 4.50;
                    break;

                case 3:
                    total = total + (double) quantitySold * 9.98;
                    break;

                case 4:
                    total = total + (double) quantitySold * 4.49;
                    break;

                case 5:
                    total = total + (double) quantitySold * 6.87;
                    break;

                default:
                    System.out.println("You have entered a wrong product number!");
                    System.out.println("Please reenter!");

            }

            System.out.printf("%s%n%s%n %s%n %s%n",
                    "Enter the product number.",
                    "Type the end-of-file indicator to terminate input:",
                    "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                    "On Windows type <Ctrl> z then press Enter");

        }

        if (total > 0) {
            System.out.printf("Total retail value of the products entered is %.02f%n", total);

        }
        else {
            System.out.println("No products were entered");

        }

    }

}
