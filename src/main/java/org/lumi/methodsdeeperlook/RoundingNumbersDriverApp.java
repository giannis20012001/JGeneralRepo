package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/4/2017.
 */

public class RoundingNumbersDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter a double value.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            double value = input.nextDouble();
            System.out.printf("%s%f%n%s%f%n%s%f%n%s%f%n%s%f%n",
                    "The value is: ", value,
                    "The value rounded to the nearest integer is: ", RoundingNumbers.roundToInteger(value),
                    "The value rounded to the nearest tenth is: ", RoundingNumbers.roundToTenths(value),
                    "The value rounded to the nearest hundredth, is: ", RoundingNumbers.roundToHundredths(value),
                    "The value rounded to the nearest thousandth., is: ", RoundingNumbers.roundToThousandths(value));

            System.out.printf("%n%s%n%s%n %s%n %s%n",
                    "Enter a double.",
                    "Type the end-of-file indicator to terminate input:",
                    "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                    "On Windows type <Ctrl> z then press Enter");

        }

    }

}
