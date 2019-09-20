package com.cdy.liankao.modular.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdy.liankao.modular.system.entity.LoginLog;
import com.cdy.liankao.modular.system.mapper.LoginLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 登录记录 服务实现类
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:32
 * @Version 1.0
 */

@Service
public class LoginLogService extends ServiceImpl<LoginLogMapper, LoginLog> {

    /**
     * 获取登录日志列表
     *
     * @author fengshuonan
     * @Date 2018/12/23 5:53 PM
     */
    public List<Map<String, Object>> getLoginLogs(Page page, String beginTime, String endTime, String logName) {
        return this.baseMapper.getLoginLogs(page, beginTime, endTime, logName);
    }

}
