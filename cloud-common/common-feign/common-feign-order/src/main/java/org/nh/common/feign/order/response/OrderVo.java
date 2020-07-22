package org.nh.common.feign.order.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "订单主信息")
public class OrderVo {

    @ApiModelProperty(value = "订单编码")
    private String orderNo;

    @ApiModelProperty(value = "订单原始金额")
    private BigDecimal orderOriginalAmount;

    @ApiModelProperty(value = "实际发生优惠")
    private BigDecimal orderActualDiscountAmount;

    @ApiModelProperty(value = "订单最终金额")
    private BigDecimal orderFinalAmount;

    @ApiModelProperty(value = "支付时间")
    private Date paymentStartTime;

    @ApiModelProperty(value = "支付时间")
    private Date paidTime;

    @ApiModelProperty(value = "订单商品个数")
    private Integer orderUnit;

    @ApiModelProperty(value = "订单描述")
    private String orderDesc;

    @ApiModelProperty(value = "订单简述")
    private String orderDescShort;

    @ApiModelProperty(value = "订单状态")
    private Integer orderStatus;

    @ApiModelProperty(value = "商户编码")
    private String merchantNo;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "订单结束时间")
    private Date endTime;

}