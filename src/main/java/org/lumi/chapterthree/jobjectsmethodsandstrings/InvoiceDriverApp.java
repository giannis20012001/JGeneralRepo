package org.lumi.chapterthree.jobjectsmethodsandstrings;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 16/2/2017.
 */

public class InvoiceDriverApp {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("15-45", "tool", 10, 5);
        Invoice invoice2 = new Invoice("65-35", "electronic", -1, -5);

        //display each object
        System.out.printf("First invoice: %s%n", invoice1);
        System.out.printf("Second invoice: %s%n", invoice2);

        //create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        invoice2.setPrice(50);
        invoice2.setQuantity(10);

        //display each object
        System.out.printf("First invoice: %s%n", invoice1);
        System.out.printf("Second invoice: %s%n", invoice2);

        System.out.printf("%nThe final amount for the first invoice is: %f", invoice1.getInvoiceAmount());
        System.out.printf("%nThe final amount for the second invoice is: %f", invoice2.getInvoiceAmount());

    }

}
