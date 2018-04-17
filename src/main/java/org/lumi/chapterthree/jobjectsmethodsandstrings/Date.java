package org.lumi.chapterthree.jobjectsmethodsandstrings;

/**
 * Created by John Tsantilis
 * (i [dot] tsantilis [at] yahoo [dot] com A.K.A lumi) on 18/2/2017.
 */

public class Date {
    public String displayDate() {
        return getDay() + "/" + getMonth() + "/" + getYear();

    }

    //=================================================================================================================
    //getters & setters
    //=================================================================================================================
    public int getMonth() {
        return month;

    }

    public void setMonth(int month) {
        this.month = month;

    }

    public int getDay() {
        return day;

    }

    public void setDay(int day) {
        this.day = day;

    }

    public int getYear() {
        return year;

    }

    public void setYear(int year) {
        this.year = year;

    }

    ///=================================================================================================================
    //constructors
    //=================================================================================================================
    /**
     * Parameterized constructor
     */
    public Date(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private int month;
    private int day;
    private int year;

}
