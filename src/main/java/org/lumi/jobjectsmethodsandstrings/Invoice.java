package org.lumi.jobjectsmethodsandstrings;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 16/2/2017.
 */

public class Invoice {
    public double getInvoiceAmount() {
        return getQuantity() * getPrice();

    }

    //=================================================================================================================
    //getters & setters
    //=================================================================================================================
    public String getPartNumber() {
        return partNumber;

    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;

    }

    public String getPartDescription() {
        return partDescription;

    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;

    }

    public int getQuantity() {
        return quantity;

    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;

        }

        this.quantity = quantity;

    }

    public double getPrice() {
        return price;

    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;

        }

        this.price = price;

    }

    ///=================================================================================================================
    //constructors
    //=================================================================================================================
    /**
     * Parameterized constructor
     */
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;

    }

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

}
