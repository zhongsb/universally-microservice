package com.prepared.pProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.prepared.pProject.mapper.*.mapper")
public class PMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PMicroserviceApplication.class, args);
	}

}
