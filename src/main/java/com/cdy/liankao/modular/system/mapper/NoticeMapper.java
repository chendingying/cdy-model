package com.cdy.liankao.modular.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdy.liankao.modular.system.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 通知表 Mapper 接口
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:26
 * @Version 1.0
 */
public interface NoticeMapper  extends BaseMapper<Notice> {

    /**
     * 获取通知列表
     */
    Page<Map<String, Object>> list(@Param("page") Page page, @Param("condition") String condition);
}
