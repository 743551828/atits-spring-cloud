package com.atits.security.domain;

import com.atits.security.entity.view.SecUserDepartmentRoleView;

import java.util.List;

/**
 * @description: 用户部门权限
 * @author: zhangys
 * @create: 2020-10-13 17:07
 **/
public interface ISecUserDepartmentRoleDomain {

    /**
     * 通过登录名获取
     * sort by 1.部门层级 2.部门排序
     *
     * @param loginUsername
     * @return
     */
    List<SecUserDepartmentRoleView> findByLoginUsername(String loginUsername);

}
