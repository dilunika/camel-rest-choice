package org.jkd.camel.example.lmr;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Body;
import org.apache.camel.Handler;

public class ResponseTransformer {

	@Handler
	public Response transform(@Body final RegistrationStatus registrationStatus){
		
		return buildResponse(registrationStatus);
	}
	
	private Response buildResponse(RegistrationStatus registrationStatus) {

		return Response.status(registrationStatus.getStatus().equals("OK") ? Response.Status.OK : Response.Status.FORBIDDEN)
					   .entity(registrationStatus)
					   .type(MediaType.APPLICATION_JSON)
					   .build();
	}
}
