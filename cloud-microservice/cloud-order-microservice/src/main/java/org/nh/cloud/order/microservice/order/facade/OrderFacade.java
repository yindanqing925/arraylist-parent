package org.nh.cloud.order.microservice.order.facade;

import org.nh.common.feign.order.response.OrderVo;

/**
 * @program: OrderFacade.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 16:39
 */
public interface OrderFacade {

    OrderVo getOrderByOrderNo(String orderNo);

}
