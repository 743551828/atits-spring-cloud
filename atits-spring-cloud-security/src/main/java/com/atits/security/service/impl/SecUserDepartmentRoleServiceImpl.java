package com.atits.security.service.impl;

import com.atits.security.domain.ISecUserDepartmentRoleDomain;
import com.atits.security.service.ISecUserDepartmentRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: zhangys
 * @create: 2020-10-13 17:21
 **/
@Service
public class SecUserDepartmentRoleServiceImpl implements ISecUserDepartmentRoleService {

    @Autowired
    private ISecUserDepartmentRoleDomain secUserDepartmentRoleDomain;



}
