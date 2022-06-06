package com.HiO.Backend.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class HiOBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiOBackendApplication.class, args);
	}

}
