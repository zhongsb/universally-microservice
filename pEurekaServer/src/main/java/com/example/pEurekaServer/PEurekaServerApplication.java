package com.example.pEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PEurekaServerApplication.class, args);
	}

}
