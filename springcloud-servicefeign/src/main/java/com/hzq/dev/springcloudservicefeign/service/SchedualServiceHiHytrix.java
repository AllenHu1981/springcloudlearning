package com.hzq.dev.springcloudservicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHytrix implements  SchedualServiceHi {
    @Override
    public String sayHiFromClientOne( String name){
        return "Feign:hi "+ name + ",encounter some mistakes";
    }
}
