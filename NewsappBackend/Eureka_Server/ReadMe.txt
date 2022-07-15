1. Create spring boot starter project with Spring Web and Eureka server.
2. Annotate EurekaServerApplication.java with @EnableEurekaServer.
3. Place application.yml file in src/main/resources.
4. Server port and application name also add in application.properties if they are not read correctly from .yml file.
5. Run the application and check the URL: http://localhost:8761.
6. Keep it running and bring up the other services to get registered with this Eureka server.
7. URL: http://localhost:8761
 
 
