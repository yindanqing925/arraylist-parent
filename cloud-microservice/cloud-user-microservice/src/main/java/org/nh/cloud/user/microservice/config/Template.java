package org.nh.cloud.user.microservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: Template.java
 * @description:
 * @author: yindanqing
 * @create: 2019/12/18 18:11
 */
@Component
public class Template {

    @Value("{owner.name}")
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
