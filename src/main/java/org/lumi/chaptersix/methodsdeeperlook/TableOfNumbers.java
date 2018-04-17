package org.lumi.chaptersix.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 26/4/2017.
 */

public class TableOfNumbers {
    public static void main(String[] args) {
        System.out.printf("%s%26st%26s%33s%n",
                "Decimal number",
                "Binary representation",
                "Octal representation",
                "Hexadecimal representation");
        for (int i = 0; i < 256; i++) {
            System.out.printf("%8s%22s%28s%29s%n", i,
                    calculateBinaryB(i),
                    calculateOctalB(i),
                    calculateHexadecimalB(i));

        }

    }

    private static int calculateBinary(int number) {
        int counter = 0;
        int result = 0;

        while (Math.pow(2, counter) <= number) {
            counter++;

        }

        while (counter > 0) {
            result = (result * 10) + (number / (int) Math.pow(2, counter - 1));
            number = number % (int) Math.pow(2, counter - 1);
            counter--;

        }

        return result;

    }

    private static String calculateBinaryB(int number) {
        return Integer.toBinaryString(number);

    }

    private static int calculateOctal(Integer number) {
        int counter = 0;
        int result = 0;

        while (Math.pow(8, counter) <= number) {
            counter++;

        }

        while (counter > 0) {
            result = (result * 10) + (number / (int) Math.pow(8, counter - 1));
            number = number % (int) Math.pow(8, counter - 1);
            counter--;

        }

        return result;

    }

    private static String calculateOctalB(Integer number) {
        return Integer.toOctalString(number);

    }

    private static String calculateHexadecimal(Integer number) {
        int counter = 0;
        String result = "";

        while (Math.pow(16, counter) <= number) {
            counter++;

        }

        while (counter > 0) {
            if ((number / (int) Math.pow(16, counter - 1) <= 9)) {
                result = result + number / (int) Math.pow(16, counter - 1);

            }
            else if ((number / (int) Math.pow(16, counter - 1) >= 10) &&
                    (number / (int) Math.pow(16, counter - 1) < 16)) {
                switch (number / (int) Math.pow(16, counter - 1)) {
                    case 10:
                        result = result + "A";
                        break;

                    case 11:
                        result = result + "B";
                        break;

                    case 12:
                        result = result + "C";
                        break;

                    case 13:
                        result = result + "D";
                        break;

                    case 14:
                        result = result + "E";
                        break;

                    case 15:
                        result = result + "F";
                        break;

                }

            }

            number = number % (int) Math.pow(16, counter - 1);
            counter--;

        }

        return result;

    }

    private static String calculateHexadecimalB(Integer number) {
        return Integer.toHexString(number).toUpperCase();

    }

}