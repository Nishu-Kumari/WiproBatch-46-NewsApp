package com.stackroute.favouriteservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* @Configuration: used to mark a class as a source of the bean definitions. 
   @EnableSwagger2: The @EnableSwagger2 annotation is used to enable the Swagger2 for our Spring Boot application. */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	/* @Bean: specifies a returned bean to be managed by Spring context. The returned bean has the same name as the factory method. */
    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.favouriteservice"))
                .build();
    }
}

