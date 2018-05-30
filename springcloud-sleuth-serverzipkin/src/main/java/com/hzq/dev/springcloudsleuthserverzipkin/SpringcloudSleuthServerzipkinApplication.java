package com.hzq.dev.springcloudsleuthserverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SpringcloudSleuthServerzipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSleuthServerzipkinApplication.class, args);
    }
}
