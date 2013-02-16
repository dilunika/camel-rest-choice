package org.jkd.camel.example.lmr;

import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberRegistrationService implements Processor{

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberRegistrationService.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		
		final MemberApplication application = exchange.getIn().getBody(MemberApplication.class);
	
		final RegistrationStatus status = new RegistrationStatus();
		status.setStatus("OK");
		status.setMembershipId(UUID.randomUUID().toString());
		
		exchange.getIn().setBody(status);
		
		LOGGER.info("Applicant {} is Registered.",application.getName());
	}

}
