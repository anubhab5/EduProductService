package com.miniamazon.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductMicroSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroSvcApplication.class, args);
	}

}
