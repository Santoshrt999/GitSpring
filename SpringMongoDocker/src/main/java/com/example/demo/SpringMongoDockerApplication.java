package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example.demo")
public class SpringMongoDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDockerApplication.class, args);
	}
}
