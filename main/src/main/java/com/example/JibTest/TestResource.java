package com.example.JibTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Component
@Path("/stores")
public class TestResource {

  @GET
  @Path("/test")
  public Response testResource() {
    return Response.ok().entity("{\"key\": \"Hello World\"}").build();
  }

}