package com.hzq.dev.springcloudsleuthmiyaservice.service;

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
public class MiyaHello {
    private static final Logger Log = LoggerFactory.getLogger(MiyaHello.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

    @RequestMapping(value = "hi")
    public String home(){
        Log.info("calling trace miya-service:hi is being called");
        return "hi,I'm miya,method:home";
    }

    @RequestMapping(value = "miya")
    public String info(){
        Log.info("info is beging called");
        return restTemplate.getForObject("http://localhost:8777/info",String.class);

    }


}
