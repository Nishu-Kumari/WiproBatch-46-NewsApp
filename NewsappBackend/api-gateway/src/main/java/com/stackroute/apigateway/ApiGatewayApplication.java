package com.stackroute.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/* @SpringBootApplication: This annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers
                           auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration 
                           and @ComponentScan annotations.
   @EnableEurekaClient: annotation makes our Spring Boot application act as a Eureka client. */

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		System.out.println("ApiGateway Server Start..!!!");
	}

}
