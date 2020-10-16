package com.atits.security.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 新增资源
 *
 * @author zhangys
 * @date 2020-10-15 10:02
 **/
@Data
@ApiModel("新增资源")
public class SecResourceSaveRequest implements Serializable {

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

    @ApiModelProperty("状态值")
    private String status;

    @ApiModelProperty("资源类型")
    private String type;

    @ApiModelProperty("备注")
    private String remark;
}
