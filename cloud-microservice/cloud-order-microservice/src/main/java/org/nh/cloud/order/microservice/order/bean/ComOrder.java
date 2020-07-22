package org.nh.cloud.order.microservice.order.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ComOrder {
    private Long orderId;

    private String orderNo;

    private String username;

    private BigDecimal orderOriginalAmount;

    private BigDecimal orderDiscountAmount;

    private BigDecimal orderActualDiscountAmount;

    private BigDecimal orderFinalAmount;

    private BigDecimal orderPaidAmount;

    private String paymentNo;

    private String partnerPayment;

    private Date paymentStartTime;

    private Date paidTime;

    private Integer orderUnit;

    private String orderDesc;

    private String orderDescShort;

    private Integer orderStatus;

    private String merchantNo;

    private String merchantName;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Date endTime;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getOrderOriginalAmount() {
        return orderOriginalAmount;
    }

    public void setOrderOriginalAmount(BigDecimal orderOriginalAmount) {
        this.orderOriginalAmount = orderOriginalAmount;
    }

    public BigDecimal getOrderDiscountAmount() {
        return orderDiscountAmount;
    }

    public void setOrderDiscountAmount(BigDecimal orderDiscountAmount) {
        this.orderDiscountAmount = orderDiscountAmount;
    }

    public BigDecimal getOrderActualDiscountAmount() {
        return orderActualDiscountAmount;
    }

    public void setOrderActualDiscountAmount(BigDecimal orderActualDiscountAmount) {
        this.orderActualDiscountAmount = orderActualDiscountAmount;
    }

    public BigDecimal getOrderFinalAmount() {
        return orderFinalAmount;
    }

    public void setOrderFinalAmount(BigDecimal orderFinalAmount) {
        this.orderFinalAmount = orderFinalAmount;
    }

    public BigDecimal getOrderPaidAmount() {
        return orderPaidAmount;
    }

    public void setOrderPaidAmount(BigDecimal orderPaidAmount) {
        this.orderPaidAmount = orderPaidAmount;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    public String getPartnerPayment() {
        return partnerPayment;
    }

    public void setPartnerPayment(String partnerPayment) {
        this.partnerPayment = partnerPayment == null ? null : partnerPayment.trim();
    }

    public Date getPaymentStartTime() {
        return paymentStartTime;
    }

    public void setPaymentStartTime(Date paymentStartTime) {
        this.paymentStartTime = paymentStartTime;
    }

    public Date getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public Integer getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(Integer orderUnit) {
        this.orderUnit = orderUnit;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc == null ? null : orderDesc.trim();
    }

    public String getOrderDescShort() {
        return orderDescShort;
    }

    public void setOrderDescShort(String orderDescShort) {
        this.orderDescShort = orderDescShort == null ? null : orderDescShort.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo == null ? null : merchantNo.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}