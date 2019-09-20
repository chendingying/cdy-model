package com.cdy.liankao.config.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: cdy
 * @Date: 2019/9/19 15:01
 * @Version 1.0
 */
@Configuration
@ConditionalOnProperty(prefix = "liankao.muti-datasource", name = "open", havingValue = "false", matchIfMissing = true)
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.cdy.liankao.modular.*.mapper"})
public class DataSourceConfig {
}
