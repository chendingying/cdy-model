package com.cdy.liankao.core.common.constant.dictmap;

import com.cdy.liankao.core.common.constant.dictmap.base.AbstractDictMap;

/**
 * 菜单的字典
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:22
 * @Version 1.0
 */
public class MenuDict extends AbstractDictMap {

    @Override
    public void init() {
        put("menuId", "菜单id");
        put("code", "菜单编号");
        put("pcode", "菜单父编号");
        put("name", "菜单名称");
        put("icon", "菜单图标");
        put("url", "url地址");
        put("sort", "菜单排序号");
        put("levels", "菜单层级");
        put("description", "备注");
        put("status", "菜单状态");
        put("openFlag", "是否打开");
    }

    @Override
    protected void initBeWrapped() {

    }
}
