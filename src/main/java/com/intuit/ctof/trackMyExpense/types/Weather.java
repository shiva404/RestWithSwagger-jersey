package com.intuit.ctof.trackMyExpense.types;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Weather {
    public Weather(String weatherReport) {
        this.weatherReport = weatherReport;
    }

    String weatherReport;

    public Weather() {
    }

    public void setWeatherReport(String weatherReport) {
        this.weatherReport = weatherReport;
    }
}
