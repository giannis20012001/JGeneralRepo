package org.lumi.chaptersix.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter the number: ");
        int number = input.nextInt();

        System.out.println(isEven(number) ?
                "Number " + number + " is even" :
                "Number " + number + " is not even");

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;

        }

        return false;

    }

}
