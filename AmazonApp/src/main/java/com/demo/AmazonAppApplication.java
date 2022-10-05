package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo")
public class AmazonAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonAppApplication.class, args);
	}

}
