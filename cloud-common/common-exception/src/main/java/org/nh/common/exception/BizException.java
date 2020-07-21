package org.nh.common.exception;

/**
 * @program: BusinessException.java
 * @description: 业务异常
 * @author: yindanqing
 * @create: 2020/7/20 14:32
 */
public class BizException extends RuntimeException {

    private int code;

    private String msg;

    public BizException() {
    }

    public BizException(int code) {
        this.code = code;
    }

    public BizException(int code, String msg) {
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
