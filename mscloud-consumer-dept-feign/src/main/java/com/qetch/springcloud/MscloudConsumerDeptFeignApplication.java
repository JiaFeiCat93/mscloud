package com.qetch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qetch.springcloud")
public class MscloudConsumerDeptFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MscloudConsumerDeptFeignApplication.class, args);
    }

}
