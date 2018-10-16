package com.springcloud.eureka.learn.client.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
	
	@Autowired
	DiscoveryClient client;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String index(){
		List<String> services = client.getServices();
		logger.info("/hello,host:{}",client.getInstances(services.get(0)).get(0).getHost());
		logger.info("/hello,service_id:{}",services.get(0));
		return "Hello world";
	}
}
