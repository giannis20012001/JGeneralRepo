package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/3/2017.
 */

public class Palindromes {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a 5 digit number (enter -1 to exit): ");
        number = scanner.nextInt();
        while (number != -1) {
            if (number >= 10000) {
                if (number <= 99999) {
                    int temp;
                    int first;
                    int second;
                    int third;
                    int fourth;
                    int fifth;

                    temp = number;
                    first = temp / 10000;
                    temp = temp % 10000;
                    second = temp / 1000;
                    temp = temp % 1000;
                    third = temp / 100;
                    temp = temp % 100;
                    fourth = temp / 10;
                    fifth = temp % 10;
                    if (first == fifth) {
                        if (second == fourth) {
                            System.out.println("The number you have entered is a palindrome!");

                        }
                        else {
                            System.out.println("The number you have entered is not a palindrome!");

                        }

                    }
                    else {
                        System.out.println("The number you have entered is not a palindrome!");

                    }

                }
                else {
                    System.out.println("You have entered a number bigger than 5 digits!");
                    System.out.println("Please re-enter number!");

                }

            }
            else {
                System.out.println("You have entered a number smaller than 5 digits!");
                System.out.println("Please re-enter number!");

            }

            System.out.printf("Enter a 5 digit number (enter -1 to exit): ");
            number = scanner.nextInt();

        }

    }

}
