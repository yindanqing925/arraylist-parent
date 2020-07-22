package org.nh.cloud.order.microservice.order.facade.impl;

import org.modelmapper.ModelMapper;
import org.nh.cloud.order.microservice.order.bean.ComOrder;
import org.nh.cloud.order.microservice.order.facade.OrderFacade;
import org.nh.cloud.order.microservice.order.service.OrderService;
import org.nh.common.feign.order.response.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: OrderFacadeImpl.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 16:39
 */
@Service
public class OrderFacadeImpl implements OrderFacade {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public OrderVo getOrderByOrderNo(String orderNo) {
        ComOrder comOrder = orderService.getOrderByOrderNo(orderNo);
        return modelMapper.map(comOrder, OrderVo.class);
    }
}
