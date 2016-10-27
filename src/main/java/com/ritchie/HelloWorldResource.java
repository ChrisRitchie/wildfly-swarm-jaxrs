package com.ritchie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@Stateless
@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	
	@GET
	public Response getHelloWorld() {
		return Response.ok(new MessageResponse("HELLO WORLD!")).build();
	}
}
