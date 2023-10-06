package com.vikash.springreactivemongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class SpringReactivemongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactivemongoApplication.class, args);
	}

}
