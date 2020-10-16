package com.atits.base.contants;

/**
 * 是否是管理员泛型
 *
 * @author zhangys
 * @date 2020-10-14 10:33
 **/
public enum  AdminStatus {

    _isAdmin(1,"是"),
    _notAdmin(0,"否");

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
