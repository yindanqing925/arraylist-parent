package org.nh.cloud.user.microservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @program: UserServiceMain.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 17:56
 */
@Log4j2
@EnableAsync
@EnableHystrix
@EnableDiscoveryClient
@SpringCloudApplication
@ComponentScan(basePackages = { "org.nh" })
@EnableFeignClients(basePackages = { "org.nh" })
public class UserServiceMain {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(UserServiceMain.class);
        builder.run(args);
        log.info("UserServiceMain start success.");
    }

}
