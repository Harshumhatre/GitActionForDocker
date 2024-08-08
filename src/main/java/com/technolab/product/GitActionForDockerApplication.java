package com.technolab.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionForDockerApplication {

	@GetMapping("/")
	public void get() {
		System.out.println("Hi harshad");
	}
	public static void main(String[] args) {
		SpringApplication.run(GitActionForDockerApplication.class, args);
	}

}
