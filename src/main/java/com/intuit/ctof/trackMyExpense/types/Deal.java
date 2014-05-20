package com.intuit.ctof.trackMyExpense.types;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Deal {
    public Deal(String id, String coupon, String dealDescription) {
        this.coupon = coupon;
        this.dealDescription = dealDescription;
        this.id = id;
    }

    private String coupon;
    private String dealDescription;

    public Deal(String id, String dealDescription) {
        this.dealDescription = dealDescription;
        this.id = id;
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public Deal() {
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }
}
