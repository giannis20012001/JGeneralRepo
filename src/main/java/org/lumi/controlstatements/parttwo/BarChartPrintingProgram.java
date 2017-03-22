package org.lumi.controlstatements.parttwo;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        int count = 5;
        Scanner intput = new Scanner(System.in);

        System.out.printf("Enter 5 numbers between 1 and 30: ");
        int number = intput.nextInt();
        if (number >= 1 && number <= 30) {
            while (count > 0) {
                for (int i = 0; i < number; i++) {
                    System.out.print("*");

                }

                count--;
                if (count > 0) {
                    System.out.printf("%nEnter next number: ");
                    number = intput.nextInt();

                }

            }

        }
        else {
            System.out.printf("The number you entered is out of range!");

        }

    }

}
