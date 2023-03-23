package com.github.diegopacheco.fixingmonoliths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.UUID;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.github.diegopacheco.fixingmonoliths")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Spring Boot 2.7.x working! ");
			System.out.println("Here is a sample UUID: " + UUID.randomUUID());
		};
	}
}

