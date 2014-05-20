package com.intuit.ctof.trackMyExpense.types;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Email {
    public Email(String toEmailIds, String body) {
        this.toEmailId = toEmailIds;
        this.body = body;
    }

    private String toEmailId;

    public Email() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    private String body;

}
