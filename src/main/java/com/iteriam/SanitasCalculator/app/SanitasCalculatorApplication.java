package com.iteriam.SanitasCalculator.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages  = "com.iteriam.SanitasCalculator.controller")
public class SanitasCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanitasCalculatorApplication.class, args);
	}

}
