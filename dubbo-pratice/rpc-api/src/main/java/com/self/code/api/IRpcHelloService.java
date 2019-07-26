package com.self.code.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public interface IRpcHelloService {

    @GET
    @Path("/{name}")
    String hello(@PathParam("name") String name);
}  
