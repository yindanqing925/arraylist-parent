package org.nh.cloud.order.microservice.order.dao;

import org.apache.ibatis.annotations.Param;
import org.nh.cloud.order.microservice.order.bean.ComOrder;

public interface ComOrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(ComOrder record);

    int insertSelective(ComOrder record);

    ComOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(ComOrder record);

    int updateByPrimaryKey(ComOrder record);

    ComOrder getOrderByOrderNo(@Param(value = "orderNo") String orderNo);

}