package org.lumi.methodsdeeperlook;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class TemperatureConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n",
                "Choose (1) Fahrenheit to Celsius or (2) Celsius to Fahrenheit",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int value = input.nextInt();

            switch (value) {
                case 1:
                    System.out.print("Enter the temperature in Fahrenheit: ");
                    System.out.println("The temperature in Celsius is: " + celsius(input.nextInt()));
                    break;

                case 2:
                    System.out.print("Enter the temperature in Celsius: ");
                    System.out.println("The temperature in Fahrenheit is: " + fahrenheit(input.nextInt()));
                    break;

                default:
                    System.out.println("You have made an invalid choice!");
                    System.out.println("Please try again!");

            }

            System.out.printf("%n%s%n%s%n %s%n %s%n",
                    "Choose (1) Fahrenheit to Celsius or (2) Celsius to Fahrenheit",
                    "Type the end-of-file indicator to terminate input:",
                    "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                    "On Windows type <Ctrl> z then press Enter");

        }

    }

    public static int celsius(int fahrenheit) {
        return (int) ((5.0 / 9.0) * (fahrenheit - 32));

    }

    public static int fahrenheit(int celsius) {
        return (int) (((9.0 / 5.0) * celsius) + 32);

    }

}
