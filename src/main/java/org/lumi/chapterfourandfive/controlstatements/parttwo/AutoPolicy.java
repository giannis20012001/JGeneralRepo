package org.lumi.chapterfourandfive.controlstatements.parttwo;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 23/3/2017.
 */

public class AutoPolicy {
    public boolean isNoFaultState() {
        boolean noFaultState;
        //Determine whether state has no-fault auto insurance
        switch (getState()) {
            case "CT": case "MA": case "ME": case "NH": case "NJ": case "NY": case "PA": case "VT":
            noFaultState = true;
            break;

            default:
                noFaultState = false;
                break;

        }

        return noFaultState;

    }

    //==================================================================================================================
    //setters & getters
    //==================================================================================================================
    public int getAccountNumber() {
        return accountNumber;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public String getMakeAndModel() {
        return makeAndModel;

    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;

    }

    public String getState() {
        return state;

    }

    public void setState(String state) {
        if (state == "CT" ||
                state == "MA" ||
                state == "ME" ||
                state == "NH" ||
                state == "NJ" ||
                state == "NY" ||
                state == "PA" ||
                state == "VT") {
            this.state = state;

        }
        else {
            System.out.println("You have entered a wrong state code!");

        }

    }

    //==================================================================================================================
    //Class constructor
    //==================================================================================================================
    /**
     * Parametrised constructor
     */
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        if (state == "CT" ||
                state == "MA" ||
                state == "ME" ||
                state == "NH" ||
                state == "NJ" ||
                state == "NY" ||
                state == "PA" ||
                state == "VT") {
            this.state = state;

        }
        else {
            System.out.println("You have entered a wrong state code!%n%n");

        }

    }

    /**
     * Default constructor
     */
    public AutoPolicy() {
        //Do nothing

    }

    //==================================================================================================================
    //Class variables
    //==================================================================================================================
    private int accountNumber; //Policy account number
    private String makeAndModel; //Car that the policy applies to
    private String state; //Two-letter state abbreviation

}