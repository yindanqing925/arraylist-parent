package org.nh.cloud.register.microservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: RegisterServiceMain.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 10:59
 */
@SpringCloudApplication
@EnableEurekaServer
@Log4j2
public class RegisterServiceMain {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(RegisterServiceMain.class);
        builder.run(args);
        log.info("RegisterServiceMain start success.");
    }

}
