package com.cyl.spring.springclouddemoconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.cyl.spring.*")
public class SpringCloudDemoConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConsumerFeignApplication.class, args);
	}

}
