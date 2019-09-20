package com.cdy.liankao.core.common.constant.state;

import lombok.Getter;

/**
 * 公共状态
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:25
 * @Version 1.0
 */
@Getter
public enum  CommonStatus {

    ENABLE("ENABLE", "启用"),
    DISABLE("DISABLE", "禁用");

    String code;
    String message;

    CommonStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getDescription(String status) {
        if (status == null) {
            return "";
        } else {
            for (CommonStatus s : CommonStatus.values()) {
                if (s.getCode().equals(status)) {
                    return s.getMessage();
                }
            }
            return "";
        }
    }
}
