package com.hzq.dev.springcloudservicefeign.web.controller;

import com.hzq.dev.springcloudservicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "hi",method =RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        System.out.println("Feign recieve request");
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
