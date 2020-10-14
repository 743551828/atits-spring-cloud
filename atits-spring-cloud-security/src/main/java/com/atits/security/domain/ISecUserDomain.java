package com.atits.security.domain;

import com.atits.security.entity.SecUserEntity;

/**
 * @description: 用户
 * @author: zhangys
 * @create: 2020-10-13 13:19
 **/
public interface ISecUserDomain {

    /**
     * 根据登录用户名获取用户
     *
     * @param loginUsername 登录用户名
     * @return 用户实例
     */
    SecUserEntity getOneByLoginUsername(String loginUsername);

}
