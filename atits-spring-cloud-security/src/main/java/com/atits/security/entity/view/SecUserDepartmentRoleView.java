package com.atits.security.entity.view;

import com.atits.security.entity.SecUserDepartmentRoleEntity;
import lombok.Data;
import org.hibernate.annotations.Subselect;
import org.hibernate.annotations.Synchronize;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * @description: 用户权限部门详情视图
 * @author: zhangys
 * @create: 2020-10-13 16:32
 **/
@Data
@Entity(name = "sec_user_department_role_view")
@Subselect("select u.code as user_code,\n" +
        "       u.username as username,\n" +
        "       u.login_username as login_username,\n" +
        "       u.photo_url as photo_url,\n" +
        "       u.telephone as telephone,\n" +
        "       u.email as email,\n" +
        "       u.last_login_time as last_login_time,\n" +
        "       u.is_admin as is_admin,\n" +
        "       u.remark as user_remark,\n" +
        "       d.code as department_code,\n" +
        "       d.name as department_name,\n" +
        "       d.logo_url as department_logo_url,\n" +
        "       d.description as department_description,\n" +
        "       d.remark as department_remark,\n" +
        "       d.sort_num as department_sort_num,\n" +
        "       dl.name as department_level_name,\n" +
        "       dl.level as department_level_level,\n" +
        "       r.code as role_code,\n" +
        "       r.name as role_name,\n" +
        "       r.description as role_description,\n" +
        "       r.remark as role_remark\n" +
        "from\n" +
        "              sec_user_department_role udr\n" +
        "                  join sec_user u on udr.user_code = u.code\n" +
        "                  join sec_department d on udr.department_code = d.code\n" +
        "                  join sec_department_level dl on d.department_level_code = dl.code\n" +
        "                  join sec_role r on udr.role_code = r.code")
@Synchronize({"sec_user_department_role","sec_user","sec_department","sec_department_level","sec_role"})
@IdClass(SecUserDepartmentRoleEntity.class)
public class SecUserDepartmentRoleView implements Serializable {

    /**
     * 用户code
     */
    @Id
    private String userCode;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 登录用户名
     */
    private String loginUsername;

    /**
     * 头像url
     */
    private String photoUrl;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 最后的登录时间
     */
    private Long lastLoginTime;

    /**
     * 是否为管理员
     */
    private Integer isAdmin;

    /**
     * 用户备注
     */
    private String userRemark;

    /**
     * 部门code
     */
    @Id
    private String departmentCode;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门logoUrl
     */
    private String departmentLogoUrl;

    /**
     * 部门描述
     */
    private String departmentDescription;

    /**
     * 部门备注
     */
    private String departmentRemark;

    /**
     * 部门层级名称
     */
    private String departmentLevelName;

    /**
     * 部门层级层数
     */
    private String departmentLevelLevel;

    /**
     * 部门排序num
     */
    private String departmentSortNum;

    /**
     * 角色code
     */
    @Id
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDescription;

    /**
     * 角色备注
     */
    private String roleRemark;
}
