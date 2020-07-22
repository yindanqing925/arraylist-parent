package org.nh.cloud.user.microservice.user.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.nh.cloud.user.microservice.user.facade.UserBaseFacade;
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
@Api(value = "UserBaseApi", tags = "user")
public class UserBaseRestController implements UserFeignClient {

    @Autowired
    private UserBaseFacade userFacade;

    @Override
    @ApiOperation(value = "getUserBaseInfoByUsername", notes = "根据用户编码获取用户信息", response = UserBaseVo.class)
    public RestResult<UserBaseVo> getUserBaseInfoByUsername(String username) {
        return new RestResult<>(userFacade.getUserBaseInfoByUsername(username));
    }
}
