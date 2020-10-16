package com.atits.security.config.service;

import com.atits.base.contants.UserStatus;
import com.atits.base.item.SelfUserDepartmentRoleDetail;
import com.atits.base.item.SelfUserDetail;
import com.atits.base.utils.BeanCopierUtil;
import com.atits.security.domain.ISecUserDepartmentRoleDomain;
import com.atits.security.domain.ISecUserDomain;
import com.atits.security.entity.SecUserEntity;
import com.atits.security.entity.view.SecUserDepartmentRoleView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.atits.base.contants.AdminStatus._isAdmin;

/**
 * 用户账号配置
 *
 * @author zhangys
 * @date 2020-09-03 15:36
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private ISecUserDomain secUserDomain;

    @Autowired
    private ISecUserDepartmentRoleDomain secUserDepartmentRoleDomain;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SecUserEntity secUserEntity = secUserDomain.findOneByLoginUsername(username);
        if (secUserEntity == null){
            throw new UsernameNotFoundException("用户名错误");
        }
        if ("删除".equals(secUserEntity.getStatus())){
            throw new UsernameNotFoundException("用户已删除");
        }
        if (!"激活".equals(secUserEntity.getStatus())){
            throw new LockedException("账号未激活");
        }
        // 组装用户部门角色集合
        SelfUserDetail selfUserDetail = BeanCopierUtil.copy(secUserEntity,SelfUserDetail.class);
        List<SecUserDepartmentRoleView> userDepartmentRole = secUserDepartmentRoleDomain.findByLoginUsername(username);
        List<SelfUserDepartmentRoleDetail> userDepartmentRoleDetails = BeanCopierUtil.copy(userDepartmentRole, SelfUserDepartmentRoleDetail.class);
        selfUserDetail.setUserDepartmentRoles(userDepartmentRoleDetails);
        // 组装角色集合
        Set<GrantedAuthority> authorities = new HashSet<>();
        for (SecUserDepartmentRoleView userDepartmentRoleView: userDepartmentRole){
            authorities.add(new SimpleGrantedAuthority("ROLE_" + userDepartmentRoleView.getRoleName()));
        }
        selfUserDetail.setAuthorities(authorities);
        return selfUserDetail;
    }

}
