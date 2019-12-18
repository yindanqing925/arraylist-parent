package org.nh.cloud.user.microservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: UserServiceMain.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 17:56
 */
@SpringCloudApplication
@EnableDiscoveryClient
@Log4j2
public class UserServiceMain {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(UserServiceMain.class);
        builder.run(args);
        log.info("UserServiceMain start success.");
    }

}
