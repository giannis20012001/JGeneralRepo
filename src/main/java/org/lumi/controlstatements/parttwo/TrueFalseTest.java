package org.lumi.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class TrueFalseTest {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;

        System.out.println(i == 1);
        System.out.println(j == 3);
        System.out.println((i >= 1) && (j < 4));
        System.out.println((m <= 99) & (k < m));
        System.out.println((j >= i) || (k == m));
        System.out.println((k + m < j) | (3 - j >= k));
        System.out.println(!(k > m));

    }

}
