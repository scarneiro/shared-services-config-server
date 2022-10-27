package com.darkstar.services.shared.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesConfigServerApplication.class, args);
	}

}
