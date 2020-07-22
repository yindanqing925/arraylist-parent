package org.nh.cloud.order.microservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: UserServiceMain.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 17:56
 */
@Log4j2
@EnableHystrix
@EnableDiscoveryClient
@SpringCloudApplication
@ComponentScan(basePackages = { "org.nh" })
public class OrderServiceMain {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(OrderServiceMain.class);
        builder.run(args);
        log.info("OrderServiceMain start success.");
    }

}
