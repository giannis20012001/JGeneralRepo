package org.lumi.chaptersix.methodsdeeperlook;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 4/4/2017.
 */

public class ParkingCharges {
    public void calculateCharges(double hoursParked) {
        if (hoursParked >= 14.0) {
            this.charges = 10.0;
            ParkingCharges.total = ParkingCharges.total + this.charges;

        }
        else if ((hoursParked > 3.0) && (hoursParked < 14)) {
            this.charges = 2.0 + (0.50 * (hoursParked - 3.0));
            ParkingCharges.total = ParkingCharges.total + this.charges;

        }
        else if ((hoursParked <= 3.0) && (hoursParked > 0.0)){
            this.charges = 2.0;
            ParkingCharges.total = ParkingCharges.total + this.charges;

        }
        else if (hoursParked == 0.0) {
            this.charges = 0.0;
            ParkingCharges.total = ParkingCharges.total + this.charges;

        }
        else {
            System.out.println("You have entered an unspecified value regarding the parked hours");

        }

        System.out.printf("The current charge for customer %d is: %f%n", this.customerID, this.charges);
        System.out.printf("The running total is: %f%n", ParkingCharges.total);

    }

    @Override
    public String toString() {
        return "ParkingCharges{" +
                "customerID=" + customerID +
                ", hoursParked=" + hoursParked +
                ", charges=" + charges +
                ", total=" + ParkingCharges.total +
                '}';

    }

    //==================================================================================================================
    //Class constructors
    //==================================================================================================================
    public int getCustomerID() {
        return customerID;

    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;

    }

    public double getHoursParked() {
        return hoursParked;

    }

    public void setHoursParked(double hoursParked) {
        this.hoursParked = hoursParked;

    }

    public double getCharges() {
        return charges;

    }

    public void setCharges(double charges) {
        this.charges = charges;

    }

    //==================================================================================================================
    //Class constructors
    //==================================================================================================================
    /**
     * Default constructor
     */
    ParkingCharges() {
        //Do nothing

    }

    /**
     * Parametrized constructor 1
     */
    ParkingCharges(int customerID) {
        this.customerID = customerID;

    }

    /**
     * Parametrized constructor 2
     */
    public ParkingCharges(int customerID, double hoursParked, double charges) {
        this.customerID = customerID;
        this.hoursParked = hoursParked;
        this.charges = charges;

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    private  int customerID;
    private  double hoursParked;
    private double charges;
    private static double total;

}
