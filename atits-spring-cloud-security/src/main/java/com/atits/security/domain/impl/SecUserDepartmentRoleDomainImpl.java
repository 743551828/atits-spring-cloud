package com.atits.security.domain.impl;

import com.atits.security.domain.ISecUserDepartmentRoleDomain;
import com.atits.security.entity.view.SecUserDepartmentRoleView;
import com.atits.security.repository.view.SecUserDepartmentRoleViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author zhangys
 * @date 2020-10-13 17:10
 **/
@Component
public class SecUserDepartmentRoleDomainImpl implements ISecUserDepartmentRoleDomain {

    @Autowired
    private SecUserDepartmentRoleViewRepository secUserDepartmentRoleViewRepository;

    @Override
    public List<SecUserDepartmentRoleView> findByLoginUsername(String loginUsername) {
        SecUserDepartmentRoleView userDepartmentRoleView = new SecUserDepartmentRoleView();
        userDepartmentRoleView.setLoginUsername(loginUsername);
        return secUserDepartmentRoleViewRepository.findAll(Example.of(userDepartmentRoleView),
                        Sort.by(Sort.Order.asc("departmentLevelLevel"),
                                Sort.Order.asc("departmentSortNum")));
    }
}
