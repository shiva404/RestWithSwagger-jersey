package com.intuit.ctof.trackMyExpense.types;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Travel {
    public Travel(String source, String destination, String discountString) {
        this.source = source;
        this.destination = destination;
        this.discountString = discountString;
    }

    private String source;
    private String destination;

    private String discountString;

    public Travel() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDiscountString() {
        return discountString;
    }

    public void setDiscountString(String discountString) {
        this.discountString = discountString;
    }
}
