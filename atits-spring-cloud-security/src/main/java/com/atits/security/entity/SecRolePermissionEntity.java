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
 * @description: 角色权限实体类
 * @author: zhangys
 * @create: 2020-10-12 15:45
 **/
@Data
@ToString
@ApiModel("角色权限实体类")
@Table(name = "sec_role_permission")
@Entity
public class SecRolePermissionEntity implements Serializable {

    @Id
    @ApiModelProperty("角色code")
    @Column(name = "role_code")
    private String roleCode;

    @Id
    @ApiModelProperty("权限code")
    @Column(name = "permission_code")
    private String permissionCode;
}
