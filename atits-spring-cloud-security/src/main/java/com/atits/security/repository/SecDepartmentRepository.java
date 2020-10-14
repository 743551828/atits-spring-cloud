package com.atits.security.repository;

import com.atits.security.entity.SecDepartmentEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * @description: 部门
 * @author: zhangys
 * @create: 2020-10-13 10:12
 **/
public interface SecDepartmentRepository extends CrudRepository<SecDepartmentEntity,String>, JpaSpecificationExecutor<SecDepartmentEntity> {
}
