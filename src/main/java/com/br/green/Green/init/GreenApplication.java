package com.br.green.Green.init;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan(basePackages = { "com.br.green.Green.controller",  })
@EnableMongoRepositories(basePackages = { "com.br.green.Green.repository" })
@SpringBootApplication
public class GreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenApplication.class, args);
	}
}
