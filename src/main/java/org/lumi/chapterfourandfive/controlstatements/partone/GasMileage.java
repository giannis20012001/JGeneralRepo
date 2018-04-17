package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/2/2017.
 */

public class GasMileage {
    public static void main(String[] args) {
        double kilometers;
        double litres;
        int trip = 0;
        double total = 0;
        double currentTrip;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter kilometers driven (enter -1 to exit): ");
        kilometers = scanner.nextDouble();
        while (kilometers != -1) {
            System.out.printf("Enter litres used: ");
            litres = scanner.nextDouble();
            currentTrip = kilometers / litres;
            System.out.printf("kilometers per litres for current trip is: %.02f%n", currentTrip);
            trip++;
            total = (total + currentTrip) / trip;
            System.out.printf("%n%nEnter kilometers driven (enter -1 to exit): ");
            kilometers = scanner.nextDouble();

        }

        System.out.printf("The average kilometers per litres for all trips is: %.02f%n", total);

    }

}
