package com.example.githupaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithupActionApplication {
	@GetMapping("/")
	public String get(){
		return "welcom demo github action";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithupActionApplication.class, args);
	}

}
