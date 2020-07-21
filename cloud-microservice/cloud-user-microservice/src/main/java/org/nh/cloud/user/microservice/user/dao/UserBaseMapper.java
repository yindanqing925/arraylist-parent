package org.nh.cloud.user.microservice.user.dao;

import org.nh.cloud.user.microservice.user.bean.UserBase;

public interface UserBaseMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserBase record);

    int insertSelective(UserBase record);

    UserBase selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);

    UserBase selectByUsername(String username);
}