package org.nh.cloud.config.microservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: ConfigServiceMain.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 16:33
 */
@SpringCloudApplication
@EnableDiscoveryClient
@EnableConfigServer
@Log4j2
public class ConfigServiceMain {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ConfigServiceMain.class);
        builder.run(args);
        log.info("ConfigServiceMain start success.");
    }

}
