package com.stackroute.favouriteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* @SpringBootApplication: This annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers
						   auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration 
                           and @ComponentScan annotations.
   @EnableSwagger2: The @EnableSwagger2 annotation is used to enable the Swagger2 for our Spring Boot application.                        
   @EnableEurekaClient: annotation makes our Spring Boot application act as a Eureka client. */

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class FavourtieserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavourtieserviceApplication.class, args);
		System.out.println("favouriteservice run successfully!!!");
	}

}
