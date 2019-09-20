package com.cdy.liankao.core.shiro.service;

/**
 * 检查用接口
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:46
 * @Version 1.0
 */
public interface PermissionCheckService {

    /**
     * 检查当前登录用户是否拥有指定的角色访问当
     */
    boolean check(Object[] permissions);

    /**
     * 检查当前登录用户是否拥有当前请求的servlet的权限
     */
    boolean checkAll();

}
