package com.atits.base.contants;

/**
 * 账号状态泛型
 *
 * @author zhangys
 * @date 2020-10-13 15:02
 **/
public enum UserStatus{

        _NORMAL(0,"激活"),
        _PROHIBIT(1,"锁定");

        private final Integer code;
        private final String description;

        UserStatus(Integer code, String description) {
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

