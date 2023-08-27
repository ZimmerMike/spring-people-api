package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableMongoRepositories("repositories") // Agrega esta anotación para habilitar los repositorios de MongoDB
@ComponentScan(basePackages = {"controllers", "services"}) // Reemplaza 'com.example.demo' con el paquete que contiene el controlador
public class ApiExampleApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ApiExampleApplication.class, args);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
