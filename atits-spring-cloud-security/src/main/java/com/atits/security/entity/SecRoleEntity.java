package com.atits.security.entity;

import com.atits.base.item.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @description: 角色
 * @author: zhangys
 * @create: 2020-10-12 14:19
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("角色实体类")
@Table(name = "sec_role")
@Entity
public class SecRoleEntity extends BaseEntity {

    @ApiModelProperty("角色名称")
    private String name;

    @ApiModelProperty("角色描述")
    private String description;

    @ApiModelProperty("部门层级code")
    @Column(name = "department_level_code")
    private String departmentLevelCode;

}
