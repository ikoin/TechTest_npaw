package com.test.resources;

import com.test.balancer.Balancer;
import com.codahale.metrics.annotation.Timed;
import com.test.bean.Rule;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/")
public class ApplicationResource {

    private ArrayList<Rule> balancerRules;

    public ApplicationResource() {
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_XML)
    @Path("/getData")
    public Response getData(@QueryParam("accountCode") String accountCode,
                             @QueryParam("targetDevice") String targetDevice,
                             @QueryParam("pluginVersion") String pluginVersion)
    {

        return Response
                .ok(Balancer.getInstance().getBalancerResponse(accountCode, targetDevice, pluginVersion)) //Returns 200 ok
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML)
                .build();
    }
}