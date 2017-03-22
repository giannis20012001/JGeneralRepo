package org.lumi.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class CompoundInterestProgram {
    public static void main(String[] args) {
        double amount; //amount on deposit at end of each year
        double principal = 1000.0; //initial amount before interest

        //display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        //calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
            for (int i = 5; i <= 10; i++) {
                //calculate new amount for specified year
                amount = principal * Math.pow(1.0 + ((double) i/100), year); //interest rate (double) i/100
                //display the year and the amount
                System.out.printf("%4d%,20.2f%n", year, amount);

            }

        }


    }

}
