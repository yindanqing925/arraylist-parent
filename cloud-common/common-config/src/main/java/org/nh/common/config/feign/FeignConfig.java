package org.nh.common.config.feign;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: FeignConfig.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 15:00
 */
@Configuration
@EnableFeignClients(basePackages = { "org.nh.feign" })
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

}
