package org.nh.cloud.user.microservice.user.dao;

import org.nh.cloud.user.microservice.user.bean.ComUserBase;

public interface ComUserBaseMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(ComUserBase record);

    int insertSelective(ComUserBase record);

    ComUserBase selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(ComUserBase record);

    int updateByPrimaryKey(ComUserBase record);

    ComUserBase selectByUsername(String username);

}