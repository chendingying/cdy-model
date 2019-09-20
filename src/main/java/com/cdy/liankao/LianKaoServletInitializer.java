package com.cdy.liankao;

import cn.stylefeng.roses.core.config.WebAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Guns Web程序启动类
 *
 * @Author: cdy
 * @Date: 2019/9/19 14:58
 * @Version 1.0
 */
@SpringBootApplication(exclude = {WebAutoConfiguration.class})
@EnableScheduling
public class LianKaoServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LianKaoApplication.class);
    }
}
