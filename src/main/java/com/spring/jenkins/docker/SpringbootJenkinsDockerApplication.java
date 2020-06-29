package com.spring.jenkins.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsDockerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Sumith");

	}

}
