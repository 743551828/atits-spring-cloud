package com.atits.security.domain.impl;

import com.atits.security.domain.ISecUserDomain;
import com.atits.security.entity.SecUserEntity;
import com.atits.security.repository.SecUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 用户
 * @author: zhangys
 * @create: 2020-10-13 13:17
 **/
@Component
public class SecUserDomainImpl implements ISecUserDomain {

    @Autowired
    private SecUserRepository secUserRepository;

    @Override
    public SecUserEntity getOneByLoginUsername(String loginUsername) {
        return secUserRepository.findSecUserEntityByLoginUsername(loginUsername);
    }
}
