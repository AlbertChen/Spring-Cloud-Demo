package com.cyl.spring.springclouddemosonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoSonsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoSonsumerApplication.class, args);
	}

}
