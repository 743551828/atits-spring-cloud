package com.atits.base.item;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * SpringSecurity用户的实体
 * 注意:这里必须要实现UserDetails接口
 *
 * @author: zhangys
 * @create: 2020-09-10 13:52
 */
@Data
public class SelfUserDetail implements Serializable, UserDetails {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户code
	 */
	private String code;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 登录用户名
	 */
	private String loginUsername;

	/**
	 * 登录密码
	 */
	private String loginPassword;

	/**
	 * 状态值
	 */
	private Integer status;

	/**
	 * 用户角色
	 */
	private Collection<GrantedAuthority> authorities;

	/**
	 * 用户部门角色
	 */
	private Collection<SelfUserDepartmentRoleDetail> userDepartmentRoles;

	/**
	 * 账户是否过期
	 */
	private boolean isAccountNonExpired = true;

	/**
	 * 账户是否被锁定
	 */
	private boolean isAccountNonLocked = true;

	/**
	 * 证书是否过期
	 */
	private boolean isCredentialsNonExpired = true;

	/**
	 * 账户是否有效
	 */
	private boolean isEnabled = true;

	private Integer isAdmin = 0;

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return loginPassword;
	}

	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

}