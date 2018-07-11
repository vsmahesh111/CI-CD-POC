package com.fuse.springboot.poc;

import org.apache.camel.builder.RouteBuilder;

public class TimerRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
	

	
		
	from("timer://foo?fixedRate=true&period=60000")
	.log("'Timer Triggeredd #############################");
	
	}


private void display()
{

System.out.println("SOnar Qube demo");

}
	

}
