package com.cdy.liankao.core.common.constant;

/**
 * jwt相关配置
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:09
 * @Version 1.0
 */
public interface JwtConstants {
    String AUTH_HEADER = "Authorization";

    String SECRET = "defaultSecret";

    Long EXPIRATION = 604800L;

    String AUTH_PATH = "/gunsApi/auth";

}
