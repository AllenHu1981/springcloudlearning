package com.hzq.dev.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@RestController
@SpringBootApplication
public class SpringcloudEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaserverApplication.class, args);
    }

    @RequestMapping("hi")
    public String hello(@RequestParam String name){
        return "hi, "+" I'm "+ name;
    }
}
