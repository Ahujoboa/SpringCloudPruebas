package com.andrea.pruebaConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PruebaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaConfigServerApplication.class, args);
	}

}
