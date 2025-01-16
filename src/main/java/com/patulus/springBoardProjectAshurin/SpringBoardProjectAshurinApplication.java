package com.patulus.springBoardProjectAshurin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBoardProjectAshurinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoardProjectAshurinApplication.class, args);
	}

}
