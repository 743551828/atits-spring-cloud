package com.atits.security.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @description: 用户dto
 * @author: zhangys
 * @create: 2020-09-25 14:17
 **/
@Data
@ToString
@ApiModel("用户实体类")
public class UserDto {

    @ApiModelProperty("登录用户名")
    private String loginUsername;
}
