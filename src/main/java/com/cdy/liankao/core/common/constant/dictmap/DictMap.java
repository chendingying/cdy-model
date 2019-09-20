package com.cdy.liankao.core.common.constant.dictmap;

import com.cdy.liankao.core.common.constant.dictmap.base.AbstractDictMap;

/**
 * 字典map
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:22
 * @Version 1.0
 */
public class DictMap extends AbstractDictMap {

    @Override
    public void init() {
        put("dictId", "字典名称");
        put("name", "字典名称");
        put("code", "字典编码");
        put("description", "字典描述");
        put("sort", "排序");
    }

    @Override
    protected void initBeWrapped() {

    }
}
