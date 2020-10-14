package com.atits.base.contants;

/**
 * @description: 是否是管理员泛型
 * @author: zhangys
 * @create: 2020-10-14 10:33
 **/
public enum  AdminStatus {

    _isAdmin(1,"激活"),
    _notAdmin(0,"锁定");

    private final Integer code;
    private final String description;

    AdminStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
