package com.fuse.springboot.poc;

import org.apache.camel.builder.RouteBuilder;

public class TimerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
	from("timer://foo?fixedRate=true&period=60000")
	.log("'Timer Triggered #####################");
	
	}
	
	

}
