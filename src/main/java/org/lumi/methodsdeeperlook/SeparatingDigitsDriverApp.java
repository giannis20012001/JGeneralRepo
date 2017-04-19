package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class SeparatingDigitsDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SeparatingDigits separatingDigits = new SeparatingDigits();

        System.out.printf("Please enter the number: ");
        separatingDigits.displayDigits(input.nextInt());

    }

}
