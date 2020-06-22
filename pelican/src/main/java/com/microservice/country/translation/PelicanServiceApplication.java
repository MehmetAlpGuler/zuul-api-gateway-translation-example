package com.microservice.country.translation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservice.country.translation")
@EnableDiscoveryClient
public class PelicanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PelicanServiceApplication.class, args);
	}

}
