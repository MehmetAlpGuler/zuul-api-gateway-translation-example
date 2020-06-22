package com.microservice.translation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BelgiumServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelgiumServiceApplication.class, args);
	}

}
