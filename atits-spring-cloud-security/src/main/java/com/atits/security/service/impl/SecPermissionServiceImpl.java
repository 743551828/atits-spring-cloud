package com.atits.security.service.impl;

import com.atits.security.domain.ISecPermissionDomain;
import com.atits.security.service.ISecPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 权限
 *
 * @author zhangys
 * @date 2020-10-14 17:24
 **/
@Service
public class SecPermissionServiceImpl implements ISecPermissionService {

    @Autowired
    private ISecPermissionDomain secPermissionDomain;

}
