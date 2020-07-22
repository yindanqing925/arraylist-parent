package org.nh.common.feign.order;

import org.nh.common.exception.OrderBizExceptionCode;
import org.nh.common.exception.UserBizExceptionCode;
import org.nh.common.feign.order.response.OrderVo;
import org.nh.common.web.RestResult;
import org.nh.common.web.ServiceNameConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: OrderFeignClient.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/22 16:32
 */
@FeignClient(name= ServiceNameConstants.CLOUD_ORDER_MICROSERVICE, fallback = OrderFeignClientFallBack.class)
public interface OrderFeignClient {

    @RequestMapping(value = "/order/820101/getUserBaseInfoByUsername", method = RequestMethod.GET)
    RestResult<OrderVo> getOrderByOrderNo(@RequestParam(value = "orderNo") String orderNo);

}
class OrderFeignClientFallBack implements OrderFeignClient{

    @Override
    public RestResult<OrderVo> getOrderByOrderNo(String orderNo) {
        return new RestResult<>(OrderBizExceptionCode.INTERFACE_ERROR_820101);
    }
}