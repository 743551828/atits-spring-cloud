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
import javax.persistence.UniqueConstraint;

/**
 * 用户实体类
 *
 * @author zhangys
 * @date 2020-09-25 14:16
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@ApiModel("用户实体类")
@Table(name = "sec_user")
@Entity
public class SecUserEntity extends BaseEntity {

    @ApiModelProperty("用户名")
    @Column(unique = true)
    private String username;

    @ApiModelProperty("登录用户名")
    @Column(name = "login_username",unique = true)
    private String loginUsername;

    @ApiModelProperty("登录密码")
    @Column(name = "login_password",unique = true)
    private String loginPassword;

    @ApiModelProperty("照片url")
    @Column(name = "photo_url")
    private String photoUrl;

    @ApiModelProperty("电话")
    private String telephone;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("最后登录时间")
    @Column(name = "last_login_time")
    private Long lastLoginTime;

    @ApiModelProperty("是否为管理员")
    @Column(name = "is_admin",unique = true)
    private Integer isAdmin;

}
