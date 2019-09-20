package com.cdy.liankao.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

/**
 * spring session配置
 * @Author: cdy
 * @Date: 2019/9/19 15:02
 * @Version 1.0
 */
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)  //session过期时间  如果部署多机环境,需要打开注释
@ConditionalOnProperty(prefix = "liankao", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {
}
