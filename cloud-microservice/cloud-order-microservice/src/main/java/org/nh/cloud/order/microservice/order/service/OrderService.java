package org.nh.cloud.order.microservice.order.service;

import org.nh.cloud.order.microservice.order.bean.ComOrder;
import org.nh.common.feign.order.response.OrderVo;

/**
 * @program: OrderService.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 16:40
 */
public interface OrderService {

    ComOrder getOrderByOrderNo(String orderNo);

}
