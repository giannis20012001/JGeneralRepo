package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;

        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%s%d%s%d%n", "Factorial of ", i, " is: ", factorial);

        }

        System.out.printf("%s%d%n", "Last factorial time 3 is:", factorial * 3);
        System.out.printf("%s%d%n", "Long max value:          ", Long.MAX_VALUE);

    }

}
