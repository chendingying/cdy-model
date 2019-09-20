package com.cdy.liankao.core.common.constant.dictmap.factory;

import cn.stylefeng.roses.kernel.model.exception.ServiceException;
import com.cdy.liankao.core.common.constant.factory.ConstantFactory;
import com.cdy.liankao.core.common.constant.factory.IConstantFactory;
import com.cdy.liankao.core.common.exception.BizExceptionEnum;

import java.lang.reflect.Method;

/**
 * 字典字段的包装器(从ConstantFactory中获取包装值)
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:19
 * @Version 1.0
 */
public class DictFieldWarpperFactory {
    public static Object createFieldWarpper(Object parameter, String methodName) {
        IConstantFactory constantFactory = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, parameter.getClass());
            return method.invoke(constantFactory, parameter);
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Long.class);
                return method.invoke(constantFactory, Long.parseLong(parameter.toString()));
            } catch (Exception e1) {
                throw new ServiceException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
            }
        }
    }
}
