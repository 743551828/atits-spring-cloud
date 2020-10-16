package com.atits.security.entity;

import com.atits.base.item.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 资源
 *
 * @author zhangys
 * @date 2020-10-12 14:35
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("资源实体类")
@Table(name = "sec_resource")
@Entity
public class SecResourceEntity extends BaseEntity {

    @ApiModelProperty("资源名称")
    @Column(unique = true)
    private String name;

    @ApiModelProperty("资源描述")
    private String description;

    @ApiModelProperty("资源url")
    @Column(unique = true)
    private String url;

    @ApiModelProperty("资源icon")
    private String icon;

    @ApiModelProperty("父资源code")
    @Column(name = "parent_code")
    private String parentCode;

    @ApiModelProperty("资源类型")
    private String type;

}
