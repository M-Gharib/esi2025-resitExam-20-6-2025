package com.esi.phdservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhDserviceApplication {

	public static void main(String[] args) {
		DatabaseInitializer.initialize("phdservice_db");
		SpringApplication.run(PhDserviceApplication.class, args);
	}
}
