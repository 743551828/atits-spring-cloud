package com.atits.security.repository.view;

import com.atits.security.entity.view.SecUserDepartmentRoleView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description: 用户部门权限视图
 * @author: zhangys
 * @create: 2020-10-13 17:03
 **/
public interface SecUserDepartmentRoleViewRepository extends JpaRepository<SecUserDepartmentRoleView,String> {

    List<SecUserDepartmentRoleView> findAllByLoginUsernameOrderByDepartmentLevelLevel(String loginUsername);

}
