package org.lumi.chaptertwo.jintro;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 12/2/2017.
 */

public class IntegerValueOfACharacter {
    public static void main(String[] args) {
        System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
        System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
        System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
        System.out.printf("The character %s has the value %d%n", "\"blank character\"", ((int) ' '));

    }

}
