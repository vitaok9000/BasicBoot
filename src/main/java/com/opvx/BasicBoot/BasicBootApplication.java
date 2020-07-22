package com.opvx.BasicBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BasicBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicBootApplication.class, args);
	}

}
