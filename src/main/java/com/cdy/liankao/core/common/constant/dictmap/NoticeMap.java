package com.cdy.liankao.core.common.constant.dictmap;

import com.cdy.liankao.core.common.constant.dictmap.base.AbstractDictMap;

/**
 * 通知的映射
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:23
 * @Version 1.0
 */
public class NoticeMap extends AbstractDictMap {

    @Override
    public void init() {
        put("noticeId", "标题id");
        put("title", "标题");
        put("content", "内容");
    }

    @Override
    protected void initBeWrapped() {
    }

}
