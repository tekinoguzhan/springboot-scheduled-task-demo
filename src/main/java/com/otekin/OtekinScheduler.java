package com.otekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class OtekinScheduler {

	public static void main(String[] args) {
		SpringApplication.run(OtekinScheduler.class, args);
	}
}
