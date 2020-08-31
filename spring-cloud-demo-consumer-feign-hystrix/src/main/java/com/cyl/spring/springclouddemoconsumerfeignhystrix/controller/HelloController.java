package com.cyl.spring.springclouddemoconsumerfeignhystrix.controller;

import com.cyl.spring.springclouddemoconsumerfeignhystrix.service.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserClient userClient;

    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     * @return
     */
    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback") // 失败时调用默认返回
    public String hello(){
        return userClient.sayHello();
    }

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFailBack")
    public String hi(){
        return userClient.sayHi();
    }

    /**
     *
     *  对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
     * @return 失败调用时，返回默认值:
     */
    public String helloFallback() {
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hello";
    }

    public String hiFailBack() {
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hi";
    }

}

