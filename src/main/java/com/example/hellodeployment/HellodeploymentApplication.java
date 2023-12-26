package com.example.hellodeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellodeploymentApplication {

	@GetMapping("/greeting")
	public String greeting(){
		return "Spring Boot War First File";

	}

	public static void main(String[] args) {
		SpringApplication.run(HellodeploymentApplication.class, args);
	}

}
