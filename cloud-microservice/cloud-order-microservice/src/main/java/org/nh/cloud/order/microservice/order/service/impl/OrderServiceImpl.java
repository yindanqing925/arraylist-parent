package org.nh.cloud.order.microservice.order.service.impl;

import org.nh.cloud.order.microservice.order.bean.ComOrder;
import org.nh.cloud.order.microservice.order.dao.ComOrderMapper;
import org.nh.cloud.order.microservice.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: OrderServiceImpl.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 16:40
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ComOrderMapper comOrderMapper;

    @Override
    public ComOrder getOrderByOrderNo(String orderNo) {
        return comOrderMapper.getOrderByOrderNo(orderNo);
    }
}
