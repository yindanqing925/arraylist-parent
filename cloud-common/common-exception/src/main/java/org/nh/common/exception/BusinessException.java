package org.nh.common.exception;

/**
 * @program: BusinessException.java
 * @description:
 * @author: yindanqing
 * @create: 2020/7/20 14:32
 */
public class BusinessException extends RuntimeException {

    private int code;

    private String msg;

    public BusinessException() {
    }

    public BusinessException(int code) {
        this.code = code;
    }

    public BusinessException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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

}
