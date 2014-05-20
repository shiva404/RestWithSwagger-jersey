package com.intuit.ctof.trackMyExpense.resource;


import com.intuit.ctof.trackMyExpense.types.Blab;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("blabber")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/blabber", description = "Post to social media")
public class BlabberResource {

    @ApiOperation(
            value = "Post to social media",
            tags = "post",
            httpMethod = "POST")
    @Path("blab")
    @POST
    public Response save(@ApiParam(required = true, name = "targetSite", value = "targetSite") @QueryParam("targetSite") String targetSite,  Blab blab){
        //todo: post to twitter
        return Response.ok().build();
    }
}
