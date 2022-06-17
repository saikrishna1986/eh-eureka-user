package com.citi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableEurekaClient
public class EhEurekaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhEurekaUserApplication.class, args);
	}
}


