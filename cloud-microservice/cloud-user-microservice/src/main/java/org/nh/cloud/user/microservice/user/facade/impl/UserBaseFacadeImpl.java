package org.nh.cloud.user.microservice.user.facade.impl;

import org.modelmapper.ModelMapper;
import org.nh.cloud.user.microservice.user.bean.UserBase;
import org.nh.cloud.user.microservice.user.facade.UserBaseFacade;
import org.nh.cloud.user.microservice.user.service.UserBaseService;
import org.nh.common.feign.user.response.UserBaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: UserFacadeImpl.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:30
 */
@Service
public class UserBaseFacadeImpl implements UserBaseFacade {

    @Autowired
    private UserBaseService userService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserBaseVo getUserBaseInfoByUsername(String username) {
        UserBase userBase = userService.getUserBaseInfoByUsername(username);
        return modelMapper.map(userBase, UserBaseVo.class);
    }
}
