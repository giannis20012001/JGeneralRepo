package org.lumi.methodsdeeperlook;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 20/4/2017.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int counter = 0;
        Instant start = Instant.now();

        for (int i = 2; i <= 10000; i++) {
            if (isPrimeA(i)) {
                counter++;
                System.out.printf(i + " ");

            }

        }

        System.out.println();
        Instant end = Instant.now();
        System.out.println(counter);
        System.out.println(Duration.between(start, end)); // prints PT1M3.553S

        counter = 0;
        start = Instant.now();
        for (int i = 2; i <= 10000; i++) {
            if (isPrimeB(i)) {
                counter++;
                System.out.printf(i + " ");

            }

        }

        System.out.println();
        end = Instant.now();
        System.out.println(counter);
        System.out.println(Duration.between(start, end)); // prints PT1M3.553S

        counter = 0;
        start = Instant.now();
        for (int i = 2; i <= 10000; i++) {
            if (isPrimeC(i)) {
                counter++;
                System.out.printf(i + " ");

            }

        }

        System.out.println();
        end = Instant.now();
        System.out.println(counter);
        System.out.println(Duration.between(start, end)); // prints PT1M3.553S

    }

    public static boolean isPrimeA(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }

        }

        return true;

    }

    public static boolean isPrimeB(int number) {
        for (int i = 2; 2 * i <= number; i++) {
            if (number % i == 0) {
                return false;

            }

        }

        return true;

    }

    public static boolean isPrimeC(int number) {
        if (number % 2 == 0 && number != 2) {
            return false;

        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;

            }

        }

        return true;

    }

}