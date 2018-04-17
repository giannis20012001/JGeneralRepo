package org.lumi.chapterthree.jobjectsmethodsandstrings;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 16/2/2017.
 */

public class Account {
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;

    }

    public boolean withdraw(double withdrawalAmount) {
        if ((getBalance() - withdrawalAmount) >= 0) {
            this.balance = getBalance() - withdrawalAmount;

            return true;

        }

        if ((getBalance() - withdrawalAmount) < 0) {
            System.out.println("Withdrawal amount exceeded account balance.");

            return false;

        }

        return false;

    }

    //=================================================================================================================
    //getters & setters
    //=================================================================================================================
    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public double getBalance() {
        return balance;

    }

    //=================================================================================================================
    //constructors
    //=================================================================================================================
    /**
     * Parameterized constructor
     */
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;

    }

    private String name;
    private double balance;

}
