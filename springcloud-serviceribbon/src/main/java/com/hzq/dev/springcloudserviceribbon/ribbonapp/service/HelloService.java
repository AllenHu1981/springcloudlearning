package com.hzq.dev.springcloudserviceribbon.ribbonapp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${project.eurekaclient,name}")
    String eurekaclient;

    @HystrixCommand(fallbackMethod = "errorHi")
    public String hiService(String name){
//        return restTemplate.getForObject("http://service-client/hi?name="+name,String.class);
        return restTemplate.getForObject("http://"+ eurekaclient +"/hi?name="+name,String.class);
    }

    public String errorHi(String name){
        return "hi "+ name + " encounter some mistakes";
    }
}
