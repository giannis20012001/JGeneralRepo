package org.lumi.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class CreditLimitCalculator {
    public static void main(String[] args) {
        int accountNumber;
        int balance;
        int charges;
        int credits;
        int creditLimit;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter account number (enter -1 to exit): ");
        accountNumber = scanner.nextInt();
        while (accountNumber != -1) {
            System.out.printf("Enter beginning monthly balance for this account: ");
            balance = scanner.nextInt();
            System.out.printf("Enter total of items Charged: ");
            charges = scanner.nextInt();
            System.out.printf("Enter total of credits applied: ");
            credits = scanner.nextInt();
            System.out.printf("Enter credit limit for this account: ");
            creditLimit = scanner.nextInt();

            balance =  (balance + charges) - credits;
            System.out.printf("The new balance is: %d%n", balance);
            System.out.println((balance > creditLimit) ?
                    "Credit limit exceeded!!!!" :
                    "The current balance does not exceed the credit limit!");

            System.out.printf("Enter account number (enter -1 to exit): ");
            accountNumber = scanner.nextInt();

        }


    }

}
