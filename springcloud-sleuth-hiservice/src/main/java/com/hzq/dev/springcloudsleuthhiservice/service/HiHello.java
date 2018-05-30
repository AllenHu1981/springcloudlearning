package com.hzq.dev.springcloudsleuthhiservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Service
public class HiHello {

    private  static final Logger Log = LoggerFactory.getLogger(HiHello.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping(value = "hi")
    public  String callHome(){
        Log.info("calling trace hi-service");
        return  restTemplate.getForObject("http://localhost:8778/miya",String.class);
    }

    @RequestMapping(value = "info")
    public String info(){
        Log.info("calling trace hi-service");
        return "I'm hi-service method:info";
    }


}
