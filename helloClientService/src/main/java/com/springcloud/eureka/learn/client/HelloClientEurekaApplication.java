package com.springcloud.eureka.learn.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientEurekaApplication.class, args);
	}

}
