package com.sl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.sl.app")
@SpringBootApplication
public class CoursesMicroserviceMongodbRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesMicroserviceMongodbRestApiServerApplication.class, args);
	}

}
