package org.nh.cloud.order.microservice.order.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.nh.cloud.order.microservice.order.facade.OrderFacade;
import org.nh.common.feign.order.OrderFeignClient;
import org.nh.common.feign.order.response.OrderVo;
import org.nh.common.web.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: OrderRestController.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 19:14
 */
@RestController
@Api(value = "OrderApi", tags = "order")
public class OrderRestController implements OrderFeignClient {

    @Autowired
    private OrderFacade orderFacade;

    @Override
    @ApiOperation(value = "getOrderByOrderNo", notes = "根据订单编码获取订单信息")
    public RestResult<OrderVo> getOrderByOrderNo(String orderNo) {
        return new RestResult<>(orderFacade.getOrderByOrderNo(orderNo));
    }
}
