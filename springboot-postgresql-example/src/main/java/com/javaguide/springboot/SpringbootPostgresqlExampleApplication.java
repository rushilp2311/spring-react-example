package com.javaguide.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootPostgresqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlExampleApplication.class, args);
	}

}
