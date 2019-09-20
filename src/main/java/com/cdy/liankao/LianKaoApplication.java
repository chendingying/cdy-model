package com.cdy.liankao;

import cn.stylefeng.roses.core.config.WebAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot方式启动类
 *
 * @Author: cdy
 * @Date: 2019/9/19 14:57
 * @Version 1.0
 */
@SpringBootApplication(exclude = {WebAutoConfiguration.class})
@EnableScheduling
public class LianKaoApplication {
    private final static Logger logger = LoggerFactory.getLogger(LianKaoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LianKaoApplication.class, args);
        logger.info(LianKaoApplication.class.getSimpleName() + " is success!");
    }
}
