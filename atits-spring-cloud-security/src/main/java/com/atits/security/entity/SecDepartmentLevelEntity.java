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
 * @description: 部门层级
 * @author: zhangys
 * @create: 2020-10-12 14:09
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("部门层级实体类")
@Table(name = "sec_department_level")
@Entity
public class SecDepartmentLevelEntity extends BaseEntity {

    @ApiModelProperty("父部门层级code")
    @Column(name = "parent_code")
    private String parentCode;

    @ApiModelProperty("部门层级名称")
    private String name;

    @ApiModelProperty("部门层级描述")
    private String description;

    @ApiModelProperty("部门层数")
    private Integer level;

}
