package com.cyl.spring.springclouddemoprovider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "I'm provider 2, Hello consumer!";
    }

    @RequestMapping("/sayHi")
    public String sayHi() {
        return "I'm provider 2, Hello consumer!";
    }

}
