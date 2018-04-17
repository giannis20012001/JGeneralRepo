package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class SalaryCalculator {
    public static void main(String[] args) {
        int employeeId = 1;
        double hoursWorked;
        double earnings = 0;
        double rates;
        Scanner scanner = new Scanner(System.in);

        while (employeeId <= 3) {
            System.out.printf("For employee %d ====>%n", employeeId);
            System.out.printf("Enter number of hours worked: ");
            hoursWorked = scanner.nextDouble();
            System.out.printf("Enter hourly rates: ");
            rates = scanner.nextDouble();
            if (hoursWorked > 40) {
                earnings = (40 * rates) + ((hoursWorked - 40) * (rates + rates/2));

            }
            else {
                earnings = 40 * rates;

            }

            System.out.printf("Total earnings for employee %d: %.02f%n", employeeId, earnings);
            employeeId++;

        }

    }

}
