package com.sl;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/my-restful-webservice")
public class MyRestWebService {

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String hello() {
//		return "Hello!";
//	}
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String hello() {
//		return "{\"message\":\"Hello!\"}";
//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String hello() {
		return "<message><messageText>Hello!</messageText><messageTone>Happy</messageTone></message>";
	}
	

}
