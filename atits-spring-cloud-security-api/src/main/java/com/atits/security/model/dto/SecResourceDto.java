package com.atits.security.model.dto;

import com.atits.base.item.BaseDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;

/**
 * 资源详情Dto
 *
 * @author zhangys
 * @date 2020-10-16 13:58
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class SecResourceDto extends BaseDto {

    @ApiModelProperty("资源名称")
    private String name;

    @ApiModelProperty("资源描述")
    private String description;

    @ApiModelProperty("资源url")
    private String url;

    @ApiModelProperty("资源icon")
    private String icon;

    @ApiModelProperty("父资源code")
    private String parentCode;

    @ApiModelProperty("父资源名称")
    private String parentName;

    @ApiModelProperty("资源类型")
    private String type;

}
