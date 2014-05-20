package com.intuit.ctof.trackMyExpense.types;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Blab {
    public Blab(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public Blab() {
    }
}