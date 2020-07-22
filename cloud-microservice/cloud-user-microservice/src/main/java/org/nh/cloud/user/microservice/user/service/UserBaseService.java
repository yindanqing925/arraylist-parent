package org.nh.cloud.user.microservice.user.service;

import org.nh.cloud.user.microservice.user.bean.ComUserBase;

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
    ComUserBase getUserBaseInfoByUsername(String username);

}
