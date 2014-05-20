package com.intuit.ctof.trackMyExpense.resource;

import com.intuit.ctof.trackMyExpense.types.Deal;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("deals")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/deals", description = "Get deals around you")
public class DealsResource {

    public static final String DEAL1_ID = "123";
    public static final String DEAL2_ID = "124";
    public static final String DEAL1_DESC = "30% off on stay- corporate offers";
    public static final String DEAL2_DESC = "25% off our new summer clothing line";

    @GET
    @ApiOperation(
            value = "List deals",
            tags = "get",
            httpMethod = "GET")
    public Response listDeals(){
        List<Deal> deals = new ArrayList<Deal>();
        deals.add(new Deal(DEAL1_ID, DEAL1_DESC));
        deals.add(new Deal(DEAL2_ID, DEAL2_DESC));

        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(deals).build();
    }

    @ApiOperation(
            value = "Get deal",
            tags = "get",
            httpMethod = "GET")
    @Path("/{dealId}")
    @GET
    public Response getDeals(@ApiParam(required = true, name = "dealId", value = "dealId") @PathParam("dealId") String dealId){
        Deal deal = null;
        if(dealId.equals(DEAL1_ID)){
            deal = new Deal(DEAL1_ID, UUID.randomUUID().toString(), DEAL1_DESC);
        } else if(dealId.equals(DEAL2_ID)){
            deal = new Deal(DEAL2_ID, UUID.randomUUID().toString(), DEAL2_DESC);
        } else {
            Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(deal).build();
    }
}
