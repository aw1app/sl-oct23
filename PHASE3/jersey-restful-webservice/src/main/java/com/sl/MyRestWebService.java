package com.sl;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/my-restful-webservice")
public class MyRestWebService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello!";
	}

}
