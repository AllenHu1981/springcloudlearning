package com.hzq.dev.springcloudservicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "service-client",fallback = SchedualServiceHiHytrix.class)
@FeignClient(value = "${project.eurekaclient,name}",fallback = SchedualServiceHiHytrix.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
