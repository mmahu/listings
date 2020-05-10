package com.mmahu.listings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ListingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListingsApplication.class, args);
	}

}
