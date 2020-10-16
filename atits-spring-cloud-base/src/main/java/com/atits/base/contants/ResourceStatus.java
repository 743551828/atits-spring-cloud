package com.atits.base.contants;

/**
 * 资源类型
 *
 * @author zhangys
 * @date 2020-10-16 10:26
 **/
public enum  ResourceStatus {

    _SYSTEM(0,"系统"),
    _MENU(1,"菜单"),
    _BUTTON(2,"按钮");

    private final Integer code;
    private final String description;

    ResourceStatus(Integer code, String description) {
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
