package com.cyl.spring.springclouddemoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDemoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoEurekaApplication.class, args);

        System.out.println("---服务监控访问地址" + "http://localhost:8761");
    }

}
