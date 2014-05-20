package com.intuit.ctof.trackMyExpense.types;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 9:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class News {
    public News() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String time, String source, String content) {
        this.time = time;
        this.source = source;
        this.content = content;
    }

    private String time;
    private String source;
    private String content;
}
