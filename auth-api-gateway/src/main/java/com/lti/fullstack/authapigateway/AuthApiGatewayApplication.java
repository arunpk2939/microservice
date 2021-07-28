package com.lti.fullstack.authapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApiGatewayApplication.class, args);
	}

}
