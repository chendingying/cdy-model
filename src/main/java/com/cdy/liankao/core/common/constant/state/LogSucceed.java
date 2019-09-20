package com.cdy.liankao.core.common.constant.state;

/**
 * 业务是否成功的日志记录
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:26
 * @Version 1.0
 */
public enum LogSucceed {

    SUCCESS("成功"),
    FAIL("失败");

    String message;

    LogSucceed(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
