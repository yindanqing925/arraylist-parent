package org.nh.cloud.user.microservice.user.service.impl;

import org.nh.cloud.user.microservice.user.bean.ComUserBase;
import org.nh.cloud.user.microservice.user.dao.ComUserBaseMapper;
import org.nh.cloud.user.microservice.user.service.UserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: UserServiceImpl.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:32
 */
@Service
public class UserBaseServiceImpl implements UserBaseService {

    @Autowired
    private ComUserBaseMapper userBaseMapper;

    @Override
    public ComUserBase getUserBaseInfoByUsername(String username) {
        return userBaseMapper.selectByUsername(username);
    }
}
