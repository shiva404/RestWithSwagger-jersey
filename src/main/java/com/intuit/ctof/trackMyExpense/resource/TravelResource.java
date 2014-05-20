package com.intuit.ctof.trackMyExpense.resource;

import com.intuit.ctof.trackMyExpense.types.Travel;
import com.intuit.ctof.trackMyExpense.types.Weather;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("travelDeals")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/travelDeals", description = "Get travelDeals")
public class TravelResource {
    @ApiOperation(
            value = "get travel deals",
            tags = "get",
            httpMethod = "GET")
    @GET
    public Response getTravels(@QueryParam("source") String source, @QueryParam("destination") String destination){
        List<Travel> travels = new ArrayList<Travel>();
        travels.add(new Travel("SFO", "Mumbai", "United Airlines Sale for SFO to Mumbai flights in December"));
        travels.add(new Travel("SFO", "LA", "United Airlines Sale for SFO to LA flights in March"));
        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(travels).build();
    }

    @GET
    @ApiOperation(
            value = "get weather report",
            tags = "get",
            httpMethod = "GET")
    @Path("destinationWeather")
    public Response getDestinationWeather(@QueryParam("destination") String destination){
        List<Weather> weathers = new ArrayList<Weather>();
        weathers.add(new Weather("Very cold in LA"));
        weathers.add(new Weather("Warm weather in LV"));
        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(weathers).build();
    }
}
