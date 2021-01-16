package com.shakhawat.aspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApplication.class, args);
	}

}
