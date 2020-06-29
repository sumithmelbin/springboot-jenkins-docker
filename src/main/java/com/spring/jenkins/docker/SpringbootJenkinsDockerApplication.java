package com.spring.jenkins.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootJenkinsDockerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running on Docker Container...");

	}

	@GetMapping("/")
	public String display() {
		return "This is running from Docker Container Using JENKINS CI ";
	}

	@GetMapping("/hello")
	public String message() {
		return "Hi Sumith I am from docker container... ";
	}
}
