package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/3/2017.
 */

public class DeMorgansLaws {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int a = 7;
        int b = 87;
        int g = 9;
        int i = 14;
        int j = 45;

        System.out.printf("%s%b%n%s%b%n",
                "The expression !(x < 5) && !(y >= 7): ",
                !(x < 5) && !(y >= 7),
                "equals to the expression !( (x < 5) || (y >= 7) )): ",
                !( (x < 5) || (y >= 7) ));
        System.out.printf("%n%s%b%n%s%b%n",
                "The expression !(a == b) || !(g != 5): ",
                !(a == b) || !(g != 5),
                "equals to the expression !( (a == b) && (g != 5) ): ",
                !( (a == b) && (g != 5) ));
        System.out.printf("%n%s%b%n%s%b%n",
                "The expression !((x <= 8) && (y > 4)): ",
                !((x <= 8) && (y > 4)),
                "equals to the expression (! (x <= 8) || ! (y > 4) ): ",
                (! (x <= 8) || ! (y > 4) ));
        System.out.printf("%n%s%b%n%s%b%n",
                "The expression !((i > 4) || (j <= 6)): ",
                !((i > 4) || (j <= 6)),
                "equals to the expression (! (i > 4) && ! (j <= 6) ): ",
                (! (i > 4) && ! (j <= 6) ));

    }

}
