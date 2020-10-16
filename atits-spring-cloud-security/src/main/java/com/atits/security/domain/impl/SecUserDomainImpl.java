package com.atits.security.domain.impl;

import com.atits.security.domain.ISecUserDomain;
import com.atits.security.entity.SecUserEntity;
import com.atits.security.repository.SecUserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 用户
 *
 * @author zhangys
 * @date 2020-10-13 13:17
 **/
@Component
public class SecUserDomainImpl implements ISecUserDomain {

    @Autowired
    private SecUserRepository secUserRepository;

    @Override
    public SecUserEntity findOneByLoginUsername(String loginUsername) {
        return secUserRepository.findSecUserEntityByLoginUsername(loginUsername);
    }

    @Override
    public SecUserEntity findByCode(String code) {
        if (StringUtils.isBlank(code)){
            return null;
        }
        Optional<SecUserEntity> optional = secUserRepository.findById(code);
        return optional.orElse(null);
    }
}
