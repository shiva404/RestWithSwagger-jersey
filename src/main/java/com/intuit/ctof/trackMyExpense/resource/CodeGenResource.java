package com.intuit.ctof.trackMyExpense.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by sn1 on 6/23/14.
 */

@Path("/gen")
public class CodeGenResource {

    @POST
    public Response generate(){
        return null;
    }

    @GET
    public Response get(){
        return Response.ok("It works!!").build();
    }
}
