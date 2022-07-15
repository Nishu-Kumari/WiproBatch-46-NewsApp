DB Setup:
1.create database news_db;
2.create table user(user_id varchar(255) not null, created_date datetime(6), first_name varchar(255),
 last_name varchar(255), password varchar(255), primary key (user_id));
3.insert into user (user_id, created_date, first_name, last_name, password) values('sk123','2022-07-14 11:43:26.300000',
					'Sandhya','Keerthigari','12345');
  insert into user values('ts123','2022-07-13 10:43:26.300000','Tejasvi','Singh','123456');
  insert into user values('hvr123','2022-07-13 11:43:26.300000','Harsh Vardhan','Rajput','1234567');
4.commit;
5.mysql> select * from user;
+---------+----------------------------+---------------+-------------+----------+
| user_id | created_date               | first_name    | last_name   | password |
+---------+----------------------------+---------------+-------------+----------+
| hvr123  | 2022-07-13 11:43:26.300000 | Harsh Vardhan | Rajput      | 1234567  |
| nk123   | 2022-07-12 09:43:26.300000 | Nishu         | Kumari      | 12345678 |
| sk123   | 2022-07-14 11:43:26.300000 | Sandhya       | Keerthigari | 12345    |
| ts123   | 2022-07-13 10:43:26.300000 | Tejasvi       | Singh       | 123456   |
+---------+----------------------------+---------------+-------------+----------+
6.drop table user;


1. Create spring boot starter project with Spring Web and Eureka Discovery Client.
2. Annotate UserserviceApplication.java with @EnableEurekaClient.
3. Place application.yml file in src/main/resources.
4. Server port and application name also add in application.properties if they are not read correctly from .yml file.
5. Configure mysql db in application.properties file.
6. Run the application and check the URL:
		1)For Register User: http://localhost:8082/api/v1/userservice/register with JSON object from postman.
			Ex: POST -> Body -> raw -> JSON
				{
    				"userId":"nk123",
    				"firstName":"Nishu",
    				"lastName":"Kumari",
    				"password":"12345678"
				}
				
		2)For Login User: http://localhost:8082/api/v1/userservice/login with JSON object from postman.
			 Ex: POST -> Body -> raw -> JSON
				{
    				"userId":"nk123",
    				"password":"12345678"
				}	
		
7. Check the Eureka server URL: http://localhost:8761 - check if USER-SERVICE registered.

