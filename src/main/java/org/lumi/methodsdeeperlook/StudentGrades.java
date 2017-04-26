package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter student's average: ");
        int avg = input.nextInt();

        if (qualityPoints(avg) >= 0) {
            System.out.println("The returned value is " + qualityPoints(avg));

        }
        else {
            System.out.println("You have entered a wrong number for average!");

        }

    }

    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) {
            return 4;

        }
        else if (average >= 80 && average <= 89) {
            return 3;

        }
        else if (average >= 70 && average <= 79) {
            return 2;

        }
        else if (average >= 60 && average <= 69) {
            return 1;

        }
        else if (average < 60 && average >= 0) {
            return 0;

        }
        else {
            return -1;

        }

    }

}
