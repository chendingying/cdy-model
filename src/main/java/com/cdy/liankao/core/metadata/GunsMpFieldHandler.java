package com.cdy.liankao.core.metadata;

import cn.stylefeng.roses.core.metadata.CustomMetaObjectHandler;
import com.cdy.liankao.core.shiro.ShiroKit;
import org.springframework.stereotype.Component;

/**
 * 字段填充器
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:42
 * @Version 1.0
 */
@Component
public class GunsMpFieldHandler extends CustomMetaObjectHandler {

    @Override
    protected Object getUserUniqueId() {
        try {

            return ShiroKit.getUser().getId();

        } catch (Exception e) {

            //如果获取不到当前用户就存空id
            return "";
        }
    }

}
