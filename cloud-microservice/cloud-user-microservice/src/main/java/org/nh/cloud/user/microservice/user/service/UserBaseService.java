package org.nh.cloud.user.microservice.user.service;

import org.nh.cloud.user.microservice.user.bean.UserBase;
import org.nh.common.feign.user.response.UserBaseVo;

/**
 * @program: UserService.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:32
 */
public interface UserBaseService {

    /**
     * 根据用户名获取用户基础信息
     * @param username
     * @return
     */
    UserBase getUserBaseInfoByUsername(String username);

}
