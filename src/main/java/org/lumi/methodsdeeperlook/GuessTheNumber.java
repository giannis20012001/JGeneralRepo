package org.lumi.methodsdeeperlook;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        int counter = 0;
        int number = 1 + randomNumbers.nextInt(1000);

        System.out.printf("Guess the number (between 1 and 1000): ");
        guess = input.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("Too high. Try again.");

            }
            else if (guess < number){
                System.out.println("Too low. Try again.");

            }

            counter++;
            System.out.printf("Guess the number (between 1 and 1000): ");
            guess = input.nextInt();

        }

        System.out.println("Congratulations. You guessed the number!");
        if (counter < 10) {
            System.out.printf("Either you know the secret or you got lucky!");

        }
        else if (counter > 10) {
            System.out.printf("You should be able to do better!");

        }
        else {
            System.out.printf("Aha! You know the secret!");

        }

    }

    private static final SecureRandom randomNumbers = new SecureRandom();

}
