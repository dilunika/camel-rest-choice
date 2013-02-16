package org.jkd.camel.example.lmr;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


public class MemberRegistrationDispatcher {

	@POST
	@Produces({"application/json", "application/xml"})
    @Consumes({"application/json", "application/xml"})
    @Path("lmr/register")
	public void register(final MemberApplication application){
		
	}
}
