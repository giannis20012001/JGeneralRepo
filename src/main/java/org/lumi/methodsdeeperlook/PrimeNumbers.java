package org.lumi.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 20/4/2017.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                counter++;
                //System.out.println(i + " is a Prime number!");

            }

        }

        System.out.println(counter);

    }

    public static boolean isPrime(int number) {
        if(number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;

                }

            }

        }

        return true;

    }

}