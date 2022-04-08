package com.andrea.bootcamp.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

@EnableAdminServer
@SpringBootApplication
public class AdminApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(AdminApplication.class, args);
	}

}
