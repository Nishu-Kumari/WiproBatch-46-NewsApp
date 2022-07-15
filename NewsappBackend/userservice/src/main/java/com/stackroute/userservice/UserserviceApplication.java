package com.stackroute.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/* @SpringBootApplication: This annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers
            			   auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration 
            			   and @ComponentScan annotations.
   @EnableEurekaClient: annotation makes our Spring Boot application act as a Eureka client. */

@SpringBootApplication
@EnableEurekaClient
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
		System.out.println("userservice run successfully!!!");
	}

}
