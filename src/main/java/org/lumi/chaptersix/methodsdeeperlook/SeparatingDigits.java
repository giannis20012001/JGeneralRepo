package org.lumi.chaptersix.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 19/4/2017.
 */

public class SeparatingDigits {
    private int calculateIntegerQuotient(int a, int b) {
        return (a / b);

    }

    private int calculateIntegerRemainder(int a, int b) {
        return a % b;

    }

    public void displayDigits(int number) {
        if (number >= 10000) {
            int a = calculateIntegerQuotient(number, 10000);
            number = calculateIntegerRemainder(number, 10000);
            int b = calculateIntegerQuotient(number, 1000);
            number = calculateIntegerRemainder(number, 1000);
            int c = calculateIntegerQuotient(number, 100);
            number = calculateIntegerRemainder(number, 100);
            int d = calculateIntegerQuotient(number, 10);
            int e = calculateIntegerRemainder(number, 10);

            System.out.printf("%d %d %d %d %d", a, b, c, d, e);

        }
        else if (number >= 1000 && number < 10000) {
            int b = calculateIntegerQuotient(number, 1000);
            number = calculateIntegerRemainder(number, 1000);
            int c = calculateIntegerQuotient(number, 100);
            number = calculateIntegerRemainder(number, 100);
            int d = calculateIntegerQuotient(number, 10);
            int e = calculateIntegerRemainder(number, 10);

            System.out.printf("%d %d %d %d", b, c, d, e);

        }
        else if (number >= 100 && number < 1000) {
            int c = calculateIntegerQuotient(number, 100);
            number = calculateIntegerRemainder(number, 100);
            int d = calculateIntegerQuotient(number, 10);
            int e = calculateIntegerRemainder(number, 10);

            System.out.printf("%d %d %d", c, d, e);

        }
        else if (number >= 10 && number < 100) {
            int d = calculateIntegerQuotient(number, 10);
            int e = calculateIntegerRemainder(number, 10);

            System.out.printf("%d %d", d, e);

        }
        else {
            System.out.println("You have entered a number outside the specified range!");

        }

    }

}
