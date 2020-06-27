package com.javademo.springboot;

import com.javademo.springboot.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableConfigurationProperties(AppProperties.class)
public class SpringbootPostgresqlExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresqlExampleApplication.class, args);
	}

}
