package com.abc.news.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan({"com.abc.news.controller", "com.abc.news.services"})
@EnableJpaRepositories({"com.abc.news.repositories"})
@SpringBootApplication
@EntityScan({"com.abc.news.entities"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); 
	}
}
