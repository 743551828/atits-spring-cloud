package com.atits.security.repository;

import com.atits.security.entity.SecPermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 权限
 *
 * @author zhangys
 * @date 2020-10-14 16:58
 **/
public interface SecPermissionRepository extends JpaRepository<SecPermissionEntity,String>, JpaSpecificationExecutor<SecPermissionEntity> {
}
