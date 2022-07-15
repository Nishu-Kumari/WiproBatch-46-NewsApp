package com.example.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/* @SpringBootApplication: This annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers
						   auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration 
                           and @ComponentScan annotations.
   @EnableEurekaServer: annotation is used to make our Spring Boot application acts as a Eureka Server. */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println("Eureka Server Start..!!!");
	}

}
