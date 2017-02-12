package org.lumi.jintro;

import java.util.Scanner;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 10/2/2017.
 */

public class LargestSmallestIntegers {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        num2 = input.nextInt();
        System.out.println("Enter third integer: ");
        num3 = input.nextInt();
        System.out.println("Enter fourth integer: ");
        num4 = input.nextInt();
        System.out.println("Enter fifth integer: ");
        num5 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num1 > num4) {
                    if (num1 > num5) {
                        System.out.printf("%d is the largest%n", num1);

                    }

                }

            }

        }

        if (num2 > num1) {
            if (num2 > num3) {
                if (num2 > num4) {
                    if (num2 > num5) {
                        System.out.printf("%d is the largest%n", num2);

                    }

                }

            }

        }

        if (num3 > num1) {
            if (num3 > num2) {
                if (num3 > num4) {
                    if (num3 > num5) {
                        System.out.printf("%d is the largest%n", num3);

                    }

                }

            }

        }

        if (num4 > num1) {
            if (num4 > num2) {
                if (num4 > num3) {
                    if (num4 > num5) {
                        System.out.printf("%d is the largest%n", num4);

                    }

                }

            }

        }

        if (num5 > num1) {
            if (num5 > num2) {
                if (num5 > num3) {
                    if (num5 > num4) {
                        System.out.printf("%d is the largest%n", num5);

                    }

                }

            }

        }

        if (num1 < num5) {
            if (num1 < num4) {
                if (num1 < num3) {
                    if (num1 < num2) {
                        System.out.printf("%d is the smallest%n", num1);

                    }

                }

            }

        }

        if (num2 < num5) {
            if (num2 < num4) {
                if (num2 < num3) {
                    if (num2 < num1) {
                        System.out.printf("%d is the smallest%n", num2);

                    }

                }

            }

        }

        if (num3 < num5) {
            if (num3 < num4) {
                if (num3 < num2) {
                    if (num3 < num1) {
                        System.out.printf("%d is the smallest%n", num3);

                    }

                }

            }

        }

        if (num4 < num5) {
            if (num4 < num3) {
                if (num4 < num2) {
                    if (num4 < num1) {
                        System.out.printf("%d is the smallest%n", num4);

                    }

                }

            }

        }

        if (num5 < num4) {
            if (num5 < num3) {
                if (num5 < num2) {
                    if (num5 < num1) {
                        System.out.printf("%d is the smallest%n", num5);

                    }

                }

            }

        }

    }

}
