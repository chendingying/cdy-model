package com.cdy.liankao.core.common.constant.state;

/**
 * 数据库排序
 *
 * @Author: cdy
 * @Date: 2019/9/19 15:28
 * @Version 1.0
 */
public enum Order {

    ASC("asc"), DESC("desc");

    private String des;

    Order(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

}
