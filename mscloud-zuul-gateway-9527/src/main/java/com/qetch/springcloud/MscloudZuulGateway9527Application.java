package com.qetch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MscloudZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MscloudZuulGateway9527Application.class, args);
    }

}