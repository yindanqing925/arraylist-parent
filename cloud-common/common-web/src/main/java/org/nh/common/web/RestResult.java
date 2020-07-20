package org.nh.common.web;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @program: RestResult.java
 * @description: 接口返参包装类
 * @author: yindanqing
 * @create: 2020/7/20 10:53
 */
@ApiModel(value = "返回结果")
public class RestResult<T> implements java.io.Serializable {

    private static final long serialVersionUID = -599615422457711011L;

    @ApiModelProperty(value = "状态码")
    private int code = 200;

    @ApiModelProperty(value = "状态信息")
    private String msg;

    @ApiModelProperty(value = "数据")
    private T data;

    @ApiModelProperty(value = "时间戳")
    private long timeStamp = System.currentTimeMillis();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public RestResult() {
    }

    public RestResult(T data) {
        this.data = data;
    }

    public RestResult(int code) {
        this.code = code;
    }

    public RestResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
