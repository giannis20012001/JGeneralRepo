package org.lumi.chapterfourandfive.controlstatements.partone;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class TwoLargestNumbers {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int firstLargestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (counter <= 10) {
            System.out.printf("Enter %d number: ", counter);
            number = scanner.nextInt();
            if (number > firstLargestNum) {
                if (firstLargestNum > secondLargestNum) {
                    secondLargestNum =firstLargestNum;

                }

                firstLargestNum = number;

            }

            counter++;

        }

        System.out.printf("The first largest number is %d.%n", firstLargestNum);
        System.out.printf("The second largest number is %d.%n", secondLargestNum);

    }

}
