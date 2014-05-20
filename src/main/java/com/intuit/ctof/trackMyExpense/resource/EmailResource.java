package com.intuit.ctof.trackMyExpense.resource;

import com.intuit.ctof.trackMyExpense.email.icn.EmailDao;
import com.intuit.ctof.trackMyExpense.email.icn.IcnEmail;
import com.intuit.ctof.trackMyExpense.types.Email;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("email")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/email", description = "Send an email")
public class EmailResource {

    private EmailDao emailDao;

    public EmailResource(EmailDao emailDao) {
        this.emailDao = emailDao;
    }

    @POST
    @ApiOperation(
            value = "List deals",
            tags = "post",
            httpMethod = "POST")
    public Response sendEmail(Email email) throws Exception {
        emailDao.sendEmail(convertToIcnInvoice(email));
        return Response.ok().header("Access-Control-Allow-Origin", "*").build();
    }

    private IcnEmail convertToIcnInvoice(Email email) {
        return new IcnEmail(email.getToEmailId(), null, null, email.getBody(), "SWAGGER_TEST");
    }

    @GET
    public Response getEmail() throws Exception {
        Email email = new Email("shivakumar_N@intuit.com", "Test from shiv");
        return Response.ok().entity(email).header("Access-Control-Allow-Origin", "*").build();
    }
}
