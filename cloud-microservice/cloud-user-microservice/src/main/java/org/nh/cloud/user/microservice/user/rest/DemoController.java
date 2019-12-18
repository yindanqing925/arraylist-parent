package org.nh.cloud.user.microservice.user.rest;

import org.nh.cloud.user.microservice.config.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: DemoController.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 18:54
 */
@RequestMapping(value = "/demo")
@RestController
public class DemoController {

    @Autowired
    private Template template;

    @RequestMapping("/getName")
    public String getName(){
        return template.getOwnerName();
    }

}
