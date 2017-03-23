package org.lumi.controlstatements.parttwo;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/3/2017.
 */

public class DiamondPrintingProgram {
    @SuppressWarnings("Duplicates")
    public void firstApproach() {
        int size = 9;
        int numOfColumns = 1;
        int numOfSpaces = size / 2;

        for (int i = 1; i <= size; i++) { //for number of rows i.e n rows
            for (int k = numOfSpaces; k >= 1; k--) { //number of spaces i.e 3,2,1,0,1,2,3 and so on
                System.out.print(" ");

            }

            for (int j = 1; j <= numOfColumns; j++) { //for number of columns i.e 1,3,5,7,5,3,1
                System.out.print("*");

            }

            System.out.println();
            if (i < ((size / 2) + 1)) {
                numOfColumns += 2; // columns increasing till center row
                numOfSpaces -= 1; // spaces decreasing till center row

            }
            else {
                numOfColumns -= 2; // columns decreasing
                numOfSpaces += 1; // spaces increasing

            }

        }

    }

    @SuppressWarnings("Duplicates")
    public void secondApproach() {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter an odd number in the range 1 to 19.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int size = input.nextInt();
            if (size % 2 != 0) {
                int numOfColumns = 1;
                int numOfSpaces = size / 2;

                for (int i = 1; i <= size; i++) { //for number of rows i.e n rows
                    for (int k = numOfSpaces; k >= 1; k--) { //number of spaces i.e 3,2,1,0,1,2,3 and so on
                        System.out.print(" ");

                    }

                    for (int j = 1; j <= numOfColumns; j++) { //for number of columns i.e 1,3,5,7,5,3,1
                        System.out.print("*");

                    }

                    System.out.println();
                    if (i < ((size / 2) + 1)) {
                        numOfColumns += 2; // columns increasing till center row
                        numOfSpaces -= 1; // spaces decreasing till center row

                    }
                    else {
                        numOfColumns -= 2; // columns decreasing
                        numOfSpaces += 1; // spaces increasing

                    }

                }

            }
            else {
                System.out.printf("%s is an even number!%n", size);
                System.out.println("Pleas enter an odd number!");

            }

            System.out.printf("%n%s%n%s%n %s%n %s%n",
                    "Enter an odd number in the range 1 to 19.",
                    "Type the end-of-file indicator to terminate input:",
                    "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                    "On Windows type <Ctrl> z then press Enter");

        }


    }

}
