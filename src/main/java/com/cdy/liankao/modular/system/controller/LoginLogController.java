package com.cdy.liankao.modular.system.controller;

import cn.stylefeng.roses.core.base.controller.BaseController;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import com.cdy.liankao.core.common.annotion.BussinessLog;
import com.cdy.liankao.core.common.annotion.Permission;
import com.cdy.liankao.core.common.constant.Const;
import com.cdy.liankao.core.common.page.LayuiPageFactory;
import com.cdy.liankao.modular.system.service.LoginLogService;
import com.cdy.liankao.modular.system.warpper.LogWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 日志管理的控制器
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:57
 * @Version 1.0
 */
@Controller
@RequestMapping("/loginLog")
public class LoginLogController extends BaseController {

    private static String PREFIX = "/modular/system/log/";

    @Autowired
    private LoginLogService loginLogService;

    /**
     * 跳转到日志管理的首页
     *
     * @author fengshuonan
     * @Date 2018/12/23 5:51 PM
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "login_log.html";
    }

    /**
     * 查询登录日志列表
     *
     * @author fengshuonan
     * @Date 2018/12/23 5:51 PM
     */
    @RequestMapping("/list")
    @Permission(Const.ADMIN_NAME)
    @ResponseBody
    public Object list(@RequestParam(required = false) String beginTime,
                       @RequestParam(required = false) String endTime,
                       @RequestParam(required = false) String logName) {

        //获取分页参数
        Page page = LayuiPageFactory.defaultPage();

        //根据条件查询日志
        List<Map<String, Object>> result = loginLogService.getLoginLogs(page, beginTime, endTime, logName);
        page.setRecords(new LogWrapper(result).wrap());

        return LayuiPageFactory.createPageInfo(page);
    }

    /**
     * 清空日志
     *
     * @author fengshuonan
     * @Date 2018/12/23 5:51 PM
     */
    @BussinessLog("清空登录日志")
    @RequestMapping("/delLoginLog")
    @Permission(Const.ADMIN_NAME)
    @ResponseBody
    public Object delLog() {
        SqlRunner.db().delete("delete from sys_login_log");
        return SUCCESS_TIP;
    }
}
