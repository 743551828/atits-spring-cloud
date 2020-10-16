package com.atits.security.service.impl;

import com.atits.base.utils.BeanCopierUtil;
import com.atits.security.domain.ISecResourceDomain;
import com.atits.security.domain.ISecUserDomain;
import com.atits.security.entity.SecResourceEntity;
import com.atits.security.entity.SecUserEntity;
import com.atits.security.model.dto.SecResourceDto;
import com.atits.security.model.request.SecResourceSaveRequest;
import com.atits.security.service.ISecResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 资源
 *
 * @author zhangys
 * @date 2020-10-14 17:24
 **/
@Service
public class SecResourceServiceImpl implements ISecResourceService {

    @Autowired
    private ISecResourceDomain secResourceDomain;

    @Autowired
    private ISecUserDomain secUserDomain;

    @Override
    public void save(SecResourceSaveRequest secResourceSaveRequest) {
        secResourceDomain.save(secResourceSaveRequest);
    }

    @Override
    public SecResourceDto findOne(String code) {
        SecResourceEntity entity = secResourceDomain.findByCode(code);
        SecResourceDto dto = BeanCopierUtil.copy(entity, SecResourceDto.class);
        SecUserEntity creator = secUserDomain.findByCode(entity.getCreatorCode());
        SecUserEntity operator = secUserDomain.findByCode(entity.getLastOperatorCode());
        dto.init(creator == null ? "用户不存在" : creator.getUsername(),
                operator == null ? "用户不存在" : operator.getUsername());
        if (!"-1".equals(entity.getParentCode())){
            SecResourceEntity parentEntity = secResourceDomain.findByCode(entity.getParentCode());
            dto.setParentName(parentEntity.getName());
        }
        return dto;
    }

}
