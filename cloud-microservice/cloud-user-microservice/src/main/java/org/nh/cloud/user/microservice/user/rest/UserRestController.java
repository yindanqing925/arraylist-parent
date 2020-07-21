package org.nh.cloud.user.microservice.user.rest;

import org.nh.cloud.user.microservice.user.facade.UserFacade;
import org.nh.common.feign.user.UserFeignClient;
import org.nh.common.feign.user.response.UserBaseVo;
import org.nh.common.web.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: UserRestController.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:28
 */
@RestController
public class UserRestController implements UserFeignClient {

    @Autowired
    private UserFacade userFacade;

    @Override
    public RestResult<UserBaseVo> getUserBaseInfoByUsername(String username) {
        return new RestResult<>(userFacade.getUserBaseInfoByUsername(username));
    }
}
