package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        int amount;
        int principal = 1000;
        double rate = 0.05;
        double fractionalPart;
        int integralPart;
        double finalFractionalPart;
        int finalIntegralPart;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        for (int year = 1; year <= 10; ++year) {
            fractionalPart = Math.pow(1.0 + rate, year) % 1;
            integralPart = (int) (Math.pow(1.0 + rate, year) - fractionalPart);
            finalFractionalPart = fractionalPart * 100;
            finalIntegralPart = integralPart * 100;
            amount = principal * (finalIntegralPart + (int) finalFractionalPart);

            System.out.printf("%4d%,20d.%d%n", year, amount/100, (int) ((finalFractionalPart % 1) * 1000));


        }


    }

}