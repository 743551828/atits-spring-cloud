package com.atits.security.domain;

import com.atits.security.entity.SecUserEntity;

/**
 * 用户
 *
 * @author zhangys
 * @date 2020-10-13 13:19
 **/
public interface ISecUserDomain {

    /**
     * 根据登录用户名获取用户
     *
     * @param loginUsername 登录用户名
     * @return 用户实例
     */
    SecUserEntity findOneByLoginUsername(String loginUsername);

    /**
     * 根据用户code获取用户
     * 如果没有则返回null
     *
     * @param code 用户code
     * @return
     */
    SecUserEntity findByCode(String code);

}
