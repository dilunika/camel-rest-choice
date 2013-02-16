package org.jkd.camel.example.lmr.orga;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jkd.camel.example.lmr.MemberApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OrganizationAUserVerificationProcessor implements Processor{

	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationAUserVerificationProcessor.class);
	
	@Override
	public void process(final Exchange exchange) throws Exception {
		
		final MemberApplication application = exchange.getIn().getBody(MemberApplication.class);
		
		LOGGER.info("{} verified by Organization A.",application);
	}

	
}
