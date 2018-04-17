package org.lumi.chaptersix.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/4/2017.
 */

public class RoundingNumbers {
    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);

    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;

    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;

    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;

    }

}
