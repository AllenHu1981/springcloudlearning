package com.hzq.dev.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class SpringcloudEurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaclientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String home(@RequestParam String name){
        System.out.println("Recieve Request");
        return "hi "+ name +", i am from port :"+port;
    }

}


