package com.atits.security.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 用户部门角色关联实体类
 *
 * @author zhangys
 * @date 2020-10-12 14:53
 **/
@Data
@ToString
@ApiModel("用户部门角色关联实体类")
@Table(name = "sec_user_department_role")
@Entity
public class SecUserDepartmentRoleEntity implements Serializable {

    @Id
    @ApiModelProperty("用户code")
    @Column(name = "user_code")
    private String userCode;

    @Id
    @ApiModelProperty("部门code")
    @Column(name = "department_code")
    private String departmentCode;

    @Id
    @ApiModelProperty("角色code")
    @Column(name = "role_code")
    private String roleCode;


}
