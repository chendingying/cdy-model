package com.cdy.liankao.core.beetl;

import cn.stylefeng.roses.core.util.ToolUtil;
import com.cdy.liankao.core.util.KaptchaUtil;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;
import java.util.Map;

import static com.cdy.liankao.core.common.constant.Const.DEFAULT_SYSTEM_NAME;
import static com.cdy.liankao.core.common.constant.Const.DEFAULT_WELCOME_TIP;
/**
 * beetl拓展配置,绑定一些工具类,方便在模板中直接调用
 * @Author: cdy
 * @Date: 2019/9/19 15:07
 * @Version 1.0
 */
public class BeetlConfiguration extends BeetlGroupUtilConfiguration {
    @Override
    public void initOther() {

        //全局共享变量
        Map<String, Object> shared = new HashMap<>();
        shared.put("systemName", DEFAULT_SYSTEM_NAME);
        shared.put("welcomeTip", DEFAULT_WELCOME_TIP);
        groupTemplate.setSharedVars(shared);

        //全局共享方法
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
    }
}
