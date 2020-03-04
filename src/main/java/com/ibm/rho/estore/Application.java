package com.ibm.rho.estore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;



@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "com.ibm.rho.estore.*"})
@EnableCircuitBreaker


public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
