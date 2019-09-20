package com.cdy.liankao.modular.system.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdy.liankao.core.common.page.LayuiPageFactory;
import com.cdy.liankao.modular.system.entity.Notice;
import com.cdy.liankao.modular.system.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 通知表 服务实现类
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:34
 * @Version 1.0
 */
@Service
public class NoticeService extends ServiceImpl<NoticeMapper, Notice> {

    /**
     * 获取通知列表
     *
     * @author fengshuonan
     * @Date 2018/12/23 6:05 PM
     */
    public Page<Map<String, Object>> list(String condition) {
        Page page = LayuiPageFactory.defaultPage();
        return this.baseMapper.list(page, condition);
    }
}
