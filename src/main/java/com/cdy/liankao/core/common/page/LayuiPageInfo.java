package com.cdy.liankao.core.common.page;

import lombok.Data;

import java.util.List;

/**
 * 分页结果的封装(for Layui Table)
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:34
 * @Version 1.0
 */
@Data
public class LayuiPageInfo {

    private Integer code = 0;

    private String msg = "请求成功";

    private List data;

    private long count;
}
