package com.example.Dalisa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class DalisaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DalisaApplication.class, args);
	}

}
