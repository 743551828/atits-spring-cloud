package com.atits.security.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @description: 用户实体类
 * @author: zhangys
 * @create: 2020-09-25 14:16
 **/
@Data
@ToString
@ApiModel("用户实体类")
public class UserEntity {

    @ApiModelProperty("登录用户名")
    private String loginUsername;

    @ApiModelProperty("登录密码")
    private String loginPassword;

}
