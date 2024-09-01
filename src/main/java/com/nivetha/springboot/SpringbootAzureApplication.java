package com.nivetha.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureApplication {

	@GetMapping("/message")
	public String message() {
		return "Welcome to Azure";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureApplication.class, args);
	}

}
