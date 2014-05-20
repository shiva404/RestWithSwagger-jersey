package com.intuit.ctof.trackMyExpense.email.icn;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class IcnEmail {
    public String getToEmailId() {
        return toEmailId;
    }

    public void setToEmailId(String toEmailId) {
        this.toEmailId = toEmailId;
    }

    public String getFromEmailId() {
        return fromEmailId;
    }

    public void setFromEmailId(String fromEmailId) {
        this.fromEmailId = fromEmailId;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public IcnEmail(String toEmailId, String fromEmailId, String locale, String subject, String template) {
        this.toEmailId = toEmailId;
        this.fromEmailId = fromEmailId;
        this.locale = locale;
        this.subject = subject;
        this.template = template;
    }

    String toEmailId;
    String fromEmailId;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    //String templateVariables (Map[string,string], optional),
    String template;
    String locale;
    String subject;
}
