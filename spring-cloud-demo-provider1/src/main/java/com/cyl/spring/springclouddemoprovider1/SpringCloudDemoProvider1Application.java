package com.cyl.spring.springclouddemoprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemoProvider1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoProvider1Application.class, args);
	}

}
