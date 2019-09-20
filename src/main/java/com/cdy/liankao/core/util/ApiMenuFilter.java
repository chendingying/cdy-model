package com.cdy.liankao.core.util;

import cn.stylefeng.roses.core.util.SpringContextHolder;
import com.cdy.liankao.config.properties.GunsProperties;
import com.cdy.liankao.core.common.constant.Const;
import com.cdy.liankao.core.common.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:49
 * @Version 1.0
 */
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        GunsProperties gunsProperties = SpringContextHolder.getBean(GunsProperties.class);
        if (!gunsProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
