package com.atits.security.service;

import com.atits.security.model.dto.SecResourceDto;
import com.atits.security.model.request.SecResourceSaveRequest;

/**
 * 资源
 *
 * @author zhangys
 * @date 2020-10-14 17:24
 **/
public interface ISecResourceService {

    /**
     * 新增一个资源
     *
     * @param secResourceSaveRequest
     */
    void save(SecResourceSaveRequest secResourceSaveRequest);

    /**
     * 查询资源详情
     *
     * @param code
     * @return
     */
    SecResourceDto findOne(String code);

}
