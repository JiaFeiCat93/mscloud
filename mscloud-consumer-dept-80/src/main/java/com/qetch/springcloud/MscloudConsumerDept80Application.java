package com.qetch.springcloud;

import com.qetch.myrule.MyRuleConfing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MSCLOUD-DEPT", configuration = MyRuleConfing.class) // 在启动该微服务的时候就能加载我们自定义的Ribbon配置类，从而使配置生效
public class MscloudConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MscloudConsumerDept80Application.class, args);
    }

}
