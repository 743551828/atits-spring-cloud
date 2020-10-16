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
 * 权限
 *
 * @author zhangys
 * @date 2020-10-12 14:30
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("权限实体类")
@Table(name = "sec_permission")
@Entity
public class SecPermissionEntity extends BaseEntity {

    @ApiModelProperty("权限名称")
    @Column(unique = true)
    private String name;

    @ApiModelProperty("权限类型")
    private String type;

    @ApiModelProperty("权限描述")
    private String description;

    @ApiModelProperty("资源code")
    @Column(name = "resource_code")
    private String resourceCode;
}
