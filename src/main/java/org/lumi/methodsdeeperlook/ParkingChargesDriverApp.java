package org.lumi.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/4/2017.
 */

public class ParkingChargesDriverApp {
    public static void main(String[] args) {
        ParkingCharges customer1 = new ParkingCharges(1);
        ParkingCharges customer2 = new ParkingCharges(2);
        ParkingCharges customer3 = new ParkingCharges(3);

        customer1.calculateCharges(2.5);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        customer2.calculateCharges(7.9);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        customer3.calculateCharges(15);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

    }

}
