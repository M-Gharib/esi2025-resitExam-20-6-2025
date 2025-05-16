package com.esi.hrservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HRApplication {

	public static void main(String[] args) {
		DatabaseInitializer.initialize("hrservice_db");
		SpringApplication.run(HRApplication.class, args);
	}
}
