package com.ljh.springboot_validation.excception;

/**
 * @author Liu, jihong
 * @version 1.0
 * @date 2019-09-10 下午 5:36
 */


/**
 * 自定义异常
 */

public class BusinessException extends RuntimeException {
    private String code;
    private String msg;
    public BusinessException(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
