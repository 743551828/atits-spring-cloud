package com.atits.base.item;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户权限部门
 * @author: zhangys
 * @create: 2020-10-13 16:30
 **/
@Data
public class SelfUserDepartmentRoleDetail implements Serializable {

    /**
     * 用户名称
     */
    private String username;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门层级名称
     */
    private String departmentLevelName;

    /**
     * 角色描述
     */
    private String roleDescription;
}
