package com.intuit.ctof.trackMyExpense.htmlStuff;

import com.intuit.ctof.trackMyExpense.resource.NewsResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sn1
 * Date: 5/15/14
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("newsHtml")
public class NewsHtml {


    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getHtml(){
        String html = "<div class='container'> <div class=\"media\"> <img class=\"pull-left media-object img\" src=\"/assets/news.png\" alt=\"news icon\"> <div class=\"media-body\"> <br /> <p> <strong>Time:</strong> 2014-01-01T11:00;00 </p> <p> <strong>Source:</strong> CNN </p> <p> <strong>Content:</strong> PM got shot </p> <br /> <div> <button class='btn btn-primary collapse_btn'>Collapse</button> <button class='btn btn-primary'>World</button> <button class='btn btn-primary'>Local</button> <button class='btn btn-primary'>Email</button> </div> </div> </div> </div>";
        List<String> strings = new ArrayList<String>();

        for (int i = 0; i< 10 ; i++){
            strings.add("<li>" + html + "</li>");
        }
        return Response.ok().header("Access-Control-Allow-Origin", "*").entity(html).build();
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("test")
    public Response getDealsHtml(){
        String html = "<html><body>" +
                "<div class='container'> " +
                "<div class=\"media\"> <img class=\"pull-left media-object img\" src=\"/assets/news.png\" " +
                "alt=\"news icon\"> <div class=\"media-body\"> <br /> <p> " +
                "<strong>Time:</strong> 2014-01-01T11:00;00 </p> <p> <strong>Source:</strong> CNN </p> <p>" +
                " <strong>Content:</strong> PM got shot </p> <br /> <div> <button class='btn btn-primary collapse_btn'>Collapse</button>" +
                " <button class='btn btn-primary'>World</button> <button class='btn btn-primary'>Local</button> " +
                "<button class='btn btn-primary'>Email</button> </div> </div> </div> </div></body></html>";
        return Response.ok().entity(html).header("Access-Control-Allow-Origin", "*").build();
    }
}
