package com.atits.security.domain.impl;

import com.atits.security.domain.ISecPermissionDomain;
import com.atits.security.repository.SecPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 权限
 *
 * @author zhangys
 * @date 2020-10-14 17:22
 **/
@Component
public class SecPermissionDomainImpl implements ISecPermissionDomain {

    @Autowired
    private SecPermissionRepository secPermissionRepository;

}
