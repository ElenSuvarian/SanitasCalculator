package com.iteriam.SanitasCalculator.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  * Clase principal que levanta el contexto de SpringBoot
 * @author Ele Suvarian
 *
 */
@SpringBootApplication
@ComponentScan(basePackages  = "com.iteriam.SanitasCalculator.controller")
public class SanitasCalculatorApplication {
	/**
	 * Método principal que arranca la aplicación
	 * @param args parámetro de entrada a la aplicación
	 */
	public static void main(String[] args) {
		SpringApplication.run(SanitasCalculatorApplication.class, args);
	}

}
