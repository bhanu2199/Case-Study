package com.coupon.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CustomerServiceApplication {
@Bean
@LoadBalanced
public RestTemplate getRestTemplate(){
	return new RestTemplate();}
	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
		System.out.println("Welcome to customer service");
	}

}
