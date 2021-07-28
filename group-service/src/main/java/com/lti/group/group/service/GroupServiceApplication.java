package com.lti.group.group.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class GroupServiceApplication {

	@Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Group service").select()
                .apis(RequestHandlerSelectors.basePackage("com.lti.group.group.service")).build().apiInfo(new ApiInfo("Group management Info",
                        "", "1.0.0", null,new Contact("LTI", "https://lti.com", null),null, null));
	}
	public static void main(String[] args) {
		SpringApplication.run(GroupServiceApplication.class, args);
	}

}
