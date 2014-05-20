package com.intuit.ctof.trackMyExpense.resource;

import com.intuit.ctof.trackMyExpense.types.News;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.joda.time.DateTime;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/14/14
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("news")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/news", description = "Get news")
public class NewsResource {

    @ApiOperation(
            value = "get news",
            tags = "get",
            httpMethod = "GET")
    @GET
    public Response getNews(){
        List<News> news = new ArrayList<News>();

        news.add(new News(new DateTime().toString(), "CNN", "PM got shot"));
        news.add(new News(new DateTime().toString(), "IBN", "PM dead. New PM is coming to India"));
        news.add(new News(new DateTime().toString(), "TOI", "India won world cup."));
        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(news).build();
    }
}