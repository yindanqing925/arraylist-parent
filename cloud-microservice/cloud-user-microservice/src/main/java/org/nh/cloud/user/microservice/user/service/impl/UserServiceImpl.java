package org.nh.cloud.user.microservice.user.service.impl;

import org.nh.cloud.user.microservice.user.bean.UserBase;
import org.nh.cloud.user.microservice.user.dao.UserBaseMapper;
import org.nh.cloud.user.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: UserServiceImpl.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public UserBase getUserBaseInfoByUsername(String username) {
        return null;
    }
}
