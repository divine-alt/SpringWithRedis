package com.spring.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringWithRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithRedisApplication.class, args);
	}

}
