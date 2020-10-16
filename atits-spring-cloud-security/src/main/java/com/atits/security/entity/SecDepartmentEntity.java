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
 * 部门
 *
 * @author zhangys
 * @date 2020-10-12 13:50
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("部门实体类")
@Table(name = "sec_department")
@Entity
public class SecDepartmentEntity extends BaseEntity {

    @ApiModelProperty("部门名称")
    @Column(unique = true)
    private String name;

    @ApiModelProperty("父code")
    @Column(name = "parent_code")
    private String parentCode;

    @ApiModelProperty("部门logo路径")
    private String logoUrl;

    @ApiModelProperty("部门描述")
    private String description;

    @ApiModelProperty("部门层级code")
    @Column(name = "department_level_code")
    private String departmentLevelCode;
}
