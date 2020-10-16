package com.atits.base.contants;

/**
 * 基本状态泛型
 *
 * @author zhangys
 * @date 2020-10-16 09:36
 **/
public enum  BaseStatus {

    _PROHIBIT(0,"锁定"),
    _NORMAL(1,"激活"),
    _DELETE(2,"删除");

    private final Integer code;
    private final String description;

    BaseStatus(Integer code, String description) {
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
