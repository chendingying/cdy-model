package com.cdy.liankao.core.util;

import cn.stylefeng.roses.core.util.SpringContextHolder;
import com.cdy.liankao.config.properties.GunsProperties;

/**
 * @Author: cdy
 * @Date: 2019/9/19 15:52
 * @Version 1.0
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(GunsProperties.class).getKaptchaOpen();
    }
}
