package org.lumi.chapterthree.jobjectsmethodsandstrings;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Created by John Tsantilis (A.K.A lumi) on 30/1/2017.
 */

public class Addition {
    public static void main(String[] args) {
        String number1 = JOptionPane.showInputDialog("Enter first number");
        if (isInteger(number1, 10)) {
            String number2 = JOptionPane.showInputDialog("Enter second number");
            if (isInteger(number2, 10)) {
                int sum = Integer.parseInt(number1) + Integer.parseInt(number2);
                JOptionPane.showMessageDialog(null, String.valueOf(sum));

            }

        }

    }

    public static boolean isInteger(String s, int radix) {
        Scanner sc = new Scanner(s.trim());
        if(!sc.hasNextInt(radix)) {
            return false;

        }
        // we know it starts with a valid int, now make sure
        // there's nothing left!
        sc.nextInt(radix);

        return !sc.hasNext();

    }

}
