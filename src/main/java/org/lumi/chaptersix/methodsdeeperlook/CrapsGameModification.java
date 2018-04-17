package org.lumi.chaptersix.methodsdeeperlook;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class CrapsGameModification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        int myPoint = 0;
        Status gameStatus;

        System.out.printf("Hello! PLease enter a wager: ");
        int wager = input.nextInt();

        while (wager > bankBalance) {
            System.out.println("The wager you entered is not valid!");
            System.out.printf("PLease enter a correct wager: ");
            wager = input.nextInt();

        }

        int sumOfDice = rollDice();
        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;

            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;

            default:
                generateChatter();
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;

        }

        // while game is not complete
        while ( gameStatus == Status.CONTINUE ) {
            generateChatter();
            sumOfDice = rollDice(); // roll dice again

            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;

            }
            else if (sumOfDice == SEVEN) {
                gameStatus = Status.LOST;

            }

        }

        // display won or lost message
        if ( gameStatus == Status.WON ) {
            System.out.println("Player wins");
            bankBalance += wager;
            System.out.println("The new bank balance is: " + bankBalance);

        }
        else {
            System.out.println("Player loses");
            bankBalance -= wager;
            System.out.println("The new bank balance is: " + bankBalance);
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");

            }

        }

    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;

    }

    public static void generateChatter() {
        int choise = 1 + randomNumbers.nextInt(3);

        switch (choise) {
            case 1:
                System.out.println("Oh, you're going for broke, huh?");
                break;

            case 2:
                System.out.println("Aw c'mon, take a chance!");
                break;

            case 3:
                System.out.println("You're up big. Now's the time to cash in your chips!");
                break;
        }

    }

    private static final SecureRandom randomNumbers = new SecureRandom();
    // enum type with constants that represent the game status
    private enum Status { CONTINUE, WON, LOST };
    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

}
