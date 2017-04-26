package org.lumi.methodsdeeperlook;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class CoinTossing {
    public static void main(String[] args) {
        int counterHeads = 0;
        int counterTails = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter choice (1 - Toss Coin, 2 - Exit): ");

        while (input.nextInt() != 2) {
            switch (flip()) {
                case HEADS:
                    counterHeads++;
                    break;

                case TAILS:
                    counterTails++;
                    break;

                default:
                    System.out.println("Something went seriously wrong!");
                    break;

            }

            System.out.printf("Please enter choice (1 - Toss Coin, 2 - Exit): ");

        }

        System.out.println("Face\tFrequency"); // output headers
        System.out.printf("Heads\t%d%nTails\t%d%n", counterHeads, counterTails);

    }

    private static Coin flip() {
        int coin = randomNumbers.nextInt(2);

        if (coin == 0) {
            return Coin.HEADS;

        }

        return Coin.TAILS;

    }

    private enum Coin { HEADS, TAILS }
    private static final SecureRandom randomNumbers = new SecureRandom();

}
