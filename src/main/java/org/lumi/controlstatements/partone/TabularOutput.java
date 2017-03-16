package org.lumi.controlstatements.partone;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 24/2/2017.
 */

public class TabularOutput {
    public static void main(String[] args) {
        int counter = 1;

        System.out.printf("N\t10*N\t100*N\t1000*N%n");
        while (counter <= 5) {
            System.out.printf("%d\t%d\t\t%d\t\t%d%n", counter, counter * 10, counter * 100, counter * 1000);
            counter++;

        }

    }

}
