package com.atits.security.config.service;

import com.atits.base.item.SelfUserDetail;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @description: 用户账号配置
 * @author: zhangys
 * @create: 2020-09-03 15:36
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SelfUserDetail selfUserEntity = new SelfUserDetail();
        selfUserEntity.setUserId(1L);
        selfUserEntity.setUsername(username);
        selfUserEntity.setPassword("123");
        selfUserEntity.setAccountNonLocked(true);
        selfUserEntity.setAccountNonExpired(true);
        selfUserEntity.setCredentialsNonExpired(true);
        selfUserEntity.setEnabled(true);
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_" + "admin"));
        selfUserEntity.setAuthorities(authorities);
        return selfUserEntity;
    }
}
