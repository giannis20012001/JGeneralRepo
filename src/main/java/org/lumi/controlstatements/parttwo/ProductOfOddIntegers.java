package org.lumi.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 22/3/2017.
 */

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int total = 1;

        for (int i = 1; i <= 15; i+=2) {
            total *= i;
            
        }

        System.out.printf("%s%d%n", "Total: ", total);
        
    }
    
}
