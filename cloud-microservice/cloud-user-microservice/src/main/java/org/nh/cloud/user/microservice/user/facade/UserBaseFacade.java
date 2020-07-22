package org.nh.cloud.user.microservice.user.facade;

import org.nh.common.feign.user.response.UserBaseVo;

/**
 * @program: UserFacade.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/21 11:29
 */
public interface UserBaseFacade {

    /**
     * 根据用户名获取用户基础信息
     * @param username
     * @return
     */
    UserBaseVo getUserBaseInfoByUsername(String username);

}
