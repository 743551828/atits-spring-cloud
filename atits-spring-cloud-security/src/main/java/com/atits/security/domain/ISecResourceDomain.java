package com.atits.security.domain;

import com.atits.security.entity.SecResourceEntity;
import com.atits.security.model.request.SecResourceSaveRequest;

/**
 * 资源
 *
 * @author zhangys
 * @date 2020-10-14 17:22
 **/
public interface ISecResourceDomain {

    /**
     * 新增一个资源
     *
     * @param secResourceSaveRequest
     * @return
     */
    SecResourceEntity save(SecResourceSaveRequest secResourceSaveRequest);

    /**
     * 获取排序值最大的资源
     * 如果没有则返回null
     *
     * @param parentCode 父资源code
     * @return
     */
    SecResourceEntity findByMaxSortNum(String parentCode);

    /**
     * 根据code获取资源
     * 如果没有则返回null
     *
     * @param code 资源code
     * @return
     */
    SecResourceEntity findByCode(String code);

}
