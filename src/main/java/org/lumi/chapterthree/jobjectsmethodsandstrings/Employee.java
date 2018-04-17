package org.lumi.chapterthree.jobjectsmethodsandstrings;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 18/2/2017.
 */

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';

    }

    //=================================================================================================================
    //getters & setters
    //=================================================================================================================
    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public double getMonthlySalary() {
        return monthlySalary;

    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            System.out.println("The value provided for the monthly salary is negative! Value is not set!");

        }

        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;

        }

    }

    ///=================================================================================================================
    //constructors
    //=================================================================================================================
    /**
     * Parameterized constructor
     */
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary < 0) {
            System.out.println("The value provided for the monthly salary is negative! Value is not set!");

        }

        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;

        }

    }

    private String firstName;
    private String lastName;
    private double monthlySalary;

}
