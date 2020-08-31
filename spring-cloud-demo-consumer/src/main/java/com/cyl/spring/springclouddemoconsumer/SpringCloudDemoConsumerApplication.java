package com.cyl.spring.springclouddemoconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConsumerApplication.class, args);
	}

}
