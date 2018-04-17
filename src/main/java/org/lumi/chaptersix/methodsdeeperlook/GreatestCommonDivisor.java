package org.lumi.chaptersix.methodsdeeperlook;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/4/2017.
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the dividend: ");
        int dividend = input.nextInt();
        System.out.printf("Please enter the divisor: ");
        int divisor = input.nextInt();

        //System.out.println("The GCD is " + findGCDA(dividend, divisor));

        Instant start = Instant.now();
        findGCDA(dividend, divisor);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end)); // prints PT1M3.553S

        start = Instant.now();
        findGCDB(dividend, divisor);
        end = Instant.now();
        System.out.println(Duration.between(start, end)); // prints PT1M3.553S

    }

    //a --> dividend & b --> divisor
    //Best results
    public static int findGCDA(int a, int b) {
        int r = 0;
        int i = 1;

        while ((a - (i * b)) > 0) {
            r = a - (i * b);
            i++;

        }

        i = 1;
        while ((b - (i * r)) > 0) {
            a = b - (i * r);
            i++;

        }

        return a;

    }

    //a --> dividend & b --> divisor
    public static int findGCDB(int a, int b) {
        while (a > b) {
            a = a - b;

        }

        while (b > 0) {
            b = b - a;

        }

        while (a > b) {
            a = a - b;

        }

        return a;

    }

}
