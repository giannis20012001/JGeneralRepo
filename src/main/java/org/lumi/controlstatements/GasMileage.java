package org.lumi.controlstatements;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/2/2017.
 */

public class GasMileage {
    public static void main(String[] args) {
        int kilometers;
        int litres;
        int trip = 0;
        double total = 0;
        double currentTrip;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers driven (enter -1 to exit): ");
        kilometers = scanner.nextInt();
        while (kilometers != -1) {
            System.out.print("Enter litres used: ");
            litres = scanner.nextInt();
            currentTrip = (double) kilometers / litres;
            trip++;
            total = (total + currentTrip) / trip;

        }

    }

}
