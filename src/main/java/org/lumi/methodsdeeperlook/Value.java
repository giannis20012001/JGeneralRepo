package org.lumi.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/4/2017.
 */

public class Value {
    public static void main(String[] args) {
        System.out.println(Math.abs(7.5));
        System.out.println(Math.floor(7.5));
        System.out.println(Math.abs(0.0));
        System.out.println(Math.ceil(0.0));
        System.out.println(Math.abs(-6.4));
        System.out.println(Math.ceil(-6.4));
        System.out.println(Math.floor(-5.5));
        System.out.println(Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));

    }

}
