package com.microservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EstoniaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoniaServiceApplication.class, args);
	}

}
