package com.openpay.restMarvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.open.pay.restMarvelJar")
public class RestMarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMarvelApplication.class, args);
	}

}
