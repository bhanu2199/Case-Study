package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2


public class SystemPaymentApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SystemPaymentApplication.class, args);
		System.out.println("Payment Gateway Running");
	}
		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/payment").allowedOrigins("http://localhost:3000");
	}
			
		};

}
}
