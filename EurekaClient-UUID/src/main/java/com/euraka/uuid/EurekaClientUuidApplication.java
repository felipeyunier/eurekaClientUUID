package com.euraka.uuid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientUuidApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientUuidApplication.class, args);
	}

}
