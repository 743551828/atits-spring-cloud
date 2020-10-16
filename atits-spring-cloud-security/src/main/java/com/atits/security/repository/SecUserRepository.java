package com.atits.security.repository;

import com.atits.security.entity.SecDepartmentEntity;
import com.atits.security.entity.SecUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户
 *
 * @author zhangys
 * @date 2020-10-13 09:53
 **/
public interface SecUserRepository extends JpaRepository<SecUserEntity,String>, JpaSpecificationExecutor<SecDepartmentEntity> {

    SecUserEntity findSecUserEntityByLoginUsername(String loginUsername);
}
