package com.org.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientApplication {
//http://localhost:8080/h2-console
	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}

}
