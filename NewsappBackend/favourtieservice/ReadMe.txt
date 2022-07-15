DB Setup:
1. create database fav_news_db;
2. Here, table "news" will be created automatically.
3. mysql> desc news;
+---------------------+---------------+------+-----+---------+----------------+
| Field               | Type          | Null | Key | Default | Extra          |
+---------------------+---------------+------+-----+---------+----------------+
| id                  | int           | NO   | PRI | NULL    | auto_increment |
| content             | varchar(1000) | YES  |     | NULL    |                |
| description         | varchar(500)  | YES  |     | NULL    |                |
| published_at        | varchar(255)  | YES  |     | NULL    |                |
| source_website_name | varchar(255)  | YES  |     | NULL    |                |
| title               | varchar(255)  | YES  |     | NULL    |                |
| url                 | varchar(255)  | YES  |     | NULL    |                |
| url_to_image        | varchar(255)  | YES  |     | NULL    |                |
| user_id             | varchar(255)  | YES  |     | NULL    |                |
+---------------------+---------------+------+-----+---------+----------------+
4. drop table user;

1. Create spring boot starter project with Spring Web and Eureka Discovery Client.
2. Annotate FavourtieserviceApplication.java with @EnableEurekaClient.
3. Place application.yml file in src/main/resources.
4. Server port and application name also add in application.properties if they are not read correctly from .yml file.
5. Run the application and check the URL:
		1. findNewsById: http://localhost:8081/api/news from postman.
		    Ex: GET -> Headers -> Authorization -> Bearer "token"
		    
		2. deleteNewsById - http://localhost:9001/api/news/{id} with JSON object from postman.
    	     Ex: http://localhost:9001/api/news/1
    			    	DELETE -> Body -> raw -> JSON
						{
    						"userId":"nk123"
						}
		 
				
6. Check the Eureka server URL : http://localhost:8761 - check if FAVOURITE-SERVICE registered.


