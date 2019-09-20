package com.cdy.liankao.core.util;

import com.cdy.liankao.core.listener.ConfigListener;

/**
 * 获取默认图片地址
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:51
 * @Version 1.0
 */
public class DefaultImages {

    /**
     * 默认的登录页面背景
     *
     * @author fengshuonan
     * @Date 2018/10/30 5:51 PM
     */
    public static String loginBg() {
        return ConfigListener.getConf().get("contextPath") + "/assets/common/images/login-register.jpg";
    }

    /**
     * 默认的用户图片的base64编码
     *
     * @author fengshuonan
     * @Date 2018/10/30 5:51 PM
     */
    public static String defaultAvatarUrl() {
        return ConfigListener.getConf().get("contextPath") + "/system/previewAvatar";
    }

    /**
     * 默认的404错误页面背景
     *
     * @author fengshuonan
     * @Date 2018/10/30 5:51 PM
     */
    public static String error404() {
        return ConfigListener.getConf().get("contextPath") + "/assets/common/images/error-bg.jpg";
    }

}