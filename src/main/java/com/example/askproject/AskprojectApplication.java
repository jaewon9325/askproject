package com.example.askproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AskprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskprojectApplication.class, args);
	}

}