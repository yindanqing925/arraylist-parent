package org.nh.common.feign.user;

import org.nh.common.exception.UserBizExceptionCode;
import org.nh.common.feign.user.response.UserBaseVo;
import org.nh.common.web.RestResult;
import org.nh.common.web.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: UserFeignClient.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/20 16:02
 */
@FeignClient(name= ServiceNameConstants.CLOUD_USER_MICROSERVICE, fallback = UserFeignClientFallBack.class)
public interface UserFeignClient {

    @RequestMapping(value = "/8101/getUserBaseInfoByUsername", method = RequestMethod.GET)
    RestResult<UserBaseVo> getUserBaseInfoByUsername(@RequestParam(value = "username") String username);

}
class UserFeignClientFallBack implements UserFeignClient {

    @Override
    public RestResult<UserBaseVo> getUserBaseInfoByUsername(String username) {
        return new RestResult<>(UserBizExceptionCode.INTERFACE_ERROR_8101);
    }
}